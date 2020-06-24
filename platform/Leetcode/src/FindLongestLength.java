import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.Scanner;

public class FindLongestLength{
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("The longest length of substring is: " + findLongestLength(scan.nextLine()) );
    }

    public static int findLongestLength(String string) {
        String[] strings = string.split("");

        int answer = 0;

        HashMap<String, Integer> diction = new HashMap<String,Integer>();

        String substr = "";
        ArrayList<String> collection = new ArrayList<String>();

        for (int s=0; s < strings.length; s++) {

            for (int i = s; i < strings.length; i++) {
                String letter = strings[i];

                if (!diction.containsKey(letter)) {
                    diction.put(letter,1);
                    substr = substr + letter;
                } else {
                    String stringLength = Integer.toString(substr.length());
                    collection.add(stringLength);
                    diction.clear();
                    substr = "";
                    break;
                }
            }
        }

        if (!substr.equals("")) {
            String stringLength = Integer.toString(substr.length());
            collection.add(stringLength);
        }

        if (collection.size() > 0) {
            ArrayList<Integer> newCollection = new ArrayList<Integer>();
            int maxCollection = 0;

            for (int i=0; i < collection.size(); i++) {
                int valueEach = Integer.parseInt(collection.get(i));
                if (maxCollection < valueEach) {
                    newCollection.add(valueEach);            
                    maxCollection = valueEach;
                }

            }
            answer = maxCollection;

        } else{
            answer = 0;
        }
        return answer;
    }
}

