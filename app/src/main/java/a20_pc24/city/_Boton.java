package a20_pc24.city;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;

import java.sql.SQLTransactionRollbackException;

public class _Boton{

    float btnCoordXo,btnCoordYo, btnCoordXf, btnCoordYf;
    float btnBordeCoordXo, btnBordeCoordYo, btnBordeCoordXf, btnBordeCoordYf;

    RectF btn;
    RectF btnBorde;

    boolean btnTieneBorde;

    Paint btnPaint;
    Paint btnBordePaint;
    Paint btnTextPaint;

    String btnTexto;

    public _Boton(float top, float left, float bottom, float right, int colorFondoBoton,
                  Boolean btnTieneBorde, String btnTexto){

        this.btnTieneBorde = btnTieneBorde;

        this.btn=new RectF(left,top,right,bottom);
        this.btnPaint = new Paint();
        this.btnPaint.setColor(colorFondoBoton);

        if(btnTieneBorde){
            this.btnBorde=new RectF(left,top,right,bottom);
            this.btnBordePaint = new Paint();
            this.btnBordePaint.setStrokeWidth(10);
            this.btnBordePaint.setColor(Color.BLACK);
            this.btnBordePaint.setStyle(Paint.Style.STROKE);
        }

        this.btnTexto = btnTexto;
        this.btnTextPaint = new Paint();
        this.btnTextPaint.setColor(Color.BLACK);
    }

    /**
     * Dibuja el botón
     * @param c lienzo donde dibuja
     */

    public void dibujaBordeBoton(Canvas c){
        c.drawRect(btn, btnPaint);
        if(this.btnTieneBorde){
            c.drawRect(this.btnBorde,btnBordePaint);
        }
        c.drawText(btnTexto,btn.left+(btn.left*1/5),btn.top+(btn.top*1/2),btnTextPaint);
    }
}
