package androidx.collection;

import e0.q;

/* loaded from: classes4.dex */
public final class FloatFloatMapKt {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.collection.FloatFloatMap, java.lang.Object] */
    static {
        ?? obj = new Object();
        long[] jArr = ScatterMapKt.f1590a;
        obj.f1404a = jArr;
        float[] fArr = FloatSetKt.f1422a;
        obj.f1405b = fArr;
        obj.f1406c = fArr;
        int g2 = ScatterMapKt.g(0);
        int max = g2 > 0 ? Math.max(7, ScatterMapKt.f(g2)) : 0;
        obj.d = max;
        if (max != 0) {
            jArr = new long[((max + 15) & (-8)) >> 3];
            q.Y(jArr);
        }
        obj.f1404a = jArr;
        int i2 = max >> 3;
        long j2 = 255 << ((max & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j2)) | j2;
        ScatterMapKt.c(obj.d);
        obj.f1405b = new float[max];
        obj.f1406c = new float[max];
    }
}
