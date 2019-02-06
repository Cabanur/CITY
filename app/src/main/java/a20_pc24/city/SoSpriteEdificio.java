package a20_pc24.city;

import android.graphics.Bitmap;

public class SoSpriteEdificio extends SO_SpritesObjetoEnEscena {
    public SoSpriteEdificio(Bitmap spriteIMG, double spriteLargariaX, double spriteLargariaY, boolean colisionable, boolean animado) {
        super(spriteIMG, spriteLargariaX, spriteLargariaY, colisionable, animado);
    }

    @Override
    public void cuadroCoolision() {
        super.cuadroCoolision();
    }

    @Override
    public void animacion() {
        super.animacion();
    }
}
