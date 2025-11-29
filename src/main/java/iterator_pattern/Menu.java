package main.java.iterator_pattern;
import java.util.Iterator;

import main.java.iterator_pattern.MenuItem;

public interface Menu {

    public Iterator<MenuItem> createIterator();
}
