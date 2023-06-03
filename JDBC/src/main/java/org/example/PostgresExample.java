package org.example;

import java.sql.*;

public class PostgresExample {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5444/postgres";
        String user = "postgres";
        String password = "awni";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url,user,password);
            // check if the user tables exists before creating one
//            String query = "SELECT EXISTS (SELECT 1 FROM information_schema.tables where table_name = 'users'";
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//            rs.next();
//            boolean exists = rs.getBoolean(1);
//            if(!exists){
            Statement stm = conn.createStatement();
            // we should use execute not execute querry for statements that does not return results
//            String query = "CREATE TABLE IF NOT EXISTS student(id SERIAL PRIMARY KEY, first_name VARCHAR(255) NOT NULL, last_name VARCHAR(255) NOT NULL, email VARCHAR(255) NOT NULL, created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP)";
//            String query = "CREATE TABLE IF NOT EXISTS instructor(id SERIAL PRIMARY KEY NOT NULL ,first_name varchar(45) DEFAULT NULL, last_name varchar(45) DEFAULT NULL,email varchar(45) DEFAULT NULL, instructor_detail_id INTEGER DEFAULT NULL)";
              String query ="CREATE TABLE IF NOT EXISTS instructor_detail(id SERIAL PRIMARY KEY NOT NULL, youtube_channel varchar(128) DEFAULT NULL, hobby varchar(45) DEFAULT NULL)";
              stm.execute(query);
            System.out.println("Table create d successfully ");


            
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

