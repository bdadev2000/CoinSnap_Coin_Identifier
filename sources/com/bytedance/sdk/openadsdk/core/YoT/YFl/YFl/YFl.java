package com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.wN;
import com.bytedance.sdk.openadsdk.core.YoT.tN.YFl;
import java.io.IOException;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class YFl {
    /* JADX WARN: Failed to find 'out' block for switch in B:46:0x00df. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:66:0x011c. Please report as an issue. */
    public static com.bytedance.sdk.openadsdk.core.YoT.tN YFl(Context context, XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        int i10;
        com.bytedance.sdk.openadsdk.core.YoT.tN tNVar;
        int i11;
        wN.YFl yFl;
        int i12;
        int i13;
        YFl.EnumC0119YFl enumC0119YFl;
        String Sg;
        int i14;
        char c10;
        if (context == null) {
            wN.YFl(xmlPullParser);
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i15 = displayMetrics.widthPixels;
        int i16 = displayMetrics.heightPixels;
        float f10 = displayMetrics.density;
        int i17 = (int) (i15 / f10);
        int i18 = (int) (i16 / f10);
        float f11 = Float.MIN_VALUE;
        com.bytedance.sdk.openadsdk.core.YoT.tN tNVar2 = null;
        while (true) {
            int i19 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("CompanionAds")) {
                return tNVar2;
            }
            xmlPullParser.next();
            int i20 = 2;
            if (xmlPullParser.getEventType() == 2) {
                String str = "Companion";
                if (xmlPullParser.getName().equals("Companion")) {
                    String str2 = wN.DSW;
                    int Sg2 = wN.Sg(xmlPullParser.getAttributeValue(str2, "width"));
                    int Sg3 = wN.Sg(xmlPullParser.getAttributeValue(str2, "height"));
                    if (Sg2 >= 300 && Sg3 >= 250) {
                        wN.YFl yFl2 = new wN.YFl();
                        while (true) {
                            if (xmlPullParser.getEventType() == i19 && xmlPullParser.getName().equals(str)) {
                                if (!TextUtils.isEmpty(yFl2.YFl) && yFl2.DSW >= f11) {
                                    tNVar2 = new com.bytedance.sdk.openadsdk.core.YoT.tN(Sg2, Sg3, yFl2.Sg, yFl2.tN, yFl2.YFl, yFl2.wN, yFl2.f10658vc, yFl2.AlY);
                                    f11 = yFl2.DSW;
                                }
                            } else {
                                xmlPullParser.next();
                                if (xmlPullParser.getEventType() == i20) {
                                    String name = xmlPullParser.getName();
                                    name.getClass();
                                    com.bytedance.sdk.openadsdk.core.YoT.tN tNVar3 = tNVar2;
                                    String str3 = str;
                                    char c11 = 65535;
                                    switch (name.hashCode()) {
                                        case -375340334:
                                            if (name.equals("IFrameResource")) {
                                                c10 = 0;
                                                c11 = c10;
                                                break;
                                            }
                                            break;
                                        case -348198615:
                                            if (name.equals("CompanionClickThrough")) {
                                                c10 = 1;
                                                c11 = c10;
                                                break;
                                            }
                                            break;
                                        case 611554000:
                                            if (name.equals("TrackingEvents")) {
                                                c11 = 2;
                                                break;
                                            }
                                            break;
                                        case 676623548:
                                            if (name.equals("StaticResource")) {
                                                c11 = 3;
                                                break;
                                            }
                                            break;
                                        case 1877773523:
                                            if (name.equals("CompanionClickTracking")) {
                                                c10 = 4;
                                                c11 = c10;
                                                break;
                                            }
                                            break;
                                        case 1928285401:
                                            if (name.equals("HTMLResource")) {
                                                c10 = 5;
                                                c11 = c10;
                                                break;
                                            }
                                            break;
                                    }
                                    switch (c11) {
                                        case 0:
                                            i11 = i18;
                                            wN.YFl yFl3 = yFl2;
                                            int i21 = Sg3;
                                            int i22 = Sg2;
                                            Point YFl = com.bytedance.sdk.openadsdk.core.YoT.tN.YFl.YFl(context, i22, i21, YFl.Sg.HTML_RESOURCE);
                                            int i23 = YFl.x;
                                            int i24 = YFl.y;
                                            YFl.Sg sg2 = YFl.Sg.IFRAME_RESOURCE;
                                            YFl.EnumC0119YFl enumC0119YFl2 = YFl.EnumC0119YFl.NONE;
                                            float YFl2 = com.bytedance.sdk.openadsdk.core.YoT.tN.YFl(i17, i11, i23, i24, sg2, enumC0119YFl2);
                                            String Sg4 = wN.Sg(xmlPullParser, "IFrameResource");
                                            if (!TextUtils.isEmpty(Sg4) && YFl2 > yFl3.DSW && YFl2 > f11) {
                                                yFl3.DSW = YFl2;
                                                yFl3.YFl(Sg4, enumC0119YFl2, sg2);
                                                yFl2 = yFl3;
                                                Sg2 = i22;
                                                Sg3 = i21;
                                                i20 = 2;
                                                tNVar2 = tNVar3;
                                                str = str3;
                                                i18 = i11;
                                                i19 = 3;
                                                break;
                                            } else {
                                                i14 = 3;
                                                wN.YFl(xmlPullParser, "IFrameResource", 3);
                                                yFl2 = yFl3;
                                                Sg2 = i22;
                                                Sg3 = i21;
                                                i20 = 2;
                                                tNVar2 = tNVar3;
                                                str = str3;
                                                i19 = i14;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            yFl2.AlY = wN.Sg(xmlPullParser, "CompanionClickThrough");
                                            i20 = 2;
                                            Sg2 = Sg2;
                                            tNVar2 = tNVar3;
                                            str = str3;
                                            i19 = 3;
                                            break;
                                        case 2:
                                            i11 = i18;
                                            yFl = yFl2;
                                            i12 = Sg3;
                                            i13 = Sg2;
                                            while (true) {
                                                if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                                                    Sg2 = i13;
                                                    Sg3 = i12;
                                                    yFl2 = yFl;
                                                    tNVar2 = tNVar3;
                                                    str = str3;
                                                    i18 = i11;
                                                    i19 = 3;
                                                    i20 = 2;
                                                    break;
                                                } else if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Tracking")) {
                                                    yFl.Sg(wN.Sg(xmlPullParser, "Tracking"));
                                                }
                                            }
                                            break;
                                        case 3:
                                            yFl = yFl2;
                                            i12 = Sg3;
                                            i13 = Sg2;
                                            YFl.EnumC0119YFl enumC0119YFl3 = YFl.EnumC0119YFl.NONE;
                                            String lowerCase = xmlPullParser.getAttributeValue(wN.DSW, "creativeType").toLowerCase();
                                            Set<String> set = com.bytedance.sdk.openadsdk.core.YoT.tN.YFl.YFl;
                                            if (set.contains(lowerCase)) {
                                                enumC0119YFl = YFl.EnumC0119YFl.IMAGE;
                                            } else {
                                                enumC0119YFl = YFl.EnumC0119YFl.JAVASCRIPT;
                                            }
                                            YFl.EnumC0119YFl enumC0119YFl4 = enumC0119YFl;
                                            YFl.Sg sg3 = YFl.Sg.STATIC_RESOURCE;
                                            Point YFl3 = com.bytedance.sdk.openadsdk.core.YoT.tN.YFl.YFl(context, i13, i12, sg3);
                                            i11 = i18;
                                            float YFl4 = com.bytedance.sdk.openadsdk.core.YoT.tN.YFl(i17, i18, YFl3.x, YFl3.y, sg3, enumC0119YFl4);
                                            if (!set.contains(lowerCase) && !com.bytedance.sdk.openadsdk.core.YoT.tN.YFl.Sg.contains(lowerCase)) {
                                                Sg = null;
                                            } else {
                                                Sg = wN.Sg(xmlPullParser, "StaticResource");
                                            }
                                            if (YFl4 >= yFl.DSW && YFl4 > f11 && !TextUtils.isEmpty(Sg)) {
                                                yFl.DSW = YFl4;
                                                yFl.YFl(Sg, enumC0119YFl4, sg3);
                                                Sg2 = i13;
                                                Sg3 = i12;
                                                yFl2 = yFl;
                                                tNVar2 = tNVar3;
                                                str = str3;
                                                i18 = i11;
                                                i19 = 3;
                                                i20 = 2;
                                                break;
                                            } else {
                                                i14 = 3;
                                                wN.YFl(xmlPullParser, "StaticResource", 3);
                                                Sg2 = i13;
                                                Sg3 = i12;
                                                yFl2 = yFl;
                                                tNVar2 = tNVar3;
                                                str = str3;
                                                i20 = 2;
                                                i19 = i14;
                                                break;
                                            }
                                            break;
                                        case 4:
                                            yFl2.YFl(wN.Sg(xmlPullParser, "CompanionClickTracking"));
                                            tNVar2 = tNVar3;
                                            str = str3;
                                            i19 = 3;
                                            i20 = 2;
                                            break;
                                        case 5:
                                            YFl.Sg sg4 = YFl.Sg.HTML_RESOURCE;
                                            Point YFl5 = com.bytedance.sdk.openadsdk.core.YoT.tN.YFl.YFl(context, Sg2, Sg3, sg4);
                                            int i25 = YFl5.x;
                                            int i26 = YFl5.y;
                                            YFl.EnumC0119YFl enumC0119YFl5 = YFl.EnumC0119YFl.NONE;
                                            wN.YFl yFl4 = yFl2;
                                            int i27 = Sg3;
                                            int i28 = Sg2;
                                            float YFl6 = com.bytedance.sdk.openadsdk.core.YoT.tN.YFl(i17, i18, i25, i26, sg4, enumC0119YFl5);
                                            String Sg5 = wN.Sg(xmlPullParser, "HTMLResource");
                                            if (!TextUtils.isEmpty(Sg5) && YFl6 > yFl4.DSW && YFl6 > f11) {
                                                yFl4.DSW = YFl6;
                                                yFl4.YFl(Sg5, enumC0119YFl5, sg4);
                                                Sg2 = i28;
                                                yFl2 = yFl4;
                                                tNVar2 = tNVar3;
                                                str = str3;
                                                Sg3 = i27;
                                                i19 = 3;
                                                i20 = 2;
                                            } else {
                                                wN.YFl(xmlPullParser, "HTMLResource", 3);
                                                i19 = 3;
                                                Sg2 = i28;
                                                yFl2 = yFl4;
                                                tNVar2 = tNVar3;
                                                str = str3;
                                                Sg3 = i27;
                                                i20 = 2;
                                                break;
                                            }
                                            break;
                                        default:
                                            wN.YFl(xmlPullParser);
                                            i11 = i18;
                                            yFl = yFl2;
                                            i12 = Sg3;
                                            i13 = Sg2;
                                            Sg2 = i13;
                                            Sg3 = i12;
                                            yFl2 = yFl;
                                            tNVar2 = tNVar3;
                                            str = str3;
                                            i18 = i11;
                                            i19 = 3;
                                            i20 = 2;
                                            break;
                                    }
                                } else {
                                    i11 = i18;
                                }
                                i18 = i11;
                            }
                        }
                    } else {
                        i10 = i18;
                        tNVar = tNVar2;
                        wN.YFl(xmlPullParser);
                        tNVar2 = tNVar;
                        i18 = i10;
                    }
                }
            }
            i10 = i18;
            tNVar = tNVar2;
            tNVar2 = tNVar;
            i18 = i10;
        }
    }
}
