class Solution {
    public String longestCommonPrefix(String[] strs) {
       StringBuffer sb=new StringBuffer("");
       if(strs.length==0){
        return "";
       }
    if(strs.length==1){
        return strs[0];
    }
    if(strs[0].equals("")){
        return "";
    }

    int count=strs[0].length();
    for(int i=0;i<strs.length;i++){
        if(count>strs[i].length()){
            count=strs[i].length();
        }
    }
       int k=0;
int n=0;
StringBuilder y=new StringBuilder();
       int flag=0;
       while(flag==0 && k<=count){
if(n==0){
    if(k+1>count){
    
String m=y.toString();
return m;
}
    y.append(strs[n].charAt(k));
}
if(k+1>count){
    y.deleteCharAt(y.length()-1);
String m=y.toString();
return m;
}
else if( strs[n].charAt(k)!=y.charAt(y.length()-1)){
   y.deleteCharAt(y.length()-1);
   flag=1;
}
if(n==strs.length-1){
    k++;
}
n=(n+1)%strs.length;
       }
       if(k>count){
        y.deleteCharAt(y.length()-1);
       }
String z=y.toString();
return z;
    }
}