/*
* This is a program that calculates mean, median and mode
* after reading in a text file into an array.
*
* @author  Jacksn Naufal
* @version 1.0
* @since   2022-10-08
*/

import java.util.ArrayList;
/**
 * This is the class for JacksonStacks.
 * Make class JacksonStacks.
 */

public class JacksonStacks {

      /** 
       * this is an array that is private in this class 
       * and can not be modified elsewhere, it only
       * takes number inputted in Main.
       */
      private ArrayList<Integer> stackNum = new ArrayList<Integer>();


      /** 
       * This is getter 
       * ShowStack().
       */  
        public void push(int userInt) {
            stackNum.add(userInt);
        }

        public int pop() {
            return stackNum.remove(stackNum.size() - 1);
        }

        public void finishedStack() {
                System.out.println(stackNum);
        }
} 
