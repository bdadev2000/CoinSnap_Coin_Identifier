package com.com.bytedance.overseas.sdk.lMd;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.KS;
import com.bytedance.sdk.openadsdk.core.KVG;

/* loaded from: classes.dex */
public class zp {
    private static volatile zp lMd;
    private String zp = "";

    private zp() {
    }

    public static zp zp() {
        if (lMd == null) {
            synchronized (zp.class) {
                try {
                    if (lMd == null) {
                        lMd = new zp();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lMd;
    }

    public String lMd() {
        if (!KVG.jU().irS("gaid")) {
            return "";
        }
        if (!TextUtils.isEmpty(this.zp)) {
            return this.zp;
        }
        String lMd2 = KS.zp(KVG.zp()).lMd("gaid", "");
        this.zp = lMd2;
        return lMd2;
    }

    public void lMd(String str) {
        this.zp = str;
    }

    public static void zp(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        KS.zp(KVG.zp()).zp("gaid", str);
    }
}
