package com.udemy.spring_framework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SimpleFetch {

    private static String BASE_URL = "http://192.168.1.39:8080";

    public static void main(String[] args) {
        for (int i = 0; i < 1000500; i++) {
            try {
                URL url = new URL(BASE_URL + "/hello");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String resp = in.readLine();
                in.close();
                System.out.println(resp);

            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }
}
