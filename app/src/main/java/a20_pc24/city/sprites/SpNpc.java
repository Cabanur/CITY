package a20_pc24.city.sprites;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class SpNpc extends SP_Personajes {

    private boolean movil;

    public SpNpc(Bitmap spriteIMG, float spritePosX, float spritePosY, boolean movil) {
        super(spriteIMG, spritePosX, spritePosY);
        this.movil = movil;
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

    }

    /*****************************************************************/
    /*****************************************************************/
    /*****************************************************************/

}
