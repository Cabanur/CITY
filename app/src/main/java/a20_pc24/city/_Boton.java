package a20_pc24.city;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;

public class _Boton extends {

    float coordXo,coordYo, coordXf, coordYf;

    RectF baseBotonRect;
    Paint paintBoton;
    Paint paintBotonText;
    RectF botonBorde;
    Paint paintBotonBorde;
    boolean tieneBorde;

    public _Boton(float top, float left, float bottom, float right, int colorFondoBoton, Boolean tieneBorde, String textoBoton, int colorTextoBoton, int destinoBoton){
        this.baseBotonRect=new RectF(left,top,right,bottom);

        this.paintBoton = new Paint();
        this.paintBoton.setColor(colorFondoBoton);

        this.paintBotonText = new Paint();
        this.paintBotonText.setColor(colorTextoBoton);
    }

    /**
     * Dibuja el botón
     * @param c lienzo donde dibuja
     */

    public void dibujaBordeBoton(Canvas c){
        if(tieneBorde){

            c.drawRect(this.baseBotonRect,paintBoton);
        }
    }
}
