package pl.sda.openweather;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.openweather.Model.Weather;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {

        WeatherService weatherService = new WeatherService("http://api.apixu.com/v1/current.json", "?key=b35651bdf5804676baf91743191002&q=");

        weatherService.getCityWeather("Barcelona");

    }
}
