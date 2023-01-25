package com.gemecosystem;

import com.galenframework.junit.GalenJUnitTestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Arrays;
import java.util.List;

public class GalenLayoutTesting extends GalenJUnitTestBase {

    @Override
    public WebDriver createDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    private DeviceSetup device;

    public GalenLayoutTesting(final DeviceSetup deviceSetup) {
        super();
        this.device = deviceSetup;
    }

    public static class DeviceSetup {
        private final Dimension screenSize;
        private final List<String> tags;

        public DeviceSetup(Dimension screenSize, String... tags) {
            this.screenSize = screenSize;
            this.tags = Arrays.asList(tags);
        }

        public Dimension getScreenSize() {
            return screenSize;
        }

        protected List<String> getTags() {
            return tags;
        }
    }


    @Parameterized.Parameters
    public static Iterable<Object[]> devices() {
        return Arrays.asList(new Object[][] {

                //device name and size
                { new DeviceSetup(new Dimension(1920, 1080), "normal", "desktop") },

                { new DeviceSetup(new Dimension(320, 800), "normal-phone", "phone", "mobile") }

        });
    }

    @Test
    public void testHomePage() throws Exception {

        WebDriver driver = this.getDriver();

        driver.get("https://gemecosystem.com/");



        resize(device.getScreenSize().getWidth(), device.getScreenSize().getHeight());
        checkLayout("HomePage.spec", device.getTags());


    }


    @Test
    public void testHowItWorksPage() throws Exception {

        WebDriver driver = this.getDriver();

        driver.get("https://gemecosystem.com/");

        driver.findElement(By.xpath("//li[@class='nav-item col-lg']/a[text()='HOW IT WORKS']")).click();

        resize(device.getScreenSize().getWidth(), device.getScreenSize().getHeight());
        checkLayout("howItWorksPage.spec", device.getTags());

    }







}
