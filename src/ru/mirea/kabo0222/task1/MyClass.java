package ru.mirea.kabo0222.task1;
public class MyClass<T, V, K> {
    private T var1;
    private V var2;
    private K var3;

    public MyClass(T var1, V var2, K var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public T getVar1() {
        return var1;
    }

    public V getVar2() {
        return var2;
    }

    public K getVar3() {
        return var3;
    }

    public void printClassNames() {
        System.out.println("Type of var1: " + var1.getClass().getName());
        System.out.println("Type of var2: " + var2.getClass().getName());
        System.out.println("Type of var3: " + var3.getClass().getName());
    }

    public static void main(String[] args) {
        MyClass<String, Integer, Double> myObject = new MyClass<>("Hello", 10, 3.14);
        myObject.printClassNames();
    }
}
