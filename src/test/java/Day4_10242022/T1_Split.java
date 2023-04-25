package Day4_10242022;

public class T1_Split {
    public static void main(String[] args) {
        //declare string variable
        String message = "My Name Is John";
        //declare an array to store the split messages
        String[] splitMessage = message.split(" ");
        //print out John to the console
        System.out.println("Split result at index 3 is " + splitMessage[3] + " Split result at index 0 is " + splitMessage[0]);
    }//end of main
}//end of class
