
public class JamesBond {
public int findCode (Vault v) {
	for (int i = 0; i < 100000000; i++) {
	if (v.trycode(i)==true) {
		return i;
		
		
	}
	}
	return -1;
}
public static void main(String[] args) {
	JamesBond james= new JamesBond ();
	
	System.out.println(james. findCode(new Vault()));;
}
}
