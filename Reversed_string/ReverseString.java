class ReverseString {
	public static void main(String[] args){
		System.out.println(reversed("cica"));
	}
	static String reversed (String s){
			String reversed = "";

	for(int i = s.length()-1; i >= 0; i--){
		reversed += s.charAt(i);
	}
	return reversed;
	}
}
