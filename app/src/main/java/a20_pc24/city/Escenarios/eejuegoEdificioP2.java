package a20_pc24.city.Escenarios;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class eejuegoEdificioP2 extends eejuego_PantallaMapeada {
    public eejuegoEdificioP2() {


    }


    @Override
    public Bitmap unificaMapa() {
        return this.mapaMontado;
    }

    @Override
    public void dibujaMapa(Canvas c){
        super.dibujaMapa(c);
    }

    @Override
    public void actualizarMapa() {

    }
}
