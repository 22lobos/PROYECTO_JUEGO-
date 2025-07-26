



public class HojaSprites {
    private final int ancho;
    private final int alto ;
    public final int[] pixeles;
    public HojaSprites(final String ruta, final int ancho, final int alto ){
        this.ancho = ancho;
        this.alto = alto;

        pixeles = new int[ancho * alto ];
        

    }
    
}
