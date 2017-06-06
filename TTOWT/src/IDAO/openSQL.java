package IDAO;

import java.sql.*;
/**
 * Created by hacker on 17-6-6.
 */
public class openSQL {
    public static int insertsql(String Sql) throws SQLException {
        try {

            //加载数据库驱动，注册到去送管理器
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/TTOWT";
            String username = "root";
            String password = "123456";
            Statement statement = null;
            ResultSet res = null;
            Connection conn = DriverManager.getConnection(url, username, password);
            if (conn != null) {
                System.out.println("数据库连接成功!");
                String sql = "select * from action";
                res = statement.executeQuery(sql);

                while (res.next()) {
                    String enmae = res.getString("where");
                    System.out.println(enmae);
                }
                conn.close();
            } else {
                System.out.println("数据库连接失败!");

                conn.close();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return 0;

    }

    public int updatesql(String Sql) throws SQLException {
        try {

            //加载数据库驱动，注册到去送管理器
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/TTOWT";
            String username = "root";
            String password = "123456";
            Statement statement = null;
            ResultSet res = null;
            Connection conn = DriverManager.getConnection(url, username, password);
            if (conn != null) {
                System.out.println("数据库连接成功!");
                String sql = "select * from action";
                res = statement.executeQuery(sql);

                while (res.next()) {
                    String enmae = res.getString("where");
                    System.out.println(enmae);
                }
                conn.close();
            } else {
                System.out.println("数据库连接失败!");

                conn.close();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return 0;

    }

    public int deletesql(String Sql) throws SQLException {
        try {

            //加载数据库驱动，注册到去送管理器
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/TTOWT";
            String username = "root";
            String password = "123456";
            Statement statement = null;
            ResultSet res = null;
            Connection conn = DriverManager.getConnection(url, username, password);
            if (conn != null) {
                System.out.println("数据库连接成功!");
                String sql = "select * from action";
                res = statement.executeQuery(sql);

                while (res.next()) {
                    String enmae = res.getString("where");
                    System.out.println(enmae);
                }
                conn.close();
            } else {
                System.out.println("数据库连接失败!");

                conn.close();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return 0;

    }


}
