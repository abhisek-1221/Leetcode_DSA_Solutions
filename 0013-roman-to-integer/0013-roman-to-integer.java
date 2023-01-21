class Solution 
{
    public int romanToInt(String s) {
int ans = 0, numVal = 0, prevNumVal = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'M' -> numVal = 1000;
                case 'D' -> numVal = 500;
                case 'C' -> numVal = 100;
                case 'L' -> numVal = 50;
                case 'X' -> numVal = 10;
                case 'V' -> numVal = 5;
                case 'I' -> numVal = 1;
            }
            if (numVal < prevNumVal) {
                ans-= numVal;
            }
            else {
                ans+= numVal;
            }
            prevNumVal = numVal;
        }
        return ans;
    }
}