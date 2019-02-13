package a20_pc24.city.sprites;

import android.graphics.Bitmap;


public class ST_TileSprite extends S_Sprite {

    public enum TileAnim{NINGUNO,ESTATICO,VERTICAL,HORIZONTAL,DIAGONAL}
    private TileAnim tileAnim;

    public ST_TileSprite(Bitmap spriteIMG, TileAnim tileAnim) {
        super(spriteIMG);
        this.tileAnim = tileAnim;
    }

    public ST_TileSprite(Bitmap spriteIMG, float spritePosX, float spritePosY, TileAnim tileAnim) {
        super(spriteIMG, spritePosX, spritePosY);
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
