package com.company.lesson8;

public class ExceptionTest {

    public static void main(String[] args) {

        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("end of try");
        }
        method2();

        method3();
    }

    public static void method1() {
        int i = 10/0;
        throw new RuntimeException("My exception");
    }

    public static void method2() {
        System.out.println("Important info");
    }

    public static void method3() {

        Object object = null;

        object.toString();


    }


}
