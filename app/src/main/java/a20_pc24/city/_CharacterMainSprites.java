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

    public final SpPersonajePrincipal mainCharaFront =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StaticPanda/front.png"));
    public final SpPersonajePrincipal mainCharaBack =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StaticPanda/back.png"));
    public final SpPersonajePrincipal mainCharaSideL =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StaticPanda/sideL.png"));
    public final SpPersonajePrincipal mainCharaSideR =
            new SpPersonajePrincipal(
                    _Utiles.flipBitmapX(_Utiles.getBitmapFromAsset("panda/StaticPanda/front.png")));
    //Personaje Principal Andando Espalda
    public final SpPersonajePrincipal mainCharaBackStep1 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StepBack/bs1.png"));
    public final SpPersonajePrincipal mainCharaBackStep2 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StepBack/bs2.png"));
    //Personaje Principal Andando Frente
    public final SpPersonajePrincipal mainCharaFrontStep1 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StepFront/sf1.png"));
    public final SpPersonajePrincipal mainCharaFrontStep2 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StepFront/sf2.png"));
    //Personaje Principal Andando Derecha
    public final SpPersonajePrincipal mainCharaRightStep1 =
            new SpPersonajePrincipal(
                    _Utiles.flipBitmapX(_Utiles.getBitmapFromAsset("panda/StepLeft/sL1.png")));
    public final SpPersonajePrincipal mainCharaRightStep2 =
            new SpPersonajePrincipal(
                    _Utiles.flipBitmapX(_Utiles.getBitmapFromAsset("panda/StepLeft/sL2.png")));
    public final SpPersonajePrincipal mainCharaRightStep3 =
            new SpPersonajePrincipal(
                    _Utiles.flipBitmapX(_Utiles.getBitmapFromAsset("panda/StepLeft/sL3.png")));
    public final SpPersonajePrincipal mainCharaRightStep4 =
            new SpPersonajePrincipal(
                    _Utiles.flipBitmapX(_Utiles.getBitmapFromAsset("panda/StepLeft/sL4.png")));
    //Personaje Principal Andando Izquierda
    public final SpPersonajePrincipal mainCharaLeftStep1 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StepFront/sf1.png"));
    public final SpPersonajePrincipal mainCharaLeftStep2 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StepLeft/sL2.png"));
    public final SpPersonajePrincipal mainCharaLeftStep3 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StepLeft/sL3.png"));
    public final SpPersonajePrincipal mainCharaLeftStep4 =
            new SpPersonajePrincipal(_Utiles.getBitmapFromAsset("panda/StepLeft/sL4.png"));

    SpPersonajePrincipal[][] spPersonajePrincipalAnda
            = new SpPersonajePrincipal[][]{
            {mainCharaFront,mainCharaBack,mainCharaSideL,mainCharaSideR},
            {mainCharaBackStep1,mainCharaBackStep2},                                            //1
            {mainCharaFrontStep1,mainCharaFrontStep2},                                          //2
            {mainCharaRightStep1,mainCharaRightStep2,mainCharaRightStep3,mainCharaRightStep4},  //3
            {mainCharaLeftStep1,mainCharaLeftStep2,mainCharaLeftStep3,mainCharaLeftStep4}       //4
    };
}
