
import java.util.ArrayList;

public class JacksonStacks {

      private ArrayList<Integer> stackNum = new ArrayList<Integer>();

        public void push(int userInt) {
                stackNum.add(userInt);
        }
        public void PoppedNumber(int userInt) {
                stackNum.pop(userInt);
        }
        
        public void finishedStack() {
                System.out.println(stackNum);       
      }
    }
