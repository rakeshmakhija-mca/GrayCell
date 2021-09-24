import java.util.Scanner;
public class second
{
	static int score_char(String str)
	{
		int score = 0;
		score += str.charAt(0);
		
		return score;
	}

	static int compare_ch(int ch, String compare_string)
	{
		for (int i = 0; i < compare_string.length(); i++) 
		{
			if (ch==compare_string.charAt(i)) 
				return i;
		}
		return compare_string.length()+1;
	}

	static void sort_str(int score_ch[],String str[],int n)
	{
		String temp;

		for (int i = 0; i < n; i++) 
		{
			for (int j = i+1; j < n; j++) 
			{
				if (score_ch[i]>score_ch[j]) 
				{
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
	}	

	public static void main(String[] args) 
	{
		int n;
		String compare_str;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter order of string you want :");
		compare_str = s.nextLine();

		System.out.print("Enter how many strings you want :");
		n = s.nextInt();
		
		String str[] = new String[n];
		Scanner s1 = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Enter all the strings:");
		System.out.println();
		
		for(int i = 0; i < n; i++)
		{
			str[i] = s1.nextLine();
		}
	
		int score_ch[] = new int[n];

		for(int i = 0; i < n; i++)
		{
			score_ch[i]=score_char(str[i]);
		}	
		
		for(int i = 0; i < n; i++)
		{
			score_ch[i]=compare_ch(score_ch[i],compare_str);
		}
		
		sort_str(score_ch,str,n);
		System.out.println("String in Sorted Order:");
		System.out.println();
		
		for (int i = 0; i < n; i++) 
		{
			System.out.println(str[i]);
		}
	}
}