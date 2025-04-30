package com.bytedance.sdk.openadsdk.utils;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public class ot {
    public static boolean zp = zp();

    private static boolean zp() {
        SharedPreferences sharedPreferences;
        try {
            if (com.bytedance.sdk.openadsdk.core.KVG.zp() != null && (sharedPreferences = com.bytedance.sdk.openadsdk.core.KVG.zp().getSharedPreferences("pag_sp_prop_switch", 0)) != null) {
                return sharedPreferences.getInt("perf_con_use_prop", 1) == 1;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.lMd(th.getMessage());
        }
        return true;
    }

    public static void zp(int i9) {
        try {
            SharedPreferences.Editor edit = com.bytedance.sdk.openadsdk.core.KVG.zp().getSharedPreferences("pag_sp_prop_switch", 0).edit();
            edit.putInt("perf_con_use_prop", i9);
            edit.apply();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.lMd(th.getMessage());
        }
    }
}
