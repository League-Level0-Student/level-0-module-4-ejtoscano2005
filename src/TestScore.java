import javax.swing.JOptionPane;

public class TestScore {
public static void main(String[] args) {
	

String test = JOptionPane.showInputDialog("What was your test score?");
double a = Double.parseDouble(test);
if(a<=69){
	JOptionPane.showMessageDialog(null, "You did terrible!");
}
else if(a<=74){
	JOptionPane.showMessageDialog(null, "You can do better!");
}
else if(a<=79){
	JOptionPane.showMessageDialog(null, "You did ok!");
}

else if(a<=85){
	JOptionPane.showMessageDialog(null, "You did good!");
}

else if(a<=94){
	JOptionPane.showMessageDialog(null, "You did great!");
}
else if(a<=100){
	JOptionPane.showMessageDialog(null, "You did amazing!");
}



















}}
