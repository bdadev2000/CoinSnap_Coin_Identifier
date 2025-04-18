package com.bytedance.adsdk.Sg.wN;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class aIu {
    private static SparseArray<WeakReference<Interpolator>> Sg;
    private static final Interpolator YFl = new LinearInterpolator();

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0091. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:122:0x020b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x021d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0262 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static <T> com.bytedance.adsdk.Sg.DSW.YFl<T> Sg(com.bytedance.adsdk.Sg.DSW r23, android.util.JsonReader r24, float r25, com.bytedance.adsdk.Sg.wN.zG<T> r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.Sg.wN.aIu.Sg(com.bytedance.adsdk.Sg.DSW, android.util.JsonReader, float, com.bytedance.adsdk.Sg.wN.zG):com.bytedance.adsdk.Sg.DSW.YFl");
    }

    private static SparseArray<WeakReference<Interpolator>> YFl() {
        if (Sg == null) {
            Sg = new SparseArray<>();
        }
        return Sg;
    }

    private static WeakReference<Interpolator> YFl(int i10) {
        WeakReference<Interpolator> weakReference;
        synchronized (aIu.class) {
            weakReference = YFl().get(i10);
        }
        return weakReference;
    }

    private static void YFl(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (aIu.class) {
            Sg.put(i10, weakReference);
        }
    }

    public static <T> com.bytedance.adsdk.Sg.DSW.YFl<T> YFl(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw, float f10, zG<T> zGVar, boolean z10, boolean z11) throws IOException {
        if (z10 && z11) {
            return Sg(dsw, jsonReader, f10, zGVar);
        }
        if (z10) {
            return YFl(dsw, jsonReader, f10, zGVar);
        }
        return YFl(jsonReader, f10, zGVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0087 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static <T> com.bytedance.adsdk.Sg.DSW.YFl<T> YFl(com.bytedance.adsdk.Sg.DSW r16, android.util.JsonReader r17, float r18, com.bytedance.adsdk.Sg.wN.zG<T> r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.Sg.wN.aIu.YFl(com.bytedance.adsdk.Sg.DSW, android.util.JsonReader, float, com.bytedance.adsdk.Sg.wN.zG):com.bytedance.adsdk.Sg.DSW.YFl");
    }

    private static Interpolator YFl(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = com.bytedance.adsdk.Sg.vc.wN.Sg(pointF.x, -1.0f, 1.0f);
        pointF.y = com.bytedance.adsdk.Sg.vc.wN.Sg(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.bytedance.adsdk.Sg.vc.wN.Sg(pointF2.x, -1.0f, 1.0f);
        float Sg2 = com.bytedance.adsdk.Sg.vc.wN.Sg(pointF2.y, -100.0f, 100.0f);
        pointF2.y = Sg2;
        int YFl2 = com.bytedance.adsdk.Sg.vc.vc.YFl(pointF.x, pointF.y, pointF2.x, Sg2);
        WeakReference<Interpolator> YFl3 = com.bytedance.adsdk.Sg.wN.YFl() ? null : YFl(YFl2);
        Interpolator interpolator = YFl3 != null ? YFl3.get() : null;
        if (YFl3 == null || interpolator == null) {
            try {
                linearInterpolator = com.bytedance.adsdk.Sg.lG.YFl(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e2) {
                if ("The Path cannot loop back on itself.".equals(e2.getMessage())) {
                    linearInterpolator = com.bytedance.adsdk.Sg.lG.YFl(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            if (!com.bytedance.adsdk.Sg.wN.YFl()) {
                try {
                    YFl(YFl2, (WeakReference<Interpolator>) new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator;
    }

    private static <T> com.bytedance.adsdk.Sg.DSW.YFl<T> YFl(JsonReader jsonReader, float f10, zG<T> zGVar) throws IOException {
        return new com.bytedance.adsdk.Sg.DSW.YFl<>(zGVar.Sg(jsonReader, f10));
    }
}
