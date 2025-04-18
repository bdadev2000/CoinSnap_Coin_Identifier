package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import e0.q;

/* loaded from: classes4.dex */
public final class FloatObjectMapKt {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.collection.FloatObjectMap, java.lang.Object] */
    static {
        ?? obj = new Object();
        long[] jArr = ScatterMapKt.f1590a;
        obj.f1416a = jArr;
        obj.f1417b = FloatSetKt.f1422a;
        obj.f1418c = ContainerHelpersKt.f1619c;
        int g2 = ScatterMapKt.g(0);
        int max = g2 > 0 ? Math.max(7, ScatterMapKt.f(g2)) : 0;
        obj.d = max;
        if (max != 0) {
            jArr = new long[((max + 15) & (-8)) >> 3];
            q.Y(jArr);
        }
        obj.f1416a = jArr;
        int i2 = max >> 3;
        long j2 = 255 << ((max & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j2)) | j2;
        ScatterMapKt.c(obj.d);
        obj.f1417b = new float[max];
        obj.f1418c = new Object[max];
    }
}
