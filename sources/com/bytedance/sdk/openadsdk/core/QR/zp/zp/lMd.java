package com.bytedance.sdk.openadsdk.core.QR.zp.zp;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class lMd {
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0040. Please report as an issue. */
    public static com.bytedance.sdk.openadsdk.core.QR.zp zp(Context context, XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> list, int i9, double d2) throws IOException, XmlPullParserException {
        xmlPullParser.require(2, COT.QR, "InLine");
        com.bytedance.sdk.openadsdk.core.QR.zp zpVar = new com.bytedance.sdk.openadsdk.core.QR.zp();
        while (true) {
            if (xmlPullParser.next() == 3 && "InLine".equals(xmlPullParser.getName())) {
                zpVar.zp().dT(list);
                return zpVar;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                char c9 = 65535;
                switch (name.hashCode()) {
                    case -2077435339:
                        if (name.equals("AdVerifications")) {
                            c9 = 0;
                            break;
                        }
                        break;
                    case -1692490108:
                        if (name.equals("Creatives")) {
                            c9 = 1;
                            break;
                        }
                        break;
                    case -56677412:
                        if (name.equals("Description")) {
                            c9 = 2;
                            break;
                        }
                        break;
                    case 67232232:
                        if (name.equals("Error")) {
                            c9 = 3;
                            break;
                        }
                        break;
                    case 184043572:
                        if (name.equals("Extensions")) {
                            c9 = 4;
                            break;
                        }
                        break;
                    case 501930965:
                        if (name.equals("AdTitle")) {
                            c9 = 5;
                            break;
                        }
                        break;
                    case 2114088489:
                        if (name.equals("Impression")) {
                            c9 = 6;
                            break;
                        }
                        break;
                }
                switch (c9) {
                    case 0:
                        zpVar.zp(jU.zp(xmlPullParser));
                        continue;
                    case 1:
                        if (!TextUtils.isEmpty(zpVar.QR()) && zpVar.KS() != null) {
                            break;
                        } else {
                            while (xmlPullParser.next() != 3) {
                                if (xmlPullParser.getEventType() == 2) {
                                    if ("Creative".equals(xmlPullParser.getName())) {
                                        zp(context, xmlPullParser, zpVar, i9, d2);
                                    } else {
                                        COT.zp(xmlPullParser);
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    case 2:
                        zpVar.lMd(COT.lMd(xmlPullParser, name));
                        continue;
                    case 3:
                        list.addAll(COT.zp(xmlPullParser, name));
                        continue;
                    case 4:
                        while (true) {
                            if (xmlPullParser.getEventType() == 3 && "Extensions".equals(xmlPullParser.getName())) {
                                continue;
                            } else {
                                xmlPullParser.next();
                                if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                                    zpVar.zp(jU.zp(xmlPullParser));
                                }
                            }
                        }
                        break;
                    case 5:
                        zpVar.zp(COT.lMd(xmlPullParser, name));
                        continue;
                    case 6:
                        zpVar.zp().zp(COT.zp(xmlPullParser, name));
                        continue;
                }
                COT.zp(xmlPullParser);
            }
        }
    }

    public static void zp(Context context, XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.QR.zp zpVar, int i9, double d2) throws IOException, XmlPullParserException {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Linear".equals(xmlPullParser.getName()) && TextUtils.isEmpty(zpVar.QR())) {
                    KS.zp(xmlPullParser, zpVar, i9, d2);
                } else if ("CompanionAds".equals(xmlPullParser.getName()) && zpVar.KS() == null) {
                    zpVar.zp(zp.zp(context, xmlPullParser));
                } else {
                    COT.zp(xmlPullParser);
                }
            }
        }
    }
}
