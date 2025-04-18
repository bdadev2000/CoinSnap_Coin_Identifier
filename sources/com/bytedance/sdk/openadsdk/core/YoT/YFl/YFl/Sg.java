package com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class Sg {
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x003d. Please report as an issue. */
    public static com.bytedance.sdk.openadsdk.core.YoT.YFl YFl(Context context, XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> list, int i10, double d10) throws IOException, XmlPullParserException {
        xmlPullParser.require(2, wN.DSW, "InLine");
        com.bytedance.sdk.openadsdk.core.YoT.YFl yFl = new com.bytedance.sdk.openadsdk.core.YoT.YFl();
        while (true) {
            if (xmlPullParser.next() == 3 && "InLine".equals(xmlPullParser.getName())) {
                yFl.YFl().nc(list);
                return yFl;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                char c10 = 65535;
                switch (name.hashCode()) {
                    case -2077435339:
                        if (name.equals("AdVerifications")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1692490108:
                        if (name.equals("Creatives")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -56677412:
                        if (name.equals("Description")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 67232232:
                        if (name.equals("Error")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 184043572:
                        if (name.equals("Extensions")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 501930965:
                        if (name.equals("AdTitle")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 2114088489:
                        if (name.equals("Impression")) {
                            c10 = 6;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        yFl.YFl(AlY.YFl(xmlPullParser));
                        continue;
                    case 1:
                        if (!TextUtils.isEmpty(yFl.DSW()) && yFl.tN() != null) {
                            break;
                        } else {
                            while (xmlPullParser.next() != 3) {
                                if (xmlPullParser.getEventType() == 2) {
                                    if ("Creative".equals(xmlPullParser.getName())) {
                                        YFl(context, xmlPullParser, yFl, i10, d10);
                                    } else {
                                        wN.YFl(xmlPullParser);
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    case 2:
                        yFl.Sg(wN.Sg(xmlPullParser, name));
                        continue;
                    case 3:
                        list.addAll(wN.YFl(xmlPullParser, name));
                        continue;
                    case 4:
                        while (true) {
                            if (xmlPullParser.getEventType() == 3 && "Extensions".equals(xmlPullParser.getName())) {
                                continue;
                            } else {
                                xmlPullParser.next();
                                if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                                    yFl.YFl(AlY.YFl(xmlPullParser));
                                }
                            }
                        }
                        break;
                    case 5:
                        yFl.YFl(wN.Sg(xmlPullParser, name));
                        continue;
                    case 6:
                        yFl.YFl().YFl(wN.YFl(xmlPullParser, name));
                        continue;
                }
                wN.YFl(xmlPullParser);
            }
        }
    }

    public static void YFl(Context context, XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.YoT.YFl yFl, int i10, double d10) throws IOException, XmlPullParserException {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Linear".equals(xmlPullParser.getName()) && TextUtils.isEmpty(yFl.DSW())) {
                    tN.YFl(xmlPullParser, yFl, i10, d10);
                } else if ("CompanionAds".equals(xmlPullParser.getName()) && yFl.tN() == null) {
                    yFl.YFl(YFl.YFl(context, xmlPullParser));
                } else {
                    wN.YFl(xmlPullParser);
                }
            }
        }
    }
}
