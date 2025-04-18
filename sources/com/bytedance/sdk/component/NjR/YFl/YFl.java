package com.bytedance.sdk.component.NjR.YFl;

/* loaded from: classes.dex */
public class YFl {
    private static volatile YFl Sg;
    private volatile Sg YFl;

    private YFl() {
    }

    public static YFl YFl() {
        if (Sg == null) {
            synchronized (YFl.class) {
                if (Sg == null) {
                    Sg = new YFl();
                }
            }
        }
        return Sg;
    }

    public Sg Sg() {
        return this.YFl;
    }

    public void YFl(Sg sg2) {
        this.YFl = sg2;
    }
}
