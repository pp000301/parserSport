package com.valerii.parser.controlers.parserEvents;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ParserEventsRecycler {

    public static List<String> getLinks (List<WebElement> webElements ) {
        List<String> result = new ArrayList<>();
        webElements.stream().forEach(webElement -> {
            result.add(webElement.getAttribute("href"));
        });
        return result;
    }

    public static  List<String> getResultListOfMinute(List<String> minutes){
        List<String> resultList = new ArrayList<>();
        for (int i = 1; i <minutes.size(); i++) {
            resultList.add(minutes.get(i));
        }
        return resultList;
    }

    public static List<String> getResultListOfMinuteGoals(List<WebElement> matchEvents1, List<String> minutesRes){
        List<String> resultList = new ArrayList<>();

        for (int i = 0; i < minutesRes.size(); i++) {
            String resCentral = "";

            if (matchEvents1.get(i).getText().equals("") | matchEvents1.get(i).getText().equals(" "))
                resCentral = "...";
            else
                resCentral = matchEvents1.get(i).getText();

            if (!resCentral.equals("..."))
                resultList.add(minutesRes.get(i));
        }

        return resultList;
    }

    public static List<String> getListOfMinute(List<WebElement> webElements){
        List<String> resultList = new ArrayList<>();
        webElements.stream().filter(res->!res.getText().equals("")).forEach(res->resultList.add(res.getText()));
        return resultList;
    }
}
