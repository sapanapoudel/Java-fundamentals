/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.*;

public class Library {
    public static void main(String[] args) {
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = tally(votes);
        System.out.println(winner + " received the most votes!");
    }

    //Rolling dice
    public static int[] roll(int n) {
        int[] valueArr = new int[n];

        //Roll the dice
        int random = (int)(Math.floor(Math.random()*6) +1);
        for( int i = 0; i < n; i++){
            valueArr[i] = random;
        }
//        System.out.println(Arrays.toString(valueArr));
        return valueArr;
    }

    //Contains duplicates
    public static boolean containsDuplicates(String[] testArr){
        for(int i = 0; i < testArr.length; i++){
            for(int k = i+1; i < testArr.length; k++){
                if (testArr[i] != null && testArr[i].equals(testArr[k])) {
                    return true;
                }
            }
        }
        return false;
    }

    //Calculating average
    public static double calculateAverage(int[] testArr){
        int sum = 0;
        for(int i = 0; i < testArr.length; i++) {
            sum += testArr[i];
        }
        double average = (double)sum / (double) testArr.length;
//        System.out.println("average is: " + average);
        return average;
    }

    //Arrays of Arrays
    public static int[] calculateAvgOfArrayOfArrays(int[][] arrs) {
        int[] minAvgArray = arrs[0];
        for(int[]currentArray : arrs){
            if(calculateAverage(currentArray) < calculateAverage(minAvgArray)){
                minAvgArray = currentArray;
            }
        }
//        System.out.println(Arrays.toString(minAvgArray));
        return minAvgArray;
    }

    //Maps
//    public static void main(String[] args) {
//        HashMap<String, Integer[]> animalFriendliness = new HashMap<>();
//        animalFriendliness.put("Ginger", new Integer[]{11});
//        animalFriendliness.put("that raccoon in my trash can", new Integer[]{0});
//        animalFriendliness.put("all of the student", new Integer[]{9,9,9,9,9,9,9,9,9,9,9,9,9,9});
//
//        System.out.println(animalFriendliness.get("Ginger"));
//    }
    public static String weatherData(int[][] arrs) {
        String finalInput = " ";
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
                System.out.println("High: " + maxValue);
            } else if (value < minValue) {
                minValue = value;
                System.out.println("Low: " + minValue);
            }
        }

        StringBuilder string = new StringBuilder(" ");
        for(int i =  minValue; i < maxValue; i++) {

            if (!h.contains(i)) {
                string.append(i);
                System.out.println("Never saw temperature: " + i);
            }
        }
        return string.toString();
        //return "High";


    }

    // Tallying Election
    public static String tally(List<String> list) {
        HashMap < String, Integer> vote = new HashMap<>();
        for(String item : list) {
            vote.put(item, 0);
        }
        int max = 0;
        String maxVotes = " ";
        for(String item : list) {
            if(vote.get(item) > max) {
                max = vote.get(item) + 1;
                maxVotes = item;
            }
            vote.put(item, max);
        }

        return maxVotes;
    }

}
