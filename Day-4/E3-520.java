class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        boolean allUpper = true;
        boolean allLower = true;
        boolean firstUpperRestLower = Character.isUpperCase(word.charAt(0));

        for (int i = 0; i < n; i++) {
            if (!Character.isUpperCase(word.charAt(i))) {
                allUpper = false;
            }
            if (!Character.isLowerCase(word.charAt(i))) {
                allLower = false;
            }
            if (i > 0 && !Character.isLowerCase(word.charAt(i))) {
                firstUpperRestLower = false;
            }
        }

        return allUpper || allLower || firstUpperRestLower;
    }
}
