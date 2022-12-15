import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.Random;

public class HomePage extends BasePage {


    @FindBy(xpath = "//div[@class='city-name']/span[contains(text(), 'Київ')]")
    WebElement cityButton;

    WebElement optionCity = driver.findElement(By.xpath("//li[contains(text(), 'Львів')]"));
    @FindBy(xpath = "//div[@class='city-name']//preceding::span[contains(text(), 'Львів')]")
    WebElement buttonLviv;

    @FindBy(xpath = "//img[@class='logo-desc']")
    WebElement logo;

    @FindBy(xpath = "//label[@for='box1']")
    WebElement checkBox;
    @FindBy(xpath = "//input[@name='SUB-EMAIL']")
    WebElement emailField;
    @FindBy(xpath ="//input[@id='subscribe_add']")
    WebElement Button;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickOnCityButton(){
        waitToElementBecomeVisible(cityButton);
        cityButton.click();
        return this;
    }

    public boolean chooseCity(){
        waitToElementBecomeVisible(optionCity);
        optionCity.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        return buttonLviv.isDisplayed();
    }

    public boolean hasLogo(){
        waitToElementBecomeVisible(logo);
        return logo.isDisplayed();
    }

    public HomePage scrollDown(){
        waitScrollDown();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        return this;
    }

    public HomePage clickOnCheckBox(){
        waitToElementBecomeVisible(checkBox);
        checkBox.click();
        return this;
    }

    public HomePage fillEmailField(){
        waitToElementBecomeVisible(emailField);
        emailField.sendKeys(getSaltString()+"@gmail.com");
        return this;
    }

    private String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    public boolean clickOnSubmit(){
        waitToElementBecomeVisible(Button);
        Button.click();
        return true;
    }
}
