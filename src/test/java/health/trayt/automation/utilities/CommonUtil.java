package health.trayt.automation.utilities;

import health.trayt.automation.annotations.LazyAutowired;
import health.trayt.automation.pages.HomePage;
import health.trayt.automation.pages.ReferralPage;
import health.trayt.automation.pages.ServicesPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CommonUtil {
    @LazyAutowired
    private HomePage homePage;
    @LazyAutowired private ReferralPage referralPage;
    @LazyAutowired private ServicesPage servicesPage;

    public static String randomStr = "";
    public static final String referrerPrefix = "TestSchoolContact";
    public static final String studentPrefix = "TestStudent";
    public static final String parentPrefix = "TestParent";
    public static final String emergencyPrefix = "TestEmergency";


    public void scrollToView(WebElement element) throws InterruptedException {
        ((JavascriptExecutor) servicesPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(3000);
    }

}
