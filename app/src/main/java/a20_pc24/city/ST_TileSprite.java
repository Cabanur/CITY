package a20_pc24.city;

import android.graphics.Bitmap;


public class ST_TileSprite extends S_Sprite {

    private enum TileTipo{SUELO,CIELO,PARED}
    private TileTipo tileTipo;

    public ST_TileSprite(Bitmap spriteIMG, double spriteChoordX, double spriteChoordY, boolean colisionable, boolean animado, TileTipo tileTipo) {
        super(spriteIMG, spriteChoordX, spriteChoordY, colisionable, animado);
        this.tileTipo = tileTipo;
        //Es importante recordar que los tiles siempre son cuadrados
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
