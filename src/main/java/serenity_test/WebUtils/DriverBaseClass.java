package serenity_test.WebUtils;

import java.io.File;

import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.internal.ElementScrollBehavior;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import net.thucydides.core.webdriver.DriverSource;

public class DriverBaseClass implements DriverSource {

	protected WebDriver driver;

	public static final String baseUrl = System.getProperty("env");

	String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator
            + "resources" + File.separator + "common" + File.separator + "web" + File.separator + "Drivers"
            + File.separator;

	DesiredCapabilities capabilities = new DesiredCapabilities();

	@Override
	public WebDriver newDriver() {
		// Add the common WebDriver capabilities.
//		capabilities.setCapability(CapabilityType.BROWSER_NAME, capabilities.getBrowserName());
		// capabilities.setCapability(CapabilityType.HAS_NATIVE_EVENTS, true);
		// capabilities.setCapability(CapabilityType.PROXY, proxy);
		// capabilities.setCapability("proxy", proxy);

		return driver;
	}
//
	@Override
	public boolean takesScreenshots() {
		return false;
	}
//
//	public Proxy setProxy() {
//		Proxy proxy = new Proxy();
//		proxy.setHttpProxy("XXX.XX.XXX.XX");
//		proxy.setSocksUsername("proxy_login");
//		proxy.setSocksPassword("proxy_pass");
//
//		return proxy;
//	}

}
