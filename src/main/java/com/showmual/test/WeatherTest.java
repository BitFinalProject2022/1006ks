package com.showmual.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class WeatherTest {
	public static void main(String[] args) {
        try{
            //OpenAPI call하는 URL
            String urlstr = "https://api.openweathermap.org/data/2.5/weather?id=1835848&appid=591600f298a1fa81342213662b1c357b";
            URL url = new URL(urlstr);
            BufferedReader bf;
            String line;
            String result = "";

            //날씨 정보를 받아온다.
            bf = new BufferedReader(new InputStreamReader(url.openStream()));

            //버퍼에 있는 정보를 문자열로 변환.
            while((line=bf.readLine()) != null){
                result = result.concat(line);
            }

            //문자열을 JSON으로 파싱
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObj = (JSONObject) jsonParser.parse(result);

            //지역 출력
            System.out.println("지역 : " + jsonObj.get("name"));

            //날씨 출력
            JSONArray weatherArray = (JSONArray) jsonObj.get("weather");
            JSONObject obj = (JSONObject) weatherArray.get(0);
            System.out.println("날씨 : " + obj.get("main"));

            //온도 출력
            JSONObject mainArray = (JSONObject) jsonObj.get("main");
            double ktemp = Double.parseDouble(mainArray.get("temp").toString());
            double temp = ktemp - 273.15;
            System.out.printf("온도 : %.0f\n" , temp);

            bf.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
