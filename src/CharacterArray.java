/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */

public class CharacterArray {

    public static void main(String[] args) {

           StringBuilder input = new StringBuilder("6901 Sudley Road Manassas VA");
           System.out.println("The input is");
           System.out.println(input);
                
                  for (int i = 0; i < input.length(); i++) {
                    
                      System.out.println("the character is:");
                    if(Character.isDigit(input.charAt(i))) {
  
                        System.out.println("digit");
                        System.out.println("*");
}
                    else if (Character.isUpperCase(input.charAt(i))){
      
                        System.out.println("Uppercase");
                        System.out.println(Character.toLowerCase(input.charAt(i)));
}

                    else if (Character.isLowerCase(input.charAt(i))){
      
                        System.out.println("Lowercase");
                        System.out.println(Character.toUpperCase(input.charAt(i)));
}
}
}
}

