class Solution {
    /*
     * @param a, b, n: 32bit integers
     * @return: An integer
     */
    public int fastPower(int a, int b, int n) {
        // write your code here
        // debug 1： 了解熟悉 fast power的性质
        //(a * b) % p = (a % p * b % p) % p 
        if (n == 0) {
            return 1 % b; 
        }
        if (n == 1) {
            return a % b;
        }
        long part1 = fastPower(a, b, n/2);  //debug
        long res = (part1 * part1) % b;     // debug
        if (n % 2 == 1) {
            res = (res * a) % b; 
        }
        return (int )res;  //debug
        // int part2 = fastPower(a, b, n/2)
    }
};
