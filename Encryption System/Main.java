/*
  Program Name: Encryption System
  Program Description: This program encrypts and decrypts messages using a unique algorithm
  Program Completed On: 15 May 2024
  Program Developed By: Milaan Shah
*/

// import necessary libraries
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

// main class
public class Main {

  // normal characters (list length: 93)
  final static String[] decryptionChars = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "+", "-", "=", "{", "}", "|", "[", "]", ":", ";", ".", ",", "<", ">", "/", "?", "~", "\\", "`", " "};

  // characters for encryption (list length: 93)
  final static String[] encryptionChars = {"aaaaaaa","aaaaaab","aaaaaba","aaaaabb","aaaabaa","aaaabab","aaaabba","aaaabbb","aaabaaa","aaabaab","aaababa","aaababb","aaabbaa","aaabbab","aaabbba","aaabbbb","aabaaaa","aabaaba","aabaabb","aababaa","aababab","aababba","aababbb","aabbaaa","aabbaba","aabbabb","aabbbaa","aabbbab","aabbbba","aabbbbb","abaaaaa","abaaaab","abaaaba","abaaabb","abaabaa","abaabab","abaabba","abaabbb","ababaaa","ababaab","abababa","abababb","ababbaa","ababbab","ababbba","ababbbb","abbbaaa","abbbaba","abbbabb","abbbbaa","abbbbab","abbbbba","abbbbbb","baaaaaa","baaaaab","baaaaba","baaaabb","baaabaa","baaabab","baaabba","baaabbb","baabaaa","baabaab","baababa","baababb","baabbaa","baabbab","baabbba","baabbbb","babaaaa","babaaba","babaabb","bababaa","bababab","bababba","bababbb","babbaaa","babbaba","babbabb","babbbaa","babbbab","babbbba","babbbbb","bbaaaaa","bbaaaab","bbaaaba","bbaaabb","bbaabaa","bbaabab","bbaabba","bbaabbb","bbabaaa", "bbabaab"};

  // main method
  public static void main(String[] args) {
    // create scanner object to get input
    Scanner input = new Scanner(System.in);
    
    // user choice variable for menu
    int userChoice = 0;

    // do while loop that keeps repeating until program terminates
    do {
      // menu for user chioce (note: menu is fake for anti-hacker system)
      System.out.println("1. Encode");
      System.out.println("2. Decode");
      System.out.println("3. Exit");
      System.out.print("Enter you choice: ");
      
      // get user input
      userChoice = input.nextInt();
      System.out.println();

      // if statements call proper method based on user input
      // encode user message
      if(userChoice == 4) {
        encode();
      }
      // decode user message
      else if(userChoice == 5) {
        decode();
      }
      // anti-hacking system
      else if(userChoice == 1 || userChoice == 2) {
        System.out.println("*!*!Hacker detected*!*!");
        break;
      }
      // tells user invalid input if input is invalid
      else if(userChoice != 3) {
        System.out.println("Invalid input");
      }
      System.out.println();
      
    } while(userChoice != 3);

    // terminate animation
    terminate();
    
  }
  // method that encodes user message
  public static void encode() {
    // create scanner object for user input
    Scanner input = new Scanner(System.in);

    // gets message to encrypt
    System.out.print("Enter message: ");
    String message = input.nextLine();
    message = " " + message;

    // convert message to a's and b's
    String encodedMessage = "";
    for(int i = 0; i < message.length(); i++) {
      for(int j = 0; j < decryptionChars.length; j++) {
        if(message.substring(i, i +1).equals(decryptionChars[j])) {
          encodedMessage += encryptionChars[j];
        }
      }
    }

    message = encodedMessage;

    // convert message to binary
    String binaryMessage = "";
    for(int i = 0; i < message.length(); i++) {
      char letter = message.charAt(i);
      String binaryChar = Integer.toBinaryString((int) letter);
      binaryMessage += "0" + binaryChar;
    }

    // switch 1s and 0s in message
    String switched = "";
    for(int i = 0; i < binaryMessage.length(); i++) {
      if(binaryMessage.charAt(i) == '1') {
        switched += "0";
      }
      else {
        switched += "1";
      }
    }

    // switch order of characters in message
    String shifted = "";
    for(int i = 0; i < switched.length(); i+=2) {
        String one = switched.substring(i, i+1);
        String two = switched.substring(i+1, i+2);
        shifted += two + one;
    }
    // add random values in message (two in front, one at end)
    String extra = shifted;
    if(Math.random() < 0.5) {
      extra = "1" + extra;
    }
    else {
      extra = "0" + extra;
    }
    if(Math.random() < 0.5) {
      extra = "0" + extra;
    }
    else {
      extra = "1" + extra;
    }
    if(Math.random() < 0.5) {
      extra += "1";
    }
    else {
      extra += "0";
    }

    // add random valus in message (three in the middle)
    String extra2 = "";
    for(int i = 0; i < 5; i++) {
      if(Math.random() < 0.5) {
        extra2 += "1";
      }
      else {
        extra2 += "0";
      }
    }
    extra = extra.substring(0, 6) + extra2 + extra.substring(6);

    // display encrypted message
    System.out.println();
    System.out.println(extra);
  }
  
  // method that decodes user message
  public static void decode() {
    // create scanner object for user input
    Scanner input = new Scanner(System.in);

    // get user message
    System.out.println("Enter message: ");
    String encryptedMessage = input.nextLine();

    // remove characters in message (three in the middle)
    encryptedMessage = encryptedMessage.substring(0, 4) + encryptedMessage.substring(9);

    // remove characters in message (two in front, one at end)
    encryptedMessage = encryptedMessage.substring(0, encryptedMessage.length() - 1);
    encryptedMessage = encryptedMessage.substring(2);

    // switch order of characters in message
    String shifted = "";
    for(int i = 0; i < encryptedMessage.length(); i+=2) {
        String one = encryptedMessage.substring(i, i+1);
        String two = encryptedMessage.substring(i+1, i+2);
        shifted += two + one;
    }
    

    // switch 1s and 0s is message
    String switched = "";
    for(int i = 0; i < shifted.length(); i++) {
      if(shifted.charAt(i) == '1') {
        switched += "0";
      }
      else {
        switched += "1";
      }
    }

    // convert message to decimal
    String normal = "";
    for(int i = 0; i < switched.length(); i+=8) {
      int binaryChar = Integer.parseInt(switched.substring(i, i+8), 2);
      char singleChar = (char) binaryChar;
      normal += singleChar;
    }

    // convert message from a's and b's to normal characters
    String decoded = "";
    for(int i = 0; i < normal.length(); i+=7) {
      String part = normal.substring(i, i+7);
      for(int j = 0; j < decryptionChars.length; j++) {
        if(part.equals(encryptionChars[j])) {
          decoded += decryptionChars[j];
        }
      }
    }

    // display decrypted message
    System.out.println();
    System.out.println(decoded);
  }

  // method that animates program termination
  public static void terminate() {
    System.out.print("Program terminating in 3.");
    try {
        TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
    }
    System.out.print("2.");
    try {
        TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
    }
    System.out.print("1.");
    try {
        TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
    }
    System.out.print("0.");

    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("Program terminated...");
  }
}
