package androidx.collection;

import e0.q;

/* loaded from: classes2.dex */
public final class LongFloatMapKt {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.collection.LongFloatMap, java.lang.Object] */
    static {
        ?? obj = new Object();
        long[] jArr = ScatterMapKt.f1590a;
        obj.f1447a = jArr;
        obj.f1448b = LongSetKt.f1465a;
        obj.f1449c = FloatSetKt.f1422a;
        int g2 = ScatterMapKt.g(0);
        int max = g2 > 0 ? Math.max(7, ScatterMapKt.f(g2)) : 0;
        obj.d = max;
        if (max != 0) {
            jArr = new long[((max + 15) & (-8)) >> 3];
            q.Y(jArr);
        }
        obj.f1447a = jArr;
        int i2 = max >> 3;
        long j2 = 255 << ((max & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j2)) | j2;
        ScatterMapKt.c(obj.d);
        obj.f1448b = new long[max];
        obj.f1449c = new float[max];
    }
}
