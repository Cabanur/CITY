package a20_pc24.city.sprites;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import a20_pc24.city._Utiles;

public class SP_Personajes extends S_Sprite {

    public SP_Personajes(Bitmap spriteIMG, float spritePosX, float spritePosY) {
        super(spriteIMG, spritePosX, spritePosY);
    }

    /*****************************************************************/
    /*****************************************************************/
    /*****************************************************************/

    /**
     * Cambio de posición en el mapa
     */
    @Override
    public void spriteMovimiento(){
        super.spriteMovimiento();
    }

    /**
     * Sucesión de sprites que conforman la animación
     */
    @Override
    public void spriteAnimacion(){

    }
    /**
     * Dibuja sprite en coordenadas dadas
     */
    @Override
    public void spriteDibujar(Canvas c){
        super.spriteDibujar(c);
    }

    /*****************************************************************/
    /*****************************************************************/
    /*****************************************************************/

}
