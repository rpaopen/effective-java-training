

class Permutation{
	static int calculate(int n, int r){
		Factorial factorial=new Factorial();
		return 	factorial.calculate(n)/
			factorial.calculate(n-r);
	}
}