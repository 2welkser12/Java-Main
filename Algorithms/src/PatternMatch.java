
public class PatternMatch {
	
	public static void main(String[] args) {
		String text = "Navinreddy";
		String pattern = "y";
		int tlen = text.length();
		int plen = pattern.length();
		
		char[] ctext = text.toCharArray();
		char[] cpattern = pattern.toCharArray();
		int count =0;
		boolean isthere = false;
		
		for(int i =0; i<tlen; i++) {
			if(ctext[i] == cpattern[0])
			{
				count++;
				while (count < plen)
				{
					System.out.println(count);
					if(ctext[i+count] == cpattern[count])
						count++;
					else
						break;
				}
				if(count == plen)
					isthere = true;
				else
					count=0;
				System.out.println(count);
					
			}
		}
		System.out.println(isthere);
		if(isthere)
			System.out.println("Is there");
		else
			System.out.println("Not there");
		
		
	}

}
