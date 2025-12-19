package s12_prototype_pattern;

class Nested implements Cloneable {

    int data;

    public Nested() {
    }

    public Nested(int data) {
        this.data = data;
    }

    @Override
    public Nested clone() throws CloneNotSupportedException {
        try {
            return (Nested) super.clone(); // deep copy에 사용됨
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Nested{data=" + data + "}";
    }
}
