package juego_vava.graficos;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class HojaSprites {
    private final int ancho;
    private final int alto ;
    public final int[] pixeles;
    public HojaSprites(final String ruta, final int ancho, final int alto ){
        this.ancho = ancho;
        this.alto = alto;

        pixeles = new int[ancho * alto ];

        BufferedImage imagen = ImageIO.read(HojaSprites.class.getResourceAsStream(ruta));
        


    }
    
}
