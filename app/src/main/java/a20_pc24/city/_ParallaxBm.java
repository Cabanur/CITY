package a20_pc24.city;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

public class _ParallaxBm {
    Bitmap imgParallax;
    float imgParallaxVelocidad;
    float imgParallaxPosX;
    float imgParallaxPosY;
    Paint imgParallaxPaint;
    boolean movimientoVerticalUHorizontal;      //True vertical, false Horizontal

    public _ParallaxBm(Bitmap imgParallax, float imgParallaxVelocidad, float imgParallaxPosX, float imgParallaxPosY, boolean movimientoVerticalUHorizontal) {
        this.imgParallax = Bitmap.createScaledBitmap(imgParallax, (int) _DimensionesDispositivo.pXLargo, (int) _DimensionesDispositivo.pYAlto, false);
        this.imgParallaxVelocidad = _DimensionesDispositivo.getDpAltoF(imgParallaxVelocidad);
        this.imgParallaxPosX = imgParallaxPosX;
        this.imgParallaxPosY = imgParallaxPosY;

        this.imgParallaxPaint = new Paint();

        this.movimientoVerticalUHorizontal = movimientoVerticalUHorizontal;
    }

    public void dibujaParallax(Canvas c){
        c.drawBitmap(this.imgParallax,
                (int)this.imgParallaxPosX,
                (int)this.imgParallaxPosY,
                imgParallaxPaint);
        if((!movimientoVerticalUHorizontal) && this.imgParallaxPosX<0){         //Movimiento del bitmap a la izquierda
            c.drawBitmap(this.imgParallax, _DimensionesDispositivo.pXLargo+this.imgParallaxPosX,this.imgParallaxPosY,imgParallaxPaint);
        }else if((!movimientoVerticalUHorizontal) && this.imgParallaxPosX>0){   //Movimiento del bitmap a la derecha
            c.drawBitmap(this.imgParallax,-1* _DimensionesDispositivo.pXLargo+this.imgParallaxPosX,this.imgParallaxPosY,imgParallaxPaint);
        }
    }

    public void actualizaPosicionParallax(){
        if(movimientoVerticalUHorizontal){
            //Intencionalmente, cuando la luna llega al suelo deja de moverse
            if(this.imgParallaxPosY< _DimensionesDispositivo.pYAlto){
                this.imgParallaxPosY += this.imgParallaxVelocidad;
            }
        }else{
            if(this.imgParallaxVelocidad<0){         //Movimiento del bitmap a la izquierda
                if(this.imgParallaxPosX<=-1* _DimensionesDispositivo.pXLargo){this.imgParallaxPosX = 0;}
                else{this.imgParallaxPosX +=this.imgParallaxVelocidad;}
            }else{                                  //Movimiento del bitmap a la derecha
                if(this.imgParallaxPosX> _DimensionesDispositivo.pXLargo){ this.imgParallaxPosX = this.imgParallaxVelocidad;}
                else{this.imgParallaxPosX +=this.imgParallaxVelocidad;}
            }

        }
    }
}
