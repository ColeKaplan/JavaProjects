import java.util.Scanner;
public class CeasarCipher {
   public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   System.out.print("What is your message: ");
   String message = scan.nextLine();
   System.out.print("How much shift would you like: ");
   int shift = scan.nextInt();
   shift = shift%26;
   String newMessage = "";
   for (int i = 0; i < message.length(); i++) {
      if (message.substring(i, i+1).equals(" "))newMessage = newMessage + " ";
      else {newMessage = newMessage + Character.toString(message.charAt(i)+shift);
}}
   System.out.println(newMessage);




   }
}