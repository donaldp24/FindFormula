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

    public static final int APP_CATEGORY = CATEGORY_DOG;

    public static DataManager dataMgr = null;

    // no taps for a long time, type of action
    public static final int ACTION_VIDEOPLAY = 0;
    public static final int ACTION_BACKTOMAIN = 1;

    public static final int ACTION_NOTAP = ACTION_BACKTOMAIN;
    public static final int TIME_ACTION_NOTAP = 60; //60 seconds

    // playing video time from no interaction (in seconds)


    public static final int VIDEO_LOOPING = 1;
    public static final int START_SERVER = 1;


    // You have to set this flag as 1 to be enable lighting.
    public static final int LIGHT_NONE = -1;
    public static final int LIGHT_COMM = 0;
    public static final int LIGHT_USBHID = 1;

    public static final int LIGHT_MODE = LIGHT_USBHID;


    //enum for transform
    public static final int TRANSFORM_ALPHA_FADE = 0;
    public static final int TRANSFORM_TRANSFORM_SLIDE = 1;
    public static final int TRANSFORM_ALPHA_SLIDE = 2;

    public static final int transformAnimation = TRANSFORM_ALPHA_SLIDE; //trans_0


    public static final int BASIC_BREED = 0;
    public static final int BASIC_LIFESTYLE = 1;
    public static final int BASIC_SIZE = 2;

    public static final int SELECTED_BASIC = BASIC_BREED;

    public static final int BREED_MAINECOON = 0;
    public static final int BREED_PERSIAN = 1;
    public static final int BREED_RAGDOLL = 2;
    public static final int BREED_SIAMESE = 3;

    public static final int BREED_BEAGLE = 0;
    public static final int BREED_BULLDOG = 1;
    public static final int BREED_CHIHUAHUA = 2;
    public static final int BREED_GERMAN = 3;
    public static final int BREED_LABRADOR = 4;
    public static final int BREED_SHIH = 5;
    public static final int BREED_WESTIE = 6;
    public static final int BREED_YORKIE = 7;

    public static final int SELECTED_BREED = BREED_MAINECOON;

    public static final int LIFESTYLE_KITTEN = 0;
    public static final int LIFESTYLE_INDOOR = 1;
    public static final int LIFESTYLE_SPAYED = 2;
    public static final int LIFESTYLE_SPECIAL = 3;
    public static final int LIFESTYLE_WET = 4;

    public static final int LIFESTYLE_XSMALL = 0;
    public static final int LIFESTYLE_MINI = 1;
    public static final int LIFESTYLE_MEDIUM = 2;
    public static final int LIFESTYLE_MAXI = 3;
    public static final int LIFESTYLE_GIANT = 4;

    public static final int SELECTED_LIFESTYLE = LIFESTYLE_KITTEN;

    public static final int SIZE_URBAN = 0;
    public static final int SIZE_INDOOR = 1;
    public static final int SIZE_SPORTING = 2;

    public static final int SELECTED_SIZE = SIZE_URBAN;

    // these are subids for lights of every kind-------------------------------------------------------
    // for example subid == 0(light==0) is matching with the kind "manie coon".
    // cat
    public static final int SUBID_MAINECOON = 0;
    public static final int SUBID_PERSIAN = 1;
    public static final int SUBID_RAGDOLL = 2;
    public static final int SUBID_SIAMESE = 3;
    public static final int SUBID_KITTEN = 4;
    public static final int SUBID_INDOOR = 5;
    public static final int SUBID_SPAYED = 6;
    public static final int SUBID_SPECIAL = 7;
    public static final int SUBID_WET = 8;

    // dog(breed)
    public static final int SUBID_BEAGLE = 15;
    public static final int SUBID_BULLDOG = 11;
    public static final int SUBID_CHIHUAHUA = 9;
    public static final int SUBID_GERMAN = 12;
    public static final int SUBID_LABRADOR = 16;
    public static final int SUBID_SHIH = 13;
    public static final int SUBID_WESTIE = 14;
    public static final int SUBID_YORKIE = 10;
    //dog(lifestyle)
    public static final int SUBID_XSMALL_MATURE = 1;
    public static final int SUBID_XSMALL_AGING = 5;
    public static final int SUBID_MINI_PUPPY = 2;
    public static final int SUBID_MINI_ADULT = 6;
    public static final int SUBID_MEDIUM_DIGESTION = 7;
    public static final int SUBID_MEDIUM_WEIGHT = 3;
    public static final int SUBID_MAXI = 8;
    public static final int SUBID_GIANT = 4;
    //dog(size)
    public static final int SUBID_URBAN_JUNIOR = 1;
    public static final int SUBID_URBAN_ADULT = 2;
    public static final int SUBID_URBAN_SENIOR = 3;
    public static final int SUBID_INDOOR_JUNIOR = 4;
    public static final int SUBID_INDOOR_ADULT = 5;
    public static final int SUBID_INDOOR_SENIOR = 6;
    public static final int SUBID_SPORTING_AGILITY = 7;
    public static final int SUBID_SPORTING_TRAIL = 8;


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
    public static int getDefaultSize()
    {
        return SIZE_URBAN;
    }

    public static int getDefaultFood() {
        return BREED_MAINECOON;
    }
}
