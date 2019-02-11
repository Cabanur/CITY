package a20_pc24.city;

import android.content.Context;
import android.graphics.Bitmap;

import a20_pc24.city.sprites.ST_TileSprite;

public class _Tiles {

    private Context tilesContext;
    //CalleCiudad
    public final ST_TileSprite CALLE_SUELO = new ST_TileSprite(_Utiles.getBitmapFromAsset(getTilesContext(),"cityscape/suelosimple.png"), double spriteLargariaX, double spriteAlturaY, boolean colisionable, boolean animado, TileTipo tileTipo);

    //






    public _Tiles(Context tilesContext){
        this.tilesContext = tilesContext;
    }

    public void setTilesContext(Context tilesContext){
        this.tilesContext = tilesContext;
    }

    public Context getTilesContext(){
        return this.tilesContext;
    }
}
