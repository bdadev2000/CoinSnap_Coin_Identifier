package com.bytedance.adsdk.lottie;

import android.content.Context;
import android.os.Trace;
import com.bytedance.component.sdk.annotation.RestrictTo;
import com.mbridge.msdk.foundation.entity.o;
import java.io.File;
import x0.AbstractC2914a;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class COT {
    private static volatile com.bytedance.adsdk.lottie.jU.ku Bj = null;
    private static String[] COT = null;
    private static long[] HWF = null;
    private static boolean KS = true;
    private static int QR = 0;
    private static com.bytedance.adsdk.lottie.jU.HWF YW = null;
    private static com.bytedance.adsdk.lottie.jU.COT dT = null;
    private static boolean jU = true;
    private static int ku = 0;
    private static boolean lMd = false;
    private static volatile com.bytedance.adsdk.lottie.jU.QR vDp = null;
    public static boolean zp = false;

    public static float lMd(String str) {
        int i9 = ku;
        if (i9 > 0) {
            ku = i9 - 1;
            return 0.0f;
        }
        if (!lMd) {
            return 0.0f;
        }
        int i10 = QR - 1;
        QR = i10;
        if (i10 != -1) {
            if (str.equals(COT[i10])) {
                Trace.endSection();
                return ((float) (System.nanoTime() - HWF[QR])) / 1000000.0f;
            }
            throw new IllegalStateException(AbstractC2914a.h(o.n("Unbalanced trace call ", str, ". Expected "), COT[QR], "."));
        }
        throw new IllegalStateException("Can't end trace section. There are none.");
    }

    public static void zp(String str) {
        if (lMd) {
            int i9 = QR;
            if (i9 == 20) {
                ku++;
                return;
            }
            COT[i9] = str;
            HWF[i9] = System.nanoTime();
            Trace.beginSection(str);
            QR++;
        }
    }

    public static com.bytedance.adsdk.lottie.jU.ku zp(Context context) {
        com.bytedance.adsdk.lottie.jU.ku kuVar;
        com.bytedance.adsdk.lottie.jU.ku kuVar2 = Bj;
        if (kuVar2 != null) {
            return kuVar2;
        }
        synchronized (com.bytedance.adsdk.lottie.jU.ku.class) {
            try {
                kuVar = Bj;
                if (kuVar == null) {
                    com.bytedance.adsdk.lottie.jU.QR lMd2 = lMd(context);
                    com.bytedance.adsdk.lottie.jU.HWF hwf = YW;
                    if (hwf == null) {
                        hwf = new com.bytedance.adsdk.lottie.jU.lMd();
                    }
                    kuVar = new com.bytedance.adsdk.lottie.jU.ku(lMd2, hwf);
                    Bj = kuVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kuVar;
    }

    public static boolean zp() {
        return jU;
    }

    public static com.bytedance.adsdk.lottie.jU.QR lMd(Context context) {
        com.bytedance.adsdk.lottie.jU.QR qr;
        if (!KS) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.bytedance.adsdk.lottie.jU.QR qr2 = vDp;
        if (qr2 != null) {
            return qr2;
        }
        synchronized (com.bytedance.adsdk.lottie.jU.QR.class) {
            try {
                qr = vDp;
                if (qr == null) {
                    com.bytedance.adsdk.lottie.jU.COT cot = dT;
                    if (cot == null) {
                        cot = new com.bytedance.adsdk.lottie.jU.COT() { // from class: com.bytedance.adsdk.lottie.COT.1
                            @Override // com.bytedance.adsdk.lottie.jU.COT
                            public File zp() {
                                return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                            }
                        };
                    }
                    qr = new com.bytedance.adsdk.lottie.jU.QR(cot);
                    vDp = qr;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qr;
    }
}
