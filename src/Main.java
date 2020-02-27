import Ordenamiento.FiltrosEspaciales;
import Ordenamiento.Grafica;
import open.AbrirImagen;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Ordenamiento.Histogramas;
import gui.JFrameSegmentacion;
import gui.JframeImagen;

public class Main {

    public static void main(String[] args) {
        Image imagen = AbrirImagen.openImage();
        JframeImagen foto = new JframeImagen(FiltrosEspaciales.iluminarImagen(imagen, 75));
//        JFrameSegmentacion frame = new JFrameSegmentacion("Segementacion",FiltrosEspaciales.iluminarImagen(imagen, 75));
//        Histogramas h2 = new  Histogramas(imagen);
//        h2.Graph();
//        JFrameSegmentacion frame2 = new JFrameSegmentacion("Segementacion",FiltrosEspaciales.segmentarImagen(imagen,150));
//        Histogramas h = new  Histogramas(FiltrosEspaciales.segmentarImagen(imagen,150));
//        h.Graph();
    }
}