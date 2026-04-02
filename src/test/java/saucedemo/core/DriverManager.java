package saucedemo.core;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.nio.file.Files;
import java.net.URL;
import java.time.Duration;

public class DriverManager {
    private static final ThreadLocal<AndroidDriver> driver = new ThreadLocal<>();

    public static void initDriver() {
        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("emulator-5554")
                .setPlatformVersion("16")
                .setChromedriverExecutable(System.getProperty("user.dir") + "/chromedriver/chromedriver")
                .setApp(System.getProperty("user.dir") + "/apk/saucedemo.apk");

        try {
            URL appiumUrl = new URL("http://127.0.0.1:4723");
            driver.set(new AndroidDriver(appiumUrl, options));
            driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        } catch (Exception e) {
            throw new RuntimeException("Gagal koneksi ke Appium Server: " + e.getMessage());
        }
    }

    public static AndroidDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }

    public static String takeScreenshot(String testName) {
        try {
            File src = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);

            String path = System.getProperty("user.dir") + "/reports/screenshots/" + testName + ".png";
            File dest = new File(path);

            Files.copy(src.toPath(), dest.toPath());

            return path;
        } catch (Exception e) {
            return null;
        }
    }
}
