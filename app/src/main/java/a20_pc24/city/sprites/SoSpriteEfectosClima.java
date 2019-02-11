package a20_pc24.city.sprites;

import android.graphics.Bitmap;

/**
 * Ej: Viento, lluvia, sol intenso, nieve
 *
 */


public class SoSpriteEfectosClima extends SO_SpritesObjetoEnEscena{
    public SoSpriteEfectosClima(Bitmap spriteIMG, boolean colisionable, boolean animado) {
        super(spriteIMG, colisionable, animado);
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
