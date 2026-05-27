package com.lab;

public interface IntList {
    /**
     * Adds a new number to the list
     * 
     * @param number the number to add
     */
    void add(int number);

    /**
     * Retrieves an element by its ID (index)
     * 
     * @param id the index of the element
     * @return the element at the specified index
     */
    int get(int id);
}
