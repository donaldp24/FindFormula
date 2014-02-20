package com.general.mediaplayer.FindFormula;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Environment;
import android.util.Xml;
import com.general.mediaplayer.FindFormula.STInfo.STDetailInfo;
import org.w3c.dom.Document;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by MaHanYong on 14-2-19.
 */
public class DataManager {
    private boolean bInitialized = false;
    private ArrayList<STDetailInfo> listItems = new ArrayList<STDetailInfo>();

    public DataManager()
    {
        bInitialized = false;
    }

    public boolean IsDataLoaded()
    {
        return bInitialized;
    }

    public boolean ReadXml(Context context, int category)
    {
        if (IsDataLoaded() == true && listItems != null && listItems.size() > 0)
            return true;

        boolean bSuccess = false;

        String xmlFileName = "";
        if (category == CommonData.CATEGORY_CAT)
            xmlFileName = CommonData.CAT_XML_FILENAME;
        else if (category == CommonData.CATEGORY_DOG)
            xmlFileName = CommonData.DOG_XML_FILENAME;

        try
        {
            AssetManager assetManager = context.getAssets();
            InputStream is = assetManager.open(xmlFileName);
            BufferedReader r = new BufferedReader(new InputStreamReader(is));

            String totalLines = "";
            String line;
            while ((line = r.readLine()) != null) {
                totalLines += line + "\n";
            }

            XmlParser parser = new XmlParser();
            listItems = parser.ParseXml(totalLines.toString());
            bSuccess = true;
        }
        catch (Exception e)
        {

        }

        bInitialized = true;

        return bSuccess;
    }

    public STDetailInfo getItemDetail(int uId)
    {
        for (int i = 0; i < listItems.size(); i++)
        {
            STDetailInfo info = listItems.get(i);
            if (info.uId == uId)
                return info;
        }

        return null;
    }

    public ArrayList<STDetailInfo> getSpotsFromName(String name, int category)
    {
        ArrayList<STDetailInfo> retList = new ArrayList<STDetailInfo>();
        for (int i = 0; i < listItems.size(); i++)
        {
            STDetailInfo info = listItems.get(i);
            if (info.category == category && info.name.equalsIgnoreCase(name))
            {
                STDetailInfo newInfo = new STDetailInfo();
                newInfo.uId = info.uId;
                newInfo.category = info.category;
                newInfo.hotspot = info.hotspot;

                newInfo.name = info.name;
                newInfo.hotspotname = info.hotspotname;
                newInfo.headline = info.headline;
                newInfo.copy = info.copy;
                newInfo.link = info.link;

                retList.add(newInfo);
            }
        }

        return retList;
    }
}
