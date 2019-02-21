package a20_pc24.city;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;

import a20_pc24.city.sprites.ST_TileSprite;
import a20_pc24.city.sprites.SpPersonajePrincipal;

public final class _CharacterMainSprites {

    SpPersonajePrincipal[][] spPersonajePrincipalCorre; //TODO sprite corriendo

    /*PERSONAJE PRINCIPAL*/
    /*-------------------*/
    //Personaje Principal Frente

    public static SpPersonajePrincipal mainCharaFront =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StaticPanda/front.png"));
    public static SpPersonajePrincipal mainCharaBack =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StaticPanda/back.png"));
    public static SpPersonajePrincipal mainCharaSideL =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StaticPanda/sideL.png"));
    public static SpPersonajePrincipal mainCharaSideR =
            new SpPersonajePrincipal(
                    _Utiles.flipBitmapX(_Utiles.getBitmapFromAsset("panda/StaticPanda/front.png")));
    //Personaje Principal Andando Espalda
    public static SpPersonajePrincipal mainCharaBackStep1 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StepBack/bs1.png"));
    public static SpPersonajePrincipal mainCharaBackStep2 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StepBack/bs2.png"));
    //Personaje Principal Andando Frente
    public static SpPersonajePrincipal mainCharaFrontStep1 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StepFront/sf1.png"));
    public static SpPersonajePrincipal mainCharaFrontStep2 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StepFront/sf2.png"));
    //Personaje Principal Andando Derecha
    public static SpPersonajePrincipal mainCharaRightStep1 =
            new SpPersonajePrincipal(
                    _Utiles.flipBitmapX(_Utiles.getBitmapFromAsset("panda/StepLeft/sL1.png")));
    public static SpPersonajePrincipal mainCharaRightStep2 =
            new SpPersonajePrincipal(
                    _Utiles.flipBitmapX(_Utiles.getBitmapFromAsset("panda/StepLeft/sL2.png")));
    public static SpPersonajePrincipal mainCharaRightStep3 =
            new SpPersonajePrincipal(
                    _Utiles.flipBitmapX(_Utiles.getBitmapFromAsset("panda/StepLeft/sL3.png")));
    public static SpPersonajePrincipal mainCharaRightStep4 =
            new SpPersonajePrincipal(
                    _Utiles.flipBitmapX(_Utiles.getBitmapFromAsset("panda/StepLeft/sL4.png")));
    //Personaje Principal Andando Izquierda
    public static SpPersonajePrincipal mainCharaLeftStep1 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StepFront/sf1.png"));
    public static SpPersonajePrincipal mainCharaLeftStep2 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StepLeft/sL2.png"));
    public static SpPersonajePrincipal mainCharaLeftStep3 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StepLeft/sL3.png"));
    public static SpPersonajePrincipal mainCharaLeftStep4 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StepLeft/sL4.png"));

    public static SpPersonajePrincipal[][] spPersonajePrincipalAnda
            = new SpPersonajePrincipal[][]{
            {mainCharaFront,mainCharaBack,mainCharaSideL,mainCharaSideR},
            {mainCharaBackStep1,mainCharaBackStep2},                                            //1
            {mainCharaFrontStep1,mainCharaFrontStep2},                                          //2
            {mainCharaRightStep1,mainCharaRightStep2,mainCharaRightStep3,mainCharaRightStep4},  //3
            {mainCharaLeftStep1,mainCharaLeftStep2,mainCharaLeftStep3,mainCharaLeftStep4}       //4
    };
}
