package com.bytedance.sdk.openadsdk.core.QR.zp.zp;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.sdk.openadsdk.core.QR.KS.zp;
import com.bytedance.sdk.openadsdk.core.QR.zp.zp.COT;
import java.io.IOException;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class zp {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:66:0x013a. Please report as an issue. */
    public static com.bytedance.sdk.openadsdk.core.QR.KS zp(Context context, XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String str;
        int i9;
        int i10;
        int i11;
        XmlPullParser xmlPullParser2;
        Context context2;
        int i12;
        String str2;
        Context context3;
        String str3;
        COT.zp zpVar;
        String str4;
        zp.EnumC0100zp enumC0100zp;
        String str5;
        String lMd;
        char c9;
        int i13;
        int i14;
        Context context4 = context;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        String str6 = "HTMLResource";
        String str7 = "IFrameResource";
        int i15 = 2;
        int i16 = 3;
        if (context4 == null) {
            COT.zp(xmlPullParser);
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i17 = displayMetrics.widthPixels;
        int i18 = displayMetrics.heightPixels;
        float f9 = displayMetrics.density;
        int i19 = (int) (i17 / f9);
        int i20 = (int) (i18 / f9);
        float f10 = Float.MIN_VALUE;
        com.bytedance.sdk.openadsdk.core.QR.KS ks = null;
        while (true) {
            if (xmlPullParser.getEventType() == i16 && xmlPullParser.getName().equals("CompanionAds")) {
                return ks;
            }
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == i15) {
                String str8 = "Companion";
                if (xmlPullParser.getName().equals("Companion")) {
                    String str9 = COT.QR;
                    int lMd2 = COT.lMd(xmlPullParser3.getAttributeValue(str9, "width"));
                    int lMd3 = COT.lMd(xmlPullParser3.getAttributeValue(str9, "height"));
                    if (lMd2 < 300 || lMd3 < 250) {
                        str = str6;
                        i10 = i20;
                        i11 = i19;
                        i9 = 2;
                        xmlPullParser2 = xmlPullParser3;
                        context2 = context4;
                        i12 = i16;
                        str2 = str7;
                        COT.zp(xmlPullParser);
                        i15 = i9;
                        str7 = str2;
                        str6 = str;
                        i19 = i11;
                        i16 = i12;
                        context4 = context2;
                        xmlPullParser3 = xmlPullParser2;
                        i20 = i10;
                    } else {
                        COT.zp zpVar2 = new COT.zp();
                        while (true) {
                            if (xmlPullParser.getEventType() != i16 || !xmlPullParser.getName().equals(str8)) {
                                int i21 = i20;
                                int i22 = i19;
                                xmlPullParser.next();
                                if (xmlPullParser.getEventType() == 2) {
                                    String name = xmlPullParser.getName();
                                    name.getClass();
                                    char c10 = 65535;
                                    switch (name.hashCode()) {
                                        case -375340334:
                                            if (name.equals(str7)) {
                                                c9 = 0;
                                                break;
                                            }
                                            break;
                                        case -348198615:
                                            if (name.equals("CompanionClickThrough")) {
                                                c9 = 1;
                                                break;
                                            }
                                            break;
                                        case 611554000:
                                            if (name.equals("TrackingEvents")) {
                                                c10 = 2;
                                                break;
                                            }
                                            break;
                                        case 676623548:
                                            if (name.equals("StaticResource")) {
                                                c10 = 3;
                                                break;
                                            }
                                            break;
                                        case 1877773523:
                                            if (name.equals("CompanionClickTracking")) {
                                                c9 = 4;
                                                break;
                                            }
                                            break;
                                        case 1928285401:
                                            if (name.equals(str6)) {
                                                c9 = 5;
                                                break;
                                            }
                                            break;
                                    }
                                    c10 = c9;
                                    switch (c10) {
                                        case 0:
                                            str5 = str6;
                                            String str10 = str7;
                                            COT.zp zpVar3 = zpVar2;
                                            str4 = str8;
                                            Point zp = com.bytedance.sdk.openadsdk.core.QR.KS.zp.zp(context, lMd2, lMd3, zp.lMd.HTML_RESOURCE);
                                            int i23 = zp.x;
                                            int i24 = zp.y;
                                            zp.lMd lmd = zp.lMd.IFRAME_RESOURCE;
                                            zp.EnumC0100zp enumC0100zp2 = zp.EnumC0100zp.NONE;
                                            float zp2 = com.bytedance.sdk.openadsdk.core.QR.KS.zp(i22, i21, i23, i24, lmd, enumC0100zp2);
                                            String lMd4 = COT.lMd(xmlPullParser, str10);
                                            if (!TextUtils.isEmpty(lMd4) && zp2 > zpVar3.QR && zp2 > f10) {
                                                zpVar3.QR = zp2;
                                                zpVar3.zp(lMd4, enumC0100zp2, lmd);
                                                zpVar2 = zpVar3;
                                                str7 = str10;
                                                str8 = str4;
                                                str6 = str5;
                                                break;
                                            } else {
                                                COT.zp(xmlPullParser, str10, 3);
                                                zpVar2 = zpVar3;
                                                str7 = str10;
                                                str8 = str4;
                                                str6 = str5;
                                                i20 = i21;
                                                i19 = i22;
                                                i16 = 3;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            str5 = str6;
                                            zpVar2.jU = COT.lMd(xmlPullParser, "CompanionClickThrough");
                                            str7 = str7;
                                            str6 = str5;
                                            break;
                                        case 2:
                                            context3 = context;
                                            str5 = str6;
                                            str3 = str7;
                                            zpVar = zpVar2;
                                            str4 = str8;
                                            while (true) {
                                                if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                                                    zpVar2 = zpVar;
                                                    str7 = str3;
                                                    str8 = str4;
                                                    str6 = str5;
                                                    break;
                                                } else if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Tracking")) {
                                                    zpVar.lMd(COT.lMd(xmlPullParser, "Tracking"));
                                                }
                                            }
                                            break;
                                        case 3:
                                            context3 = context;
                                            str3 = str7;
                                            zpVar = zpVar2;
                                            str4 = str8;
                                            zp.EnumC0100zp enumC0100zp3 = zp.EnumC0100zp.NONE;
                                            String lowerCase = xmlPullParser.getAttributeValue(COT.QR, "creativeType").toLowerCase();
                                            Set<String> set = com.bytedance.sdk.openadsdk.core.QR.KS.zp.zp;
                                            if (set.contains(lowerCase)) {
                                                enumC0100zp = zp.EnumC0100zp.IMAGE;
                                            } else {
                                                enumC0100zp = zp.EnumC0100zp.JAVASCRIPT;
                                            }
                                            zp.lMd lmd2 = zp.lMd.STATIC_RESOURCE;
                                            Point zp3 = com.bytedance.sdk.openadsdk.core.QR.KS.zp.zp(context3, lMd2, lMd3, lmd2);
                                            str5 = str6;
                                            float zp4 = com.bytedance.sdk.openadsdk.core.QR.KS.zp(i22, i21, zp3.x, zp3.y, lmd2, enumC0100zp);
                                            if (!set.contains(lowerCase) && !com.bytedance.sdk.openadsdk.core.QR.KS.zp.lMd.contains(lowerCase)) {
                                                lMd = null;
                                            } else {
                                                lMd = COT.lMd(xmlPullParser, "StaticResource");
                                            }
                                            if (zp4 >= zpVar.QR && zp4 > f10 && !TextUtils.isEmpty(lMd)) {
                                                zpVar.QR = zp4;
                                                zpVar.zp(lMd, enumC0100zp, lmd2);
                                                zpVar2 = zpVar;
                                                str7 = str3;
                                                str8 = str4;
                                                str6 = str5;
                                                break;
                                            } else {
                                                COT.zp(xmlPullParser, "StaticResource", 3);
                                                i16 = 3;
                                                zpVar2 = zpVar;
                                                str7 = str3;
                                                str8 = str4;
                                                str6 = str5;
                                                i20 = i21;
                                                i19 = i22;
                                                break;
                                            }
                                            break;
                                        case 4:
                                            zpVar2.zp(COT.lMd(xmlPullParser, "CompanionClickTracking"));
                                            str7 = str7;
                                            break;
                                        case 5:
                                            zp.lMd lmd3 = zp.lMd.HTML_RESOURCE;
                                            Point zp5 = com.bytedance.sdk.openadsdk.core.QR.KS.zp.zp(context, lMd2, lMd3, lmd3);
                                            int i25 = zp5.x;
                                            int i26 = zp5.y;
                                            zp.EnumC0100zp enumC0100zp4 = zp.EnumC0100zp.NONE;
                                            String str11 = str7;
                                            COT.zp zpVar4 = zpVar2;
                                            String str12 = str8;
                                            float zp6 = com.bytedance.sdk.openadsdk.core.QR.KS.zp(i22, i21, i25, i26, lmd3, enumC0100zp4);
                                            String lMd5 = COT.lMd(xmlPullParser, str6);
                                            if (!TextUtils.isEmpty(lMd5) && zp6 > zpVar4.QR && zp6 > f10) {
                                                zpVar4.QR = zp6;
                                                zpVar4.zp(lMd5, enumC0100zp4, lmd3);
                                                zpVar2 = zpVar4;
                                                str7 = str11;
                                                str8 = str12;
                                                break;
                                            } else {
                                                COT.zp(xmlPullParser, str6, 3);
                                                i16 = 3;
                                                zpVar2 = zpVar4;
                                                str7 = str11;
                                                str8 = str12;
                                                i20 = i21;
                                                i19 = i22;
                                                break;
                                            }
                                        default:
                                            COT.zp(xmlPullParser);
                                            context3 = context;
                                            str5 = str6;
                                            str3 = str7;
                                            zpVar = zpVar2;
                                            str4 = str8;
                                            zpVar2 = zpVar;
                                            str7 = str3;
                                            str8 = str4;
                                            str6 = str5;
                                            break;
                                    }
                                }
                                i20 = i21;
                                i19 = i22;
                                i16 = 3;
                            } else {
                                if (!TextUtils.isEmpty(zpVar2.zp) && zpVar2.QR >= f10) {
                                    i13 = i20;
                                    i14 = i19;
                                    com.bytedance.sdk.openadsdk.core.QR.KS ks2 = new com.bytedance.sdk.openadsdk.core.QR.KS(lMd2, lMd3, zpVar2.lMd, zpVar2.KS, zpVar2.zp, zpVar2.COT, zpVar2.HWF, zpVar2.jU);
                                    f10 = zpVar2.QR;
                                    ks = ks2;
                                } else {
                                    i13 = i20;
                                    i14 = i19;
                                }
                                context4 = context;
                                xmlPullParser3 = xmlPullParser;
                                i20 = i13;
                                i19 = i14;
                                i15 = 2;
                                i16 = 3;
                            }
                        }
                    }
                }
            }
            str = str6;
            i9 = i15;
            i10 = i20;
            i11 = i19;
            xmlPullParser2 = xmlPullParser3;
            context2 = context4;
            i12 = i16;
            str2 = str7;
            i15 = i9;
            str7 = str2;
            str6 = str;
            i19 = i11;
            i16 = i12;
            context4 = context2;
            xmlPullParser3 = xmlPullParser2;
            i20 = i10;
        }
    }
}
