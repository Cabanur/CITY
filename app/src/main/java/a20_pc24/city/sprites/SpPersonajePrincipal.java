package a20_pc24.city.sprites;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import android.view.MotionEvent;

import a20_pc24.city._Utiles;

public class SpPersonajePrincipal extends S_Sprite{

    Bitmap spriteBm;
    PointF spritePos, pIni, pFin;
    float spritePosX, spritePosY;
    RectF spriteColRect;


    /*PERSONAJE PRINCIPAL*/
    /*-------------------*/
    //Personaje Principal Frente
    public final SpPersonajePrincipal mainCharaFront =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StaticPanda/front.png"));
    public final SpPersonajePrincipal mainCharaBack =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StaticPanda/back.png"));
    public final SpPersonajePrincipal mainCharaSideL =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StaticPanda/sideL.png"));
    public final SpPersonajePrincipal mainCharaSideR =
            new SpPersonajePrincipal(
                    _Utiles.flipBitmapX(_Utiles.getBitmapFromAsset("panda/StaticPanda/front.png")));
    //Personaje Principal Andando Espalda
    public final SpPersonajePrincipal mainCharaBackStep1 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StepBack/bs1.png"));
    public final SpPersonajePrincipal mainCharaBackStep2 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StepBack/bs2.png"));
    //Personaje Principal Andando Frente
    public final SpPersonajePrincipal mainCharaFrontStep1 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StepFront/sf1.png"));
    public final SpPersonajePrincipal mainCharaFrontStep2 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StepFront/sf2.png"));
    //Personaje Principal Andando Derecha
    public final SpPersonajePrincipal mainCharaRightStep1 =
            new SpPersonajePrincipal(
                    _Utiles.flipBitmapX(_Utiles.getBitmapFromAsset("panda/StepLeft/sL1.png")));
    public final SpPersonajePrincipal mainCharaRightStep2 =
            new SpPersonajePrincipal(
                    _Utiles.flipBitmapX(_Utiles.getBitmapFromAsset("panda/StepLeft/sL2.png")));
    public final SpPersonajePrincipal mainCharaRightStep3 =
            new SpPersonajePrincipal(
                    _Utiles.flipBitmapX(_Utiles.getBitmapFromAsset("panda/StepLeft/sL3.png")));
    public final SpPersonajePrincipal mainCharaRightStep4 =
            new SpPersonajePrincipal(
                    _Utiles.flipBitmapX(_Utiles.getBitmapFromAsset("panda/StepLeft/sL4.png")));
    //Personaje Principal Andando Izquierda
    public final SpPersonajePrincipal mainCharaLeftStep1 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StepFront/sf1.png"));
    public final SpPersonajePrincipal mainCharaLeftStep2 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StepLeft/sL2.png"));
    public final SpPersonajePrincipal mainCharaLeftStep3 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StepLeft/sL3.png"));
    public final SpPersonajePrincipal mainCharaLeftStep4 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StepLeft/sL4.png"));


    public SpPersonajePrincipal(Bitmap spriteBm){
        super(spriteBm);
    }

    public SpPersonajePrincipal(Bitmap spriteBm, float spritePosX, float spritePosY){
        this(spriteBm);
        this.spritePosX = spritePosX;
        this.spritePosY = spritePosY;
        this.spritePos = new PointF(spritePosX,spritePosY);
        this.cuadroCoolision();
    }

    public void cuadroCoolision() {
        spriteColRect = new RectF(spritePosX,spritePosY,spriteBm.getWidth(),spriteBm.getHeight());
    }

    public void moverPersonajePrincipal() {

        this.cuadroCoolision();
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
                    npY=
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
