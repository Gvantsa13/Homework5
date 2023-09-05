package Utils;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

    public class ChromeRunner {
        @BeforeMethod(description = "გვერდის გამართვა და გახსნა")
        public void setUp(){
            open("https://nido.ge/");
            Configuration.browserSize = "1920x1080";

        }

    }

