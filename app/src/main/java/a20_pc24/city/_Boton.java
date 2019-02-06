package a20_pc24.city;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

public class _Boton {

    RectF baseBotonRect;
    Paint paintBoton;
    Paint paintBotonText;
    Rect botonBorde;
    boolean tieneBorde;
    int destinoBoton;

    public _Boton(float top, float left, float bottom, float right, int colorFondoBoton, Boolean tieneBorde, String textoBoton, int colorTextoBoton, int destinoBoton){
        this.baseBotonRect=new RectF(left,top,right,bottom);

        this.paintBoton = new Paint();
        this.paintBoton.setColor(colorFondoBoton);

        this.destinoBoton = destinoBoton;

        this.paintBotonText = new Paint();
        this.paintBotonText.setColor(colorTextoBoton);
    }

    public void dibujaBordeBoton(Canvas c){
        if(tieneBorde){
            c.drawRect(this.baseBotonRect,paintBoton);
        }
    }

    public int onTouchEvent(){
        switch(destinoBoton){
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
    }
}
