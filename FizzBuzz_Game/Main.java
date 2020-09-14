class Main {
	public static void main(String[] args) {
		fizzBuzz();
	}
	static void fizzBuzz(){
	int x = 100;
		for(int i = 0; i <= x; i++){

	if( i % 15 == 0){
			System.out.println("FizzBuzz");
	}else if ( i % 5 == 0 && i % 15 != 0){
		System.out.println("Buzz");
	}else if ( i % 3 == 0 && i% 15!= 0 && i % 5 != 0){
		System.out.println("Fizz");
	}else {
		System.out.println(i);
	}
		}
	}
}
