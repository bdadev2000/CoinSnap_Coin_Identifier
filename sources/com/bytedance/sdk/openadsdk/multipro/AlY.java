package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.lG;
import vd.e;

/* loaded from: classes.dex */
public class AlY {
    public static String YFl = "com.bytedance.openadsdk";
    public static String Sg = e.h(new StringBuilder("content://"), YFl, ".TTMultiProvider");

    static {
        YFl();
    }

    public static void YFl() {
        if (lG.YFl() != null) {
            YFl = lG.YFl().getPackageName();
            Sg = e.h(new StringBuilder("content://"), YFl, ".TTMultiProvider");
        }
    }
}
