public static void main(String[] args) {
    System.out.println("***Demonstration-7.Overloading with Overriding Demo***\n");
    ChildClass7 childOb = new ChildClass7();
    int value = childOb.showMe(5);
    System.out.println("The value returned is: " + value); // 5+5 = 10
    childOb.showMe();
}
}
