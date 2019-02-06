package a20_pc24.city.sprites;

import android.graphics.Bitmap;

/**
 * Ej: Viento, lluvia, sol intenso, nieve
 *
 */


public class SoSpriteEfectosClima extends SO_SpritesObjetoEnEscena{
    public SoSpriteEfectosClima(Bitmap spriteIMG, double spriteLargariaX, double spriteLargariaY, boolean colisionable, boolean animado) {
        super(spriteIMG, spriteLargariaX, spriteLargariaY, colisionable, animado);
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
