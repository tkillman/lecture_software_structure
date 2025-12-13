package prototype_pattern;

interface Prototype<T> extends Cloneable {

    T clone();
}
