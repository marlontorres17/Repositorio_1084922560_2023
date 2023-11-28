/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Frames;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author JuanDa
 */
public class CancionEncuesta extends JFrame {
     private JTable table;
    private DefaultTableModel tableModel;

    public CancionEncuesta() {
        setTitle("Canciones de la encuesta");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Establecer el tamaño de la ventana para que ocupe toda la pantalla
        setSize(screenSize.width, screenSize.height);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Nombre del Oyente");
        tableModel.addColumn("Nombre de la cancion");
        

        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        
        

        cargarDatos();
        panel.add(scrollPane, BorderLayout.CENTER);
        
       JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEADING)); // FlowLayout con alineación izquierda

        JButton siguienteButton = new JButton("Atras");
        siguienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear una instancia de Encuesta
                Artista eGUI = new Artista();
                eGUI.setVisible(true);

                // Cerrar la instancia actual de Cancion si es necesario
                dispose();
            }
        });
        buttonPanel.add(siguienteButton);

        JButton siguienteButton2 = new JButton("Siguiente");
        siguienteButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear una instancia de Artista
                Sorteo a = new Sorteo();
                a.setVisible(true);

                // Cerrar la instancia actual de Cancion si es necesario
                dispose();
            }
        });
        buttonPanel.add(siguienteButton2);

        panel.add(buttonPanel, BorderLayout.SOUTH); // Agregar el panel de botones en la parte inferior del panel principal

        add(panel);
    }
    
    private void cargarDatos(){
        List<String> NombreOyentes = Arrays.asList("Adriana González", "Pedro Rodríguez", "Ana Martínez", "Carlos López",
                "Laura Pérez", "Manuel García", "Isabel Sánchez", "David Romero",
                "Sofía Fernández", "Luis Torres", "María Ruiz", "José Jiménez",
                "Ana Moreno", "Carlos Herrera", "Laura Castro", "Manuel Ortega",
                "Isabel Flores", "David Delgado", "Sofía Morales", "Luis Ramírez",
                "María González", "José Rodríguez", "Ana Martínez", "Carlos López",
                "Laura Pérez", "Manuel García", "Isabel Sánchez", "David Romero",
                "Sofía Fernández", "Luis Torres", "María Ruiz", "José Jiménez",
                "Ana Moreno", "Carlos Herrera", "Laura Castro", "Manuel Ortega",
                "Isabel Flores", "David Delgado", "Sofía Morales", "Luis Ramírez",
                "María González", "José Rodríguez", "Ana Martínez", "Carlos López",
                "Laura Pérez", "Manuel Delgado", "Martha Morales", "Juan Ramírez",
                "Gabriela Torres","Hitler Rodolfo" );
        
        List<String>NombreC = Arrays.asList( "Starry Dreams","Clocks and Shadows","Guitarist's Sketch","Elegance in Artistry","Dali's Surreal Dreams","Persistence in Waltz",
"Da Vinci's Sonata","Van Gogh's Echoes","Visions Unbound","Mysteries on Canvas","Dance of the Avant-Garde","Vincent's Visions","Dreams on Canvas","Floral Nocturne",
"Sunflower Serenade","Blossoms in Moonlight","Symphony of the Subconscious","Cubist Concerto","Renaissance Waltz","Guernica's Echo","Abstract Reverie","Whispers of the Canvas","The Eaters' Ballad",
"Terrace Tango","Wheat Field Nocturne","Harlequin's Muse","Burning Giraffes Ballet","Legacy of Leonardo","Life in Brushstrokes","Elephant's Journey","Bullfight Rhapsody","Picasso's Palette",
"Portrait of Shapes","Blue Hues Waltz","Nighttime Symphony","Vinci's Muse","Nocturne in Masterpiece","Canvas of Emotions","Dreamer's Brushes","Mona Lisa Serenade","Gala's Muse",
"Starry Night Sonata","Melting Clocks","Clocks and Shadows","Harmony of Art","Crow's Melody","Legacy of Leonardo","Manuel's Melody","Elephant's Journey",
"Abstract Reverie","Persistence in Waltz","Sunflower Serenade","Floral Nocturne","The Eaters' Ballad","Guitarist's Sketch","Blossoms in Moonlight","Dusk Irises",
"Symphony of the Subconscious","Dance of the Avant-Garde","Wheat Field Nocturne","Cubist Concerto","Manuel's Muse","Terrace Tango","Whispers of the Canvas","Da Vinci's Sonata",
"Starry Dreams","Marie's Melody","Artistic Journeys","Luis' Lullaby","Renaissance Waltz","Starry Dreams","Clocks and Shadows","Guitarist's Sketch","Elegance in Artistry",
"Dali's Surreal Dreams","Persistence in Waltz","Da Vinci's Sonata","Van Gogh's Echoes","Visions Unbound","Mysteries on Canvas","Vinci's Muse","Blossoms in Moonlight",
"Dusk Irises","Clocks and Shadows","Guitarist's Sketch","Elegance in Artistry","Portrait of Shapes","Blue Hues Waltz","Nighttime Symphony","Harmony of Art","Starry Night Sonata",
"Melting Clocks","Clocks and Shadows","Harmony of Art","Crow's Melody","Legacy of Leonardo","Manuel's Melody","Elephant's Journey","Abstract Reverie","Nighttime Symphony","Vinci's Muse","Nocturne in Masterpiece",
"Canvas of Emotions","Dreamer's Brushes","Mona Lisa Serenade","Gala's Muse","Starry Night Sonata","Melting Clocks","Clocks and Shadows","Harmony of Art",
"Dali's Surreal Dreams","Persistence in Waltz","Da Vinci's Sonata","Van Gogh's Echoes","Visions Unbound","Mysteries on Canvas",
"Dance of the Avant-Garde","Vincent's Visions","Dreams on Canvas","Floral Nocturne","Sunflower Serenade","Blossoms in Moonlight","Symphony of the Subconscious","Cubist Concerto","Renaissance Waltz","Picasso's Vision",
"Whispers in the Night","Canvas of Dreams","Echoes of Harmony","Vivid Abstractions","Twilight Serenade","Surreal Symphony","Brushstrokes of Emotion","Eternal Waltz",
"Journey Through Time","Chromatic Dreamscape","Midnight Melodies","Muse's Inspiration","Vibrant Surrealism","Mystery in Motion","Rhythms of Creativity",
"Nocturnal Reverie","Luminous Whispers","Abstract Elegance","Sonic Colors","Dance of Imagination","Infinite Palette","Artistic Fusion",
"Enchanted Strokes","Brushes of Brilliance" );
        
        
        
        
         List<String>NombreOyente= new ArrayList<>();
        for (String nombres : NombreOyentes) {
            for (int i = 1; i <= 3; i++) {
                NombreOyente.add(nombres);
            }
        }

     
        
        List<Integer>ids = new ArrayList<>();
        for (int i = 1; i <= 150; i++) {
            ids.add(i);
        }

        for (int i = 0; i < 150; i++) {
            Object[] rowData = { ids.get(i), NombreOyente.get(i), NombreC.get(i) };
            tableModel.addRow(rowData);
        }
    }

    }

