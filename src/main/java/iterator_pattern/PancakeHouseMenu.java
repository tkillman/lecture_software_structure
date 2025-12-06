package main.java.iterator_pattern;

import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu {

    List<MenuItem> menuItems;

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}