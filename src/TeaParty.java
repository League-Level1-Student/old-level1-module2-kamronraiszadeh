import javax.swing.JOptionPane;

public class TeaParty {
public static void main(String[] args) {
	
}
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		if (isKnighted && !isWoman) {
			JOptionPane.showMessageDialog(null, "Sir" + name + "");
			return "Hello Sir " + name + "";

			

			}
			if (!isWoman) {
				return "Hello Mr. " + name + "";
		}
		if (isKnighted&&isWoman) {
			return "Hello Lady "+name+"";
			
			
			}
		
			return "Hello Ms. " + name+"";
	
		
			}
	

}