package com.company;

public class JavaGen1<T> {
    T ob;
    JavaGen1(T ob){
        this.ob = ob;
        System.out.println(ob);
    }
    public static void main(String[]args){
        JavaGen1<Integer>obj = new JavaGen1<>(10);
    }
}
