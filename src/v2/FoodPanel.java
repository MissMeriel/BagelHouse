package v2;

import java.awt.*;
import javax.swing.*;

public class FoodPanel extends JPanel {

	private DonutPanel dp;
	private BagelPanel bp;
	
	public FoodPanel(){
		
		bp = new BagelPanel();
		dp = new DonutPanel();
		
		setLayout(new BorderLayout());
		
		add(bp, BorderLayout.NORTH);
		add(dp,BorderLayout.SOUTH);
	}
	
	public double getFoodCost(){
		return bp.getBagelCost() + dp.getDonutCost();
	}
}
