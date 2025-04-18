package com.bytedance.sdk.component.DSW.AlY;

/* loaded from: classes.dex */
public class tN {
    private Sg Sg;
    private YFl YFl;

    /* loaded from: classes.dex */
    public interface Sg {
    }

    /* loaded from: classes.dex */
    public enum YFl {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    /* renamed from: com.bytedance.sdk.component.DSW.AlY.tN$tN, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0074tN {
        private static final tN YFl = new tN();
    }

    public static void YFl(YFl yFl) {
        synchronized (tN.class) {
            C0074tN.YFl.YFl = yFl;
        }
    }

    private tN() {
        this.YFl = YFl.OFF;
        this.Sg = new com.bytedance.sdk.component.DSW.AlY.Sg();
    }
}
