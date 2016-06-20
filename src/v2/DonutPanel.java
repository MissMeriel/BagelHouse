package v2;

import java.awt.*;
import javax.swing.*;

//

public class DonutPanel extends JPanel {

	public final double JELLY_DONUT = 1.50;
	public final double PLAIN_DONUT = 1.00;

	// The following variables will reference radio
	// buttons for the different donuts.
	private JRadioButton jellyDonut;
	private JRadioButton none;
	private JRadioButton plainDonut;

	// The following variable will reference a
	// ButtonGroup object to group the radio buttons.
	private ButtonGroup bg;

	public DonutPanel() {

		setLayout(new GridLayout(3, 1));
		
		none = new JRadioButton("None");
		jellyDonut = new JRadioButton("Jelly Donut", true);
		plainDonut = new JRadioButton("Plain Donut");

		// Group the radio buttons.
		bg = new ButtonGroup();
		bg.add(none);
		bg.add(plainDonut);
		bg.add(jellyDonut);


		// Add a border around the panel.
		setBorder(BorderFactory.createTitledBorder("Donut"));

		
		add(jellyDonut);
		add(plainDonut);
		add(none);

	}

	public double getDonutCost() {

		// The following variable will hold the cost
		// of the selected donut.
		double donutCost = 0.0;

		// Determine which bagel is selected.
		if (jellyDonut.isSelected())
			donutCost = JELLY_DONUT;
		else if (plainDonut.isSelected())
			donutCost = PLAIN_DONUT;
		
		// Return the cost of the selected donut.
		return donutCost;
	}
}
