package cn.yunhe.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class IndexDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        Connection con = DriverManager.getConnection(url, "scott", "tiger");
        String sql = "insert into tb_index_test values(seq_tb_test.nextval,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        String username = "";
        int age = 1;
        String[] citys = {"北京", "上海", "杭州", "郑州", "天津", "重庆", "宁波", "洛阳", "西安", "兰州"};
        String city = "";
        for (int i = 0; i < 1000000; i++) {
            username = "user" + i;
            age = new Random().nextInt(100);
            city = citys[new Random().nextInt(10)];
            ps.setString(1, username);
            ps.setInt(2, age);
            ps.setString(3, city);
            ps.executeUpdate();
        }

    }
}
