import javax.swing.*;
import java.text.DecimalFormat;

public class ParkingGarage {
public static void main(String[] args) {
    double hours, charge, totalHours, totalCost;
    DecimalFormat hoursFormat, costFormat;
    JPanel uneditablePanel, editablePanel;
    JTextField hoursText, totalHoursText, totalCostText;
    //GridLayout layout = new GridLayout(2, 4, 0, 3);

    totalHours = 0; totalCost = 0;
    hoursFormat = new DecimalFormat("##.#"); costFormat = new DecimalFormat("$##.##");

    hoursText = new JTextField(3);
    totalHoursText = new JTextField(3); totalHoursText.setEditable(false);
    totalCostText = new JTextField(3); totalCostText.setEditable(false);

    uneditablePanel = new JPanel();
    uneditablePanel.setLayout(new BoxLayout(uneditablePanel, BoxLayout.X_AXIS));
    uneditablePanel.add(new JLabel("Total Hours:"));  uneditablePanel.add(totalHoursText);
    uneditablePanel.add(new JLabel("Total Cost:"));   uneditablePanel.add(totalCostText);
    uneditablePanel.add(new JLabel("Hours Parked:")); uneditablePanel.add(hoursText);

    for (int i = 0; i < 5; i++) {
        hoursText.setText("0");
        totalHoursText.setText(Double.toString(totalHours));
        totalCostText.setText(Double.toString(totalCost));
        JOptionPane.showMessageDialog(null, panel, "Parking Garage", JOptionPane.QUESTION_MESSAGE);
        hours = Double.parseDouble(hoursText.getText());
        charge = 5;

        if (hours - 2 > 0) {
            charge += Math.ceil(hours) - 2;
        }
        charge = clamp(charge, 5, 12);
        //charge = 5 + Math.ceil(hours) - 2;
        totalHours += hours;
        totalCost += charge;
    }

    JOptionPane.showMessageDialog(null, "Total Hours " + hoursFormat.format(totalHours) + "\n" + "Total Charge " +
            costFormat.format(totalCost));
}

/**
 * Clamps a value to a minimum and maximum value (both inclusive).
 */
public static double clamp(double value, double min, double max)
{
    return value < min ? min : value > max ? max : value;
}
}
