package self_assessment_task1;

public class SortingWords {

	public static void main(String[] args) {
		String text = "To be or not to be, that is the question;"
				+"Whether `tis nobler in the mind to suffer"
				+" the slings and arrows of outrageous fortune,"
				+" or to take arms against a sea of troubles,"
				+" and by opposing end them?";
		
		String lowerCaseText = text.toLowerCase();
		String[]  words = lowerCaseText.split("[^a-z]+");
		
		wordsBubbleSort(words);
		
		for (int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
		
	}
	
	private static void wordsBubbleSort(String[] words)
	{
		int n= words.length;
		boolean wordsSwapped = true;
		while (wordsSwapped) {
			wordsSwapped=false;
			for (int i =0; i<n-1; i++)
			{
				if(words[i].compareTo(words[i+1])>0) {
					 String tmp = words[i];
					 words[i] = words[i+1];
					 words[i+1] = tmp;
					 wordsSwapped = true;
				}
			}
		}
	}
}
