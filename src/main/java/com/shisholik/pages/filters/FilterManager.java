package com.shisholik.pages.filters;

public interface FilterManager {
    void push(String propertyName);

    void pop();

    boolean contains(String propertyName);
}
