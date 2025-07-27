package juego_vava.graficos;

public final  class Pantalla {

    private final int ancho;
    private final int alto;


    public final int[] pixeles;

    public Pantalla (final int ancho, final int alto){
        this.ancho =  ancho;
        this.alto = alto;

        pixeles = new int[ancho * alto];
        
    }


    
}
