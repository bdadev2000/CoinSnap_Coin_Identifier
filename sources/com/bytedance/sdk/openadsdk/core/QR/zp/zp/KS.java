package com.bytedance.sdk.openadsdk.core.QR.zp.zp;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.QR.KS.zp;
import com.bytedance.sdk.openadsdk.core.QR.lMd.KS;
import com.bytedance.sdk.openadsdk.core.QR.zp.zp.COT;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class KS {
    private static List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> KS(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        return COT.zp(xmlPullParser, "Tracking");
    }

    public static double lMd(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        if (COT.lMd(xmlPullParser, "Duration").split(":").length == 3) {
            try {
                return (Integer.parseInt(r2[1].trim()) * 60) + (Integer.parseInt(r2[0].trim()) * 3600) + Float.parseFloat(r2[2].trim());
            } catch (Exception unused) {
                return 0.0d;
            }
        }
        return 0.0d;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x003a. Please report as an issue. */
    public static void zp(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.QR.zp zpVar, int i9, double d2) throws IOException, XmlPullParserException {
        boolean z8 = false;
        while (true) {
            if (xmlPullParser.next() != 3 || !xmlPullParser.getName().equals("Linear")) {
                if (xmlPullParser.getEventType() == 2) {
                    if (z8 && TextUtils.isEmpty(zpVar.QR())) {
                        COT.zp(xmlPullParser);
                    }
                    String name = xmlPullParser.getName();
                    name.getClass();
                    char c9 = 65535;
                    switch (name.hashCode()) {
                        case -2049897434:
                            if (name.equals("VideoClicks")) {
                                c9 = 0;
                                break;
                            }
                            break;
                        case -1927368268:
                            if (name.equals("Duration")) {
                                c9 = 1;
                                break;
                            }
                            break;
                        case -385055469:
                            if (name.equals("MediaFiles")) {
                                c9 = 2;
                                break;
                            }
                            break;
                        case 70476538:
                            if (name.equals("Icons")) {
                                c9 = 3;
                                break;
                            }
                            break;
                        case 611554000:
                            if (name.equals("TrackingEvents")) {
                                c9 = 4;
                                break;
                            }
                            break;
                    }
                    switch (c9) {
                        case 0:
                            zp(xmlPullParser, zpVar);
                            break;
                        case 1:
                            zpVar.zp(lMd(xmlPullParser));
                            break;
                        case 2:
                            zp(xmlPullParser, i9, d2, zpVar);
                            z8 = true;
                            break;
                        case 3:
                            com.bytedance.sdk.openadsdk.core.QR.lMd zp = zp(xmlPullParser);
                            if (zp != null && zpVar.lMd() == null) {
                                zpVar.zp(zp);
                                break;
                            }
                            break;
                        case 4:
                            zp(xmlPullParser, zpVar.zp());
                            break;
                        default:
                            COT.zp(xmlPullParser);
                            break;
                    }
                }
            } else {
                return;
            }
        }
    }

    private static String zp(XmlPullParser xmlPullParser, int i9, double d2, com.bytedance.sdk.openadsdk.core.QR.zp zpVar) throws IOException, XmlPullParserException {
        double d9 = Double.NEGATIVE_INFINITY;
        String str = null;
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MIN_VALUE;
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("MediaFiles")) {
                break;
            }
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("MediaFile")) {
                String str2 = COT.QR;
                String attributeValue = xmlPullParser.getAttributeValue(str2, "type");
                int lMd = COT.lMd(xmlPullParser.getAttributeValue(str2, "width"));
                int lMd2 = COT.lMd(xmlPullParser.getAttributeValue(str2, "height"));
                int lMd3 = COT.lMd(xmlPullParser.getAttributeValue(str2, "bitrate"));
                String lMd4 = COT.lMd(xmlPullParser, "MediaFile");
                if (lMd > 0 && lMd2 > 0 && com.bytedance.sdk.openadsdk.core.QR.KS.jU.zp.contains(attributeValue) && !TextUtils.isEmpty(lMd4)) {
                    double zp = com.bytedance.sdk.openadsdk.core.QR.KS.jU.zp(i9, d2, lMd, lMd2, lMd3, attributeValue);
                    if (zp > d9) {
                        str = lMd4;
                        d9 = zp;
                        i10 = lMd;
                        i11 = lMd2;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            zpVar.jU(str);
            zpVar.zp(i10);
            zpVar.lMd(i11);
        }
        return str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x00f2. Please report as an issue. */
    public static com.bytedance.sdk.openadsdk.core.QR.lMd zp(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str;
        String str2;
        String str3;
        com.bytedance.sdk.openadsdk.core.QR.lMd lmd;
        String str4;
        String str5;
        int i9;
        com.bytedance.sdk.openadsdk.core.QR.lMd lmd2;
        String str6;
        String str7;
        String str8;
        int i10;
        zp.EnumC0100zp enumC0100zp;
        String str9;
        String str10;
        String str11 = "HTMLResource";
        String str12 = "IconClicks";
        String str13 = "StaticResource";
        String str14 = "IFrameResource";
        String str15 = "IconViewTracking";
        int i11 = 2;
        int i12 = 3;
        com.bytedance.sdk.openadsdk.core.QR.lMd lmd3 = null;
        while (true) {
            if (xmlPullParser.getEventType() == i12 && xmlPullParser.getName().equals("Icons")) {
                return lmd3;
            }
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == i11 && xmlPullParser.getName().equals("Icon")) {
                String str16 = COT.QR;
                int lMd = COT.lMd(xmlPullParser.getAttributeValue(str16, "width"));
                int lMd2 = COT.lMd(xmlPullParser.getAttributeValue(str16, "height"));
                if (lMd > 0 && lMd <= 300 && lMd2 > 0 && lMd2 <= 300) {
                    int zp = com.bytedance.sdk.openadsdk.core.QR.lMd.zp.zp(xmlPullParser.getAttributeValue(str16, "offset"));
                    int zp2 = com.bytedance.sdk.openadsdk.core.QR.lMd.zp.zp(xmlPullParser.getAttributeValue(str16, "duration"));
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    String str17 = str14;
                    String str18 = str15;
                    COT.zp zpVar = null;
                    String str19 = null;
                    while (true) {
                        if (xmlPullParser.next() == i12 && xmlPullParser.getName().equals("Icon")) {
                            if (zpVar == null || !(lmd3 == null || TextUtils.isEmpty(lmd3.HWF()))) {
                                str9 = str12;
                                str10 = str13;
                            } else {
                                str9 = str12;
                                str10 = str13;
                                com.bytedance.sdk.openadsdk.core.QR.lMd lmd4 = new com.bytedance.sdk.openadsdk.core.QR.lMd(lMd, lMd2, zp, zp2, zpVar.lMd, zpVar.KS, zpVar.zp, arrayList, arrayList2, str19);
                                COT.zp(xmlPullParser, "Icons", i12);
                                lmd3 = lmd4;
                            }
                            str15 = str18;
                            str14 = str17;
                            str12 = str9;
                            str13 = str10;
                            i11 = 2;
                        } else {
                            String str20 = str12;
                            String str21 = str13;
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                switch (name.hashCode()) {
                                    case -1044238411:
                                        i9 = zp2;
                                        str6 = str18;
                                        str7 = str17;
                                        str8 = str20;
                                        str13 = str21;
                                        if (name.equals(str6)) {
                                            i10 = 0;
                                            break;
                                        }
                                        i10 = -1;
                                        break;
                                    case -375340334:
                                        str7 = str17;
                                        str8 = str20;
                                        str13 = str21;
                                        if (!name.equals(str7)) {
                                            i9 = zp2;
                                            str6 = str18;
                                            i10 = -1;
                                            break;
                                        } else {
                                            i10 = 1;
                                            i9 = zp2;
                                            str6 = str18;
                                            break;
                                        }
                                    case 676623548:
                                        str8 = str20;
                                        str13 = str21;
                                        i9 = zp2;
                                        str6 = str18;
                                        str7 = str17;
                                        if (name.equals(str13)) {
                                            i10 = 2;
                                            break;
                                        }
                                        i10 = -1;
                                        break;
                                    case 1030746596:
                                        str8 = str20;
                                        if (!name.equals(str8)) {
                                            i9 = zp2;
                                            str6 = str18;
                                            str7 = str17;
                                            str13 = str21;
                                            i10 = -1;
                                            break;
                                        } else {
                                            i10 = i12;
                                            i9 = zp2;
                                            str6 = str18;
                                            str7 = str17;
                                            str13 = str21;
                                            break;
                                        }
                                    case 1928285401:
                                        if (name.equals(str11)) {
                                            i10 = 4;
                                            i9 = zp2;
                                            str6 = str18;
                                            str7 = str17;
                                            str8 = str20;
                                            str13 = str21;
                                            break;
                                        }
                                    default:
                                        i9 = zp2;
                                        str6 = str18;
                                        str7 = str17;
                                        str8 = str20;
                                        str13 = str21;
                                        i10 = -1;
                                        break;
                                }
                                switch (i10) {
                                    case 0:
                                        str5 = str11;
                                        lmd2 = lmd3;
                                        arrayList2.add(new KS.zp(COT.lMd(xmlPullParser, str6)).zp());
                                        break;
                                    case 1:
                                        str5 = str11;
                                        lmd2 = lmd3;
                                        if (zpVar == null) {
                                            zpVar = new COT.zp(COT.lMd(xmlPullParser, str7), zp.EnumC0100zp.NONE, zp.lMd.IFRAME_RESOURCE);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        str5 = str11;
                                        lmd2 = lmd3;
                                        zp.EnumC0100zp enumC0100zp2 = zp.EnumC0100zp.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(COT.QR, "creativeType").toLowerCase();
                                        Set<String> set = com.bytedance.sdk.openadsdk.core.QR.KS.zp.zp;
                                        String lMd3 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.QR.KS.zp.lMd.contains(lowerCase)) ? COT.lMd(xmlPullParser, str13) : null;
                                        if (set.contains(lowerCase)) {
                                            enumC0100zp = zp.EnumC0100zp.IMAGE;
                                        } else {
                                            enumC0100zp = zp.EnumC0100zp.JAVASCRIPT;
                                        }
                                        zpVar = new COT.zp(lMd3, enumC0100zp, zp.lMd.STATIC_RESOURCE);
                                        break;
                                    case 3:
                                        str5 = str11;
                                        lmd2 = lmd3;
                                        while (true) {
                                            if (xmlPullParser.next() != 3 || !xmlPullParser.getName().equals(str8)) {
                                                if (xmlPullParser.getEventType() == 2) {
                                                    if (xmlPullParser.getName().equals("IconClickThrough")) {
                                                        str19 = COT.lMd(xmlPullParser, "IconClickThrough");
                                                    } else if (xmlPullParser.getName().equals("IconClickTracking")) {
                                                        arrayList.add(new KS.zp(COT.lMd(xmlPullParser, "IconClickTracking")).zp());
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    case 4:
                                        if (zpVar != null) {
                                            lmd2 = lmd3;
                                            if (zpVar.KS != zp.lMd.IFRAME_RESOURCE) {
                                                str5 = str11;
                                                break;
                                            }
                                        } else {
                                            lmd2 = lmd3;
                                        }
                                        str5 = str11;
                                        zpVar = new COT.zp(COT.lMd(xmlPullParser, str11), zp.EnumC0100zp.NONE, zp.lMd.HTML_RESOURCE);
                                        break;
                                    default:
                                        str5 = str11;
                                        lmd2 = lmd3;
                                        break;
                                }
                                COT.zp(xmlPullParser);
                            } else {
                                str5 = str11;
                                i9 = zp2;
                                lmd2 = lmd3;
                                str6 = str18;
                                str7 = str17;
                                str8 = str20;
                                str13 = str21;
                            }
                            str12 = str8;
                            str17 = str7;
                            str18 = str6;
                            lmd3 = lmd2;
                            zp2 = i9;
                            str11 = str5;
                            i12 = 3;
                        }
                    }
                } else {
                    str = str11;
                    str2 = str14;
                    str3 = str15;
                    lmd = lmd3;
                    str4 = str12;
                    COT.zp(xmlPullParser);
                }
            } else {
                str = str11;
                str2 = str14;
                str3 = str15;
                lmd = lmd3;
                str4 = str12;
            }
            str12 = str4;
            str14 = str2;
            str15 = str3;
            lmd3 = lmd;
            str11 = str;
            i11 = 2;
            i12 = 3;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0043. Please report as an issue. */
    public static void zp(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.QR.jU jUVar) throws IOException, XmlPullParserException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                if ("Tracking".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(COT.QR, NotificationCompat.CATEGORY_EVENT);
                    if (TextUtils.isEmpty(attributeValue)) {
                        COT.zp(xmlPullParser, "Tracking", 3);
                    } else {
                        attributeValue.getClass();
                        char c9 = 65535;
                        switch (attributeValue.hashCode()) {
                            case -1638835128:
                                if (attributeValue.equals(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT)) {
                                    c9 = 0;
                                    break;
                                }
                                break;
                            case -1337830390:
                                if (attributeValue.equals("thirdQuartile")) {
                                    c9 = 1;
                                    break;
                                }
                                break;
                            case -934426579:
                                if (attributeValue.equals(CampaignEx.JSON_NATIVE_VIDEO_RESUME)) {
                                    c9 = 2;
                                    break;
                                }
                                break;
                            case -840405966:
                                if (attributeValue.equals(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE)) {
                                    c9 = 3;
                                    break;
                                }
                                break;
                            case -599445191:
                                if (attributeValue.equals(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE)) {
                                    c9 = 4;
                                    break;
                                }
                                break;
                            case 3363353:
                                if (attributeValue.equals(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) {
                                    c9 = 5;
                                    break;
                                }
                                break;
                            case 3532159:
                                if (attributeValue.equals("skip")) {
                                    c9 = 6;
                                    break;
                                }
                                break;
                            case 94756344:
                                if (attributeValue.equals("close")) {
                                    c9 = 7;
                                    break;
                                }
                                break;
                            case 106440182:
                                if (attributeValue.equals(CampaignEx.JSON_NATIVE_VIDEO_PAUSE)) {
                                    c9 = '\b';
                                    break;
                                }
                                break;
                            case 109757538:
                                if (attributeValue.equals("start")) {
                                    c9 = '\t';
                                    break;
                                }
                                break;
                            case 560220243:
                                if (attributeValue.equals("firstQuartile")) {
                                    c9 = '\n';
                                    break;
                                }
                                break;
                            case 1778167540:
                                if (attributeValue.equals("creativeView")) {
                                    c9 = 11;
                                    break;
                                }
                                break;
                        }
                        switch (c9) {
                            case 0:
                                jUVar.zp(COT.lMd(xmlPullParser, "Tracking"), 0.5f);
                                break;
                            case 1:
                                jUVar.zp(COT.lMd(xmlPullParser, "Tracking"), 0.75f);
                                break;
                            case 2:
                                jUVar.KS(KS(xmlPullParser));
                                break;
                            case 3:
                                jUVar.vDp(KS(xmlPullParser));
                                break;
                            case 4:
                                jUVar.jU(KS(xmlPullParser));
                                break;
                            case 5:
                                jUVar.Bj(KS(xmlPullParser));
                                break;
                            case 6:
                                jUVar.HWF(KS(xmlPullParser));
                                break;
                            case 7:
                                jUVar.COT(KS(xmlPullParser));
                                break;
                            case '\b':
                                jUVar.lMd(KS(xmlPullParser));
                                break;
                            case '\t':
                            case 11:
                                jUVar.zp(COT.lMd(xmlPullParser, "Tracking"), 0L);
                                break;
                            case '\n':
                                jUVar.zp(COT.lMd(xmlPullParser, "Tracking"), 0.25f);
                                break;
                        }
                    }
                } else if (xmlPullParser.getEventType() == 4) {
                    xmlPullParser.nextTag();
                } else {
                    COT.zp(xmlPullParser);
                }
            }
        }
    }

    private static void zp(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.QR.zp zpVar) throws IOException, XmlPullParserException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("VideoClicks")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                if (!name.equals("ClickThrough")) {
                    if (name.equals("ClickTracking")) {
                        zpVar.zp().QR(COT.zp(xmlPullParser, "ClickTracking"));
                    } else {
                        COT.zp(xmlPullParser);
                    }
                } else {
                    zpVar.KS(COT.lMd(xmlPullParser, "ClickThrough"));
                }
            }
        }
    }
}
