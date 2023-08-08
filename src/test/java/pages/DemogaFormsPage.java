package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemogaFormsPage {

    public DemogaFormsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@class='card mt-4 top-card'])[2]")
    public WebElement forms ;

    @FindBy(xpath = "//li[.='Practice Form']")
    public WebElement practiceForm;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "userEmail")
    public WebElement userEmail;
    @FindBy(xpath = "(//*[@class='custom-control custom-radio custom-control-inline'])[1]")
    public WebElement maleButton;
    @FindBy(xpath = "(//*[@class='custom-control custom-radio custom-control-inline'])[2]")
    public WebElement femaleButton;
    @FindBy(xpath = "(//*[@class='custom-control custom-radio custom-control-inline'])[3]")
    public WebElement otherButton;

    @FindBy(id = "userNumber")
    public WebElement userNumber;

    @FindBy(id = "dateOfBirthInput")
    public WebElement dateOfBirthInput;

    @FindBy(id = "subjectsContainer")
    public WebElement subjects;

    @FindBy(id = "hobbies-checkbox-1")
    public WebElement sportsButton;
    @FindBy(id = "hobbies-checkbox-2")
    public WebElement readingButton;
    @FindBy(id = "hobbies-checkbox-3")
    public WebElement musicButton;
    @FindBy(id = "uploadPicture")
    public WebElement uploadPicture;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress;
    @FindBy(xpath = "(//div[.='Uttar Pradesh'])[1]")
    public WebElement state;
    @FindBy(id = "city")
    public WebElement city;
    @FindBy(id = "submit")
    public WebElement submit;








}
