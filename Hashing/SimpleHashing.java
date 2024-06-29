package Hashing;

public class SimpleHashing {

    public static void main(String[] args) {
        String input = "Hello, world!";
        int hashValue = simpleHash(input);

        System.out.println("Input: " + input);
        System.out.println("Hash Value: " + hashValue);
    }

    public static int simpleHash(String input) {
        // A simple hash function that sums up the ASCII values of characters
        int hash = 0;
        for (int i = 0; i < input.length(); i++) {
            hash += input.charAt(i);
        }
        return hash;
    }
}
