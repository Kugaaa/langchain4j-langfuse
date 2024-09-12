/**
 * @(#)ObservitionType.java, 9月 11, 2024.
 * <p>
 * Copyright 2024 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.kuga;


import java.util.Optional;

/**
 * @author zhaokai
 */
public enum ObservationType {
    EVENT(1, "event"),

    SPAN(2, "span"),

    GENERATION(3, "generation"),
    ;

    private int value;

    private String name;

    ObservationType(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Optional<ObservationType> findByInt(int value) {
        for (ObservationType item : ObservationType.values()) {
            if (item.value == value) {
                return Optional.of(item);
            }
        }

        return Optional.empty();
    }

    public static Optional<ObservationType> findByString(String name) {
        for (ObservationType item : ObservationType.values()) {
            if (item.name.equals(name)) {
                return Optional.of(item);
            }
        }

        return Optional.empty();
    }

    public static ObservationType findNullableByString(String name) {
        for (ObservationType item : ObservationType.values()) {
            if (item.name.equals(name)) {
                return item;
            }
        }

        return null;
    }

    public String toString() {
        return this.name;
    }

    public int toInt() {
        return this.value;
    }
}
