/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.*;

public class Library {

    //=====================Rolling dice=============================================
    public static int[] roll(int n) {
        int[] valueArr = new int[n];

        //Roll the dice
        int random = (int)(Math.floor(Math.random()*6) +1);
        for( int i = 0; i < n; i++){
            valueArr[i] = random;
        }
        return valueArr;
    }

    //======================Contains duplicates=============================
    public static boolean containsDuplicates(String[] testArr){
        for(int i = 0; i < testArr.length; i++){
            for(int k = i+1; true; k++){
                if (testArr[i] != null && testArr[i].equals(testArr[k])) {
                    return true;
                }

            }
        }

        return false;
    }

    //=================Calculating average================================
    public static double calculateAverage(int[] testArr){
        int sum = 0;
        for(int i = 0; i < testArr.length; i++) {
            sum += testArr[i];
        }
        double average = (double)sum / (double) testArr.length;
        return average;
    }

    //=======================Arrays of Arrays===================================
    public static int[] calculateAvgOfArrayOfArrays(int[][] arrs) {
        int[] minAvgArray = arrs[0];
        for(int[]currentArray : arrs){
            if(calculateAverage(currentArray) < calculateAverage(minAvgArray)){
                minAvgArray = currentArray;
            }
        }
        return minAvgArray;
    }

    //======================Maps=================================================

    public static String weatherData(int[][] arrs) {
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0; i < arrs.length; i++) {
            for(int item : arrs[i]) {
                h.add(item);

            }
        }
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for(int value : h){
            if (value > maxValue){
                maxValue = value;

            } else if (value < minValue) {
                minValue = value;

            }
        }
        StringBuilder string = new StringBuilder();
        string.append("High: " + maxValue);
        string.append("\n");
        string.append("Low: " + minValue);
        string.append("\n");

        for(int i =  minValue; i < maxValue; i++) {

            if (!h.contains(i)) {
                string.append("Never saw temperature: " + i + "\n");
            }
        }
        return string.toString();
    }

    // ===============================Tallying Election========================
    public static String tally(List<String> votes) {
        //Source: https://www.geeksforgeeks.org/find-winner-election-votes-represented-candidate-names/
        //Insert all votes into Hashmap
        HashMap<String, Integer> vote = new HashMap<>();
        for (String item : votes) {
            if (vote.keySet().contains(item)) {
                vote.put(item, vote.get(item) + 1);
            } else {
                vote.put(item, 1);
            }
        }
        // Traverse through map to find the candidate
        // with maximum votes.
        int max = 0;
        String winner = " ";

        //source: https://www.geeksforgeeks.org/map-entry-interface-java-example/
        for (Map.Entry<String, Integer> entry : vote.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value > max) {
                max = value;
                winner = key;
            } else if (value == max && winner.compareTo(key) > 0) {
                winner = key;
            }
        }
        return winner;

    }

}
