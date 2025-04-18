package com.bytedance.adsdk.YFl;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class DSW {
    public static Object YFl(com.bytedance.adsdk.YFl.Sg.YFl.YFl yFl) {
        wN YFl;
        if (yFl == null || (YFl = YFl(yFl.YFl())) == null) {
            return null;
        }
        return YFl.YFl(null, yFl.Sg());
    }

    public static wN YFl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3143097:
                if (str.equals("find")) {
                    c10 = 0;
                    break;
                }
                break;
            case 96955127:
                if (str.equals("exist")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    c10 = 2;
                    break;
                }
                break;
            case 2056988195:
                if (str.equals("isDigit")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return new tN();
            case 1:
                return new Sg();
            case 2:
                return new vc();
            case 3:
                return new AlY();
            default:
                return null;
        }
    }
}
