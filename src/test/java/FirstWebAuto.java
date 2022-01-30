import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstWebAuto {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
//        ChromeDriver chromeDriver = new ChromeDriver();
//        chromeDriver.get("https://www.baidu.com");
        openBrowser("chrome").get("http://www.baidu.com");
    }
    public static WebDriver openBrowser(String browserName){
        if (browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");

//            chromeDriver.get("https://www.baidu.com");

            return new ChromeDriver();
        }
        else {
            return null;
        }


    }
}
