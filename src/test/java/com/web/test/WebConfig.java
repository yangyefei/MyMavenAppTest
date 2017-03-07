package com.web.test;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Spring;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class WebConfig {
	private String webRunMachineIp;

	public void setWebRunMachineIp(String webRunMachineIp) {
		this.webRunMachineIp = webRunMachineIp;
	}

	public String getWebRunMachineIp() {
		return webRunMachineIp;
}
	public WebDriver browserOfChromeSetUp(WebDriver driver) throws Exception {
		// TODO Auto-generated method stub

		driver = new RemoteWebDriver(new URL("http://" + webRunMachineIp + ":4444/wd/hub"),
				DesiredCapabilities.chrome());

		return driver;
	}
	
	public WebDriver browserOfFirefoxSetUp(WebDriver driver) throws Exception {
		// TODO Auto-generated method stub
		driver = new RemoteWebDriver(new URL("http://" + webRunMachineIp + ":4444/wd/hub"), DesiredCapabilities.firefox());
		return driver;
	}
	
}
