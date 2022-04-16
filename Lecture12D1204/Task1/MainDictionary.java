package Lecture12D1204.Task1;
////String - class that will help you handle text in java - String text = "New Text";
////Set - Structure to store unique data - Set<String> set = new HashSet<>();
////Override - Overrides a method in the child class -
////@Override
////Public void exampleMethod(){}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainDictionary {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Map<String, Dictionary> mapDictionary = new HashMap<>();
        mapDictionary.put("String", new Dictionary("String",
                "class that will help you handle text in java",
                "String text = \"New Text\";"));
        mapDictionary.put("Set", new Dictionary("Set",
                "Structure to store unique data",
                "Set<String> set = new HashSet<>();"));
        mapDictionary.put("Override", new Dictionary("Override",
                "Overrides a method in the child class",
                "@Override \n" +
                        "Public void exampleMethod(){}"));

        System.out.println("Enter a word:");
        String inputWord = scan.nextLine();

        System.out.println("Your word is: " + inputWord);
        System.out.println("Explanation: " + mapDictionary.get(inputWord).getExplanation());
        System.out.println("Example: " + mapDictionary.get(inputWord).getExample());

        scan.close();
    }
}
