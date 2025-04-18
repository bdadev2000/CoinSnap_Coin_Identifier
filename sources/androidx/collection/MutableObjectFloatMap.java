package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import e0.q;

/* loaded from: classes3.dex */
public final class MutableObjectFloatMap<K> extends ObjectFloatMap<K> {

    /* renamed from: f, reason: collision with root package name */
    public int f1479f;

    public MutableObjectFloatMap(int i2) {
        this.f1542a = ScatterMapKt.f1590a;
        this.f1543b = ContainerHelpersKt.f1619c;
        this.f1544c = FloatSetKt.f1422a;
        if (i2 >= 0) {
            d(ScatterMapKt.g(i2));
        } else {
            RuntimeHelpersKt.a("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void b() {
        this.e = 0;
        long[] jArr = this.f1542a;
        if (jArr != ScatterMapKt.f1590a) {
            q.Y(jArr);
            long[] jArr2 = this.f1542a;
            int i2 = this.d;
            int i3 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j2)) | j2;
        }
        q.W(0, this.d, this.f1543b);
        this.f1479f = ScatterMapKt.c(this.d) - this.e;
    }

    public final int c(int i2) {
        int i3 = this.d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f1542a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = j2 & ((~j2) << 7) & (-9187201950435737472L);
            if (j3 != 0) {
                return (i4 + (Long.numberOfTrailingZeros(j3) >> 3)) & i3;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public final void d(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, ScatterMapKt.f(i2)) : 0;
        this.d = max;
        if (max == 0) {
            jArr = ScatterMapKt.f1590a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            q.Y(jArr);
        }
        this.f1542a = jArr;
        int i3 = max >> 3;
        long j2 = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        this.f1479f = ScatterMapKt.c(this.d) - this.e;
        this.f1543b = new Object[max];
        this.f1544c = new float[max];
    }

    public /* synthetic */ MutableObjectFloatMap() {
        this(6);
    }
}
