package a20_pc24.city.sprites;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import a20_pc24.city._Utiles;


public class ST_TileSprite extends S_Sprite {

    public enum TileAnim{NINGUNO,ESTATICO,VERTICAL,HORIZONTAL,DIAGONAL}
    private TileAnim tileAnim;

    public ST_TileSprite(Bitmap spriteIMG, TileAnim tileAnim) {
        super(Bitmap.createScaledBitmap(spriteIMG,(int) _Utiles.convertDpToPixel(32),(int) _Utiles.convertDpToPixel(32),false) );
        this.tileAnim = tileAnim;
    }

    public ST_TileSprite(Bitmap spriteIMG, float spritePosX, float spritePosY, TileAnim tileAnim) {
        super(spriteIMG, spritePosX, spritePosY);
        this.tileAnim = tileAnim;
        //Es importante recordar que los tiles siempre son cuadrados
    }

    /*****************************************************************/
    /*****************************************************************/
    /*****************************************************************/

    /**
     * Método destinado a definir el cuadro de coolisiones
     */
    public void spriteCuadroColision(){

    }

    /**
     * Cambio de posición en el mapa
     */
    public void spriteMovimiento(){

    }

    /**
     * Sucesión de sprites que conforman la animación
     */
    public void spriteAnimacion(){

    }

    /**
     * Dibuja sprite en coordenadas dadas
     */
    public void spriteDibujar(Canvas c){
        Bitmap tile = Bitmap.createScaledBitmap(this.getspriteBm()
                ,(int)_Utiles.convertDpToPixel(64)
                ,(int)_Utiles.convertDpToPixel(64)
                , false);
        c.drawBitmap(tile,this.getSpritePosX(),this.getSpritePosY(),this.getSpritePaint());
    }

    /*****************************************************************/
    /*****************************************************************/
    /*****************************************************************/
}
