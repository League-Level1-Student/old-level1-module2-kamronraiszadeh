
public class Vault {
	int code = 54468637;
public static void main(String[] args) {
	
	Vault v = new Vault();
	System.out.println(v.trycode(54468637));
}
	public boolean trycode(int guess) {
		if (guess == code) {
			return true;
		} else {
			return false;
		}
		
	}
}
