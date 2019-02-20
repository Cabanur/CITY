package a20_pc24.city.sprites;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;

public abstract class S_Sprite{

    public PointF spritePos;
    float spritePosX, spritePosY;
    private Bitmap spriteIMG;
    public RectF spriteColisionRect;
    //Los tiles y sprites son definidos con las clases que heredan de S_SPRITE
    // y construídos en las clases _Tiles y _CharacterSprites

    public S_Sprite(Bitmap spriteIMG){
        this.spriteIMG = spriteIMG;
    }

    /**
     * A pesar de ser una clase abstracta, declaro el constructor para que sea la base de los hijos
     *
     * @param spriteIMG bitmap correspondiente al sprite
     * @param spritePosX posición X donde posicionaremos y dibujaremos
     * @param spritePosY posición Y donde posicionaremos y dibujaremos
     */

    public S_Sprite(Bitmap spriteIMG, float spritePosX, float spritePosY){
        this(spriteIMG);
        this.spritePosX = spritePosX;
        this.spritePosY = spritePosY;
        this.spritePos = new PointF(spritePosX,spritePosY);
        this.spriteColisionRect = new RectF(spritePosX,spritePosY,spriteIMG.getWidth(),spriteIMG.getHeight());
    }

    public Bitmap getSpriteIMG() {
        return spriteIMG;
    }

    public void setSpriteIMG(Bitmap spriteIMG) {
        this.spriteIMG = spriteIMG;
    }

    /**
     * Método destinado a definir el cuadro de coolisiones siempre que colisionable sea TRUE
     * No es abstracto porque es innecesario si el sprite no tiene colisiones
     */

    public void cuadroCoolision(){}

    public void movimiento(){}

    public void animacion(){}

    public float getWidth(){
        return this.spriteIMG.getWidth();
    }
    public float getHeigh(){
        return this.spriteIMG.getHeight();
    }
}