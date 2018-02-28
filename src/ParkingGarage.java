import javax.swing.*;
import java.text.DecimalFormat;

public class ParkingGarage {
// Written by: Mike Baldwin
// Project 5 - Part 2 - The Little Parking Garage
// Calculates the total hours and cost of a 5-car parking garage

public static void main(String[] args) {
    double hours, charge, totalHours, totalCost;
    DecimalFormat hoursFormat, costFormat;
    JPanel panel;
    JTextField hoursText, totalHoursText, totalCostText;

    totalHours = 0; totalCost = 0;
    hoursFormat = new DecimalFormat("##.#"); costFormat = new DecimalFormat("$##.00");

    hoursText = new JTextField(3);
    totalHoursText = new JTextField(3); totalHoursText.setEditable(false);
    totalCostText = new JTextField(3);  totalCostText.setEditable(false);

    panel = new JPanel();
    panel.add(new JLabel("Total Hours:"));  panel.add(totalHoursText);
    panel.add(new JLabel("Total Cost:"));   panel.add(totalCostText);
    panel.add(new JLabel("Hours Parked:")); panel.add(hoursText);

    for (int i = 0; i < 5; i++) {
        hoursText.setText("0");
        totalHoursText.setText(Double.toString(totalHours));
        totalCostText.setText(Double.toString(totalCost));
        JOptionPane.showMessageDialog(null, panel, "Parking Garage", JOptionPane.QUESTION_MESSAGE);
        hours = clamp(Double.parseDouble(hoursText.getText()), 0, 24);
        charge = clamp(5 + Math.ceil(hours) - 2, 5, 12);
        totalHours += hours;
        totalCost += charge;
    }

    JOptionPane.showMessageDialog(null, "Total Hours " + hoursFormat.format(totalHours) + "\n" + "Total Charge " + costFormat.format(totalCost));
}

/**
 * Clamps a value to a minimum and maximum value (both inclusive).
 */
public static double clamp(double value, double min, double max) {
    return value < min ? min : value > max ? max : value;
}
}
