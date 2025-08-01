package juego_vava.control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Teclado implements KeyListener{


    private final static int numeroTaclas = 120;
    private boolean[]teclas = new boolean [numeroTaclas];

    public boolean arriba;
    public boolean abajo;
    public boolean izquierda;
    public boolean derecha;

    public void actualizar(){
        arriba= teclas [KeyEvent.VK_W];
        abajo = teclas [KeyEvent.VK_S];
        izquierda = teclas[KeyEvent.VK_A];
        derecha = teclas[KeyEvent.VK_D];
    }




    @Override
    public void keyTyped(KeyEvent e) {
        
        
    }
    @Override
    public void keyPressed(KeyEvent e) {
        teclas[e.getKeyCode()]= true;
        
    }
    @Override
    public void keyReleased(KeyEvent e) {
      
         teclas[e.getKeyCode()]= false;
    }

    
}
