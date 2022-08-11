/**Class: Intermediate Programming
* @author: Nikki Vongsamphanh
* @version 1.0
* Course: ITEC2140 - 03
* Written: August 11, 2022
* Description: This code creates a program that adds two integers from user's input together.
*/

import java.util.Scanner;
public class ReviewProgram{

    public static void main(String[] args){
    ReviewProgram rp = new ReviewProgram();
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter two numbers: ");
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    
    int result = rp.add(number1, number2);
    System.out.println("The result of addition of two numbers " + number1 + " and " + number2 + " is " + result);
    
    int resultStatic = ReviewProgram.add(number1, number2); //add(number1, number2)
    System.out.println("The result of addition of two numbers " + number1 + " and " + number2 + " is " + result);
    
   }

public int add(int firstNum, int secondNum) {
    return firstNum + secondNum;
   }
   
public static int addStatic(int firstNum, int secondNum)
{
    return firstNum + secondNum;
  }
        
}
