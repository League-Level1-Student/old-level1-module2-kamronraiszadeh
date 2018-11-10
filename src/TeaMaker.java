import javax.swing.JOptionPane;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

public class TeaMaker {

	/* Figure out how to make a cup of tea using the classes below */
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("What flavor don you want your tea?");
		TeaBag tea = new TeaBag(flavor);
		Kettle kettle = new Kettle();

		kettle.boil();
		kettle.getWater();
		Cup cup = new Cup();
		cup.makeTea(tea, kettle.getWater());

	}

}

class TeaBag {

	public final static String GREEN = "Green";
	public final static String MINT = "Mint";
	public final static String CHAMOMILE = "Chamomile";
	public final static String PASSION_FRUIT = "Passion Fruit";

	private String flavor;

	TeaBag(String flavor) {
		this.flavor = flavor;
	}

	String getFlavor() {
		return flavor;
	}

}

class Kettle {

	private Water water = new Water();

	Water getWater() {
		return water;
	}

	void boil() {
		this.water.isHot = true;
	}

	class Water {

		private boolean isHot = false;

		public boolean isHot() {
			return this.isHot;
		}
	}

}

class Cup {

	private TeaBag teabag;

	void makeTea(TeaBag teabag, Kettle.Water hotWater) {
		this.teabag = teabag;
		if (hotWater.isHot())
			System.out.println("Making hot " + teabag.getFlavor() + " tea.");
		else
			System.out.println("Can't make tea with cold water! ");
	}

}
