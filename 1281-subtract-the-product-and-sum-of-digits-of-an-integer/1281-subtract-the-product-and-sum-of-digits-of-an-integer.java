class Solution {
    public int subtractProductAndSum(int n) {
        int res;
        int sum=0; int prod=1;
        ArrayList<Integer> arr = new ArrayList<>();
        while(n != 0){
            res = n%10;
            n /= 10;
            arr.add(res);
        }
        for(int i=0; i<arr.size(); i++){
            sum += arr.get(i);
            prod *= arr.get(i);
        }
        return prod-sum;
    }
}