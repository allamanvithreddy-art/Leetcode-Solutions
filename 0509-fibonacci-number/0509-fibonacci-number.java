class Solution {
   
    public int fib(int n) {
         int arr[]=new int[n+1];
    arr[0]=0;
    if(n==0)
    return arr[0];
    arr[1]=1;
        return fib1(n,arr);
    }
    public int fib1(int n,int arr[]){
if(arr[n]!=0){
    return arr[n];
}
if(n==0 || n==1){
    return arr[n];
}
return arr[n]= fib1(n-1,arr)+fib1(n-2,arr);
    }
}