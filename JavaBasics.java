//boilerplate code
import java.util.*;
public class JavaBasics{
  public static void main(String args[]) {
    //function to print 
    System.out.println("Vishal");

    //print pattern with loop
    System.out.println("****\n***\n**\n*");

    //variable declaration
    //code to calculate sum
    /*hi 
    how are you? 
    I am a multi line comment 
    */
    int a = 10;
    int b = 5;
    int sum = a + b;
    String name = "Vishal kumar singh";
    
    System.out.println("a = "+a+" b = "+b+" sum = "+sum);


    //Java is a typed language (strict language)
    //javaScript is a dynamic language
    //Primitive (exist in java)   Non Primitive
    //byte   [-128 to 127]             String
    //short   2byte                    Array
    //char     2byte                   class
    //boolean   1byte                  Object
    //int       4byte                  interface
    //long   8byte
    //double 4byte
    //float   8byte

    //implementation of data type

    byte c = 9;
    System.out.println(c);
    char ch = 'a'; //only single character
    System.out.println(ch);
    boolean var = false;
    System.out.println(var);
    float price = 10.4f;
    System.out.println(price);
    int number = 24;
    //long (used for big integers)
    //double (used for big decimal number)

    short n = 240;
    System.out.println(n);

    //1byte = 8bits;


    //Input In Java
    //make a object of scanner
    Scanner sc = new Scanner (System.in);
    // System.out.print("Enter your name: ");
    // String input = sc.next();//capture the string upto space
    // System.out.println("Your name -> "+input);

    System.out.print("Enter your Full Name: ");
    String fullName = sc.nextLine(); //Full paragraph An input
    System.out.println("Your full name -> "+fullName);

    //Input funtion in Java
    //next()
    //nextLine()
    //nextInt()
    //nextByte()
    //nextFloat()
    //nextDouble()
    //nextBoolean()
    //nextShort()
    //nextLong()


    //Type Conversion (widening or implicit coversion)
    /*
     * conversion happens when
     * a.type compatible
     * b.destination > source type
     * byte -> short -> int -> float -> long -> double
     */

     //type Casting(forcfully conversion or narrowing or explicitly)
     //int marks = (int) 99.99f;

     int chara = 'A';
     System.out.println(chara);

     //Type promotion in Expressions
     /*
      * 1. java automatically promotes each byte, short, or char operand to int when evaluating an expression.
      *2. If one operand is long, float or double the whole expression is promoted to long float, or double reprectively
      */

      // example

      char z = 'a';
      char u = 'b';
      System.out.println((int)z);
      System.out.println((int)u);
      System.out.println(u - z); // type promotion in expression

      //how is out Code Running?

      // sourcecode.java -> compiler -> Bytecode.class -> Jvm -> Natve code

      //Java is portable language because it run on any system

  }
}