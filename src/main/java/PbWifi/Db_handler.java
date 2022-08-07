package PbWifi;

import java.sql.*;
import java.util.ArrayList;

public class Db_handler {

    public void drop_Near_Wifi_Info() {
        String url = "jdbc:sqlite:C:\\Users\\dlwhd\\DataGripProjects\\Data_Study\\identifier.sqlite";

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("드라이버 연결 실패");
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(url);

            String sql = " drop table Near_Wifi_Info ";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void create_Near_Wifi_Info() {
        String url = "jdbc:sqlite:C:\\Users\\dlwhd\\DataGripProjects\\Data_Study\\identifier.sqlite";

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("드라이버 연결 실패");
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(url);

            String sql = " CREATE TABLE `Near_Wifi_Info` ( " +
                    " `DISTANCE`            DECIMAL      NULL, " +
                    " `X_SWIFI_MGR_NO`      VARCHAR(255) NOT NULL, " +
                    " `X_SWIFI_WRDOFC`      VARCHAR(255) NULL, " +
                    " `X_SWIFI_MAIN_NM`     VARCHAR(255) NULL, " +
                    " `X_SWIFI_ADRES1`      VARCHAR(255) NULL, " +
                    " `X_SWIFI_ADRES2`      VARCHAR(255) NULL, " +
                    " `X_SWIFI_INSTL_FLOOR` VARCHAR(255) NULL, " +
                    " `X_SWIFI_INSTL_TY`    VARCHAR(255) NULL, " +
                    " `X_SWIFI_INSTL_MBY`   VARCHAR(255) NULL, " +
                    " `X_SWIFI_SVC_SE`      VARCHAR(255) NULL, " +
                    " `X_SWIFI_CMCWR`       VARCHAR(255) NULL, " +
                    " `X_SWIFI_CNSTC_YEAR`  VARCHAR(255) NULL, " +
                    " `X_SWIFI_INOUT_DOOR`  VARCHAR(255) NULL, " +
                    " `X_SWIFI_REMARS3`     VARCHAR(255) NULL, " +
                    " `LAT`                 DECIMAL      NULL, " +
                    " `LNT`                 DECIMAL      NULL, " +
                    " `WORK_DTTM`           VARCHAR(255) NULL " +
                    ")";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void drop_Pb_Wifi_Info() {
        String url = "jdbc:sqlite:C:\\Users\\dlwhd\\DataGripProjects\\Data_Study\\identifier.sqlite";

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("드라이버 연결 실패");
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(url);

            String sql = " drop table Pb_Wifi_Info ";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void create_Pb_Wifi_Info() {
        String url = "jdbc:sqlite:C:\\Users\\dlwhd\\DataGripProjects\\Data_Study\\identifier.sqlite";

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("드라이버 연결 실패");
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(url);

            String sql = "CREATE TABLE `Pb_Wifi_Info` (" +
                    " `X_SWIFI_MGR_NO`      VARCHAR(255) NOT NULL, " +
                    " `X_SWIFI_WRDOFC`      VARCHAR(255) NULL, " +
                    " `X_SWIFI_MAIN_NM`     VARCHAR(255) NULL, " +
                    " `X_SWIFI_ADRES1`      VARCHAR(255) NULL, " +
                    " `X_SWIFI_ADRES2`      VARCHAR(255) NULL, " +
                    " `X_SWIFI_INSTL_FLOOR` VARCHAR(255) NULL, " +
                    " `X_SWIFI_INSTL_TY`    VARCHAR(255) NULL, " +
                    " `X_SWIFI_INSTL_MBY`   VARCHAR(255) NULL, " +
                    " `X_SWIFI_SVC_SE`      VARCHAR(255) NULL, " +
                    " `X_SWIFI_CMCWR`       VARCHAR(255) NULL, " +
                    " `X_SWIFI_CNSTC_YEAR`  VARCHAR(255) NULL, " +
                    " `X_SWIFI_INOUT_DOOR`  VARCHAR(255) NULL, " +
                    " `X_SWIFI_REMARS3`     VARCHAR(255) NULL, " +
                    " `LAT`                 DECIMAL      NULL, " +
                    " `LNT`                 DECIMAL      NULL, " +
                    " `WORK_DTTM`           VARCHAR(255) NULL, " +
                    " `COS_LAT`             DECIMAL      NULL, " +
                    " `SIN_LAT`             DECIMAL      NULL, " +
                    " `COS_LNT`             DECIMAL      NULL, " +
                    " `SIN_LNT`             DECIMAL      NULL " +
                    ") ";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public int Pb_Wifi_Info_Insert(Wifi_Info[] wifi_infos) {
        String url = "jdbc:sqlite:C:\\Users\\dlwhd\\DataGripProjects\\Data_Study\\identifier.sqlite";
        int result = 0;

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("드라이버 연결 실패");
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(url);

            String sql = " insert into Pb_Wifi_Info " +
                    " (X_SWIFI_MGR_NO, X_SWIFI_WRDOFC, X_SWIFI_MAIN_NM, X_SWIFI_ADRES1, X_SWIFI_ADRES2, X_SWIFI_INSTL_FLOOR, X_SWIFI_INSTL_TY, X_SWIFI_INSTL_MBY, X_SWIFI_SVC_SE, X_SWIFI_CMCWR, X_SWIFI_CNSTC_YEAR, X_SWIFI_INOUT_DOOR, X_SWIFI_REMARS3, LAT, LNT, WORK_DTTM, COS_LAT, SIN_LAT, COS_LNT, SIN_LNT) " +
                    " values " +
                    " (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

            preparedStatement = connection.prepareStatement(sql);

            for (int i = 0; i < wifi_infos.length; i++) {
                preparedStatement.setString(1, wifi_infos[i].getX_SWIFI_MGR_NO());
                preparedStatement.setString(2, wifi_infos[i].getX_SWIFI_WRDOFC());
                preparedStatement.setString(3, wifi_infos[i].getX_SWIFI_MAIN_NM());
                preparedStatement.setString(4, wifi_infos[i].getX_SWIFI_ADRES1());
                preparedStatement.setString(5, wifi_infos[i].getX_SWIFI_ADRES2());
                preparedStatement.setString(6, wifi_infos[i].getX_SWIFI_INSTL_FLOOR());
                preparedStatement.setString(7, wifi_infos[i].getX_SWIFI_INSTL_TY());
                preparedStatement.setString(8, wifi_infos[i].getX_SWIFI_INSTL_MBY());
                preparedStatement.setString(9, wifi_infos[i].getX_SWIFI_SVC_SE());
                preparedStatement.setString(10, wifi_infos[i].getX_SWIFI_CMCWR());
                preparedStatement.setString(11, wifi_infos[i].getX_SWIFI_CNSTC_YEAR());
                preparedStatement.setString(12, wifi_infos[i].getX_SWIFI_INOUT_DOOR());
                preparedStatement.setString(13, wifi_infos[i].getX_SWIFI_REMARS3());
                preparedStatement.setDouble(14, wifi_infos[i].getLAT());
                preparedStatement.setDouble(15, wifi_infos[i].getLNT());
                preparedStatement.setString(16, wifi_infos[i].getWORK_DTTM());
                preparedStatement.setDouble(17, wifi_infos[i].getCOS_LAT());
                preparedStatement.setDouble(18, wifi_infos[i].getSIN_LAT());
                preparedStatement.setDouble(19, wifi_infos[i].getCOS_LNT());
                preparedStatement.setDouble(20, wifi_infos[i].getSIN_LNT());

                if (preparedStatement.executeUpdate() > 0) {
                    result += 1;
                }
            }

        } catch (Exception e) {
         e.printStackTrace();
        } finally {

            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public int Near_Wifi_Info_Insert(ArrayList<Wifi_Info> wifi_info_arr) {
        String url = "jdbc:sqlite:C:\\Users\\dlwhd\\DataGripProjects\\Data_Study\\identifier.sqlite";
        int result = 0;

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("드라이버 연결 실패");
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(url);

            String sql = " insert into Near_Wifi_Info " +
                    " (DISTANCE, X_SWIFI_MGR_NO, X_SWIFI_WRDOFC, X_SWIFI_MAIN_NM, X_SWIFI_ADRES1, X_SWIFI_ADRES2, X_SWIFI_INSTL_FLOOR, X_SWIFI_INSTL_TY, X_SWIFI_INSTL_MBY, X_SWIFI_SVC_SE, X_SWIFI_CMCWR, X_SWIFI_CNSTC_YEAR, X_SWIFI_INOUT_DOOR, X_SWIFI_REMARS3, LAT, LNT, WORK_DTTM) " +
                    " values " +
                    " (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

            preparedStatement = connection.prepareStatement(sql);

            for (int i = 0; i < wifi_info_arr.size(); i++) {

                preparedStatement.setDouble(1, wifi_info_arr.get(i).getDISTANCE());
                preparedStatement.setString(2, wifi_info_arr.get(i).getX_SWIFI_MGR_NO());
                preparedStatement.setString(3, wifi_info_arr.get(i).getX_SWIFI_WRDOFC());
                preparedStatement.setString(4, wifi_info_arr.get(i).getX_SWIFI_MAIN_NM());
                preparedStatement.setString(5, wifi_info_arr.get(i).getX_SWIFI_ADRES1());
                preparedStatement.setString(6, wifi_info_arr.get(i).getX_SWIFI_ADRES2());
                preparedStatement.setString(7, wifi_info_arr.get(i).getX_SWIFI_INSTL_FLOOR());
                preparedStatement.setString(8, wifi_info_arr.get(i).getX_SWIFI_INSTL_TY());
                preparedStatement.setString(9, wifi_info_arr.get(i).getX_SWIFI_INSTL_MBY());
                preparedStatement.setString(10, wifi_info_arr.get(i).getX_SWIFI_SVC_SE());
                preparedStatement.setString(11, wifi_info_arr.get(i).getX_SWIFI_CMCWR());
                preparedStatement.setString(12, wifi_info_arr.get(i).getX_SWIFI_CNSTC_YEAR());
                preparedStatement.setString(13, wifi_info_arr.get(i).getX_SWIFI_INOUT_DOOR());
                preparedStatement.setString(14, wifi_info_arr.get(i).getX_SWIFI_REMARS3());
                preparedStatement.setDouble(15, wifi_info_arr.get(i).getLAT());
                preparedStatement.setDouble(16, wifi_info_arr.get(i).getLNT());
                preparedStatement.setString(17, wifi_info_arr.get(i).getWORK_DTTM());

                if (preparedStatement.executeUpdate() > 0) {
                    result += 1;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public void insert_User_Info(double LAT, double LNT) {
        String url = "jdbc:sqlite:C:\\Users\\dlwhd\\DataGripProjects\\Data_Study\\identifier.sqlite";

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("드라이버 연결 실패");
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(url);

            String sql = " insert into User_Info " +
                    " (LAT, LNT, VEIW_DATE) " +
                    " values " +
                    " (?, ?, current_timestamp); ";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setDouble(1, LAT);
            preparedStatement.setDouble(2, LNT);
            preparedStatement.execute();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public String Near_Wifi_Search(double LAT, double LNT) {
        insert_User_Info(LAT, LNT);
        String result;

        String url = "jdbc:sqlite:C:\\Users\\dlwhd\\DataGripProjects\\Data_Study\\identifier.sqlite";

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;


        try {
            connection = DriverManager.getConnection(url);

            String sql = " select " + build_Distance_Query(LAT, LNT) + " as partial_distance " + ", " +
                    " X_SWIFI_MGR_NO, X_SWIFI_WRDOFC, X_SWIFI_MAIN_NM, X_SWIFI_ADRES1, X_SWIFI_ADRES2, X_SWIFI_INSTL_FLOOR, X_SWIFI_INSTL_TY, X_SWIFI_INSTL_MBY, X_SWIFI_SVC_SE, X_SWIFI_CMCWR, X_SWIFI_CNSTC_YEAR, X_SWIFI_INOUT_DOOR, X_SWIFI_REMARS3, LAT, LNT, WORK_DTTM " +
                    " from Pb_Wifi_Info " +
                    " order by partial_distance desc " +
                    " limit 20 ";

            preparedStatement = connection.prepareStatement(sql);

            rs = preparedStatement.executeQuery();

            ArrayList<Wifi_Info> wifi_info_arr = new ArrayList<>();

            while (rs.next()) {
                Wifi_Info tmp = new Wifi_Info();

                double partial_distance = rs.getDouble("partial_distance");
                double distance = 6371 * Math.acos(partial_distance);
                tmp.setDISTANCE(Double.parseDouble(String.format("%.4f", distance)));
                tmp.setX_SWIFI_MGR_NO(rs.getString("X_SWIFI_MGR_NO"));
                tmp.setX_SWIFI_WRDOFC(rs.getString("X_SWIFI_WRDOFC"));
                tmp.setX_SWIFI_MAIN_NM(rs.getString("X_SWIFI_MAIN_NM"));
                tmp.setX_SWIFI_ADRES1(rs.getString("X_SWIFI_ADRES1"));
                tmp.setX_SWIFI_ADRES2(rs.getString("X_SWIFI_ADRES2"));
                tmp.setX_SWIFI_INSTL_FLOOR(rs.getString("X_SWIFI_INSTL_FLOOR"));
                tmp.setX_SWIFI_INSTL_TY(rs.getString("X_SWIFI_INSTL_TY"));
                tmp.setX_SWIFI_INSTL_MBY(rs.getString("X_SWIFI_INSTL_MBY"));
                tmp.setX_SWIFI_SVC_SE(rs.getString("X_SWIFI_SVC_SE"));
                tmp.setX_SWIFI_CMCWR(rs.getString("X_SWIFI_CMCWR"));
                tmp.setX_SWIFI_CNSTC_YEAR(rs.getString("X_SWIFI_CNSTC_YEAR"));
                tmp.setX_SWIFI_INOUT_DOOR(rs.getString("X_SWIFI_INOUT_DOOR"));
                tmp.setX_SWIFI_REMARS3(rs.getString("X_SWIFI_REMARS3"));
                tmp.setLAT(rs.getDouble("LAT"));
                tmp.setLNT(rs.getDouble("LNT"));
                tmp.setWORK_DTTM(rs.getString("WORK_DTTM"));

                wifi_info_arr.add(tmp);
            }

            HTML html = new HTML();
            result = html.renderTable(wifi_info_arr);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public String build_Distance_Query(double LAT, double LNT) {
        double sinLat = Math.sin(Math.toRadians(LAT));
        double cosLat = Math.cos(Math.toRadians(LAT));
        double sinLnt = Math.sin(Math.toRadians(LNT));
        double cosLnt = Math.cos(Math.toRadians(LNT));

        return "(" + cosLat + "*COS_LAT*(COS_LNT*" + cosLnt + "+SIN_LNT*" + sinLnt + ")+" + sinLat + "*SIN_LAT)";

    }

    public String User_Info_Search() {
        String result;

        String url = "jdbc:sqlite:C:\\Users\\dlwhd\\DataGripProjects\\Data_Study\\identifier.sqlite";

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;


        try {
            connection = DriverManager.getConnection(url);

            String sql = " select * " +
                    " from User_Info ";

            preparedStatement = connection.prepareStatement(sql);

            rs = preparedStatement.executeQuery();

            ArrayList<User_Info> user_info_arr = new ArrayList<>();

            while (rs.next()) {
                User_Info tmp = new User_Info();

                tmp.setID(Integer.parseInt(rs.getString("ID")));
                tmp.setLAT(Double.parseDouble(rs.getString("LAT")));
                tmp.setLNT(Double.parseDouble(rs.getString("LNT")));
                tmp.setVEIW_DATE(rs.getString("VEIW_DATE"));

                user_info_arr.add(tmp);
            }

            HTML html = new HTML();
            result = html.renderTable2(user_info_arr);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public void delete_User_Info(String ID) {
        String url = "jdbc:sqlite:C:\\Users\\dlwhd\\DataGripProjects\\Data_Study\\identifier.sqlite";

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("드라이버 연결 실패");
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(url);

            String sql = " delete from User_Info " +
                    " where ID = ? ";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ID);
            preparedStatement.execute();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
