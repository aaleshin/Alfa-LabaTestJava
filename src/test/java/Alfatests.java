package test.java;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Alfatests {
//    private WebDriver driver;
//    private String baseUrl;
//    private static final String wiley = "WileyPLUS";

//    @BeforeClass
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
//        driver = new ChromeDriver();
//        baseUrl = "http://www.wiley.com/WileyCDA/";
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//    }


    @Test
    public void readFile() throws IOException {
        File file = new File("/home/aaleshin/IdeaProjects/Alfa-LabaTestJava/randomnumbers.txt");

        //Если требуемого файла не существует.
        if(!file.exists()) {
            //Создаем его.
            file.createNewFile();
        }

        // Создание объекта FileWriter
        FileWriter writer = new FileWriter(file);



        // Запись содержимого в файл
        writer.write("Это простой пример,\n в котором мы осуществляем\n с помощью языка Java\n запись в файл\n и чтение из файла\n");
        writer.flush();
        writer.close();

        // Создание объекта FileReader
        FileReader fr = new FileReader(file);
        char[] a = new char[200];   // Количество символов, которое будем считывать
        fr.read(a);   // Чтение содержимого в массив

        for (char c : a)
            System.out.print(c);   // Вывод символов один за другими
        fr.close();

    }

}
