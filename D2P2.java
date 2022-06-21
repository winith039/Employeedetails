/*Write a function that reverses a string. The input string is given as an array of characters s.*/
class Solution {
    public void reverseString(char[] s) {
        //char[] r=new char[s.length];
        int i=0;
        int n=s.length-1;
        char temp;
        while(i<n){
            temp=s[i];
            s[i]=s[n];
            s[n]=temp;
            i++;
            n--;
        }
    }
}
