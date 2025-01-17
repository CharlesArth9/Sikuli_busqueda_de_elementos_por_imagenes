import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.util.concurrent.TimeUnit;

public class Youtube{
     public static void main(String[] args) throws FindFailed, InterruptedException{
          System.setProperty( "webdriver.chrome.driver","D:\\Mis Documentos\\Maxtime\\src\\test\\resources\\driver\\chromedriver.exe" );
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().deleteAllCookies();
          driver.manage().timeouts().pageLoadTimeout( 30, TimeUnit.SECONDS );
         // driver.get( "https://www.youtube.com/watch?v=OtQAMoXYqes&t=1110s" );
          driver.get( "https://www.google.com.co/" );
          String path = "C:\\Users\\cmestral\\Desktop\\Proyecto_IT\\Sikuli_im\\";
          Screen screen = new Screen();
      //    Pattern omitir = new Pattern(path+"omitir_anuncio.png");
      //    Pattern mod_teatro = new Pattern(path+"yt_modoteatro.png");
          Pattern menu = new Pattern(path+"menu_app_google.png");
          Pattern traductor = new Pattern(path+"traductor.png");

          screen.wait( menu, 5000 );
          screen.click( menu );
          screen.click( traductor );
          Thread.sleep( 5000 );
          driver.quit();
     }
}
