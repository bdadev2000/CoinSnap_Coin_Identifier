package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.tG;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;

/* loaded from: classes.dex */
public class lMd {
    public static Boolean zp;

    public static boolean KS() {
        Boolean bool = zp;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!tG.COT()) {
            return false;
        }
        if (zp == null) {
            zp = Boolean.valueOf(com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("sp_multi_info", "is_support_multi_process", false));
        }
        return zp.booleanValue();
    }

    public static void lMd() {
        zp = Boolean.FALSE;
        BinderPoolService.zp = true;
    }

    public static void zp() {
        Boolean bool = Boolean.TRUE;
        zp = bool;
        com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("sp_multi_info", "is_support_multi_process", bool);
    }
}
