/*
Brute Force Password Guesser (20 chars)
Created by Milaan Shah
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    String [] chars = {"", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "+", "-", "=", "{", "}", "|", "[", "]", ":", ";", ".", ",", "<", ">", "/", "?", "~", "\\", "`", " "};
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter password: ");
    String password = input.nextLine();

    boolean passwordGuessed = false;
    String testPassword = "";
    int attempts = -1;

    for (int t = 0; t < chars.length; t++) {
      for (int s = 0; s < chars.length; s++) {
        for (int r = 0; r < chars.length; r++) {
          for (int q = 0; q < chars.length; q++) {
            for (int p = 0; p < chars.length; p++) {
              for (int o = 0; o < chars.length; o++) {
                for (int n = 0; n < chars.length; n++) {
                  for (int m = 0; m < chars.length; m++) {
                    for (int l = 0; l < chars.length; l++) {
                      for (int k = 0; k < chars.length; k++) {
                        for (int j = 0; j < chars.length; j++) {
                          for (int i = 0; i < chars.length; i++) {
                            for (int h = 0; h < chars.length; h++) {
                              for (int g = 0; g < chars.length; g++) {
                                for (int f = 0; f < chars.length; f++) {
                                  for (int e = 0; e < chars.length; e++) {
                                    for (int d = 0; d < chars.length; d++) {
                                      for (int c = 0; c < chars.length; c++) {
                                        for (int b = 0; b < chars.length; b++) {
                                          for (int a = 0; a < chars.length; a++) {
                                            attempts++;
                                            testPassword = chars[t] + chars[s] + chars[r] + chars[q] + chars[p] + chars[o] + chars[n] + chars[m] + chars[l] + chars[k] + chars[j] + chars[i] + chars[h] + chars[g] + chars[f] + chars[e] + chars[d] + chars[c] + chars[b] + chars[a];
                                            System.out.println(testPassword);
                                            if (testPassword.equals(password)) {
                                              System.out.println("\nPassword: " + testPassword);
                                              System.out.println("Attempts: " + attempts);
                                              passwordGuessed = true;
                                              break;
                                            }
                                          }
                                          if (passwordGuessed == true) {
                                            break;
                                          }
                                        }
                                        if (passwordGuessed == true) {
                                          break;
                                        }
                                      }
                                      if (passwordGuessed == true) {
                                        break;
                                      }
                                    }
                                    if (passwordGuessed == true) {
                                      break;
                                    }
                                  }
                                  if (passwordGuessed == true) {
                                    break;
                                  }
                                }
                                if (passwordGuessed == true) {
                                  break;
                                }
                              }
                              if (passwordGuessed == true) {
                                break;
                              }
                            }
                            if (passwordGuessed == true) {
                              break;
                            }
                          }
                          if (passwordGuessed == true) {
                            break;
                          }
                        }
                        if (passwordGuessed == true) {
                          break;
                        }
                      }
                      if (passwordGuessed == true) {
                        break;
                      }
                    }
                    if (passwordGuessed == true) {
                      break;
                    }
                  }
                  if (passwordGuessed == true) {
                    break;
                  }
                }
                if (passwordGuessed == true) {
                  break;
                }
              }
              if (passwordGuessed == true) {
                break;
              }
            }
            if (passwordGuessed == true) {
              break;
            }
          }
          if (passwordGuessed == true) {
            break;
          }
        }
        if (passwordGuessed == true) {
          break;
        }
      }
      if (passwordGuessed == true) {
        break;
      }
    }
            
  }

}
