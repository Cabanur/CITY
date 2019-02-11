package a20_pc24.city.sprites;

import android.graphics.Bitmap;


public class ST_TileSprite extends S_Sprite {

    public enum TileAnim{NINGUNO,VERTICAL,HORIZONTAL,DIAGONAL}
    private TileAnim tileAnim;

    public ST_TileSprite(Bitmap spriteIMG, boolean colisionable, boolean animado, TileAnim tileAnim) {
        super(spriteIMG, colisionable, animado);
        this.tileAnim = tileAnim;
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
