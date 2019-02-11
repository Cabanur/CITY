package a20_pc24.city.sprites;

import android.graphics.Bitmap;


public class ST_TileSprite extends S_Sprite {

    public enum TileTipo{SUELO,CIELO,PARED}
    private TileTipo tileTipo;

    public ST_TileSprite(Bitmap spriteIMG, boolean colisionable, boolean animado, TileTipo tileTipo) {
        super(spriteIMG, colisionable, animado);
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
