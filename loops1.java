import javax.swing.JOptionPane;

public class loops1 {
public static void main(String [] args) {
String user, pass, user1, pass1;
user = JOptionPane.showInputDialog("Enter your Username");
pass = JOptionPane.showInputDialog("Enter your password");
										user1 = JOptionPane.showInputDialog("Enter your Username");			pass1 = JOptionPane.showInputDialog("Enter your password");
										while (!user.equals(user1) && (!pass.equals(pass1))) {	
										JOptionPane.showMessageDialog(null, "Incorrect!! please try again");
										user1 = JOptionPane.showInputDialog("Enter your Username");
										pass1 = JOptionPane.showInputDialog("Enter your password");}
										JOptionPane.showMessageDialog(null, "Welcome " + user);	
										
}
}
