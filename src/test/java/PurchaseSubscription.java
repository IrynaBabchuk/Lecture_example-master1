
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class PurchaseSubscription extends BaseTest {

    @Test (priority = 1)
    public void PurchaseSubscription() {
        boolean actualResults = new HomePage(driver)
                .scrollDown()
                .clickOnCheckBox()
                .fillEmailField()
                .clickOnSubmit();
        Assert.assertTrue(actualResults);
    }
}
