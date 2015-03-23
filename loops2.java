import javax.swing.JOptionPane;

public class loops2 {
	public static void main(String [] args) {
			String user, pass, user1, pass1;
					final int LIMIT = 2;
							int count = 0;
									
											
													user = JOptionPane.showInputDialog("Enter your Username");
															pass = JOptionPane.showInputDialog("Enter your password");
																	user1 = JOptionPane.showInputDialog("Enter your Username");
																			pass1 = JOptionPane.showInputDialog("Enter your password");
																					
																							while (count < LIMIT) {
																										
																												if (user.equals(user1) && (pass.equals(pass1))) {
																															JOptionPane.showMessageDialog(null, "Welcome " + user);
																																	System.exit(0); }
																																			
																																					else {
																																							JOptionPane.showMessageDialog(null, "Incorrect!! please try again");
																																									user1 = JOptionPane.showInputDialog("Enter your Username");
																																											pass1 = JOptionPane.showInputDialog("Enter your password");
																																													count++;}}
																																															JOptionPane.showMessageDialog(null, "Please contact your adminstrator to unlock your account!");
																																																	System.exit(0);

																																																	}
																																																	}

