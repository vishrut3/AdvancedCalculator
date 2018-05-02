package com.example.vibhavkotriwala.advancedcalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class NumbersApi {

    public String getUrl(String url) throws IOException {
        URL numbersApi = new URL(url);
        URLConnection api = numbersApi.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        api.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null)
            return inputLine;
        in.close();
        return inputLine;
    }

    public String getResponse(int num) {
        ArrayList<String> typeList = new ArrayList<>();
        typeList.add("trivia");
        typeList.add("math");
        typeList.add("date");
        typeList.add("year");

        int index = (int)(Math.random() % typeList.size());

        String type = typeList.get(index);

        return "http://numbersapi.com/" + Integer.toString(num) + "/" + type;
    }
}