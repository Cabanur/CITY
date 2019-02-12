package a20_pc24.city;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;

public class EE_EsquemaEscena {

    Context cntx;
    private int idEscena;
    private int anchoPantalla, altoPantalla;
    Bitmap fondo;
    Paint pTexto, pTexto2, pBoton, pBoton2;
    Rect backToPrincipal;

    public EE_EsquemaEscena(Context cntx, int idEscena, int anchoPantalla, int altoPantalla) {
        this.cntx = cntx;
        this.idEscena = idEscena;
        this.anchoPantalla = anchoPantalla;
        this.altoPantalla = altoPantalla;
        pTexto= new Paint();
        pTexto2= new Paint();

        pTexto.setColor(Color.GREEN);
        pTexto.setTextAlign(Paint.Align.CENTER);
        pTexto.setTextSize((int)(getAltoPantalla()/7*1.5));

        pTexto2.setColor(Color.WHITE);
        pTexto2.setTextAlign(Paint.Align.CENTER);
        pTexto2.setTextSize((int)(getAltoPantalla()/5));

        pBoton = new Paint();
        pBoton.setColor(Color.BLUE);

        pBoton2 = new Paint();
        pBoton2.setColor(Color.MAGENTA);

        backToPrincipal = new Rect(anchoPantalla-anchoPantalla/7,0,anchoPantalla,anchoPantalla/7);
//TODO iniciar fondo a algo o kapoot
        //Crear imagen placeholder de pantalla
        fondo = BitmapFactory.decodeResource(cntx.getResources(),R.drawable.placeholder);
        fondo = Bitmap.createScaledBitmap(fondo, anchoPantalla, altoPantalla, false);
    }

    public Context getCntx() {
        return cntx;
    }

    public void setCntx(Context cntx) {
        this.cntx = cntx;
    }

    public int getIdEscena() {
        return idEscena;
    }

    public void setIdEscena(int idEscena) {
        this.idEscena = idEscena;
    }

    public int getAnchoPantalla() {
        return anchoPantalla;
    }

    public void setAnchoPantalla(int anchoPantalla) {
        this.anchoPantalla = anchoPantalla;
    }

    public int getAltoPantalla() {
        return altoPantalla;
    }

    public void setAltoPantalla(int altoPantalla) {
        this.altoPantalla = altoPantalla;
    }

    public Bitmap getFondo() {
        return fondo;
    }

    public void setFondo(Bitmap fondo) {
        this.fondo = fondo;
    }

    //Rutina de dibujo en el lienzo de los elementos. Se llama desde el hilo
    public void dibujar(Canvas c){
        try{
            if(idEscena!=0){
                c.drawRect(backToPrincipal,pBoton);
            }
        }catch(Exception e){

        }
    }

    public void actualizarFisica(){

    }

    public int onTouchEvent(MotionEvent event) {
        int pointerIndex = event.getActionIndex();        //Obtenemos el índice de la acción
        int pointerID = event.getPointerId(pointerIndex); //Obtenemos el Id del pointer asociado a la acción
        int accion = event.getActionMasked();             //Obtenemos el tipo de pulsación
        switch (accion) {
            case MotionEvent.ACTION_DOWN:           // Primer dedo toca
            case MotionEvent.ACTION_POINTER_DOWN:  // Segundo y siguientes tocan
                break;

            case MotionEvent.ACTION_UP:                     // Al levantar el último dedo
            case MotionEvent.ACTION_POINTER_UP:  // Al levantar un dedo que no es el último
                if(pulsa(backToPrincipal,event) && idEscena!=0){
                    return 0;
                }
                break;

            case MotionEvent.ACTION_MOVE: // Se mueve alguno de los dedos

                break;
            default:  Log.i("Otra acción", "Acción no definida: "+accion);
        }
        return getIdEscena();
    }

    public boolean pulsa(Rect boton, MotionEvent event){
        if(boton.contains((int)event.getX(), (int)event.getY()))
        {
            return true;
        }
        else{
            return false;
        }
    }

}
