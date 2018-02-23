import javax.swing.*;
import java.text.DecimalFormat;

public class ParkingGarage {
public static void main(String[] args) {
    String hours;
    double charge;
    double totalHours;
    double totalCharge;
    DecimalFormat hoursFormat;
    DecimalFormat costFormat;

    totalHours = 0;
    totalCharge = 0;
    hoursFormat = new DecimalFormat("##.#");
    costFormat = new DecimalFormat("$##.##");

    for (int i = 0; i < 5; i++) {
        hours = JOptionPane.showInputDialog("Enter the hours parked for car 1:");
        charge = 5 + Math.ceil(Double.parseDouble(hours)) - 2;

        totalHours += Double.parseDouble(hours);
        totalCharge += charge;
    }

    JOptionPane.showMessageDialog(null, "Total Hours " + hoursFormat.format(totalHours) + "\n" + "Total Charge " + costFormat.format(totalCharge));
}
}
