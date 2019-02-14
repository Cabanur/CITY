package a20_pc24.city;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
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

    public _Boton(float left, float top, float right, float bottom, int colorFondoBoton,
                  boolean btnTieneBorde, String btnTexto){

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
        this.btnTextPaint.setTextSize(this.btn.height()-this.btn.height()*2/3);
        this.btnTextPaint.setTypeface(Typeface.DEFAULT);
        this.btnTextPaint.setColor(Color.BLACK);
    }

    /**
     * Dibuja el botón
     * @param c lienzo donde dibuja
     */

    public void dibujaBoton(Canvas c){
        c.drawRect(btn, btnPaint);
        if(this.btnTieneBorde){
            c.drawRect(this.btnBorde,btnBordePaint);
        }
        c.drawText(this.btnTexto,this.btn.width()-this.btn.width()*4/7,this.btn.centerY()+this.btn.height()*1/11,this.btnTextPaint);
    }


}
