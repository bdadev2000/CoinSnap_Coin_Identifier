package com.bytedance.sdk.component.QR.jU;

/* loaded from: classes.dex */
public class KS {
    private lMd lMd;
    private zp zp;

    /* renamed from: com.bytedance.sdk.component.QR.jU.KS$KS, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0076KS {
        private static final KS zp = new KS();
    }

    /* loaded from: classes.dex */
    public interface lMd {
    }

    /* loaded from: classes.dex */
    public enum zp {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    public static void zp(zp zpVar) {
        synchronized (KS.class) {
            C0076KS.zp.zp = zpVar;
        }
    }

    private KS() {
        this.zp = zp.OFF;
        this.lMd = new com.bytedance.sdk.component.QR.jU.lMd();
    }
}
