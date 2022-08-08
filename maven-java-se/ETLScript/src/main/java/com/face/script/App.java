package com.face.script;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Hello h = new Hello();       

        System.out.println( "[INFO] Hello World!");
        h.sayHello();
        System.out.println(h.add(5, 15));
    }
}
