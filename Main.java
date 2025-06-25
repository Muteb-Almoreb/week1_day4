import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        1.Write a program that prints the numbers from 1 to 100 such that:
//        If the number is a multiple of 3, you need to print "Fizz" instead of that
//        number.


        //for loop to print 100
        System.out.println("this program print number from 1 to 100");
        for(int i =0; i<=100;i++)
        {
            //IF to Fulfillment of the condition and print the result
            if(i%5==0 && i%3==0)
            {
                System.out.println("FizzBuzz");
            } else if (i%5==0) {
                System.out.println("Buzz");

            } else if (i%3==0) {
                System.out.println("Fizz");

            }
            else
            System.out.println(i);
        }


        //2.Write a Java program to reverse a string.
        //Test Data: Input a string: The quick brown fox Expected Output: Reverse
        //string: xof nworb kciuq ehT


        //get input from user
        System.out.println("this program to reverse a sentence please enter a sentence: ");
        String sentence = input.nextLine();

        //get objects from StringBuilder
        StringBuilder ss = new StringBuilder(sentence);
        //reverse the objects
        StringBuilder newS = ss.reverse();
        //print the result
        System.out.println(newS);



        //3.Write a program to find the factorial value of any number entered
        //through the keyboard.

        //get input from user
        System.out.println("Enter number to know the factorial ");
        int num = input.nextInt();
        int factorial = 1;

        //for loop to calculate the factorial
        for(int i =1; i<=num;i++)
        {
            factorial= factorial * i;


        }
        //print
        System.out.println(factorial);



        //4.Two numbers are entered through the keyboard. Write a program to find
        //the value of one number raised to the power of another. (Do not use Java
        //built-in method)


        //get input from user
        System.out.println("Enter 2 number to find the value of one number raised to the power of another: ");
        System.out.println("Number 1: ");
        int num1 = input.nextInt();
        System.out.println("Number 2: ");
        int num2 = input.nextInt();
        //Variable Total too add Results
        int total = 1;

        //for loop to To multiply and add the results
        for (int i = 1; i <= num2; i++) {
            total *= num1;

        }

        //print the result
        System.out.println(total);


//5.Write a program that reads a set of integers, and then prints the sum of
//the even and odd integers.


        //get input from user
        System.out.println("This program is for adding even numbers together  and adding odd numbers togther .");
        int number = -1;
        int odd = 0;
        int evn = 0;
        int total1 = 0;

        // do while to adding numbers in variables
        do {
            System.out.println("Enter number: ");

            number = input.nextInt();
            total += number;

            //IF statement To know which number is odd and which is even
            if (number == 0)
                break;


            else if (number % 2 != 0) {
                odd = number + odd;
            } else if (number % 2 == 0) {
                evn = number + evn;

            }

            System.out.println("To Exit and see the result press 0 ");


        } while (number != 0);

        //print the result
        System.out.println("the result of odd number is: " + odd);
        System.out.println("the result of even number is: " + evn);
        System.out.println("the result of total number is: " + total1);



        //6.Write a program that prompts the user to input a positive integer. It
        //should then output a message indicating whether the number is a prime
        //number.

        System.out.println(" Enter positive integer to see is it prime or not: ");
        int numm = input.nextInt();

        Boolean isPrime = true;

        if (numm <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < numm; i++) {
                if (numm % i == 0) {
                    isPrime = false;
                    break;
                }
            }

        }

        if (isPrime)
            System.out.println("The number num " + numm + " is prime number ");
        else
            System.out.println("The number num " + numm + " is not prime number ");


        //7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
        //another for loop to print the days (Days 1 -7) for each week.


        for (int i = 1; i <= 4; i++) {
            System.out.println("Week " + i);

            for (int j = 1; j <= 7; j++) {
                System.out.println("day " + j);
            }
        }


        //8.Write a program thats check if the word is a palindrome or not. hint: A
        //string is said to be a palindrome if it is the same if we start reading it from
        //left to right or right to left.

        //get input from user
        System.out.println("Enter word to check if the word is a palindrome or not ");
        String word = input.nextLine();

        //bolean to know is it Palindrome or not
        Boolean isPalindrome = true;

        //for loop to compare the letters from the beginning with the letters at the end
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }


        }
        //print the result with If statement
        if (isPalindrome) {
            System.out.println("The word is palindrome ");
        } else
            System.out.println("The word is not palindrome");


    }
}





