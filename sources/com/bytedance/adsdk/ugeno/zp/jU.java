package com.bytedance.adsdk.ugeno.zp;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class jU {
    public static Object zp(com.bytedance.adsdk.zp.lMd.zp.zp zpVar) {
        lMd zp;
        if (zpVar == null || (zp = zp(zpVar.zp())) == null) {
            return null;
        }
        return zp.lMd(zpVar.lMd());
    }

    public static lMd zp(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        if (str.equals("find")) {
            return new zp();
        }
        return null;
    }
}
