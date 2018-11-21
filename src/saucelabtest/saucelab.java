package saucelabtest;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class saucelab {
    public static final String USERNAME = "samsmith42";
    public static final String ACCESS_KEY = "fa8e3cbd-4290-448d-9d6e-6c06c0f84c7b";
    public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "66.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL),caps);
        driver.get("https://www.facebook.com");
        System.out.println(driver.getTitle());
    }
}
