package com.ejemplo;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Hashtable;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new MusicPlayerGUI().setVisible(true);

//                Song song = new Song("src/assets/Wind Riders - Asher Fulero.mp3");
//                System.out.println(song.getSongTitle());
//                System.out.println(song.getSongArtist());
            }
        });
    }
}
