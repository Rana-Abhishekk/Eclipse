
public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello world";
		String[] strA = str.split(" ");
		for(int i=0;i<strA.length;i++) {
			System.out.println(strA[i]);
		}
		String res = new String();
		String s = new String();
		String nstr ="";
		for(int i=0;i<strA.length;i++) {
			s = strA[i];
			for (int j=0; j<s.length(); j++)
		      {
		       char ch= s.charAt(j); //extracts each character
		        nstr= ch+nstr; //adds each character in front of the existing string
		      }
			
			res = res + nstr;
			if(i!=strA.length-1) res = res+" ";
			
			nstr="";
		}
		System.out.println(res);
		
		

	}

}
