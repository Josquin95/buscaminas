package co.edu.icesi.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by CarlosTorres on 18/05/2017.
 */
public class MigestorDecorador implements ActionListener {

  private InterfazJugador interfazJugador;
 public MigestorDecorador(InterfazJugador interfaz){
     this.interfazJugador=interfaz;
 }
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==interfazJugador.getItemPrimero()){

    }
    }
}
