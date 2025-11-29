package main.java.iterator_pattern;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
    Hashtable menuItems = new Hashtable();

    public void addItem(String name, String desc, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
