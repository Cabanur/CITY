package a20_pc24.city.sprites;

import android.graphics.Bitmap;

public class SpPersonajePrincipal extends SP_Personajes {
    public SpPersonajePrincipal(Bitmap spriteIMG, double spriteLargariaX, double spriteAlturaY, boolean colisionable, boolean animado) {
        super(spriteIMG, spriteLargariaX, spriteAlturaY, colisionable, animado);
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
