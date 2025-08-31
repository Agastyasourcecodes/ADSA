class Solution {
    public int[] lcmAndGcd(int a, int b) {
        int gcd = findGCD(a, b);
        int lcm = (a * b) / gcd;
        return new int[]{lcm, gcd};
    }

    private int findGCD(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
