package com.general.mediaplayer.FindFormula;

import com.general.mediaplayer.FindFormula.STInfo.STDetailInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MaHanYong on 14-2-19.
 */
public class XmlParser {
    private ArrayList<STDetailInfo> listItem;
    private STDetailInfo currentInfo;
    private String currentKey = "";

    private final static String XML_KEY_ITEM = "Item";
    private final static String XML_KEY_ITEM_UID = "UID";
    private final static String XML_KEY_ITEM_CATEGORY = "CATEGORY";
    private final static String XML_KEY_ITEM_NAME = "NAME";
    private final static String XML_KEY_ITEM_HOTSPOT = "HOTSPOT";
    private final static String XML_KEY_ITEM_HOTSPOTNAME = "HOTSPOTNAME";
    private final static String XML_KEY_ITEM_HEADLINE = "HEADLINE";
    private final static String XML_KEY_ITEM_COPY = "COPY";
    private final static String XML_KEY_ITEM_LINK = "LINK";

    public XmlParser()
    {
        listItem = new ArrayList<STDetailInfo>();
        currentInfo = new STDetailInfo();
    }

    public boolean startElement(String key)
    {
        if (key.startsWith("/") == true)
            return false;

        currentKey = key;
        if (key.equalsIgnoreCase(XML_KEY_ITEM) == true)
        {
            currentInfo.uId = -1;
            currentInfo.category = -1;
            currentInfo.hotspot = -1;

            currentInfo.name = "";
            currentInfo.hotspotname = "";
            currentInfo.headline = "";
            currentInfo.copy = "";
            currentInfo.link = "";
        }

        return true;
    }

    public void endElement(String key, String value)
    {
        try
        {
            if (currentKey.equalsIgnoreCase(key) == true)
            {
                if (key.equalsIgnoreCase(XML_KEY_ITEM_UID) == true)
                {
                    currentInfo.uId = Integer.parseInt(value);
                }
                else if (key.equalsIgnoreCase(XML_KEY_ITEM_CATEGORY) == true)
                {
                    currentInfo.category = Integer.parseInt(value);
                }
                else if (key.equalsIgnoreCase(XML_KEY_ITEM_HOTSPOT) == true)
                {
                    currentInfo.hotspot = Integer.parseInt(value);
                }
                else if (key.equalsIgnoreCase(XML_KEY_ITEM_NAME) == true)
                {
                    currentInfo.name = value;
                }
                else if (key.equalsIgnoreCase(XML_KEY_ITEM_HOTSPOTNAME) == true)
                {
                    currentInfo.hotspotname = value;
                }
                else if (key.equalsIgnoreCase(XML_KEY_ITEM_HEADLINE) == true)
                {
                    currentInfo.headline = value;
                }
                else if (key.equalsIgnoreCase(XML_KEY_ITEM_COPY) == true)
                {
                    currentInfo.copy = value;
                }
                else if (key.equalsIgnoreCase(XML_KEY_ITEM_LINK) == true)
                {
                    currentInfo.link = value;
                }
            }

            if (key.equalsIgnoreCase(XML_KEY_ITEM) == true)
            {
                STDetailInfo newItem = new STDetailInfo();
                newItem.uId = currentInfo.uId;
                newItem.category = currentInfo.category;
                newItem.hotspot = currentInfo.hotspot;

                newItem.name = currentInfo.name;
                newItem.hotspotname = currentInfo.hotspotname;
                newItem.headline = currentInfo.headline;
                newItem.copy = currentInfo.copy;
                newItem.link = currentInfo.link;

                listItem.add(newItem);

                currentInfo.uId = -1;
                currentInfo.category = -1;
                currentInfo.hotspot = -1;

                currentInfo.name = "";
                currentInfo.hotspotname = "";
                currentInfo.headline = "";
                currentInfo.copy = "";
                currentInfo.link = "";
            }
        }
        catch (Exception e)
        {

        }

        currentKey = "";
    }

    public ArrayList<STDetailInfo> ParseXml(String xmlInfo)
    {
        listItem.clear();

        try
        {
            String[] xmlLines = xmlInfo.split("\n");
            for (int iLine = 0; iLine < xmlLines.length; iLine++)
            {
                int startidx = -1, endidx = -1;
                boolean bStartFlag = false;

                String content = "";
                String xmlString = xmlLines[iLine];
                startidx = xmlString.indexOf("<");
                endidx = xmlString.indexOf(">");

                if (startidx != -1 && endidx != -1)
                {
                    String startKey = xmlString.substring(startidx + 1, endidx);
                    if (startElement(startKey.trim()) == true)
                    {
                        bStartFlag = true;

                        xmlString = xmlString.substring(endidx + 1, xmlString.length());
                    }
                }

                startidx = xmlString.indexOf("</");
                endidx = xmlString.indexOf(">");

                if (startidx != -1 && endidx != -1)
                {
                    if (bStartFlag)
                    {
                        content = xmlString.substring(0, startidx).trim();
                    }

                    String endKey = xmlString.substring(startidx + 2, endidx);
                    endElement(endKey, content);
                }
            }
        }
        catch (Exception e)
        {

        }

        return getInfoList();
    }

    public ArrayList<STDetailInfo> getInfoList(){
        return this.listItem;
    }
}
