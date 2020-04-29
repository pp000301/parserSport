package com.valerii.parser.controlers;

import com.valerii.parser.controlers.entity.Test;
import com.valerii.parser.controlers.parserEvents.ParserEventsRecycler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
public class MainControler {

    @GetMapping("/index")
    public String mainTest(Model model){
        model.addAttribute("test1","test mesege");
          model.addAttribute("test",new Test());

//        System.setProperty("webdriver.gecko.driver", "f:\\Idea Progects\\parserSoccer\\driver\\geckodriver.exe");
//        //  System.setProperty("webdriver.chrome.driver", "f:\\Idea Progects\\parserSoccer\\driver\\chromedriver.exe");
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.get("https://www.livescore.com/soccer/2020-02-11/");
//        List<WebElement> webElement = driver.findElements(By.xpath("//a[@data-type='evt']"));
//
//        List<String> links = ParserEventsRecycler.getLinks(webElement);// Получаем ссылки для парсинга 2 последних пустые!
//        driver.get(links.get(17));// Переход по ссылке для парсинга.
//        System.out.println(links.get(17));
//
//        List<WebElement> minutesEvent = driver.findElements(By.className("min"));
//        List<String> minutes =ParserEventsRecycler.getListOfMinute(minutesEvent);// Получение начального списка минут.
//
//        List<String> minutesRes = ParserEventsRecycler.getResultListOfMinute(minutes);// Результирующий список с минутаим событий (без первого элемента).
//
//        List<WebElement> matchEvents = driver.findElements(By.xpath("//div[@data-type='middle']"));//Парсинг среднего столбца
//
//        List<String> minutesOfGoals = ParserEventsRecycler.getResultListOfMinuteGoals(matchEvents,minutesRes);// Результирующий список с минутами голов.
//        final String[] resultString = {""};
//        minutesOfGoals.forEach(minute->{
//            resultString[0] = resultString[0] + minute;
//        });
//        model.addAttribute("test",Test.builder().testString(resultString[0]).build());
//        driver.quit();

        return "index";
    }

    @PostMapping("/index")
    public  String testSubmit(@ModelAttribute Test testentity, Model model){
        model.addAttribute("testmesege",testentity);
//        System.out.println("test!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        return  "result";
    }

}
