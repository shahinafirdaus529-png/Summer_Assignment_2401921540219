import java.util.*;

class ContainsDuplicate {

    public boolean containsDuplicate(int[] values) {

        HashSet<Integer> uniqueData = new HashSet<>();

        for(int item : values) {

            if(uniqueData.contains(item)) {
                return true;
            }

            uniqueData.add(item);
        }

        return false;
    }
}
