public class ContainsSequence {
    public static void main(String[] args) {
        String str = "I love programming in Java";
        String sequence = "programming";

        if (str.contains(sequence))
            System.out.println("The string contains the sequence: " + sequence);
        else
            System.out.println("The string does not contain the sequence.");
    }
}
