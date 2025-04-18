package com.bytedance.sdk.component.vc.YFl.vc;

import com.bytedance.sdk.component.vc.YFl.qsH;

/* loaded from: classes.dex */
public class YFl {
    private static volatile Sg YFl;

    public static Sg YFl() {
        if (YFl == null) {
            synchronized (Sg.class) {
                if (YFl == null) {
                    YFl = new tN(qsH.DSW().vc(), new vc(qsH.DSW().vc()));
                }
            }
        }
        return YFl;
    }
}
