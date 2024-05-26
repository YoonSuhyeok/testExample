package com.test.test.Entity;

public enum BrandType {
    kubo("교보문고");

    private String name;

    public String getName() {
        return name;
    }

    BrandType(String name) {
        this.name = name;
    }
}
