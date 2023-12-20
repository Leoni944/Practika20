package ru.mirea.kabo0222.task4;
public class Main {
    public static void main(String[] args) {
        Integer[] array = {4, 6, 2, 9, 1};
        MinMax<Integer> minMax = new MinMax<>(array);

        System.out.println("Min: " + minMax.findMin());
        System.out.println("Max: " + minMax.findMax());

        System.out.println("Sum: " + Calculator.sum(5, 10));
        System.out.println("Multiply: " + Calculator.multiply(5, 10));
        System.out.println("Divide: " + Calculator.divide(10.0, 2.0));
        System.out.println("Subtraction: " + Calculator.subtraction(10, 5));
    }
}
