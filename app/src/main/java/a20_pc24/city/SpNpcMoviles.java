package a20_pc24.city;

import android.graphics.Bitmap;

public class SpNpcMoviles extends SP_Personajes {

    public SpNpcMoviles(Bitmap spriteIMG, double spriteChoordX, double spriteChoordY) {
        super(spriteIMG, spriteChoordX, spriteChoordY);
        super.canMove=true;
    }
}
