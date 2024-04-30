public class ex1
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}

import java.io.*;
import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String s1 = sc.nextLine();
        System.out.println(s1);
    }
}

import java.io.*;
import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        char operator;
        Double num1, num2, result;
        Scanner input = new Scanner(System.in);
        System.out.println("num1:");
        num1 = input.nextDouble();
        System.out.println("num2:");
        num2 = input.nextDouble();
        result=num1+num2;
        System.out.println(num1+"+"+num2+"="+result);
    }
}

import java.io.*;
import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        char operator;
        Double num1, num2, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter: +,_,*, or /");
        operator = input.next().charAt(0);
        System.out.println("num1:");
        num1 = input.nextDouble();
        System.out.println("num2:");
        num2 = input.nextDouble();
        switch (operator)
        {
            case '+':
                result=num1+num2;
                System.out.println(num1+"+"+num2+"="+result);
                break;
            case '-':
                result=num1-num2;
                System.out.println(num1+"+"+num2+"="+result);
                break;
            case '*':
                result=num1*num2;
                System.out.println(num1+"+"+num2+"="+result);
                break;
            case '/':
                result=num1/num2;
                System.out.println(num1+"+"+num2+"="+result);
                break;
            
        }

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter a string:");
        // String s1 = sc.nextLine();
        // System.out.println(s1);
    }
}
