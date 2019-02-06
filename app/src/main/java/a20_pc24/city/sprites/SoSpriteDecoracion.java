package a20_pc24.city.sprites;

import android.graphics.Bitmap;

public class SoSpriteDecoracion extends SO_SpritesObjetoEnEscena {
    public SoSpriteDecoracion(Bitmap spriteIMG, double spriteLargariaX, double spriteLargariaY, boolean colisionable, boolean animado) {
        super(spriteIMG, spriteLargariaX, spriteLargariaY, colisionable, animado);
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
