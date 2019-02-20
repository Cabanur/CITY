package a20_pc24.city;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import a20_pc24.city._Dimensiones;

public class _ParallaxBm {
    Bitmap imgParallax;
    float imgParallaxVelocidad;
    float imgParallaxPosX;
    float imgParallaxPosY;
    Paint imgParallaxPaint;
    boolean movimientoVerticalUHorizontal;      //True vertical, false Horizontal

    public _ParallaxBm(Bitmap imgParallax, float imgParallaxVelocidad, float imgParallaxPosX, float imgParallaxPosY, boolean movimientoVerticalUHorizontal) {
        this.imgParallax = Bitmap.createScaledBitmap(imgParallax, (int)_Dimensiones.pXLargo, (int) _Dimensiones.pYAlto, false);
        this.imgParallaxVelocidad = (int) _Utiles.convertDpToPixel(imgParallaxVelocidad);
        this.imgParallaxPosX = imgParallaxPosX;
        this.imgParallaxPosY = imgParallaxPosY;

        this.imgParallaxPaint = new Paint();

        this.movimientoVerticalUHorizontal = movimientoVerticalUHorizontal;
    }

    public void dibujaParallax(Canvas c){
        c.drawBitmap(this.imgParallax,this.imgParallaxPosX,this.imgParallaxPosY,imgParallaxPaint);
        if((!movimientoVerticalUHorizontal) && this.imgParallaxPosX<0){         //Movimiento del bitmap a la izquierda
            c.drawBitmap(this.imgParallax,_Dimensiones.pXLargo+this.imgParallaxPosX,this.imgParallaxPosY,imgParallaxPaint);
        }else if((!movimientoVerticalUHorizontal) && this.imgParallaxPosX>0){   //Movimiento del bitmap a la derecha
            c.drawBitmap(this.imgParallax,-1*_Dimensiones.pXLargo+this.imgParallaxPosX,this.imgParallaxPosY,imgParallaxPaint);
        }
    }

    public void actualizaPosicionParallax(){
        if(movimientoVerticalUHorizontal){
            //Intencionalmente, cuando la luna llega al suelo deja de moverse
            if(this.imgParallaxPosY<_Dimensiones.pYAlto){
                this.imgParallaxPosY += this.imgParallaxVelocidad;
            }
        }else{
            if(this.imgParallaxVelocidad<0){         //Movimiento del bitmap a la izquierda
                if(this.imgParallaxPosX<=-1*_Dimensiones.pXLargo){this.imgParallaxPosX = 0;}
                else{this.imgParallaxPosX +=this.imgParallaxVelocidad;}
            }else{                                  //Movimiento del bitmap a la derecha
                if(this.imgParallaxPosX>_Dimensiones.pXLargo){ this.imgParallaxPosX = this.imgParallaxVelocidad;}
                else{this.imgParallaxPosX +=this.imgParallaxVelocidad;}
            }

        }
    }
}
