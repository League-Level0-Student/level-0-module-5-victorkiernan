import javax.swing.JOptionPane;

public class PrimeORKNot {
public static void main(String[] args) {
String number = JOptionPane.showInputDialog("Enter your favorite number!!!!");	
int num = Integer.parseInt(number);
for (int i = 2; i < num; i++) {
if (num%i==0) {
JOptionPane.showMessageDialog(null, "It is composite!");
System.exit(0);
}	
}
	JOptionPane.showMessageDialog(null, "It's prime!");
	System.exit(0);
}
}


