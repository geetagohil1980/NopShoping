import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LetsShopping {


    WebDriver driver;


    @Test(priority = 1)
    void openBrowser()  {

        WebDriverManager.chromedriver ().setup ();
        driver = new ChromeDriver ();
        driver.get ( "https://demo.nopcommerce.com/ " );
        driver.manage ().window ().maximize ();


    }

    @Test
    void locateProduct() {


        driver.findElement ( By.xpath ( "/html/body/div[6]/div[2]/ul[1]/li[1]/a " ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a " ) ).click ();
        driver.findElement ( By.xpath ( " /html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a/img " ) ).click ();

        driver.findElement ( By.className ( " button-2 product-box-add-to-cart-button" ) ).click ();
        System.out.println ("USER SELECT PRODUCT");
    }

    @Test
    void shopping()  {

        driver.findElement ( By.className ( " cart-label" ) ).click ();
        driver.findElement ( By.xpath ( "//*[@id=shopping-cart-form]/div[3]/div[2]/div[3]/label " ) ).click ();
        driver.findElement ( By.className ( "qty-input " ) ).sendKeys ( "1" );
        driver.findElement ( By.xpath ( " /html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[2]/div[1]/button[1]" ) ).click ();
        driver.findElement ( By.id ( "termsofservice " ) ).click ();
        driver.findElement ( By.className ( "button-1 checkout-button " ) ).click ();
    }

    @Test
    void checkoutAsGuest() {
        driver.findElement ( By.xpath ( "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1] " ) ).click ();
        driver.findElement ( By.xpath ( "//*[@id=opc-billing]/div[1]/h2 " ) ).click ();
        driver.findElement ( By.xpath ( "//*[@id=checkout-billing-load]/div/div[1]/p/label " ) ).click ();
        driver.findElement ( By.name ( " BillingNewAddress.FirstName" ) ).sendKeys ( "Geeta" );
        driver.findElement ( By.name ( " BillingNewAddress.LastName" ) ).sendKeys ( "Chavda" );
        driver.findElement ( By.name ( " BillingNewAddress.Email" ) ).sendKeys ( "gtgohil@yahoo.co.in" );
        driver.findElement ( By.id ( "BillingNewAddress_CountryId " ) ).sendKeys ( "United Kingdum" );
        driver.findElement ( By.name ( "BillingNewAddress.City " ) ).sendKeys ( "LONDON" );
        driver.findElement ( By.name ( " BillingNewAddress.Address1" ) ).sendKeys ( "5,Coverton road" );
        driver.findElement ( By.name ( "BillingNewAddress.ZipPostalCode " ) ).sendKeys ( "SW17 0QN" );
        driver.findElement ( By.name ( "BillingNewAddress.PhoneNumber " ) ).sendKeys ( "07926029114" );
        driver.findElement ( By.xpath ( "//*[@id=billing-buttons-container]/button[4] " ) ).click ();
    }

    @Test
    void checkout() {
        driver.findElement ( By.xpath ( "/html/body/div[6]/div[3]/div/div/div/div[1]/h1 " ) ).click ();
        driver.findElement ( By.xpath ( " /html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[1]/div/div/ul/li[2]/div[1]/label" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/button " ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[2]/form/div/div/div/ul/li[2]/div/div[2]/label " ) ).click ();
        driver.findElement ( By.className ( " button-1 payment-method-next-step-button" ) ).click ();


    }

    @Test
    void payments() {
        driver.findElement ( By.xpath ( "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/form/div/div/div/div/table/tbody/tr[1]/td[2]/select " ) ).click ();
        driver.findElement ( By.xpath ( " /html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/form/div/div/div/div/table/tbody/tr[2]/td[2]/input" ) ).sendKeys ( "geeta" );
        driver.findElement ( By.xpath ( "//*[@id=CardNumber]" ) ).sendKeys ( "5187 9135 0655 8269" );
        driver.findElement ( By.id ( "ExpireMonth " ) ).sendKeys ( "March" );
        driver.findElement ( By.id ( "ExpireYear " ) ).sendKeys ( "2024" );
        driver.findElement ( By.id ( "CardCode " ) ).sendKeys ( "355" );
        driver.findElement ( By.xpath ( "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/div/button " ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[6]/div[2]/div[2]/button " ) ).click ();
        driver.findElement ( By.xpath ( " /html/body/div[6]/div[3]/div/div/div/div[1]" ) ).click ();


    }

    @Test
    void closeBrowser() {
        driver.close ();
        System.out.println ( " Browser close" );

    }


}







