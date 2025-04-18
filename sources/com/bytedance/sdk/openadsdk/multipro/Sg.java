package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.pDU;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;

/* loaded from: classes.dex */
public class Sg {
    public static Boolean YFl;

    public static void Sg() {
        YFl = Boolean.FALSE;
        BinderPoolService.YFl = true;
    }

    public static void YFl() {
        Boolean bool = Boolean.TRUE;
        YFl = bool;
        com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("sp_multi_info", "is_support_multi_process", bool);
    }

    public static boolean tN() {
        Boolean bool = YFl;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!pDU.wN()) {
            return false;
        }
        if (YFl == null) {
            YFl = Boolean.valueOf(com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("sp_multi_info", "is_support_multi_process", false));
        }
        return YFl.booleanValue();
    }
}
