class Main {

	public static void main(String[] args){
		System.out.println(factorial(3));
	}
	static int factorial(int n){
	int result = 1;
	for(int i = 2; i <= n; i++){
		result = result * i;
		System.out.println(result);
		System.out.println(i);
	}
	return result;
	}

}
