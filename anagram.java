import java.util.*;
import java.lang.*;
class anagram{
	public static void main(String...args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first String");
	String str1=sc.next();
	
	System.out.println("Enter second String");
	String str2=sc.next();
	
	char[] str1_sort=str1.toCharArray();
	Arrays.sort(str1_sort);

	char[] str2_sort=str2.toCharArray();
	Arrays.sort(str2_sort);

	String s1=String.valueOf(str1_sort);
	String s2=String.valueOf(str2_sort);
	
	if(s1.equals(s2)==true)
	{
	System.out.println("String are anagram");
	}
	else 
	{
	System.out.println("String are not anagram");
	}

	


	}	
}
