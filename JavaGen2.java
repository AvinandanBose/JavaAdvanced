package com.company;
import java.math.*;
import java.util.stream.Collector;
 public class JavaGen2<T extends  Number,V extends Number > {
    T ob;
    V ob2;
     public JavaGen2(T ob,V ob2){
        this.ob = ob;
        this.ob2 = ob2;
    }
    public int square(T ob, V ob2){
         return  ob.intValue()*ob2.intValue(); //intValue belongs to Number

    }
    public static void main(String[]args){
         JavaGen2<Integer,Integer> iob= new JavaGen2<>(6,7);
         System.out.println(iob.square(10,12));


    }


}
