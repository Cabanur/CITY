package a20_pc24.city;

import android.graphics.Bitmap;

/**
 * Ej: Viento, lluvia, sol intenso, nieve
 *
 */


public class SoSpriteEfectosClima extends SO_SpritesObjetoEnEscena{
    public SoSpriteEfectosClima(Bitmap spriteIMG, double spriteChoordX, double spriteChoordY, boolean colisionable, boolean animado) {
        super(spriteIMG, spriteChoordX, spriteChoordY, colisionable, animado);
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
