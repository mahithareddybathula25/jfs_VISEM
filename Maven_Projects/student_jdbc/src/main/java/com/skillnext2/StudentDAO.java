package com.skillnext2;

import java.sql.*;

public class StudentDAO {

    Connection con;

    public StudentDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/skillnext2_db",
                "root",
                "mahitha@2006"
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addStudent(Student s) {
        try {
            PreparedStatement pst = con.prepareStatement(
                "INSERT INTO student VALUES (?, ?, ?, ?)"
            );

            pst.setInt(1, s.rollno);
            pst.setString(2, s.name);
            pst.setString(3, s.email);
            pst.setString(4, s.branch);

            pst.executeUpdate();
            System.out.println("Inserted!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewStudents() {
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                System.out.println(
                    rs.getInt(1) + " | " +
                    rs.getString(2) + " | " +
                    rs.getString(3) + " | " +
                    rs.getString(4)
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
