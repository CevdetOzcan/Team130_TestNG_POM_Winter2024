package tests.day16_TestNG_POM;

import org.testng.annotations.Test;
import pages.TestOtomasyonPage;
import utilities.Driver;

public class C01_PageClassIlePozitifLoginTesti {

    @Test
    public void pozitifLoginTesti(){

        //1- https://www.testotomasyonu.com/ anasayfasina gidin
        Driver.getDriver().get("https://www.testotomasyonu.com/");
        //2- account linkine basin

        //POM'de page class'larinda locate ettigimiz webElementlere ulasmak icin
        // PageClass'larindan obje olustururuz

        TestOtomasyonPage testOtomasyonPage = new TestOtomasyonPage();
        testOtomasyonPage.accountLinki.click();

        //3- Kullanici email'i olarak “wise@gmail.com”girin
        //4- Kullanici sifresi olarak “12345” girin
        //5- Login butonuna basarak login olun
        // 6- Basarili olarak giris yapilabildigini test edin
    }
}
