/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmosettingsbackup;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import static mmosettingsbackup.Uploader.readFileAsString;

/**
 *
 * @author Pinapelz
 */
public class Downloader {

    public void downloadFFXIV() {
        try {
            Robot robot = new Robot();
            String ffxivPathString = readFileAsString("ffxivPath.txt");
            runProgram(ffxivPathString + "\\ffxivconfig.exe");
            wait(900);
            robot.keyPress(KeyEvent.VK_TAB);
            wait(300);
            robot.keyPress(KeyEvent.VK_TAB);
            wait(300);
            robot.keyPress(KeyEvent.VK_ENTER);
            wait(300);
            robot.keyPress(KeyEvent.VK_ENTER);
            wait(300);
            robot.keyPress(KeyEvent.VK_ENTER);
            wait(600);
            robot.keyPress(KeyEvent.VK_ENTER);
        } catch (Exception e) {

        }
    }

    private void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Logger.getLogger(Mainscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void runProgram(String path) {
        File file = new File(path);
        ProcessBuilder processBuilder = new ProcessBuilder(file.getAbsolutePath());
        processBuilder.directory(file.getParentFile());

        try {
            processBuilder.start();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String readFileAsString(String fileName) {
        String text = "";
        try {
            text = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}
