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

    Bitmap spriteBm;
    PointF spritePos, pIni, pFin;
    float spritePosX, spritePosY;
    RectF spriteColRect;
    Paint spritePaint;
    public enum Direccion{
        ABAJO(0), ARRIBA(1), DERECHA(2), IZQUIERDA(3);

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
        this.spritePosX = (_Dimensiones.pXLargo/2)-(this.spriteBm.getWidth()/2);
        this.spritePosY = (_Dimensiones.pYAlto/2)-(this.spriteBm.getHeight()/2);
        this.spritePaint = new Paint();
    }

    public SpPersonajePrincipal(Bitmap spriteBm, float spritePosX, float spritePosY){
        this(spriteBm);
        this.spritePosX = spritePosX;
        this.spritePosY = spritePosY;
        this.spritePos = new PointF(spritePosX,spritePosY);
        this.cuadroCoolision();
    }

    public void dibujaMainChar(Canvas c){
        c.drawBitmap(this.spriteBm,this.spriteBm.getWidth(),this.spriteBm.getHeight(),spritePaint);
    }

    public void cuadroCoolision() {
        spriteColRect = new RectF(spritePosX,spritePosY,spriteBm.getWidth(),spriteBm.getHeight());
    }

    public void moverPersonajePrincipal() {
        this.cuadroCoolision();
        //aquí desplazamiento de fondo
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
                if(pFin.x>pIni.x){
                    //Movimiento Derecha
                    npX =pFin.x;
                }else{
                    npX =pIni.x;
                    //Movimmiento Izquierda
                }
                if(pFin.y>pIni.y){
                    npY = pFin.y;
                    //Movimiento arriba
                }else{
                    npY = pIni.y;
                    //Movimiento abajo
                }

                //El movimiento no tiene diagonales diagonales
                //El pj se mueve en la dirección correspondiente a la mayor variable
                if(npX>npY){

                }else{

                }

                pIni = new PointF(event.getX(),event.getY());

                break;
            default:
                Log.i("Otra acción", "Acción no definida: " + accion);
                break;
        }
        return 0;
    }

//    public void animacion() {
//        super.animacion();
//    }
}
