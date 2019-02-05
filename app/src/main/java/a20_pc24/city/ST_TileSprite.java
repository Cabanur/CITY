package a20_pc24.city;

import android.graphics.Bitmap;


public class ST_TileSprite extends S_Sprite {

    public enum TileTipo{SUELO,CIELO,PARED}
    TileTipo tileTipo;

    public ST_TileSprite(Bitmap spriteIMG, double spriteChoordX, double spriteChoordY, TileTipo tileTipo) {
        super(spriteIMG, spriteChoordX, spriteChoordY);
        //Es importante recordar que los tiles

        this.tileTipo=tileTipo;
    }
}
