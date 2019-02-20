package a20_pc24.city.sprites;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import android.view.MotionEvent;

import a20_pc24.city._Dimensiones;
import a20_pc24.city._Utiles;

public class SpPersonajePrincipal extends S_Sprite{

    PointF pIni, pFin;
    RectF spriteColRect;
    public enum Direccion{
        ABAJO(1),ARRIBA(2),DERECHA(3),IZQUIERDA(4);

        private int nDireccion;

        Direccion(int nDireccion){
            this.nDireccion = nDireccion;
        }
        public int getNDireccion(){
            return this.nDireccion;
        }
    }

    public SpPersonajePrincipal(Bitmap spriteBm){
        super(spriteBm);
        //el sprite en un principio siempre aparecerá enmedio de la pantalla
        this.setSpritePosX((_Dimensiones.pXLargo/2)-(this.getspriteBm().getWidth()/2));
        this.setSpritePosY((_Dimensiones.pYAlto/2)-(this.getspriteBm().getHeight()/2));
    }

    /**
     * En el caso de que se quiera cambiar la posición del sprite desde el inicio de la escena
     * @param spriteBm
     * @param spritePosX
     * @param spritePosY
     */
    public SpPersonajePrincipal(Bitmap spriteBm, float spritePosX, float spritePosY){
        super(spriteBm, spritePosX, spritePosY);
    }

    /*****************************************************************/
    /*****************************************************************/
    /*****************************************************************/

    /**
     * Método destinado a definir el cuadro de coolisiones
     * Usamos la posición a partir de la que se ha dibujado el sprite,
     * su altura y su ancho.
     */
    public void spriteCuadroColision(){
        this.spriteColRect = new RectF(this.getSpritePosX(),this.getSpritePosY(),
                this.getspriteBm().getWidth(),this.getspriteBm().getHeight());
    }

    /**
     * Cambio de "posición"
     */
    public void spriteMovimiento(Direccion direccion){

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

    public void dibujaMainChar(Canvas c){
        c.drawBitmap(this.getspriteBm(),this.getSpritePosX(),this.getSpritePosY(),this.getSpritePaint());
    }

    public void moverPersonajePrincipal() {
        this.setSpriteColisionRect(new RectF(this.getSpritePosX(),this.getSpritePosY(),this.getWidth(),this.getHeigh()));
    }

    public int onTouchEvent(MotionEvent event) {
        int pointerIndex = event.getActionIndex();        //Obtenemos el índice de la acción
        int pointerID = event.getPointerId(pointerIndex); //Obtenemos el Id del pointer asociado a la acción
        int accion = event.getActionMasked();             //Obtenemos el tipo de pulsación
        switch (accion) {
            case MotionEvent.ACTION_DOWN:           // Primer dedo toca
                pIni = new PointF(event.getX(),event.getY());
                pFin = new PointF(event.getX(),event.getY());
                break;
            case MotionEvent.ACTION_POINTER_DOWN:  // Segundo y siguientes tocan
                break;
            case MotionEvent.ACTION_UP:                     // Al levantar el último dedo
                break;
            case MotionEvent.ACTION_POINTER_UP:  // Al levantar un dedo que no es el último
                break;
            case MotionEvent.ACTION_MOVE: // Se mueve alguno de los dedos

                pFin = new PointF(event.getX(),event.getY());

                float npX, npY;
                if(pFin.x>pIni.x){  //Movimiento Derecha

                    npX =pFin.x;
                }else{              //Movimmiento Izquierda
                    npX =pIni.x;

                }
                if(pFin.y>pIni.y){  //Movimiento arriba
                    npY = pFin.y;

                }else{              //Movimiento abajo
                    npY = pIni.y;

                }

                //El movimiento no tiene diagonales diagonales
                //El pj se mueve en la dirección correspondiente al mayor desplazamiento

                if(npX>npY){        //Desplazamiento horizontal
                    this.moverPersonajePrincipal(   );
                }else{              //Desplazamiento vertical
                    this.moverPersonajePrincipal();
                }

                pIni = new PointF(event.getX(),event.getY());
                break;
            default:
                Log.i("Otra acción", "Acción no definida: " + accion);
                break;
        }
        return 0;
    }
}
