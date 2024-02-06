
package testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.baseClass;
import PomClasses.formFillUp;
import PomClasses.homePage;

public class newTest extends baseClass {
    homePage hp;
    formFillUp ff;

    @BeforeMethod
    public void stepsToLaunch() throws InterruptedException {
        launchTheBrowser();
        hp = new homePage(driver);
        hp.clickOnCookies();
        ff = new formFillUp(driver);
    }

    @Test(priority = -2)
    public void ClickOnMarketing() throws InterruptedException {
        hp.moveUptoLeasing(driver);
       // hp.verifyLogo(driver);
        hp.clickOnLeasing();
    }

    @Test(priority = -1)
    public void fillForm() throws InterruptedException {
        // hp.clickOnCookies(); // This line is commented out, make sure it's intentional
        hp.moveUptoLeasing(driver);
        hp.clickOnLeasing();
        ff.clickOnLearnMore();
        ff.fillTheForm(driver);
    }
}
