public class Necklace {

    public static void main(String[] args) {
        String left = "abcd";
        String right = "acab";
        String output = Boolean.toString(compareNecklace(left, right));

        System.out.print("Is " + left + " equal to " + right + " ? ");
        System.out.println(output);
    }

    public static boolean compareNecklace(String left, String right) {
        boolean output;
        if (left.equals(right)) {
            return false;
        } else {
            String leftRestructured;
            int lengthLeft = left.length();
            for (int i=0; i < lengthLeft; i++) {
                char letter = left.charAt(i);

                leftRestructured = left.substring(i+1).concat(left.substring(0, i+1));
                if (leftRestructured.equals(right)) {
                    return true;
                }
            }
        }
        return false;
    }
}