package com.bytedance.adsdk.lottie.COT;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class cz {
    private static SparseArray<WeakReference<Interpolator>> lMd;
    private static final Interpolator zp = new LinearInterpolator();

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x00a6. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static <T> com.bytedance.adsdk.lottie.QR.zp<T> lMd(com.bytedance.adsdk.lottie.HWF r26, android.util.JsonReader r27, float r28, com.bytedance.adsdk.lottie.COT.Iv<T> r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.lottie.COT.cz.lMd(com.bytedance.adsdk.lottie.HWF, android.util.JsonReader, float, com.bytedance.adsdk.lottie.COT.Iv):com.bytedance.adsdk.lottie.QR.zp");
    }

    private static SparseArray<WeakReference<Interpolator>> zp() {
        if (lMd == null) {
            lMd = new SparseArray<>();
        }
        return lMd;
    }

    private static WeakReference<Interpolator> zp(int i9) {
        WeakReference<Interpolator> weakReference;
        synchronized (cz.class) {
            weakReference = zp().get(i9);
        }
        return weakReference;
    }

    private static void zp(int i9, WeakReference<Interpolator> weakReference) {
        synchronized (cz.class) {
            lMd.put(i9, weakReference);
        }
    }

    public static <T> com.bytedance.adsdk.lottie.QR.zp<T> zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf, float f9, Iv<T> iv, boolean z8, boolean z9) throws IOException {
        if (z8 && z9) {
            return lMd(hwf, jsonReader, f9, iv);
        }
        if (z8) {
            return zp(hwf, jsonReader, f9, iv);
        }
        return zp(jsonReader, f9, iv);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0086 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static <T> com.bytedance.adsdk.lottie.QR.zp<T> zp(com.bytedance.adsdk.lottie.HWF r17, android.util.JsonReader r18, float r19, com.bytedance.adsdk.lottie.COT.Iv<T> r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.lottie.COT.cz.zp(com.bytedance.adsdk.lottie.HWF, android.util.JsonReader, float, com.bytedance.adsdk.lottie.COT.Iv):com.bytedance.adsdk.lottie.QR.zp");
    }

    private static Interpolator zp(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = com.bytedance.adsdk.lottie.HWF.COT.lMd(pointF.x, -1.0f, 1.0f);
        pointF.y = com.bytedance.adsdk.lottie.HWF.COT.lMd(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.bytedance.adsdk.lottie.HWF.COT.lMd(pointF2.x, -1.0f, 1.0f);
        float lMd2 = com.bytedance.adsdk.lottie.HWF.COT.lMd(pointF2.y, -100.0f, 100.0f);
        pointF2.y = lMd2;
        int zp2 = com.bytedance.adsdk.lottie.HWF.HWF.zp(pointF.x, pointF.y, pointF2.x, lMd2);
        WeakReference<Interpolator> zp3 = com.bytedance.adsdk.lottie.COT.zp() ? null : zp(zp2);
        Interpolator interpolator = zp3 != null ? zp3.get() : null;
        if (zp3 == null || interpolator == null) {
            try {
                linearInterpolator = com.bytedance.adsdk.lottie.KVG.zp(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e4) {
                if ("The Path cannot loop back on itself.".equals(e4.getMessage())) {
                    linearInterpolator = com.bytedance.adsdk.lottie.KVG.zp(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            if (!com.bytedance.adsdk.lottie.COT.zp()) {
                try {
                    zp(zp2, (WeakReference<Interpolator>) new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator;
    }

    private static <T> com.bytedance.adsdk.lottie.QR.zp<T> zp(JsonReader jsonReader, float f9, Iv<T> iv) throws IOException {
        return new com.bytedance.adsdk.lottie.QR.zp<>(iv.lMd(jsonReader, f9));
    }
}
