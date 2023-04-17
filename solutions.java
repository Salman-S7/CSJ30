package CSJ30;
/* 
public class solutions {
    1. Write a program to calculate the fuel consumption of your vehicle.
The program should ask the user to enter the quantity of petrol to fill up the tank and the distance covered till the tank goes dry.
Calculate the fuel consumption and display it in the format (liters per 100 kilometers).
Convert the same result to the U.S. style of miles per gallon and display the result. If the quantity or distance is zero or negative display "<respective_input> is an Invalid Input".
[Note: The US approach of fuel consumption calculation (distance / fuel) is the inverse of the European approach (fuel / distance ). Also note that 1 kilometer is 0.6214 miles, and 1 liter is 0.2642 gallons.]
The result should be with two decimal place.
To get two decimal place refer the below-mentioned print statement :
float cost=670.23;

SOLUTION-------------------------

import java.util.*;
public class FuelConsmp {
  
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //command line inputs
            System.out.print("Enter the amount of fuel (in liters): ");
            float fuel = sc.nextFloat();
            System.out.print("Enter total distance covered (in kms): ");
            float dist = sc.nextFloat();
            System.out.println();

            float litperkm = ((fuel/dist)*100);
            double milpergallon = (dist*0.6214)/(fuel*0.2642);
            
            //this blocks executes if any input is zero or negative 
            if(fuel<=0 || dist<=0)
            {
                if(fuel<=0) System.out.println("Invalid credential Fuel: "+fuel+"\nplease enter correct information");
                if(dist<=0) System.out.println("Invalid credential Distance: "+dist+"\nplease enter correct information");
               // System.out.format("Double Number: %.2f", num);  
            }
           
            
            //if all values are positive this block will be executed
            else
            {
                System.out.format("Fuel required(in liters) per 100km is "+"Double Number: %.2f", litperkm);
                System.out.println();
                System.out.format("Distance covered(in miles) per gallon of fuel is "+"Double Number: %.2f", milpergallon);
                System.out.println();
            }
            sc.close();
        }
    }


**********************************************************

2. Help Mr.Ben who is a programmer, in developing a registration form on console. Customers will not just input data, but also view the details once he/she finishes the registration. 
Sample Input 1:
Enter your name:Jany
Enter age:25
Enter gender:Female
Hailing from:Mexico

SOLUTION------------------------------------------


import java.util.*;
public class RegistrationForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter age: ");
        int  age = sc.nextInt();

        System.out.println("Enter gender: ");
        String gender = sc.next();

        System.out.println("Hailing from: ");
        String city = sc.next();
        System.out.println();
        System.out.println();

        System.out.println("Welcome, "+name+"!");
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("City: "+city);


    }
}


*************************************************************************



3. Rohan wants a magic board, which displays a character for a corresponding number for his science exhibition. Help him to develop such application. 
For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be displayed.
[Assume the number of inputs should be always 4 ]

SOLUTION------------------------------------------

import java.util.*;
public class Ascii {
    public static void main(String[] args) {
        System.out.println("Enter numbers");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();

        System.out.println(i+"-"+(char)i);
        System.out.println(i+"-"+(char)j);
        System.out.println(k+"-"+(char)k);
        System.out.println(l+"-"+(char)l);
    }
}



*********************************************************
4. Reaya's teacher has asked her to prepare well for the lesson on seasons. When her teacher tells a month, she needs to say the season corresponding to that month. Write a program to solve the above task.
    • Spring - March to May,
    • Summer - June to August,
    • Autumn - September to November and,
    • Winter - December to February.
Month should be in the range 1 to 12.  If not the output should be "Invalid month".

SOLUTION--------------

import java.util.*;
public class Seasons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter serial number of month: ");
        int num = sc.nextInt();
        if(num>12 || num<1){
            System.out.println("invalid input");
            return;
        }
        if(num==12)
            System.out.println("winter");
        else if(num>=9)
            System.out.println("Autumn");
        else if(num>=6)
            System.out.println("Summer");
        else if(num>=9)
            System.out.println("Spring");
        else if(num>=9)
            System.out.println("Winter");
    }
}



*******************************************************

5 William planned to choose a four digit lucky number for his car. His lucky numbers are 3,5 and 7. Help him find the number, whose sum is divisible by  3 or 5 or 7.
Provide a valid car number, Fails to provide a valid input then display that number is not a valid car number. 
Note : The input other than 4 digit positive number[includes negative and 0] is considered as invalid.
Refer the samples, to read and display the data.

SOLUTION------------------------

import java.util.*;
public class LuckyNum {
    public static void main(String[] args) {
        int digit=0, sumofdigits=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
       
        if(num<1000 || num>9999){
            System.out.println("invalid number ");
            return;
        }
        while(num>0){
            digit = num%10;
            sumofdigits = sumofdigits+digit;
            num = num/10;
        }
        if(sumofdigits%3==0 || sumofdigits%7==0 || sumofdigits%5 ==0){
            System.out.println("Given number  is lucky number");
        }
        else{
            System.out.println("sorry given number is not my lucky number");
        }
    }
}



****************************************************************
6. . To speed up his composition of generating unpredictable rhythms, A.R.Rahman wants the list of prime numbers available in a range of numbers.Can you help him out?
Write a java program to print all prime numbers in the interval [a,b] (a and b, both inclusive).

Note
    • Input 1 should be lesser than Input 2. Both the inputs should be positive. 
    • Range must always be greater than zero.
    • If any of the condition mentioned above fails, then display "Provide valid input"
    • Use a minimum of one for loop and one while loop


    SOLUTION--------------------------

    import java.util.*;
public class PrimesInGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number of range: ");
        int rangefrom = sc.nextInt();
        System.out.print("Enter last number of range: ");
        int rangeto = sc.nextInt();
      
        if(rangefrom>=rangeto|| rangefrom<0)
        {
            System.out.println("invalid inputs");
            return;
        }

        
        for(int i = rangefrom; i<=rangeto;i++)
        {
            int j=2;
            boolean isprime = true;
            while(j<i){
                if(i%j==0){
                    isprime = false;
                    break;
                }
                j++;
            }
            if(i==1) continue;
            if(isprime == true){
                System.out.print(i+"  ");
            }
        }System.out.println();


        
    }
}



****************************************************************
7. George and  Tintin plays  by  telling numbers.  George says a number to Tintin.  Tintin should first reverse the number and check if it is same as the original.  If yes,  Tintin should say “Palindrome”.  If not, he should say “Not a Palindrome”.  If the number is negative, print “Invalid Input”.  Help Tintin by writing a program.

SOLUTION ------------------------------


import java.util.*;
public class Plaindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if(num<0){
            System.out.println("invalid input");
            return;
        }
        int num1 = num;
        int reversenum=0,
            digit;
        while(num>0){
            digit = num%10;
            reversenum = reversenum*10 + digit;
            num = num/10;
        }
        if(num1 == reversenum){
            System.out.println(num1+" is palindrome number ");
        }
        else{
            System.out.println(num1+" is not a palindrome number");
        }

    }
}



*/