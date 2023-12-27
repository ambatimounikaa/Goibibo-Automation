package pageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Goibibo {
    WebDriver dr;

    public Goibibo(WebDriver dr) {
        this.dr=dr;
        PageFactory.initElements(dr, this);
    }

    @FindBy(how=How.XPATH,using = "//ul[@class='sc-q68in4-85 dUYYxb']/li[2]")
    WebElement option;

    @FindBy(how=How.XPATH,using = "//div[@class='sc-hGPBjI bYQHSX fswFld ']/p")
    WebElement fromCityHolder;

    @FindBy(how=How.XPATH,using = "//input[@type='text']")
    WebElement cityEntered;

    @FindBy(how=How.XPATH,using = "//ul[@id='autoSuggest-list']/li[@tabindex='0']")
    WebElement cityList;

    @FindBy(how=How.XPATH,using = "//div[@class='sc-cCcXHH biumhA']")
    WebElement travellers;

    @FindBy(how=How.XPATH,using = "//ul[@class='sc-lcepkR zWTBw']/li[4]")
    WebElement tClass;

    @FindBy(how=How.XPATH,using = "//span[@class='sc-pVTFL kecYK']")
    WebElement fareType;

    @FindBy(how=How.XPATH,using = "//span[@class='sc-XxNYO hiLeUc']")
    WebElement search ;

    @FindBy(how=How.XPATH,using = "(//div[@class='DayPicker-Caption'])[1]")
    WebElement mdString;
    @FindBy(how=How.XPATH,using = "//span[@aria-label='Next Month']")
    WebElement nextButton;

    @FindBy(how=How.XPATH,using ="//div[@class='DayPicker-Months']/div[1]")
    WebElement monthsElement;

    @FindBy(how=How.XPATH,using ="(//div[@class='DayPicker-Week'])[1]")
    List<WebElement> weeksElement;



    @FindBy(how=How.XPATH,using ="//div[@class='DayPicker-Day']/p[1]")
    List<WebElement> daysElement;


    @FindBy(how=How.XPATH,using ="//span[@class='fswTrvl__done']")
    WebElement doneButton;

    //To load the homepage
    public void homePage() {
        dr.get("https://www.goibibo.com/");
        dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println(dr.getTitle());
    }

    //To verify the title of homepage
    public void verifyTitle() {
        Assert.assertEquals(dr.getTitle(), "Goibibo - Best Travel Website. Book Hotels, Flights, Trains, Bus and Cabs with upto 50% off");
    }

    //To select the trip type
    public void tripType() {
        WebElement s = option;
        s.click();
        Boolean Select = s.isEnabled();
        System.out.println(Select);
    }

    //To choose From & To Locations
    public void fromtoLocations(String fromCity,String toCity){
        //For selecting the From Location
        fromCityHolder.click();
        cityEntered.sendKeys(fromCity);
        cityList.click();

        //For selecting the From Location
        cityEntered.sendKeys(toCity);
        cityList.click();

    }

    //To select Departure date
    public void departureDate(String monthYear, String monthDate ) {

        while(true) {
            String datePickerMD =mdString.getText();
            System.out.println(datePickerMD);
            if(datePickerMD.equals(monthYear))
                break;
            else {
                nextButton.click();
            }
        }
        dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        for(WebElement eachWeek : weeksElement) {
            for(WebElement day:daysElement) {
                if(day.getText().equals(monthDate)) {
                    day.click();
                break;
                }
            }
        }
    }

    //To select Return date
    public void returnDate(String monthDate1) {
        for(WebElement eachWeek : weeksElement) {
            for(WebElement day:daysElement) {
                if(day.getText().equals(monthDate1)) {
                    day.click();
                break;
                }
            }
        }
        doneButton.click();

    }

    //To select the number of Travellers & Class
    public void travellersClass() {
        travellers.click();
        //Choosing the travel class
        WebElement e = tClass;
        e.click();
        Boolean s = e.isEnabled();
        System.out.println(s);

    }

    //To check fare type
    public void fareTypeCheck() {
        Boolean Select = fareType.isEnabled();
        System.out.println(Select);
    }

    //To search flights according to requirements
    public void searchFlights() {
        search.click();
    }


 

}