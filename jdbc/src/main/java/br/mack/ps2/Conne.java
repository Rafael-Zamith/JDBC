package br.mack.ps2;

import java.math.BigDecimal;
import java.sql.*;

public class Conne {
    
    public void add(int num, String saldo) {

        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:32775/contas";
            conn = DriverManager.getConnection(url, "root", "root");

            String sql = "INSERT INTO contas VALUES (?, ?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setLong(1, num);
            pstm.setBigDecimal(2, new BigDecimal(saldo));

            int rs = pstm.executeUpdate();
            System.out.println("Atualizado os registros: " + rs);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void remove(int num) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:32775/contas";
            conn = DriverManager.getConnection(url, "root", "root");

            String sql = "DELETE FROM contas WHERE nro_conta = ?;";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setLong(1, num);

            int rs = pstm.executeUpdate();
            System.out.println("Atualizado os registros: " + rs);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
    

}