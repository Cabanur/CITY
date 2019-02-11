package a20_pc24.city;

import android.graphics.Bitmap;

public class eejuegoEdificioPB extends eejuego_PantallaMapeada {
    public eejuegoEdificioPB(){;
    }


    @Override
    public Bitmap unificaMapa() {
        return this.mapaMontado;
    }

    @Override
    public void dibujaMapa(){}

    @Override
    void actualizarMapa() {

    }
}
