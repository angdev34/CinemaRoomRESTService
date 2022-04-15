
class Box<T> {

    private T type;

    public void put(T type) {
        this.type = type;
    }

    public T get() {
        return this.type;
    }
}

// Don't change classes below

class Cake { }

class Pie { }

class Tart { }