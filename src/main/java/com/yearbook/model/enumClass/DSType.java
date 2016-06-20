package com.yearbook.model.enumClass;

public enum DSType {
    MASTER("MASTER"),
    SLAVE("SLAVE"),
    BATCH("BATCH"),
    FIRST("FIRST"),
    SECOND("SECOND");

    private final String name;

    DSType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

