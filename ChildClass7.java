public class ChildClass7 extends ParentClass7 {
    public int showMe(int i ){
        System.out.println("In Child.showMe(int i)");
        System.out.println("I am overriding the parent method and adding 5 to the argument.");
        return i + 5; // Must return an int
    }
     public void showMe() {
        System.out.println("Hello, I'm the showMe method without any arguments.");
    }
}

