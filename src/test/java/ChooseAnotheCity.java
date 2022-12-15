import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ChooseAnotheCity extends BaseTest{
    @Test (priority = 2)
    public void chooseAnotherCity() {
        boolean actualResults = new HomePage(driver)
                .clickOnCityButton()
                .chooseCity();
        Assert.assertTrue(actualResults);
    }
}

