package pl.sda.openweather;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.openweather.Model.Weather;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;


public class WeatherService {

    private String finalURL;

    public WeatherService(String url, String apiKey) {
        this.finalURL = url + apiKey;
    }

    public void getCityWeather(String city){

        try{
            URL jsonURL = new URL(finalURL+city);
            ObjectMapper objectMapper = new ObjectMapper();
            Weather weather = objectMapper.readValue(jsonURL, Weather.class);
            System.out.println("Temperatura dla: " + city);
            System.out.println(weather.getCurrent().getTemp_c());
//            System.out.println(weather);
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}



