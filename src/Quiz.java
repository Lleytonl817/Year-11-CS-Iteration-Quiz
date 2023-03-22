import java.util.Scanner;
public class Quiz {



    /** 1. Write a method that returns the number of vowels in a string.
           Consider a, e, i, o, u as vowels. **/
        public static void main(String args[]) {
            int count = 0;
            System.out.println("Enter a string:");
            Scanner scan = new Scanner(System.in);
            String string = scan.nextLine();

            for (int i = 0; i < string.length(); i++) {
                char ch = string.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
                    count++;
                }
            }
            System.out.println(count);


            /** 2. Write a method called findN that finds the number of natural numbers not exceeding N
             and not divisible by any of the numbers [2, 3, 5].

             Example

             Let's take the number 5 as an example:

             1 - doesn't divide integer by 2, 3, and 5
             2 - divides integer by 2
             3 - divides integer by 3
             4 - divides integer by 2
             5 - divides integer by 5

             Answer: 1 (only one number doesn't divide integer by any of 2, 3, 5) **/

            int findN = 0;
            System.out.println("Enter a number: ");
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextLine();
            for (int a = 0; a >= t; a++){
                if (t !/ 2, 3, 5) {
                    findN ++;
                }

            }
            System.out.println("only " + findN + " number doesn't divide integer by any of 2, 3, 5");



            /** 3. Write a method called camelCaseMe so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should always be capitalized.

             Examples

             "the-stealth-warrior" gets converted to "theStealthWarrior"

             "The_Stealth_Warrior" gets converted to "TheStealthWarrior"

             "The_Stealth-Warrior" gets converted to "TheStealthWarrior" **/

        }
}
