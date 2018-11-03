import javax.swing.JOptionPane;

public class popcornrunner {
public static void main(String[] args) {
		String flavor=JOptionPane.showInputDialog("What flavor do want your popcorn?");
		String time=JOptionPane.showInputDialog(" How many minutes should it be cooked?");
		Popcorn pop = new Popcorn(flavor);
	Microwave micro= new Microwave ();
	
	micro.putInMicrowave(pop);
	int duration= Integer.parseInt(time);
	micro.setTime(duration);
	
	micro.startMicrowave();
	
	
}
}
