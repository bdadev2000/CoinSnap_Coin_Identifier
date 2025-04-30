package com.bytedance.sdk.openadsdk.component.reward;

import Q7.n0;
import android.text.TextUtils;

/* loaded from: classes.dex */
class tG {
    private final String zp;

    public tG(String str) {
        this.zp = TextUtils.isEmpty(str) ? "" : str;
    }

    private String COT(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        return n0.l(new StringBuilder(), this.zp, "_cache_", str);
    }

    public boolean KS(String str) {
        try {
            return com.bytedance.sdk.openadsdk.multipro.jU.jU.zp(COT(str), "has_played", true);
        } catch (Throwable unused) {
            return true;
        }
    }

    public void jU(String str) {
        try {
            com.bytedance.sdk.openadsdk.multipro.jU.jU.zp(COT(str));
        } catch (Throwable unused) {
        }
    }

    public long lMd(String str) {
        try {
            return com.bytedance.sdk.openadsdk.multipro.jU.jU.zp(COT(str), "create_time", 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public String zp(String str) {
        try {
            return com.bytedance.sdk.openadsdk.multipro.jU.jU.lMd(COT(str), "material_data", null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void zp(String str, String str2) {
        try {
            com.bytedance.sdk.openadsdk.multipro.jU.jU.zp(COT(str), "has_played", Boolean.FALSE);
            com.bytedance.sdk.openadsdk.multipro.jU.jU.zp(COT(str), "create_time", Long.valueOf(System.currentTimeMillis()));
            com.bytedance.sdk.openadsdk.multipro.jU.jU.zp(COT(str), "material_data", str2);
        } catch (Throwable unused) {
        }
    }
}
