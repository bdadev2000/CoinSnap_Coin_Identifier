package com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.YoT.Sg.tN;
import com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.wN;
import com.bytedance.sdk.openadsdk.core.YoT.tN.YFl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class tN {
    public static double Sg(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        if (wN.Sg(xmlPullParser, "Duration").split(":").length == 3) {
            try {
                return (Integer.parseInt(r2[1].trim()) * 60) + (Integer.parseInt(r2[0].trim()) * 60 * 60) + Float.parseFloat(r2[2].trim());
            } catch (Exception unused) {
                return 0.0d;
            }
        }
        return 0.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0050, code lost:
    
        if (r2.equals("Icons") == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void YFl(org.xmlpull.v1.XmlPullParser r8, com.bytedance.sdk.openadsdk.core.YoT.YFl r9, int r10, double r11) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r8.next()
            r3 = 3
            if (r2 != r3) goto L17
            java.lang.String r2 = r8.getName()
            java.lang.String r4 = "Linear"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L16
            goto L17
        L16:
            return
        L17:
            int r2 = r8.getEventType()
            r4 = 2
            if (r2 != r4) goto L2
            if (r1 == 0) goto L2d
            java.lang.String r2 = r9.DSW()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L2d
            com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.wN.YFl(r8)
        L2d:
            java.lang.String r2 = r8.getName()
            r2.getClass()
            int r5 = r2.hashCode()
            r6 = 1
            r7 = -1
            switch(r5) {
                case -2049897434: goto L69;
                case -1927368268: goto L5e;
                case -385055469: goto L53;
                case 70476538: goto L4a;
                case 611554000: goto L3f;
                default: goto L3d;
            }
        L3d:
            r3 = r7
            goto L73
        L3f:
            java.lang.String r3 = "TrackingEvents"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L48
            goto L3d
        L48:
            r3 = 4
            goto L73
        L4a:
            java.lang.String r4 = "Icons"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L73
            goto L3d
        L53:
            java.lang.String r3 = "MediaFiles"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L5c
            goto L3d
        L5c:
            r3 = r4
            goto L73
        L5e:
            java.lang.String r3 = "Duration"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L67
            goto L3d
        L67:
            r3 = r6
            goto L73
        L69:
            java.lang.String r3 = "VideoClicks"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L72
            goto L3d
        L72:
            r3 = r0
        L73:
            switch(r3) {
                case 0: goto La2;
                case 1: goto L99;
                case 2: goto L93;
                case 3: goto L82;
                case 4: goto L7a;
                default: goto L76;
            }
        L76:
            com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.wN.YFl(r8)
            goto L2
        L7a:
            com.bytedance.sdk.openadsdk.core.YoT.AlY r2 = r9.YFl()
            YFl(r8, r2)
            goto L2
        L82:
            com.bytedance.sdk.openadsdk.core.YoT.Sg r2 = YFl(r8)
            if (r2 == 0) goto L2
            com.bytedance.sdk.openadsdk.core.YoT.Sg r3 = r9.Sg()
            if (r3 != 0) goto L2
            r9.YFl(r2)
            goto L2
        L93:
            YFl(r8, r10, r11, r9)
            r1 = r6
            goto L2
        L99:
            double r2 = Sg(r8)
            r9.YFl(r2)
            goto L2
        La2:
            YFl(r8, r9)
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.tN.YFl(org.xmlpull.v1.XmlPullParser, com.bytedance.sdk.openadsdk.core.YoT.YFl, int, double):void");
    }

    private static List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> tN(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        return wN.YFl(xmlPullParser, "Tracking");
    }

    private static String YFl(XmlPullParser xmlPullParser, int i10, double d10, com.bytedance.sdk.openadsdk.core.YoT.YFl yFl) throws IOException, XmlPullParserException {
        double d11 = Double.NEGATIVE_INFINITY;
        String str = null;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MIN_VALUE;
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("MediaFiles")) {
                break;
            }
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("MediaFile")) {
                String str2 = wN.DSW;
                String attributeValue = xmlPullParser.getAttributeValue(str2, "type");
                int Sg = wN.Sg(xmlPullParser.getAttributeValue(str2, "width"));
                int Sg2 = wN.Sg(xmlPullParser.getAttributeValue(str2, "height"));
                int Sg3 = wN.Sg(xmlPullParser.getAttributeValue(str2, "bitrate"));
                String Sg4 = wN.Sg(xmlPullParser, "MediaFile");
                if (Sg > 0 && Sg2 > 0 && com.bytedance.sdk.openadsdk.core.YoT.tN.AlY.YFl.contains(attributeValue) && !TextUtils.isEmpty(Sg4)) {
                    double YFl = com.bytedance.sdk.openadsdk.core.YoT.tN.AlY.YFl(i10, d10, Sg, Sg2, Sg3, attributeValue);
                    if (YFl > d11) {
                        str = Sg4;
                        d11 = YFl;
                        i11 = Sg;
                        i12 = Sg2;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            yFl.AlY(str);
            yFl.YFl(i11);
            yFl.Sg(i12);
        }
        return str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:46:0x00cf. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:62:0x0104. Please report as an issue. */
    public static com.bytedance.sdk.openadsdk.core.YoT.Sg YFl(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        YFl.EnumC0119YFl enumC0119YFl;
        ArrayList arrayList2;
        com.bytedance.sdk.openadsdk.core.YoT.Sg sg2 = null;
        while (true) {
            int i14 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("Icons")) {
                return sg2;
            }
            xmlPullParser.next();
            int i15 = 2;
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Icon")) {
                String str = wN.DSW;
                int Sg = wN.Sg(xmlPullParser.getAttributeValue(str, "width"));
                int Sg2 = wN.Sg(xmlPullParser.getAttributeValue(str, "height"));
                if (Sg > 0 && Sg <= 300 && Sg2 > 0 && Sg2 <= 300) {
                    int YFl = com.bytedance.sdk.openadsdk.core.YoT.Sg.YFl.YFl(xmlPullParser.getAttributeValue(str, "offset"));
                    int YFl2 = com.bytedance.sdk.openadsdk.core.YoT.Sg.YFl.YFl(xmlPullParser.getAttributeValue(str, "duration"));
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    wN.YFl yFl = null;
                    String str2 = null;
                    while (true) {
                        if (xmlPullParser.next() == i14 && xmlPullParser.getName().equals("Icon")) {
                            if (yFl != null && (sg2 == null || TextUtils.isEmpty(sg2.vc()))) {
                                sg2 = new com.bytedance.sdk.openadsdk.core.YoT.Sg(Sg, Sg2, YFl, YFl2, yFl.Sg, yFl.tN, yFl.YFl, arrayList3, arrayList4, str2);
                                wN.YFl(xmlPullParser, "Icons", i14);
                            }
                        } else {
                            ArrayList arrayList5 = arrayList3;
                            ArrayList arrayList6 = arrayList4;
                            if (xmlPullParser.getEventType() == i15) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                char c10 = 65535;
                                switch (name.hashCode()) {
                                    case -1044238411:
                                        if (name.equals("IconViewTracking")) {
                                            c10 = 0;
                                            break;
                                        }
                                        break;
                                    case -375340334:
                                        if (name.equals("IFrameResource")) {
                                            c10 = 1;
                                            break;
                                        }
                                        break;
                                    case 676623548:
                                        if (name.equals("StaticResource")) {
                                            c10 = 2;
                                            break;
                                        }
                                        break;
                                    case 1030746596:
                                        if (name.equals("IconClicks")) {
                                            c10 = 3;
                                            break;
                                        }
                                        break;
                                    case 1928285401:
                                        if (name.equals("HTMLResource")) {
                                            c10 = 4;
                                            break;
                                        }
                                        break;
                                }
                                switch (c10) {
                                    case 0:
                                        arrayList3 = arrayList5;
                                        i10 = 3;
                                        i11 = 2;
                                        arrayList = arrayList6;
                                        arrayList.add(new tN.YFl(wN.Sg(xmlPullParser, "IconViewTracking")).YFl());
                                        break;
                                    case 1:
                                        arrayList3 = arrayList5;
                                        i12 = 3;
                                        i13 = 2;
                                        if (yFl == null) {
                                            yFl = new wN.YFl(wN.Sg(xmlPullParser, "IFrameResource"), YFl.EnumC0119YFl.NONE, YFl.Sg.IFRAME_RESOURCE);
                                            i14 = i12;
                                            i15 = i13;
                                            arrayList4 = arrayList6;
                                            break;
                                        }
                                        wN.YFl(xmlPullParser);
                                        i14 = i12;
                                        i15 = i13;
                                        arrayList4 = arrayList6;
                                    case 2:
                                        arrayList3 = arrayList5;
                                        i12 = 3;
                                        i13 = 2;
                                        YFl.EnumC0119YFl enumC0119YFl2 = YFl.EnumC0119YFl.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(wN.DSW, "creativeType").toLowerCase();
                                        Set<String> set = com.bytedance.sdk.openadsdk.core.YoT.tN.YFl.YFl;
                                        String Sg3 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.YoT.tN.YFl.Sg.contains(lowerCase)) ? wN.Sg(xmlPullParser, "StaticResource") : null;
                                        if (set.contains(lowerCase)) {
                                            enumC0119YFl = YFl.EnumC0119YFl.IMAGE;
                                        } else {
                                            enumC0119YFl = YFl.EnumC0119YFl.JAVASCRIPT;
                                        }
                                        yFl = new wN.YFl(Sg3, enumC0119YFl, YFl.Sg.STATIC_RESOURCE);
                                        i14 = i12;
                                        i15 = i13;
                                        arrayList4 = arrayList6;
                                        break;
                                    case 3:
                                        while (true) {
                                            i12 = 3;
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("IconClicks")) {
                                                arrayList3 = arrayList5;
                                                i13 = 2;
                                                i14 = i12;
                                                i15 = i13;
                                                arrayList4 = arrayList6;
                                                break;
                                            } else {
                                                if (xmlPullParser.getEventType() == 2) {
                                                    if (xmlPullParser.getName().equals("IconClickThrough")) {
                                                        str2 = wN.Sg(xmlPullParser, "IconClickThrough");
                                                    } else if (xmlPullParser.getName().equals("IconClickTracking")) {
                                                        arrayList2 = arrayList5;
                                                        arrayList2.add(new tN.YFl(wN.Sg(xmlPullParser, "IconClickTracking")).YFl());
                                                        arrayList5 = arrayList2;
                                                    }
                                                }
                                                arrayList2 = arrayList5;
                                                arrayList5 = arrayList2;
                                            }
                                        }
                                        break;
                                    case 4:
                                        if (yFl == null || yFl.tN == YFl.Sg.IFRAME_RESOURCE) {
                                            yFl = new wN.YFl(wN.Sg(xmlPullParser, "HTMLResource"), YFl.EnumC0119YFl.NONE, YFl.Sg.HTML_RESOURCE);
                                            arrayList3 = arrayList5;
                                            arrayList4 = arrayList6;
                                            i14 = 3;
                                            i15 = 2;
                                            break;
                                        } else {
                                            arrayList3 = arrayList5;
                                            i12 = 3;
                                            i13 = 2;
                                            wN.YFl(xmlPullParser);
                                            i14 = i12;
                                            i15 = i13;
                                            arrayList4 = arrayList6;
                                            break;
                                        }
                                    default:
                                        arrayList3 = arrayList5;
                                        i12 = 3;
                                        i13 = 2;
                                        wN.YFl(xmlPullParser);
                                        i14 = i12;
                                        i15 = i13;
                                        arrayList4 = arrayList6;
                                        break;
                                }
                            } else {
                                i10 = i14;
                                i11 = i15;
                                arrayList3 = arrayList5;
                                arrayList = arrayList6;
                            }
                            arrayList4 = arrayList;
                            i14 = i10;
                            i15 = i11;
                        }
                    }
                } else {
                    wN.YFl(xmlPullParser);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00af, code lost:
    
        if (r0.equals(com.mbridge.msdk.foundation.entity.CampaignEx.JSON_NATIVE_VIDEO_UNMUTE) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void YFl(org.xmlpull.v1.XmlPullParser r7, com.bytedance.sdk.openadsdk.core.YoT.AlY r8) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.tN.YFl(org.xmlpull.v1.XmlPullParser, com.bytedance.sdk.openadsdk.core.YoT.AlY):void");
    }

    private static void YFl(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.YoT.YFl yFl) throws IOException, XmlPullParserException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("VideoClicks")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                if (name.equals("ClickThrough")) {
                    yFl.tN(wN.Sg(xmlPullParser, "ClickThrough"));
                } else if (!name.equals("ClickTracking")) {
                    wN.YFl(xmlPullParser);
                } else {
                    yFl.YFl().DSW(wN.YFl(xmlPullParser, "ClickTracking"));
                }
            }
        }
    }
}
