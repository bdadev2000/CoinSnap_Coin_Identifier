package com.bytedance.sdk.component.vc.YFl.YFl.YFl;

import com.bytedance.sdk.component.vc.YFl.qsH;
import vd.e;

/* loaded from: classes.dex */
public class DSW {
    public static String YFl = "com.bytedance.openadsdk";
    public static String Sg = e.h(new StringBuilder("content://"), YFl, ".TTMultiProvider");

    static {
        YFl();
    }

    public static void YFl() {
        if (qsH.DSW().vc() != null) {
            YFl = qsH.DSW().vc().getPackageName();
            Sg = e.h(new StringBuilder("content://"), YFl, ".TTMultiProvider");
        }
    }
}
