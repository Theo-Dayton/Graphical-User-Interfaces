/*
 * Button class, simple button which prints a message to console when it is
 * pressed
 */

import javax.swing.JButton; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

abstract public class Button extends JButton implements ActionListener{ 
    protected Canvas c;

    public Button (String label) {
	    setText (label);
        addActionListener (this);
    }

    public Button (String label, Canvas c) {
        this.c = c;
	    setText (label);
        addActionListener (this);
    }

    public Button (ComboBox combo, ScrollBarHorizontal scroll, Canvas c) {

    }

    public Button (ComboBox combo, Canvas c) {

    }

    public void actionPerformed (ActionEvent e) {
    }
}
