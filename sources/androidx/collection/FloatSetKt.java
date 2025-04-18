package androidx.collection;

import e0.q;

/* loaded from: classes2.dex */
public final class FloatSetKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f1422a;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.collection.FloatSet, java.lang.Object] */
    static {
        ?? obj = new Object();
        long[] jArr = ScatterMapKt.f1590a;
        obj.f1419a = jArr;
        obj.f1420b = f1422a;
        int g2 = ScatterMapKt.g(0);
        int max = g2 > 0 ? Math.max(7, ScatterMapKt.f(g2)) : 0;
        obj.f1421c = max;
        if (max != 0) {
            jArr = new long[((max + 15) & (-8)) >> 3];
            q.Y(jArr);
        }
        obj.f1419a = jArr;
        int i2 = max >> 3;
        long j2 = 255 << ((max & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j2)) | j2;
        ScatterMapKt.c(obj.f1421c);
        obj.f1420b = new float[max];
        f1422a = new float[0];
    }
}
