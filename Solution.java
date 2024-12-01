class Solution {
    public boolean checkIfExist(int[] arr) {
        // Use a HashSet to store elements for quick look-up
        HashSet<Integer> seen = new HashSet<>();
        
        // Traverse through the array
        for (int num : arr) {
            // Check if either the double of the current number or half exists in the set
            if (seen.contains(2 * num) || (num % 2 == 0 && seen.contains(num / 2))) {
                return true;
            }
            // Add the current number to the set
            seen.add(num);
        }
        
        // If no such pair is found, return false
        return false;
    }
}
