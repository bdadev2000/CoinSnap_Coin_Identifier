package com.bytedance.sdk.openadsdk.utils;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public class VOe {
    public static boolean YFl = YFl();

    private static boolean YFl() {
        SharedPreferences sharedPreferences;
        try {
            if (com.bytedance.sdk.openadsdk.core.lG.YFl() != null && (sharedPreferences = com.bytedance.sdk.openadsdk.core.lG.YFl().getSharedPreferences("pag_sp_prop_switch", 0)) != null) {
                return sharedPreferences.getInt("perf_con_use_prop", 1) == 1;
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.Sg(th2.getMessage());
        }
        return true;
    }

    public static void YFl(int i10) {
        try {
            SharedPreferences.Editor edit = com.bytedance.sdk.openadsdk.core.lG.YFl().getSharedPreferences("pag_sp_prop_switch", 0).edit();
            edit.putInt("perf_con_use_prop", i10);
            edit.apply();
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.Sg(th2.getMessage());
        }
    }
}
