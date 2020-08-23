/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmosettingsbackup;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Pinapelz
 */
public class ErrorHandler {

    private JFileChooser chooser = new JFileChooser();

    public ErrorHandler() {
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    }

    public void alreadySelected(String name) {
        JOptionPane.showMessageDialog(null, name + "has already been chosen. Please press START or choose another option", "Already Chosen Error", JOptionPane.ERROR_MESSAGE);
    }

    public void notChosen() {
        JOptionPane.showMessageDialog(null, "Please choose an option for the game", "Error no option chosen", JOptionPane.ERROR_MESSAGE);
    }

    public File noPath(String name) {
        File returnFile;
        JOptionPane.showMessageDialog(null, name + "'s install location is not specified. Please set it using the instructions that come next", "Error no path", JOptionPane.WARNING_MESSAGE);
        if (name.equals("Final Fantasy XIV")) {
            JOptionPane.showMessageDialog(null, "Please Navigate To The Folder Where ffxivboot.exe is in", "Error no path", JOptionPane.INFORMATION_MESSAGE);
            File path = chooser.getSelectedFile();
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                returnFile = chooser.getSelectedFile();
                return returnFile;
            }
            else{
                JOptionPane.showMessageDialog(null, "Nothing was chosen", "Error no option chosen", JOptionPane.ERROR_MESSAGE); 
                return null;
            }
          

        } else if (name.equals("World of Warcraft")) {
            JOptionPane.showMessageDialog(null, "Please Navigate To your user account folder in the WTF folder. This normally looks like: \n C:\\Games\\World of Warcraft\\_retail_\\WTF\\Account\\[ACCOUNT NUMBER]", "Error no path", JOptionPane.INFORMATION_MESSAGE);
        }
        return null;
    }
}
