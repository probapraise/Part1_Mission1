package PbWifi;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;


public class API {
    public void API_Connect(int start, int end) throws IOException {
        String START_INDEX = String.valueOf(start);
        String END_INDEX = String.valueOf(end);
        StringBuilder urlBuilder = new StringBuilder("http://openapi.seoul.go.kr:8088"); /*URL*/
        urlBuilder.append("/" +  URLEncoder.encode("63466d4e66646c7731303659526d5858","UTF-8") ); /*인증키 (sample사용시에는 호출시 제한됩니다.)*/
        urlBuilder.append("/" +  URLEncoder.encode("json","UTF-8") ); /*요청파일타입 (xml,xmlf,xls,json) */
        urlBuilder.append("/" + URLEncoder.encode("TbPublicWifiInfo","UTF-8")); /*서비스명 (대소문자 구분 필수입니다.)*/
        urlBuilder.append("/" + URLEncoder.encode(START_INDEX,"UTF-8")); /*요청시작위치 (sample인증키 사용시 5이내 숫자)*/
        urlBuilder.append("/" + URLEncoder.encode(END_INDEX,"UTF-8")); /*요청종료위치(sample인증키 사용시 5이상 숫자 선택 안 됨)*/

        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        conn.setDoOutput(true);
//        System.out.println("Response code: " + conn.getResponseCode()); /* 연결 자체에 대한 확인이 필요하므로 추가합니다.*/
        BufferedReader rd;

        // 서비스코드가 정상이면 200~300사이의 숫자가 나옵니다.
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();

        JsonObject jsonData = (JsonObject) JsonParser.parseString(sb.toString());
        JsonObject TbPublicWifiInfo = (JsonObject) jsonData.get("TbPublicWifiInfo");
        JsonArray jsonArray = (JsonArray) TbPublicWifiInfo.get("row");

        Db_handler db_handler = new Db_handler();
        Wifi_Info[] wifi_infos = new Wifi_Info[end - start + 1];

        for (int i = 0; i < jsonArray.size(); i++) {
            JsonObject jo = (JsonObject) jsonArray.get(i);
            Wifi_Info tmp = new Wifi_Info();
            tmp.setX_SWIFI_MGR_NO(jo.get("X_SWIFI_MGR_NO").getAsString());
            tmp.setX_SWIFI_WRDOFC(jo.get("X_SWIFI_WRDOFC").getAsString());
            tmp.setX_SWIFI_MAIN_NM(jo.get("X_SWIFI_MAIN_NM").getAsString());
            tmp.setX_SWIFI_ADRES1(jo.get("X_SWIFI_ADRES1").getAsString());
            tmp.setX_SWIFI_ADRES2(jo.get("X_SWIFI_ADRES2").getAsString());
            tmp.setX_SWIFI_INSTL_FLOOR(jo.get("X_SWIFI_INSTL_FLOOR").getAsString());
            tmp.setX_SWIFI_INSTL_TY(jo.get("X_SWIFI_INSTL_TY").getAsString());
            tmp.setX_SWIFI_INSTL_MBY(jo.get("X_SWIFI_INSTL_MBY").getAsString());
            tmp.setX_SWIFI_SVC_SE(jo.get("X_SWIFI_SVC_SE").getAsString());
            tmp.setX_SWIFI_CMCWR(jo.get("X_SWIFI_CMCWR").getAsString());
            tmp.setX_SWIFI_CNSTC_YEAR(jo.get("X_SWIFI_CNSTC_YEAR").getAsString());
            tmp.setX_SWIFI_INOUT_DOOR(jo.get("X_SWIFI_INOUT_DOOR").getAsString());
            tmp.setX_SWIFI_REMARS3(jo.get("X_SWIFI_REMARS3").getAsString());
            tmp.setWORK_DTTM(jo.get("WORK_DTTM").getAsString());

            double lat = jo.get("LNT").getAsDouble();
            double lnt = jo.get("LAT").getAsDouble();
            tmp.setLAT(jo.get("LNT").getAsDouble());
            tmp.setLNT(jo.get("LAT").getAsDouble());
            tmp.setCOS_LAT(Math.cos(Math.toRadians(lat)));
            tmp.setSIN_LAT(Math.sin(Math.toRadians(lat)));
            tmp.setCOS_LNT(Math.cos(Math.toRadians(lnt)));
            tmp.setSIN_LNT(Math.sin(Math.toRadians(lnt)));

            wifi_infos[i] = tmp;
        }

        int r = db_handler.Pb_Wifi_Info_Insert(wifi_infos);
        System.out.println(r + "개의 데이터가 성공적으로 저장되었습니다.");
    }

    public int get_Wifi_Info() throws IOException {
        Db_handler db_handler = new Db_handler();
        db_handler.drop_Pb_Wifi_Info();
        db_handler.create_Pb_Wifi_Info();

        StringBuilder urlBuilder = new StringBuilder("http://openapi.seoul.go.kr:8088"); /*URL*/
        urlBuilder.append("/" +  URLEncoder.encode("63466d4e66646c7731303659526d5858","UTF-8") ); /*인증키 (sample사용시에는 호출시 제한됩니다.)*/
        urlBuilder.append("/" +  URLEncoder.encode("json","UTF-8") ); /*요청파일타입 (xml,xmlf,xls,json) */
        urlBuilder.append("/" + URLEncoder.encode("TbPublicWifiInfo","UTF-8")); /*서비스명 (대소문자 구분 필수입니다.)*/
        urlBuilder.append("/" + URLEncoder.encode("1","UTF-8")); /*요청시작위치 (sample인증키 사용시 5이내 숫자)*/
        urlBuilder.append("/" + URLEncoder.encode("5","UTF-8")); /*요청종료위치(sample인증키 사용시 5이상 숫자 선택 안 됨)*/

        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        conn.setDoOutput(true);
        System.out.println("Response code: " + conn.getResponseCode()); /* 연결 자체에 대한 확인이 필요하므로 추가합니다.*/
        BufferedReader rd;

        // 서비스코드가 정상이면 200~300사이의 숫자가 나옵니다.
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();

        JsonObject jsonData = (JsonObject) JsonParser.parseString(sb.toString());
        JsonObject TbPublicWifiInfo = (JsonObject) jsonData.get("TbPublicWifiInfo");

        int total_count = Integer.parseInt(String.valueOf(TbPublicWifiInfo.get("list_total_count")));
        int prev = total_count / 1000;

        API api = new API();

        for (int i = 0; i < prev; i++) {
            int start = (i * 1000) + 1;
            int end = (i + 1) * 1000;
            api.API_Connect(start, end);
        }

        api.API_Connect((prev*1000) + 1, total_count);

        System.out.println("총 " + total_count + "개의 WIFI 정보를 정상적으로 저장하였습니다.");
        return total_count;
    }

}
