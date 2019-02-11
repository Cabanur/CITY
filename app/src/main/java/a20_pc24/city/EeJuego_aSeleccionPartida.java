package a20_pc24.city;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import android.view.MotionEvent;

import a20_pc24.city.sprites.ST_TileSprite;

public class EeJuego_aSeleccionPartida extends EE_EsquemaEscena {

    Rect boundsRect;
    BitmapDrawable mosaicDefinerBD;
    ST_TileSprite savedGamesBackgroundTile1Spot;
    ST_TileSprite savedGamesBackgroundTile2Cross;
    ST_TileSprite savedGamesBackgroundTile3Circle;

    public EeJuego_aSeleccionPartida(Context cntx, int idEscena, int anchoPantalla, int altoPantalla) {
        super(cntx, idEscena, anchoPantalla, altoPantalla);
//        fondo = BitmapFactory.decodeResource(cntx.getResources(),R.drawable.b);
//        fondo = Bitmap.createScaledBitmap(fondo, anchoPantalla, altoPantalla, false);
//        fondo = _Utiles.getBitmapFromAsset(this.cntx,"menugraphics/savegame4smallcross.png");
//        fondo = Bitmap.createScaledBitmap(fondo,64,64,false);
//        this.savedGamesBackgroundTile1Spot = new ST_TileSprite(fondo,false,false,ST_TileSprite.TileTipo.SUELO);
                                    //Bitmap spriteIMG, double spriteChoordX, double spriteChoordY, boolean colisionable, boolean animado, TileTipo tileTipo
        this.savedGamesBackgroundTile1Spot = _Tiles.MENU_SPOT;
        this.savedGamesBackgroundTile2Cross = _Tiles.MENU_CROSS;
        this.savedGamesBackgroundTile3Circle = _Tiles.MENU_CIRCLE;
    }

    public void dibujar(Canvas c) {
        try{
            for(int i=0;i<getAltoPantalla();i+=64){
                for(int j=0;j<getAnchoPantalla();j+=64){
                    c.drawBitmap(this.savedGamesBackgroundTile1Spot.getSpriteIMG(),j,i,null);
                    c.drawBitmap(this.savedGamesBackgroundTile2Cross.getSpriteIMG(),j,i,null);
                    c.drawBitmap(this.savedGamesBackgroundTile3Circle.getSpriteIMG(),j,i,null);
                }
            }
//            c.drawBitmap(fondo,0,0,null);
            super.dibujar(c);
            //Llamamos a super para poner el botón de salir
//            c.drawText("Menú", getAnchoPantalla()/2, getAltoPantalla()/5, pTexto);
//            c.drawText("Menú", getAnchoPantalla()/2+5, getAltoPantalla()/5+10, pTexto2);

        }catch(Exception e){
            Log.i("Error al dibujar", e.getLocalizedMessage());
        }
    }

    public void actualizarFisica() {


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
//                if(pulsa(juego,event)) {
//                    return 1;
//                }else if(pulsa(ayuda,event)){
//                    return 99;
//                }else if(pulsa(opciones,event)){
//                    return 98;
//
//                }else if(pulsa(records,event)){
//                    return 97;
//                }
                break;

            case MotionEvent.ACTION_MOVE: // Se mueve alguno de los dedos

                break;
            default:  Log.i("Otra acción", "Acción no definida: "+accion);
        }

        int idPadre = super.onTouchEvent(event);
        if(idPadre!=getIdEscena()){
            return idPadre;
        }

        return getIdEscena();
    }
}

