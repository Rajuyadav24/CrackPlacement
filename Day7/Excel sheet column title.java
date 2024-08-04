class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--; // Adjust to 0-based index
            char ch = (char) (columnNumber % 26 + 'A'); // Map remainder to corresponding character
            result.insert(0, ch); // Insert character at the beginning of the result string
            columnNumber /= 26; // Divide the number by 26 for the next iteration
        }
        return result.toString();
    }
}
