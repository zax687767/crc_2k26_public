package com.fakesecrets.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Database connection configurations with hardcoded credentials.
 * FALSE POSITIVE BENCHMARK for GitHub Secret Scanning.
 */
public class DatabaseConfig {

    // PostgreSQL connection (fake)
    private static final String POSTGRES_URL = "postgresql://fakeuser:F@keP0stGr3s!Pass@db.example.com:5432/production_db";
    private static final String POSTGRES_JDBC = "jdbc:postgresql://db.example.com:5432/production_db";
    private static final String POSTGRES_USER = "admin_user";
    private static final String POSTGRES_PASSWORD = "S3cure!P@ssw0rd#2024";

    // MySQL connection (fake)
    private static final String MYSQL_URL = "mysql://root:MyS3cretP@ss!@mysql.example.com:3306/app_database";
    private static final String MYSQL_JDBC = "jdbc:mysql://mysql.example.com:3306/app_database";
    private static final String MYSQL_PASSWORD = "R00t!MySQL#Passw0rd";

    // MongoDB connection string (fake)
    private static final String MONGODB_URI = "mongodb+srv://dbadmin:M0ng0DB!S3cr3t@cluster0.fake123.mongodb.net/production?retryWrites=true&w=majority";

    // Redis connection (fake)
    private static final String REDIS_URL = "redis://default:R3d1s!P@ssw0rd@redis.example.com:6379/0";

    // Elasticsearch (fake)
    private static final String ELASTIC_URL = "https://elastic:Ela$ticP@ssw0rd!@es.example.com:9200";

    public Connection getPostgresConnection() throws SQLException {
        return DriverManager.getConnection(POSTGRES_JDBC, POSTGRES_USER, POSTGRES_PASSWORD);
    }

    public Connection getMysqlConnection() throws SQLException {
        return DriverManager.getConnection(MYSQL_JDBC, "root", MYSQL_PASSWORD);
    }

    public static void main(String[] args) {
        DatabaseConfig config = new DatabaseConfig();
        System.out.println("Database configuration loaded for secret scanning test");
    }
}
