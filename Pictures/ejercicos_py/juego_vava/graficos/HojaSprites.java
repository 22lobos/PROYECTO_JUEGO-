package juego_vava.graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class HojaSprites {
    private final int ancho;
    private final int alto ;
    public final int[] pixeles;
    //coleccion hoja de sprites
    public static HojaSprites desierto = new HojaSprites("/juego_vava/texturas/gratis.png", 256 ,256);



    //fin de coleccion


    public HojaSprites(final String ruta, final int ancho, final int alto ){
        this.ancho = ancho;
        this.alto = alto;

        pixeles = new int[ancho * alto ];

        BufferedImage imagen;
        try {
            imagen = ImageIO.read(HojaSprites.class.getResourceAsStream(ruta));
             imagen.getRGB(0, 0,ancho,alto, pixeles,0,ancho);

        } catch (IOException e) {
            
            e.printStackTrace();
        }


    }
    
 public int obtenerAncho(){
    return ancho;
 }


}
