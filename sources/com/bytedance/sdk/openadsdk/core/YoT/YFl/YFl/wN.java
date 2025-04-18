package com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.YoT.Sg.tN;
import com.bytedance.sdk.openadsdk.core.YoT.YFl.Sg;
import com.bytedance.sdk.openadsdk.core.YoT.tN.YFl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class wN extends com.bytedance.sdk.openadsdk.core.YoT.YFl.Sg {
    public static final String DSW = null;

    public wN(Context context, int i10, int i11) {
        super(context, i10, i11);
    }

    private static List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> AlY(String str) {
        return YFl(str, false);
    }

    public static int Sg(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return Integer.MIN_VALUE;
        }
    }

    private void tN(String str) {
        com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl yFl;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List singletonList = Collections.singletonList(new tN.YFl(str).YFl());
        if (this.YFl > 0) {
            yFl = com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.NO_ADS_VAST_RESPONSE;
        } else {
            yFl = com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.UNDEFINED_ERROR;
        }
        com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(singletonList, yFl, -1L, null), (tN.Sg) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.YoT.YFl.Sg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.openadsdk.core.YoT.YFl YFl(java.lang.String r6, java.util.List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "UTF-8"
            r1 = 0
            r5.wN = r1
            android.content.Context r2 = r5.Sg
            r3 = 0
            if (r2 != 0) goto Le
            r6 = -1
            r5.wN = r6
            return r3
        Le:
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 == 0) goto L18
            r6 = -2
            r5.wN = r6
            return r3
        L18:
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            byte[] r6 = r6.getBytes(r0)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            org.xmlpull.v1.XmlPullParser r6 = android.util.Xml.newPullParser()     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L4a
            java.lang.String r4 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r6.setFeature(r4, r1)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L4a
            r6.setInput(r2, r0)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L4a
            r6.nextTag()     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L4a
            com.bytedance.sdk.openadsdk.core.YoT.YFl r6 = r5.YFl(r6, r7)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L4a
            r5.YFl(r6)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L4a
            r2.close()     // Catch: java.io.IOException -> L3a
        L3a:
            return r6
        L3b:
            r6 = move-exception
            goto L4c
        L3d:
            r2 = r3
        L3e:
            r6 = -3
            r5.wN = r6     // Catch: java.lang.Throwable -> L4a
            r5.YFl(r3)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L49
            r2.close()     // Catch: java.io.IOException -> L49
        L49:
            return r3
        L4a:
            r6 = move-exception
            r3 = r2
        L4c:
            if (r3 == 0) goto L51
            r3.close()     // Catch: java.io.IOException -> L51
        L51:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.wN.YFl(java.lang.String, java.util.List):com.bytedance.sdk.openadsdk.core.YoT.YFl");
    }

    /* loaded from: classes.dex */
    public static class YFl {
        String AlY;
        YFl.EnumC0119YFl Sg;
        String YFl;
        YFl.Sg tN;
        final List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> wN = new ArrayList();

        /* renamed from: vc, reason: collision with root package name */
        final List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> f10658vc = new ArrayList();
        float DSW = Float.MIN_VALUE;

        public YFl() {
        }

        public void Sg(String str) {
            this.f10658vc.add(new tN.YFl(str).YFl());
        }

        public void YFl(String str, YFl.EnumC0119YFl enumC0119YFl, YFl.Sg sg2) {
            this.YFl = str;
            this.Sg = enumC0119YFl;
            this.tN = sg2;
        }

        public void YFl(String str) {
            this.wN.add(new tN.YFl(str).YFl());
        }

        public YFl(String str, YFl.EnumC0119YFl enumC0119YFl, YFl.Sg sg2) {
            YFl(str, enumC0119YFl, sg2);
        }
    }

    public static String Sg(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        String str2;
        String str3 = DSW;
        xmlPullParser.require(2, str3, str);
        if (xmlPullParser.next() == 4) {
            str2 = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        } else {
            str2 = "";
        }
        xmlPullParser.require(3, str3, str);
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0017, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008a, code lost:
    
        if (r8.equals("TrackingEvents") == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.bytedance.sdk.openadsdk.core.YoT.YFl Sg(org.xmlpull.v1.XmlPullParser r18, java.util.List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> r19) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int r3 = r0.YFl
            r4 = 0
            r5 = 5
            if (r3 < r5) goto L10
            YFl(r18)
            return r4
        L10:
            com.bytedance.sdk.openadsdk.core.YoT.AlY r3 = new com.bytedance.sdk.openadsdk.core.YoT.AlY
            r3.<init>(r4)
            r6 = r4
            r7 = r6
        L17:
            int r8 = r18.getEventType()
            java.lang.String r9 = "Wrapper"
            r10 = 3
            if (r8 != r10) goto L42
            java.lang.String r8 = r18.getName()
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L2b
            goto L42
        L2b:
            com.bytedance.sdk.openadsdk.core.YoT.YFl r1 = r0.YFl(r6, r2)
            if (r1 == 0) goto L41
            com.bytedance.sdk.openadsdk.core.YoT.tN r2 = r1.tN()
            if (r2 != 0) goto L3a
            r1.YFl(r7)
        L3a:
            com.bytedance.sdk.openadsdk.core.YoT.AlY r2 = r1.YFl()
            r2.YFl(r3)
        L41:
            return r1
        L42:
            r18.next()
            int r8 = r18.getEventType()
            r11 = 2
            if (r8 != r11) goto L17
            java.lang.String r8 = r18.getName()
            r8.getClass()
            int r12 = r8.hashCode()
            java.lang.String r13 = "ClickTracking"
            java.lang.String r14 = "Error"
            java.lang.String r15 = "VASTAdTagURI"
            r16 = -1
            switch(r12) {
                case -587420703: goto L96;
                case 67232232: goto L8d;
                case 611554000: goto L84;
                case 1150879268: goto L79;
                case 2107600959: goto L70;
                case 2114088489: goto L65;
                default: goto L62;
            }
        L62:
            r11 = r16
            goto L9e
        L65:
            java.lang.String r11 = "Impression"
            boolean r11 = r8.equals(r11)
            if (r11 != 0) goto L6e
            goto L62
        L6e:
            r11 = r5
            goto L9e
        L70:
            boolean r11 = r8.equals(r13)
            if (r11 != 0) goto L77
            goto L62
        L77:
            r11 = 4
            goto L9e
        L79:
            java.lang.String r11 = "CompanionAds"
            boolean r11 = r8.equals(r11)
            if (r11 != 0) goto L82
            goto L62
        L82:
            r11 = r10
            goto L9e
        L84:
            java.lang.String r12 = "TrackingEvents"
            boolean r12 = r8.equals(r12)
            if (r12 != 0) goto L9e
            goto L62
        L8d:
            boolean r11 = r8.equals(r14)
            if (r11 != 0) goto L94
            goto L62
        L94:
            r11 = 1
            goto L9e
        L96:
            boolean r11 = r8.equals(r15)
            if (r11 != 0) goto L9d
            goto L62
        L9d:
            r11 = 0
        L9e:
            switch(r11) {
                case 0: goto Ld4;
                case 1: goto Lc2;
                case 2: goto Lbd;
                case 3: goto Lb5;
                case 4: goto Lac;
                case 5: goto La3;
                default: goto La1;
            }
        La1:
            goto L17
        La3:
            java.util.List r8 = YFl(r1, r8)
            r3.YFl(r8)
            goto L17
        Lac:
            java.util.List r8 = YFl(r1, r13)
            r3.DSW(r8)
            goto L17
        Lb5:
            android.content.Context r7 = r0.Sg
            com.bytedance.sdk.openadsdk.core.YoT.tN r7 = com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.YFl.YFl(r7, r1)
            goto L17
        Lbd:
            com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.tN.YFl(r1, r3)
            goto L17
        Lc2:
            com.bytedance.sdk.openadsdk.core.YoT.Sg.tN$YFl r8 = new com.bytedance.sdk.openadsdk.core.YoT.Sg.tN$YFl
            java.lang.String r9 = Sg(r1, r14)
            r8.<init>(r9)
            com.bytedance.sdk.openadsdk.core.YoT.Sg.tN r8 = r8.YFl()
            r2.add(r8)
            goto L17
        Ld4:
            java.lang.String r6 = Sg(r1, r15)
            java.lang.String r6 = r0.Sg(r6, r2)
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 == 0) goto L17
            YFl(r1, r9, r10)
            r1 = -2
            r0.wN = r1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.wN.Sg(org.xmlpull.v1.XmlPullParser, java.util.List):com.bytedance.sdk.openadsdk.core.YoT.YFl");
    }

    private void YFl(com.bytedance.sdk.openadsdk.core.YoT.YFl yFl) {
        if (this.f10656vc == null) {
            this.f10656vc = new Sg.YFl();
        }
        Sg.YFl yFl2 = this.f10656vc;
        yFl2.YFl = this.wN;
        yFl2.Sg = this.YFl;
        if (yFl != null) {
            yFl2.tN = yFl.YFl().Sg.size() <= 0;
        }
    }

    private com.bytedance.sdk.openadsdk.core.YoT.YFl YFl(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> list) throws IOException, XmlPullParserException {
        xmlPullParser.require(2, DSW, "VAST");
        boolean z10 = false;
        String str = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Error".equals(name)) {
                    str = Sg(xmlPullParser, name);
                } else if ("Ad".equals(name)) {
                    if (YFl(xmlPullParser.getAttributeValue(DSW, "sequence"))) {
                        while (true) {
                            if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                break;
                            }
                            if (xmlPullParser.getEventType() == 2) {
                                String name2 = xmlPullParser.getName();
                                if ("InLine".equals(name2)) {
                                    com.bytedance.sdk.openadsdk.core.YoT.YFl YFl2 = Sg.YFl(this.Sg, xmlPullParser, list, this.tN, this.AlY);
                                    if (YFl2 != null) {
                                        if (!TextUtils.isEmpty(YFl2.DSW())) {
                                            return YFl2;
                                        }
                                        this.wN = -6;
                                        return null;
                                    }
                                } else if ("Wrapper".equals(name2)) {
                                    com.bytedance.sdk.openadsdk.core.YoT.YFl Sg = Sg(xmlPullParser, list);
                                    if (Sg != null) {
                                        return Sg;
                                    }
                                } else {
                                    YFl(xmlPullParser);
                                }
                            }
                        }
                    } else {
                        YFl(xmlPullParser);
                    }
                    z10 = true;
                } else {
                    YFl(xmlPullParser);
                }
            }
        }
        if (!z10) {
            this.wN = -4;
            tN(str);
        }
        if (this.wN == 0) {
            this.wN = -5;
        }
        return null;
    }

    public static List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> YFl(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        return AlY(Sg(xmlPullParser, str));
    }

    public static void YFl(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i10 = 1;
        while (i10 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static void YFl(XmlPullParser xmlPullParser, String str, int i10) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == i10) {
                return;
            } else {
                xmlPullParser.next();
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> YFl(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new tN.YFl(str).YFl(z10).YFl());
    }
}
