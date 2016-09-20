/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Creston
 */
public class gradeConverter {
    
    
}
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
run()
    {

    double grade = readDouble("What is your grade? ");
    if(grade >= 89.5)
{
System.out.println("A");
}
if (grade >= 79.5 && grade < 89.5)
{
System.out.println("B");
}
if (grade >= 69.5 && grade < 79.5)
{
System.out.println("C");
}
if(grade <69.5)
{
System.out.println("F");
}
    
    }
    
}
