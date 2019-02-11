package a20_pc24.city.sprites;

import android.graphics.Bitmap;

public class SpNpc extends SP_Personajes {

    private boolean movil;

    public SpNpc(Bitmap spriteIMG, boolean colisionable, boolean animado, boolean movil) {
        super(spriteIMG, colisionable, animado);
        this.movil=movil;
    }

    @Override
    public void cuadroCoolision() {
        super.cuadroCoolision();
    }

    @Override
    public void movimiento() {
        super.movimiento();
    }

    @Override
    public void animacion() {
        super.animacion();
    }
}
