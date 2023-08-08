package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.DemogaFormsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class formStepDef {
    DemogaFormsPage demogaFormsPage = new DemogaFormsPage();


    @Given("kullanici anasayfaya gider")
    public void kullanici_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("kullanici forms alanina tiklar")
    public void kullanici_forms_alanina_tiklar() {
        demogaFormsPage.forms.click();
        ReusableMethods.waitFor(1);
    }
    @Then("kullanici practiceforms alanina tiklar")
    public void kullanici_practiceforms_alanina_tiklar() {
        demogaFormsPage.practiceForm.click();
        ReusableMethods.waitFor(1);
    }
    @Then("kullanici {string} alanina valid deger girer")
    public void kullanici_alanina_valid_deger_girer(String string) {
        switch (string){
            case "name" :
                demogaFormsPage.firstName.sendKeys("hasan");
                break;
            case "lastname":
                demogaFormsPage.lastName.sendKeys("ince");
                break;
            case "email" :
                demogaFormsPage.userEmail.sendKeys("hasanince@gmail.com");
                break;
            case "mobileNumber" :
                demogaFormsPage.userNumber.sendKeys("54789652");
                break;
            case "dateOfBirth" :
                demogaFormsPage.dateOfBirthInput.clear();
                demogaFormsPage.dateOfBirthInput.sendKeys("21.06");
                ReusableMethods.scrollIntoViewJS(demogaFormsPage.sportsButton);
                break;
            case "subject" :
                demogaFormsPage.subjects.sendKeys("a",Keys.ARROW_DOWN,Keys.ENTER);
                break;
            case "adress" :
                demogaFormsPage.currentAddress.sendKeys("Amasya");
                break;
        }
        ReusableMethods.waitFor(1);
    }
    @Then("kullanici gender alaninda male buttona tiklar")
    public void kullanici_gender_alaninda_male_buttona_tiklar() {
        demogaFormsPage.maleButton.click();
        ReusableMethods.waitFor(1);
    }
    @Then("kullanici hobbies alaninda sports ve music buttonlarina tiklar")
    public void kullanici_hobbies_alaninda_sports_ve_music_buttonlarina_tiklar() {
        ReusableMethods.scrollIntoViewJS(demogaFormsPage.sportsButton);
        ReusableMethods.clickByJS(demogaFormsPage.sportsButton);
        ReusableMethods.waitFor(1);
        ReusableMethods.clickByJS(demogaFormsPage.musicButton);
        ReusableMethods.waitFor(1);
    }
    @Then("kullanici picture bolumunde dosya sec alanina tiklar ve masaustunden fotograf secer")
    public void kullanici_picture_bolumunde_dosya_sec_alanina_tiklar_ve_masaustunden_fotograf_secer() {
//        ReusableMethods.clickByJS(demogaFormsPage.uploadPicture);
        ReusableMethods.waitFor(1);
//        WebElement file= Driver.getDriver().findElement(By.id("uploadPicture"));
//        String dosyayolu= System.getProperty("user.home") + "/Desktop/img.jpg";
//        file.sendKeys(dosyayolu);

        String file="C:\\Users\\Hasan İNCE\\Desktop\\img.jpg";
        WebElement dosyaSec= Driver.getDriver().findElement(By.id("uploadPicture"));
        dosyaSec.sendKeys(file);
        ReusableMethods.waitFor(2);
    }
    @Then("kullanici state alaninda ulke secer")
    public void kullanici_state_alaninda_ulke_secer() {
        demogaFormsPage.state.sendKeys("Uttar", Keys.ENTER);
        ReusableMethods.waitFor(1);
    }
    @Then("kullanici city alaninda city secer")
    public void kullanici_city_alaninda_city_secer() {
        demogaFormsPage.city.sendKeys("Karnal", Keys.ENTER);
        ReusableMethods.waitFor(1);
    }
    @Then("Kullanici submit butonuna tiklar")
    public void kullanici_submit_butonuna_tiklar() {
        demogaFormsPage.submit.click();
        ReusableMethods.waitFor(1);
    }


}
