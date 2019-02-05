package a20_pc24.city;

import android.graphics.Bitmap;

public class SpPersonajePrincipal extends SP_Personajes {
    public SpPersonajePrincipal(Bitmap spriteIMG, double spriteChoordX, double spriteChoordY, boolean colisionable, boolean animado) {
        super(spriteIMG, spriteChoordX, spriteChoordY, colisionable, animado);
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
