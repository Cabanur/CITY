package a20_pc24.city.sprites;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;

    // Los tiles y sprites son definidos con las clases que heredan de S_SPRITE
    // y construídos en las clases _Tiles y _CharacterSprites,
    // menos los correspondientes al personaje principal que están en SpPersonajePrincipal

public abstract class S_Sprite{

    private PointF spritePos;                //Posición en que se coloca el sprite
    private float spritePosX, spritePosY;           //Coordenadas que componen spritePos
    private Bitmap spriteIMG;               //Imagen del sprite
    private RectF spriteColisionRect;        //Cuadrado creado a partir del sprite que determina sus límites
    private Paint spritePaint;

    /**
     * Constructor para instanciar el sprite sin darle más propiedades,
     * con el fín de poder dárselas de forma dinámica
     * @param spriteIMG imagen que integra el sprite
     */
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
        this.spritePaint = new Paint();
    }

    /*****************************************************************/
    /*****************************************************************/
    /*****************************************************************/

    /**
     * Método destinado a definir el cuadro de coolisiones
     */
    public void spriteCuadroColision(){

    }

    /**
     * Cambio de posición en el mapa
     */
    public void spriteMovimiento(){

    }

    /**
     * Sucesión de sprites que conforman la animación
     */
    public void spriteAnimacion(){

    }
    /**
     * Dibuja sprite en coordenadas dadas
     */
    public void spriteDibujar(){

    }
    /*****************************************************************/
    /*****************************************************************/
    /*****************************************************************/

    /**
     * @return obtiene el Bitmap del sprite
     */
    public Bitmap getSpriteIMG() {
        return spriteIMG;
    }

    /**
     * Cambia a machete el Bitmap de un sprite
     * @param spriteIMG nuevo Bitmap para el sprite
     */
    public void setSpriteIMG(Bitmap spriteIMG) {
        this.spriteIMG = spriteIMG;
    }

    /**
     * @return el ancho del sprite
     */
    public float getWidth(){
        return this.spriteIMG.getWidth();
    }

    /**
     * @return el alto del sprite
     */
    public float getHeigh(){
        return this.spriteIMG.getHeight();
    }

    /**
     * @return devuelve la posición donde se encuentra el sprite
     */
    public PointF getSpritePos() {
        return spritePos;
    }

    /**
     * Indica una nueva posición para el sprite
     * @param spritePos nueva posición
     */
    public void setSpritePos(PointF spritePos) {
        this.spritePos = spritePos;
    }

    /**
     * @return devuelve la posición X del sprite
     */
    public float getSpritePosX() {
        return spritePosX;
    }

    /**
     * Indica nuevo valor para X (horizontal)
     * @param spritePosX nueva posición X (horizontal)
     */
    public void setSpritePosX(float spritePosX) {
        this.spritePosX = spritePosX;
    }

    /**
     * @return devuelve la posición Y del sprite
     */
    public float getSpritePosY() {
        return spritePosY;
    }

    /**
     * Indica nuevo valor para Y (vertical)
     * @param spritePosY nueva posición Y (vertical)
     */
    public void setSpritePosY(float spritePosY) {
        this.spritePosY = spritePosY;
    }

    /**
     * @return obtiene el rectándulo de colisiones
     */
    public RectF getSpriteColisionRect() {
        return spriteColisionRect;
    }

    /**
     * Determina un nuevo rectángulo de colisiones
     * @param spriteColisionRect
     */
    public void setSpriteColisionRect(RectF spriteColisionRect) {
        this.spriteColisionRect = spriteColisionRect;
    }

    /**
     *
     * @return
     */
    public Paint getSpritePaint() {
        return spritePaint;
    }

    /**
     *
     * @param spritePaint
     */
    public void setSpritePaint(Paint spritePaint) {
        this.spritePaint = spritePaint;
    }
}
