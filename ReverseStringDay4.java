public class ReverseStringDay4 {

    public void reverseString(char[] s) {
        int index1 = 0;
        int index2 = s.length-1;
        while(index2>index1){
            swapValues(s,index1,index2);
            index2--;
            index1++;
        }
    }

    public void swapValues(char[]s,int index1,int index2){
        char temp = s[index1];
        s[index1] = s[index2];
        s[index2] = temp;
    }

    public static void main(String[] args){
        ReverseStringDay4 object = new ReverseStringDay4();
        char[] s = {'h','a','n','x','n','a','H'};
        object.reverseString(s);
    }
}
