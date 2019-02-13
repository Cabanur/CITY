package a20_pc24.city.sprites;

import android.graphics.Bitmap;

public class SpNpc extends SP_Personajes {

    private boolean movil;

    public SpNpc(Bitmap spriteIMG, float spritePosX, float spritePosY, boolean movil) {
        super(spriteIMG, spritePosX, spritePosY);
        this.movil = movil;
    }
}
