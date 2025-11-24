class ClassA {
    void showA() {
        System.out.println("Inside Class A");
    }
}

class ClassB extends ClassA {
    void showB() {
        System.out.println("Inside Class B");
    }
}

class ClassC extends ClassB {
    void showC() {
        System.out.println("Inside Class C");
    }
}

public class Multilevel_inheritance {
    public static void main(String[] args) {
        ClassC obj = new ClassC();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}
