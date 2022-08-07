package PbWifi;

import java.util.ArrayList;

public class HTML {
    public String toDOM(Wifi_Info wifi_info) {
        StringBuilder sb = new StringBuilder();
        sb.append("<tr>");
        sb.append(" <td>");
        sb.append(wifi_info.getDISTANCE());
        sb.append("</td>");
        sb.append(" <td>");
        sb.append(wifi_info.getX_SWIFI_MGR_NO());
        sb.append("</td>");
        sb.append(" <td>");
        sb.append(wifi_info.getX_SWIFI_WRDOFC());
        sb.append("</td>");
        sb.append(" <td>");
        sb.append(wifi_info.getX_SWIFI_MAIN_NM());
        sb.append("</td>");
        sb.append(" <td>");
        sb.append(wifi_info.getX_SWIFI_ADRES1());
        sb.append("</td>");
        sb.append(" <td>");
        sb.append(wifi_info.getX_SWIFI_ADRES2());
        sb.append("</td>");
        sb.append(" <td>");
        sb.append(wifi_info.getX_SWIFI_INSTL_FLOOR());
        sb.append("</td>");
        sb.append(" <td>");
        sb.append(wifi_info.getX_SWIFI_INSTL_TY());
        sb.append("</td>");
        sb.append(" <td>");
        sb.append(wifi_info.getX_SWIFI_INSTL_MBY());
        sb.append("</td>");
        sb.append(" <td>");
        sb.append(wifi_info.getX_SWIFI_SVC_SE());
        sb.append("</td>");
        sb.append(" <td>");
        sb.append(wifi_info.getX_SWIFI_CMCWR());
        sb.append("</td>");
        sb.append(" <td>");
        sb.append(wifi_info.getX_SWIFI_CNSTC_YEAR());
        sb.append("</td>");
        sb.append(" <td>");
        sb.append(wifi_info.getX_SWIFI_INOUT_DOOR());
        sb.append("</td>");
        sb.append(" <td>");
        sb.append(wifi_info.getX_SWIFI_REMARS3());
        sb.append("</td>");
        sb.append(" <td>");
        sb.append(wifi_info.getLAT());
        sb.append("</td>");
        sb.append(" <td>");
        sb.append(wifi_info.getLNT());
        sb.append("</td>");
        sb.append(" <td>");
        sb.append(wifi_info.getWORK_DTTM());
        sb.append("</td>");
        sb.append("</tr>");

        return sb.toString();
    }

    public String toDOM(User_Info user_info) {
        StringBuilder sb = new StringBuilder();
        sb.append("<tr>");
        sb.append(" <td>");
        sb.append(user_info.getID());
        sb.append("</td>");
        sb.append(" <td>");
        sb.append(user_info.getLAT());
        sb.append("</td>");
        sb.append(" <td>");
        sb.append(user_info.getLNT());
        sb.append("</td>");
        sb.append(" <td>");
        sb.append(user_info.getVEIW_DATE());
        sb.append("</td>");
        sb.append(" <td>");
        sb.append("<button type=\"button\" onclick=\"row_delete()\">삭제</button>");
        sb.append("</td>");
        sb.append("</tr>");

        return sb.toString();
    }

    public String renderTable(ArrayList<Wifi_Info> wifi_infos) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wifi_infos.size(); i++) {
            sb.append(toDOM(wifi_infos.get(i)));
        }
        return sb.toString();
    }

    public String renderTable2(ArrayList<User_Info> user_info_arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < user_info_arr.size(); i++) {
            sb.append(toDOM(user_info_arr.get(i)));
        }
        return sb.toString();
    }
}
