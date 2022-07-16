package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird implements Animal {
    private String migrationMonth;
    @Override
    public String getMigrationMonth() {
        return migrationMonth;
    }

    @Override
    public String setMigrationMonth(String migrationMonth) {
        this.migrationMonth = migrationMonth;
        return migrationMonth;
    }

    @Override
    public String move() {
        return "fly";
    }

    @Override
    public int getSpeed() {
        return 10;
    }

    @Override
    public String color() {
        return "red";
    }
}
