package com.alura.forohub;import org.flywaydb.core.Flyway;

public class FlywayRepair {
    public static void main(String[] args) {
        Flyway flyway = Flyway.configure().dataSource("jdbc:mysql://localhost/database_forohub", "root", "K4r!n4pum45").load();
        flyway.repair();
    }
}

