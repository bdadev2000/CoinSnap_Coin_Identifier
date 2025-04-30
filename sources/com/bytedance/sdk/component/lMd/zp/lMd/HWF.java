package com.bytedance.sdk.component.lMd.zp.lMd;

/* loaded from: classes.dex */
final class HWF {
    static long lMd;
    static COT zp;

    private HWF() {
    }

    public static COT zp() {
        synchronized (HWF.class) {
            COT cot = zp;
            if (cot != null) {
                zp = cot.HWF;
                cot.HWF = null;
                lMd -= 8192;
                return cot;
            }
            return new COT();
        }
    }

    public static void zp(COT cot) {
        if (cot.HWF == null && cot.QR == null) {
            if (cot.jU) {
                return;
            }
            synchronized (HWF.class) {
                try {
                    long j7 = lMd;
                    if (j7 + 8192 > 65536) {
                        return;
                    }
                    lMd = j7 + 8192;
                    cot.HWF = zp;
                    cot.KS = 0;
                    cot.lMd = 0;
                    zp = cot;
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
