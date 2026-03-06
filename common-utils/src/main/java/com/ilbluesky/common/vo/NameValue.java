package com.ilbluesky.common.vo;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Orca Zhang
 * date 3/6/2026
 */
public class NameValue implements Serializable, Comparable<NameValue> {

    private String name;
    private String value;
    private String extra1;
    private int sort;

    public NameValue() {
    }

    public NameValue(String name, String value, int sort) {
        this.name = name;
        this.value = value;
        this.sort = sort;
    }

    public NameValue(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getExtra1() {
        return extra1;
    }

    public void setExtra1(String extra1) {
        this.extra1 = extra1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NameValue nameValue = (NameValue) o;

        return Objects.equals(value, nameValue.value);
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    @Override
    public int compareTo(NameValue o) {
        if (o == null) {
            return 1;
        }
        return sort - o.getSort();
    }
}
