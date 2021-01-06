

public class Solution {
    // Write your code here.
    Stack<Character> stacky;
    Queue<Character> queuey;

    public Solution(){
        stacky = new Stack<Character>();
        queuey = new LinkedList<> ();
    }

    public void pushCharacter(Character ch){
        stacky.push(ch);
    }
    public void enqueueCharacter(Character ch){
        queuey.add(ch);
    }
     public Character popCharacter(){
        return stacky.pop();
    }
    public Character dequeueCharacter(){
        return queuey.remove();
    }
