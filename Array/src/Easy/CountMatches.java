package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountMatches {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else {
            index = 2;
        }

        int count = 0;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count = count + 1;
            }
        }
        return count;
    }

    //    Main Function
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));
        String ruleKey = "type";
        String ruleValue = "phone";
        System.out.println(countMatches(items, ruleKey,ruleValue));
    }
}
