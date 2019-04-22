package org.pash.problems;

public class TargetIndices extends AbstractProblems {

    TargetIndices () {
        this.problemID = "Indices1895";
    }

    public void problemDefinition () {
        System.out.println ("Given an array of integers, return indices of the two numbers such that they add up to a specific target.\n" +
                "You may assume that each input would have exactly one solution, and you may not use the same element twice.\n" +
                "Example:\n" +
                "Given nums = [2, 7, 11, 15], target = 9,\n" +
                "\n" +
                "Because nums[0] + nums[1] = 2 + 7 = 9,\n" +
                "return [0, 1].\n");
    }

    /**
     *
     * Example:
     * Given nums = [2, 7, 11, 15], target = 9,
     *
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     *
     * @param array
     * @param target
     */
    public boolean solveProblem (int [] array, int target) {
        if (array == null || array.length < 2) {
            System.out.println("Invalid arguments. Nothing to do!");
            return false;
        }

        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    found = true;
                    System.out.println("Indices for target: " + target +
                            " are: " + i + " and " + j +
                            ". Each having values: " + array[i] + " and " + array[j]);
                   return true;
                }
            }
        }

        if (!found)
            System.out.println("No valid results found...");

        return false;
    }

    public static void main(String[] args) {
        TargetIndices prob = new TargetIndices();

        int [] arr = {2,7,9,5,4};
        prob.solveProblem(arr, 9);


    }
}
