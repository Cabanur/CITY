package a20_pc24.city;

import android.graphics.Bitmap;

public class SpPersonajePrincipal extends SP_Personajes {
    public SpPersonajePrincipal(Bitmap spriteIMG, double spriteChoordX, double spriteChoordY) {
        super(spriteIMG, spriteChoordX, spriteChoordY);
        super.canMove=true;
    }
}
