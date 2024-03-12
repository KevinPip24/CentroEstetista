package DoveSiamo;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mappa extends JFrame {
    private JFXPanel jfxPanel;

    public Mappa() {
        setTitle("Dove siamo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        jfxPanel = new JFXPanel();

        // Aggiungi il JFXPanel al frame
        getContentPane().add(jfxPanel, BorderLayout.CENTER);

        // Carica la mappa di Google Maps
        Platform.runLater(() -> {
            WebView webView = new WebView();
            jfxPanel.setScene(new Scene(webView));
            webView.getEngine().load("https://shorturl.at/kIPU4");
        });
    }

    public static void main(String[] args) {
        // Crea un'istanza della classe per avviare l'applicazione
        SwingUtilities.invokeLater(new Runnable(){
        	public void run(){
        		 new Mappa().setVisible(true);
        	}
        
        	
        });
    }   
}
