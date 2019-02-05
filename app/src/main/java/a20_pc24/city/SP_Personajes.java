package a20_pc24.city;

import android.graphics.Bitmap;

public class SP_Personajes extends S_Sprite {

    boolean canMove;

    public SP_Personajes(Bitmap spriteIMG, double spriteChoordX, double spriteChoordY) {
        super(spriteIMG, spriteChoordX, spriteChoordY);
        this.canMove=false;
    }
}
