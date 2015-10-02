package ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

// I'm Kirill Nikolaev
public class App 
{
    public static void main( String[] args )
    {
        RandomNameGenerator rnd = new RandomNameGenerator(0);
        System.out.println("Exercise 1");
        for (int i=0; i<4; i+=1) {
            String name = rnd.next();
            System.out.println("Hello," + name);
        }
        System.out.println("\nExercise 2");
        for (int i=0; i<15; i+=1) {
            String name = rnd.next();
            System.out.println("Hello," + name);
        }
    }
}

