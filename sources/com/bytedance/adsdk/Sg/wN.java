package com.bytedance.adsdk.Sg;

import a4.j;
import android.content.Context;
import android.os.Trace;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.io.File;
import vd.e;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class wN {
    private static boolean AlY = true;
    private static int DSW = 0;
    private static com.bytedance.adsdk.Sg.AlY.vc NjR = null;
    private static boolean Sg = false;
    public static boolean YFl = false;
    private static volatile com.bytedance.adsdk.Sg.AlY.DSW YoT = null;
    private static volatile com.bytedance.adsdk.Sg.AlY.qsH eT = null;

    /* renamed from: nc, reason: collision with root package name */
    private static com.bytedance.adsdk.Sg.AlY.wN f10220nc = null;
    private static int qsH = 0;
    private static boolean tN = true;

    /* renamed from: vc, reason: collision with root package name */
    private static long[] f10221vc;
    private static String[] wN;

    public static float Sg(String str) {
        int i10 = qsH;
        if (i10 > 0) {
            qsH = i10 - 1;
            return 0.0f;
        }
        if (!Sg) {
            return 0.0f;
        }
        int i11 = DSW - 1;
        DSW = i11;
        if (i11 != -1) {
            if (str.equals(wN[i11])) {
                Trace.endSection();
                return ((float) (System.nanoTime() - f10221vc[DSW])) / 1000000.0f;
            }
            throw new IllegalStateException(e.h(j.o("Unbalanced trace call ", str, ". Expected "), wN[DSW], "."));
        }
        throw new IllegalStateException("Can't end trace section. There are none.");
    }

    public static void YFl(String str) {
        if (Sg) {
            int i10 = DSW;
            if (i10 == 20) {
                qsH++;
                return;
            }
            wN[i10] = str;
            f10221vc[i10] = System.nanoTime();
            Trace.beginSection(str);
            DSW++;
        }
    }

    public static com.bytedance.adsdk.Sg.AlY.qsH YFl(Context context) {
        com.bytedance.adsdk.Sg.AlY.qsH qsh;
        com.bytedance.adsdk.Sg.AlY.qsH qsh2 = eT;
        if (qsh2 != null) {
            return qsh2;
        }
        synchronized (com.bytedance.adsdk.Sg.AlY.qsH.class) {
            qsh = eT;
            if (qsh == null) {
                com.bytedance.adsdk.Sg.AlY.DSW Sg2 = Sg(context);
                com.bytedance.adsdk.Sg.AlY.vc vcVar = NjR;
                if (vcVar == null) {
                    vcVar = new com.bytedance.adsdk.Sg.AlY.Sg();
                }
                qsh = new com.bytedance.adsdk.Sg.AlY.qsH(Sg2, vcVar);
                eT = qsh;
            }
        }
        return qsh;
    }

    public static boolean YFl() {
        return AlY;
    }

    public static com.bytedance.adsdk.Sg.AlY.DSW Sg(Context context) {
        com.bytedance.adsdk.Sg.AlY.DSW dsw;
        if (!tN) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.bytedance.adsdk.Sg.AlY.DSW dsw2 = YoT;
        if (dsw2 != null) {
            return dsw2;
        }
        synchronized (com.bytedance.adsdk.Sg.AlY.DSW.class) {
            dsw = YoT;
            if (dsw == null) {
                com.bytedance.adsdk.Sg.AlY.wN wNVar = f10220nc;
                if (wNVar == null) {
                    wNVar = new com.bytedance.adsdk.Sg.AlY.wN() { // from class: com.bytedance.adsdk.Sg.wN.1
                        @Override // com.bytedance.adsdk.Sg.AlY.wN
                        public File YFl() {
                            return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                        }
                    };
                }
                dsw = new com.bytedance.adsdk.Sg.AlY.DSW(wNVar);
                YoT = dsw;
            }
        }
        return dsw;
    }
}
