package CoderbyteChallenges;



public class LongestWord
{
	public static void main(String args[])
	{	int longestLen=1;
		String longestWord="";
		String s1="Argument goes here";
		
		//HashMap<String, Integer> WordLen=new HashMap<String, Integer>();
		String words[] = s1.split(" ");
		if(s1==null)
			System.out.println("Empty String");
		for(int i=0;i<words.length;i++)
		{   
			if(words[i].length() > longestLen)
			{
				longestLen=words[i].length();
				longestWord=words[i];
			}
			else{	
				if(words[i].length() == longestLen && longestLen>1)
				{
					System.out.println("Multiple Longest Words exist "+words[i]);
				}
				else{
					if(words[i].length() == longestLen && longestLen==1 && words[++i]==null)
						System.out.println("Multiple Longest Words exist "+words[i]);
				}
			}
			
		}
		System.out.println("Longest Word : "+longestWord);


	}
}