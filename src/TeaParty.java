import javax.swing.JOptionPane;

public class TeaParty {
public static void main(String[] args) {
}
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		if (isKnighted && !isWoman) {
			JOptionPane.showMessageDialog(null, "Sir" + name + "");
			return "Sir" + name + "";

			

			}
			if (!isWoman) {
				return "Mr" + name + "";
		}
		if (isKnighted&&isWoman) {
			return "Lady"+name+"";
			
			
			}
		
			return "Ms"+ name+"";
	
		
			}
	

}