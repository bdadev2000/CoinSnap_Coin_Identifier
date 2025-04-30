package com.applovin.impl;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class hs {
    public static String a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i9 = 0; i9 < attributeCount; i9++) {
            if (xmlPullParser.getAttributeName(i9).equals(str)) {
                return xmlPullParser.getAttributeValue(i9);
            }
        }
        return null;
    }

    public static boolean b(XmlPullParser xmlPullParser, String str) {
        return a(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean c(XmlPullParser xmlPullParser, String str) {
        if (b(xmlPullParser) && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean b(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean a(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }
}
