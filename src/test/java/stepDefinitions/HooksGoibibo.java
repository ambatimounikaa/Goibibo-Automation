package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksGoibibo {
    static WebDriver dr=null;
    @Before("@First")
    public void setup() {
        System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
        dr = new EdgeDriver();
        dr.manage().window().maximize();
    }
    @After("@First,@Second")
    public void tearDown() {
        dr.close();
    }
}