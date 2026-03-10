package ex4;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex4 {
    static void main(String[] args) {

        Scanner launcher = new Scanner(System.in);
        boolean online = true;

        do {
            System.out.println("Inserire i secondi per il conto alla rovescia");
            int sec = Integer.parseInt(launcher.nextLine());
            System.out.println("Modalità simulazione? y/n (default no)");
            String mode = launcher.nextLine();
            if ("y".equals(mode)) {
                simulatorCountdown(sec);
            } else {
                System.out.println(countdown(sec));
            }
            System.out.println("Vuoi lanciare un altro razzo? y/n (default no)");
            String repeater = launcher.nextLine();
            if (!"y".equals(repeater)) {
                online = false;
            }
        } while (online);


    }

    static int numberValidator(int num) {
        return Math.min(Math.abs(num), 20);
    }

    static String countdown(int num) {
        num = numberValidator(num);
        StringBuilder result = new StringBuilder();
        for (int i = num; i > 0; i--) {
            result.append("[").append(i % 2 == 0 ? "OK" : "CHECK").append("] Secondo ").append(i).append("\n");
            if (i == 10) {
                result.append("--- SEPARAZIONE STADIO ---\n");
            }
        }
        result.append("--- IGNITION ---\n");
        return result.toString();
    }

    static void simulatorCountdown(int num) {
        num = numberValidator(num);
        for (int i = num; i > 0; i--) {
            System.out.println(("[") + (i % 2 == 0 ? "OK" : "CHECK") + ("] Secondo ") + (i) + ("\n"));
            if (i == 10) {
                System.out.println("--- SEPARAZIONE STADIO ---\n");
            }

            java.awt.Toolkit.getDefaultToolkit().beep();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("---!!!EMERGENZA!!!--- Countdown interrotto");
                return;
            }
        }
        System.out.println("--- IGNITION ---\n");
        java.awt.Toolkit.getDefaultToolkit().beep();

        try {
            File audio = new File("mixkit-rocket-landing-whoosh-1721.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audio);

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            Thread.sleep(5000);
        } catch (
                UnsupportedAudioFileException e) {
            System.out.println("Formato audio non supportato.");
        } catch (
                IOException e) {
            System.out.println("Errore di lettura del file audio.");
        } catch (
                LineUnavailableException e) {
            System.out.println("Linea audio non disponibile.");
        } catch (InterruptedException e) {
            System.out.println("Timer offline");
        }


    }

}
