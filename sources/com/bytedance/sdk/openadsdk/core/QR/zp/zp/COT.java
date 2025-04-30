package com.bytedance.sdk.openadsdk.core.QR.zp.zp;

import android.content.Context;
import android.text.TextUtils;
import android.util.Xml;
import com.bytedance.sdk.openadsdk.core.QR.KS.zp;
import com.bytedance.sdk.openadsdk.core.QR.lMd.KS;
import com.bytedance.sdk.openadsdk.core.QR.zp.lMd;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class COT extends com.bytedance.sdk.openadsdk.core.QR.zp.lMd {
    public static final String QR = null;

    public COT(Context context, int i9, int i10) {
        super(context, i9, i10);
    }

    private void KS(String str) {
        com.bytedance.sdk.openadsdk.core.QR.zp.zp zpVar;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List singletonList = Collections.singletonList(new KS.zp(str).zp());
        if (this.zp > 0) {
            zpVar = com.bytedance.sdk.openadsdk.core.QR.zp.zp.NO_ADS_VAST_RESPONSE;
        } else {
            zpVar = com.bytedance.sdk.openadsdk.core.QR.zp.zp.UNDEFINED_ERROR;
        }
        com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(singletonList, zpVar, -1L, null), (KS.lMd) null);
    }

    private static List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> jU(String str) {
        return zp(str, false);
    }

    public static int lMd(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return Integer.MIN_VALUE;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    @Override // com.bytedance.sdk.openadsdk.core.QR.zp.lMd
    public com.bytedance.sdk.openadsdk.core.QR.zp zp(String str, List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> list) {
        ByteArrayInputStream byteArrayInputStream;
        this.COT = 0;
        InputStream inputStream = null;
        if (this.lMd == null) {
            this.COT = -1;
            return null;
        }
        ?? isEmpty = TextUtils.isEmpty(str);
        try {
            if (isEmpty != 0) {
                this.COT = -2;
                return null;
            }
            try {
                byteArrayInputStream = new ByteArrayInputStream(str.getBytes("UTF-8"));
            } catch (Exception unused) {
                byteArrayInputStream = null;
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                newPullParser.setInput(byteArrayInputStream, "UTF-8");
                newPullParser.nextTag();
                com.bytedance.sdk.openadsdk.core.QR.zp zp2 = zp(newPullParser, list);
                zp(zp2);
                try {
                    byteArrayInputStream.close();
                } catch (IOException unused3) {
                }
                return zp2;
            } catch (Exception unused4) {
                this.COT = -3;
                zp((com.bytedance.sdk.openadsdk.core.QR.zp) null);
                if (byteArrayInputStream != null) {
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused5) {
                    }
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = isEmpty;
        }
    }

    /* loaded from: classes.dex */
    public static class zp {
        zp.lMd KS;
        String jU;
        zp.EnumC0100zp lMd;
        String zp;
        final List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> COT = new ArrayList();
        final List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> HWF = new ArrayList();
        float QR = Float.MIN_VALUE;

        public zp() {
        }

        public void lMd(String str) {
            this.HWF.add(new KS.zp(str).zp());
        }

        public void zp(String str, zp.EnumC0100zp enumC0100zp, zp.lMd lmd) {
            this.zp = str;
            this.lMd = enumC0100zp;
            this.KS = lmd;
        }

        public void zp(String str) {
            this.COT.add(new KS.zp(str).zp());
        }

        public zp(String str, zp.EnumC0100zp enumC0100zp, zp.lMd lmd) {
            zp(str, enumC0100zp, lmd);
        }
    }

    public static String lMd(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        String str2;
        String str3 = QR;
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

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e4, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x005e. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.bytedance.sdk.openadsdk.core.QR.zp lMd(org.xmlpull.v1.XmlPullParser r18, java.util.List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> r19) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.QR.zp.zp.COT.lMd(org.xmlpull.v1.XmlPullParser, java.util.List):com.bytedance.sdk.openadsdk.core.QR.zp");
    }

    private void zp(com.bytedance.sdk.openadsdk.core.QR.zp zpVar) {
        if (this.HWF == null) {
            this.HWF = new lMd.zp();
        }
        lMd.zp zpVar2 = this.HWF;
        zpVar2.zp = this.COT;
        zpVar2.lMd = this.zp;
        if (zpVar != null) {
            zpVar2.KS = zpVar.zp().lMd.size() <= 0;
        }
    }

    private com.bytedance.sdk.openadsdk.core.QR.zp zp(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> list) throws IOException, XmlPullParserException {
        xmlPullParser.require(2, QR, "VAST");
        boolean z8 = false;
        String str = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Error".equals(name)) {
                    str = lMd(xmlPullParser, name);
                } else if ("Ad".equals(name)) {
                    if (zp(xmlPullParser.getAttributeValue(QR, "sequence"))) {
                        while (true) {
                            if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                break;
                            }
                            if (xmlPullParser.getEventType() == 2) {
                                String name2 = xmlPullParser.getName();
                                if ("InLine".equals(name2)) {
                                    com.bytedance.sdk.openadsdk.core.QR.zp zp2 = lMd.zp(this.lMd, xmlPullParser, list, this.KS, this.jU);
                                    if (zp2 != null) {
                                        if (!TextUtils.isEmpty(zp2.QR())) {
                                            return zp2;
                                        }
                                        this.COT = -6;
                                        return null;
                                    }
                                } else if ("Wrapper".equals(name2)) {
                                    com.bytedance.sdk.openadsdk.core.QR.zp lMd = lMd(xmlPullParser, list);
                                    if (lMd != null) {
                                        return lMd;
                                    }
                                } else {
                                    zp(xmlPullParser);
                                }
                            }
                        }
                    } else {
                        zp(xmlPullParser);
                    }
                    z8 = true;
                } else {
                    zp(xmlPullParser);
                }
            }
        }
        if (!z8) {
            this.COT = -4;
            KS(str);
        }
        if (this.COT == 0) {
            this.COT = -5;
        }
        return null;
    }

    public static List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> zp(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        return jU(lMd(xmlPullParser, str));
    }

    public static void zp(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i9 = 1;
        while (i9 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i9++;
            } else if (next == 3) {
                i9--;
            }
        }
    }

    public static void zp(XmlPullParser xmlPullParser, String str, int i9) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == i9) {
                return;
            } else {
                xmlPullParser.next();
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> zp(String str, boolean z8) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new KS.zp(str).zp(z8).zp());
    }
}
