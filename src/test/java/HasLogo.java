import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HasLogo extends BaseTest{
    @Test (priority = 3)
    public void hasLogo() {
        boolean actualResults = new HomePage(driver)
                .hasLogo();
        Assert.assertTrue(actualResults);
    }
}

