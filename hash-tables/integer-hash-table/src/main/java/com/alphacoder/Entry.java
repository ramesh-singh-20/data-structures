package com.alphacoder;

import java.util.Objects;

public class Entry {
    public int key;
    public String value;
    public boolean isDeleted;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entry)) return false;
        Entry entry = (Entry) o;
        return Objects.equals(value, entry.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
