package a20_pc24.city;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.MotionEvent;

import java.sql.SQLTransactionRollbackException;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.MotionEvent;

import java.sql.SQLTransactionRollbackException;

//Clase de refuerzo para crear botones y gestionar su pulsación en ellos

public class _Boton{

    float btnCoordXo,btnCoordYo, btnCoordXf, btnCoordYf;
    float btnBordeCoordXo, btnBordeCoordYo, btnBordeCoordXf, btnBordeCoordYf;

    RectF btnRect;
    RectF btnBordeRect;

    boolean btnTieneBorde;

    Paint btnPaint;
    Paint btnBordePaint;
    Paint btnTextPaint;

    String btnTexto;

    int btnValue;

    /**
     * Crea el botón como concepto a partir de los parámetros proporcionados
     * @param left coordenaa inicial izquierda
     * @param top coordenada inicial superior
     * @param right foordenada final derecha
     * @param bottom coordenada final inferior
     * @param colorFondoBoton color que tendrá el botón
     * @param btnTieneBorde true para que el botón tenga borde, false en caso contrario
     * @param btnTexto texto contenido por el botón
     */

    public _Boton(float left, float top, float right, float bottom, int colorFondoBoton,
                  boolean btnTieneBorde, String btnTexto){

        this.btnTieneBorde = btnTieneBorde;

        this.btnRect=new RectF(left,top,right,bottom);
        this.btnPaint = new Paint();
        this.btnPaint.setColor(colorFondoBoton);

        if(btnTieneBorde){
            this.btnBordeRect=new RectF(left,top,right,bottom);
            this.btnBordePaint = new Paint();
            this.btnBordePaint.setStrokeWidth(10);
            this.btnBordePaint.setColor(Color.BLACK);
            this.btnBordePaint.setStyle(Paint.Style.STROKE);
        }

        this.btnTexto = btnTexto;
        this.btnTextPaint = new Paint();
        this.btnTextPaint.setTextSize(this.btnRect.height()-this.btnRect.height()*2/3);
        this.btnTextPaint.setTypeface(Typeface.DEFAULT);
        this.btnTextPaint.setColor(Color.BLACK);
    }

    public _Boton(float left, float top, float right, float bottom, int colorFondoBoton,
                  boolean btnTieneBorde, String btnTexto, int btnValue){
        this(left, top, right, bottom, colorFondoBoton, btnTieneBorde, btnTexto);
        this.btnValue = btnValue;
    }

    /**
     * Dibuja el botón, su borde en caso de tenerlo y el texto proporcionado
     * @param c lienzo donde dibuja
     */

    public void dibujaBoton(Canvas c){
        c.drawRect(btnRect, btnPaint);
        if(this.btnTieneBorde){
            c.drawRect(this.btnBordeRect,btnBordePaint);
        }
        c.drawText(this.btnTexto,this.btnRect.centerX(),this.btnRect.centerY()+this.btnRect.height()*1/11,this.btnTextPaint);
    }

    /**
     * Determina si se ha pulsado o no un botón
     * @param event transmite la pulsación capturada por onTouch
     * @return true si la pulsación está dentro del botón, false en caso contrario
     */

    public boolean pulsaBoton(MotionEvent event){
        if(this.btnRect.contains((int)event.getX(), (int)event.getY()))
        {
            return true;
        }
        else{
            return false;
        }
    }
}
