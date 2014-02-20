package com.general.mediaplayer.FindFormula;

/**
 * Created with IntelliJ IDEA.
 * User: Donald Pae
 * Date: 1/17/14
 * Time: 9:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class CommonData {

    public static final int CATEGORY_DOG = 0;// for dog
    public static final int CATEGORY_CAT = 1;// for cat

    public static final String CAT_XML_FILENAME = "Cat.xml";
    public static final String DOG_XML_FILENAME = "Dog.xml";

    public static final int APP_FOR_CAT = CATEGORY_CAT;

    public static DataManager dataMgr = null;

    // no taps for a long time, type of action
    public static final int ACTION_VIDEOPLAY = 0;
    public static final int ACTION_BACKTOMAIN = 1;

    public static final int ACTION_NOTAP = ACTION_BACKTOMAIN;
    public static final int TIME_ACTION_NOTAP = 60; //60 seconds

    // playing video time from no interaction (in seconds)


    public static final int VIDEO_LOOPING = 1;
    public static final int START_SERVER = 1;
    public static final int USE_SERIAL = 1;


    //enum for transform
    public static final int TRANSFORM_ALPHA_FADE = 0;
    public static final int TRANSFORM_TRANSFORM_SLIDE = 1;
    public static final int TRANSFORM_ALPHA_SLIDE = 2;

    public static final int transformAnimation = TRANSFORM_ALPHA_SLIDE; //trans_0


    public static final int BASIC_BREED = 0;
    public static final int BASIC_LIFESTYLE = 1;

    public static final int SELECTED_BASIC = BASIC_BREED;

    public static final int BREED_MAINECOON = 0;
    public static final int BREED_PERSIAN = 1;
    public static final int BREED_RAGDOLL = 2;
    public static final int BREED_SIAMESE = 3;

    public static final int SELECTED_BREED = BREED_MAINECOON;

    public static final int LIFESTYLE_KITTEN = 0;
    public static final int LIFESTYLE_INDOOR = 1;
    public static final int LIFESTYLE_SPAYED = 2;
    public static final int LIFESTYLE_SPECIAL = 3;
    public static final int LIFESTYLE_WET = 4;

    public static final int SELECTED_LIFESTYLE = LIFESTYLE_KITTEN;

    public static DataManager GetDataMgr(){
        if (dataMgr == null)
            dataMgr = new DataManager();

        return dataMgr;
    }

    // initialize Suitable option and ...
    public static void initialize()
    {

    }

    public static int getDefaultBasic()
    {
        return BASIC_BREED;
    }

    public static int getDefaultBreed()
    {
        return BREED_MAINECOON;
    }

    public static int getDefaultLifestyle()
    {
        return LIFESTYLE_KITTEN;
    }
}
