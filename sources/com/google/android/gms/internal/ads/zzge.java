package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public final class zzge {
    @Nullable
    public static String zza(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i9 = 0; i9 < attributeCount; i9++) {
            if (xmlPullParser.getAttributeName(i9).equals(str)) {
                return xmlPullParser.getAttributeValue(i9);
            }
        }
        return null;
    }

    public static boolean zzb(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean zzc(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }
}
