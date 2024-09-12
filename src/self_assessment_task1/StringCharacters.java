package self_assessment_task1;

public class StringCharacters {

	public static void main(String[] args) {
		String text = "To be or not to be, that is the question;"
				+"Whether `tis nobler in the mind to suffer"
				+" the slings and arrows of outrageous fortune,"
				+" or to take arms against a sea of troubles,"
				+" and by opposing end them?";
				int spaces = 0,
				vowels = 0,
				letters = 0;
				String lowerCaseText = text.toLowerCase();
				for (int i=0; i<lowerCaseText.length();i++) {
					char c=lowerCaseText.charAt(i);
					if(c >= 'a' &&  c <= 'z') {
						letters++;
						if (c =='a' || c =='e' || c =='i'||c =='u' || c=='o') {
							vowels++;
						}
					}		
					else if (lowerCaseText.charAt(i)== ' '){
							spaces++;
					}
					
				} 
				System.out.println("The text contained vowels: " + vowels + "\n" + "Consonants:" + (letters - vowels) + "\nSpaces:" + spaces);
	}

}
