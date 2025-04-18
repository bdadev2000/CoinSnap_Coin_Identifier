package androidx.collection;

import e0.q;

/* loaded from: classes3.dex */
public final class IntFloatMapKt {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.collection.IntFloatMap] */
    static {
        ?? obj = new Object();
        long[] jArr = ScatterMapKt.f1590a;
        obj.f1426a = jArr;
        obj.f1427b = IntSetKt.f1446a;
        obj.f1428c = FloatSetKt.f1422a;
        int g2 = ScatterMapKt.g(0);
        int max = g2 > 0 ? Math.max(7, ScatterMapKt.f(g2)) : 0;
        obj.d = max;
        if (max != 0) {
            jArr = new long[((max + 15) & (-8)) >> 3];
            q.Y(jArr);
        }
        obj.f1426a = jArr;
        int i2 = max >> 3;
        long j2 = 255 << ((max & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j2)) | j2;
        ScatterMapKt.c(obj.d);
        obj.f1427b = new int[max];
        obj.f1428c = new float[max];
    }
}
