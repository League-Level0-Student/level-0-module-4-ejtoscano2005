import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
public static void main(String[] args) {
String[] options ={"Enter the cave.","Go into the ocean.","Stay on the island."};	
int input =JOptionPane.showOptionDialog(null,"What do you want to do?","Choices", 0, -1, null, options, 0);
String choice = options[input];
if(choice.equals("Enter the cave.")){
JOptionPane.showMessageDialog(null, "You enter the cave and hear a scary noise. Using courage you go deeper into the cave. You find a dragon!");	
JOptionPane.showMessageDialog(null, "You grab you hammer and try to smash it into pieces. It attacks you. You try to run. The dragon chases after you. You have an idea. You jump on top of the dragon. You tame it and fly off into the sky.");
}

if(choice.equals("Go into the ocean.")){
JOptionPane.showMessageDialog(null, "You go into the ocean. You hear small splashes. You are a bit confused and go further into the ocean. You find a tremendous sea monster!");	
JOptionPane.showMessageDialog(null, "You take out your bow and shoot it. It does nothing. You run for it. It grabs you and pulls you down into the ocean. You struggle to breathe. You hit it direcly in the eye with your arrow. You run away.");
}

if(choice.equals("Stay on the island.")){
JOptionPane.showMessageDialog(null, "You stay on the island. You hear a rumbling underneath you. Your instinct kicks in and it causes you to get out of there. A gigantic sand monster pops up!");	
JOptionPane.showMessageDialog(null, "You take out your sword and cut through it. Nothing happens. You run. It chases after you. You stab it deeply in its sandy body. It seems to be hurt. You go deeper. You slay it.");
}

















}
}

