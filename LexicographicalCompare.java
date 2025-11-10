public class LexicographicalCompare {
    public static void main(String[] args) {
        String s1 = "Apple";
        String s2 = "apple";

        int result = s1.compareToIgnoreCase(s2);
        if (result == 0)
            System.out.println("Strings are equal (ignoring case).");
        else if (result > 0)
            System.out.println(s1 + " is greater than " + s2);
        else
            System.out.println(s1 + " is smaller than " + s2);
    }
}