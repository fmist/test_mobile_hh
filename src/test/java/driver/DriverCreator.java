package driver;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import config.MobileConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverCreator {
    MobileConfig mobileConfig = ConfigFactory.create(MobileConfig.class);
    public void createDriver() {
        //asd
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserstack.user", mobileConfig.getUser());
        capabilities.setCapability("browserstack.key", mobileConfig.getKey());
        capabilities.setCapability("project", mobileConfig.getProject());
        capabilities.setCapability("build", mobileConfig.getBuild());
        capabilities.setCapability("browserstack.debug", mobileConfig.debug());
        capabilities.setCapability("device", mobileConfig.getDevice());
        capabilities.setCapability("os_version", mobileConfig.getVersion());
        capabilities.setCapability("app", mobileConfig.getPath());
        capabilities.setCapability("name", mobileConfig.getName());
        capabilities.setCapability("browserstack.networkLogs", mobileConfig.logs());

        try {
            WebDriverRunner.setWebDriver(new RemoteWebDriver(new URL(mobileConfig.getUrl()), capabilities));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Configuration.timeout = 60000;
    }

    public void closeDriver() {
        Selenide.closeWebDriver();
    }
}
