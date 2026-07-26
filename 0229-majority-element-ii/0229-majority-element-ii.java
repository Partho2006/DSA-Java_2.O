class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n=arr.length;
        int c1=0, c2=0;
        int el1=Integer.MIN_VALUE, el2=Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            if(c1==0 && el2!=arr[i]) {
                c1=1;
                el1=arr[i];
            } else if(c2==0 && el1!=arr[i]) {
                c2=1;
                el2=arr[i];
            } else if(arr[i] == el1) {
                c1++;
            } else  if(arr[i] == el2) {
                c2++;
            } else {
                c1--;
                c2--;
            }
        }
        c1=0; c2=0;
        for(int i=0; i<n; i++) {
            if(arr[i] == el1) c1++;
            else if(arr[i] == el2) c2++;
        }
        int N=n/3+1;
        List<Integer> result=new ArrayList<>();
        if (c1 >= N) result.add(el1);
        if (c2 >= N && el1 != el2) result.add(el2);
        return result;
    }
}