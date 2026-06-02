import java.util.*;

 class TwoSums {
     public int[] twoSum(int[] numbers, int targetValue) {
         HashMap<Integer, Integer> valueMap = new HashMap<>();
  for(int currentIndex = 0; currentIndex < numbers.length; currentIndex++) { 
    int requiredValue = targetValue - numbers[currentIndex];
     if(valueMap.containsKey(requiredValue)) { 
        return new int[]{ valueMap.get(requiredValue), currentIndex }; 
        }
         valueMap.put(numbers[currentIndex], currentIndex);
          }
           return new int[]{};
            } 
            }


