package Lecture7;

public class ReverseString {
public static void main(String[] args) {
	String str = "hello";
	
	String ans = "";
	for(int i=str.length()-1;i>=0;i--) {
		char ch = str.charAt(i);
		//System.out.println(ch);
		ans=ans+ch;
		System.out.println(ans);
	}
	
	
}
}
