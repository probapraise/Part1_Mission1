package PbWifi;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
       API api = new API();
       Db_handler db_handler = new Db_handler();

       db_handler.Near_Wifi_Search(37.47987,126.94788);

    }
}