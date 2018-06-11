//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        
        
        /*
          Ask the user for these values using a confirm dialog like the one below*/
        
         int x = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         System.out.println(x);
    if( x==0) {JOptionPane.showMessageDialog(null, "Get up lazy bones");}
    else{
    	JOptionPane.showMessageDialog(null, "Sleep in");
    }


        /*
         * Print â€œsleep inâ€� if it is a vacation or a weekend. If itâ€™s a weekday,
         * print â€œget up lazybones!â€� If it is a weekday, and we are on vacation,
         * print â€œsleep inâ€�.
         */
    }
}
