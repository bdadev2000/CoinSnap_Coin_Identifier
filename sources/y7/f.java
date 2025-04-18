package y7;

import java.util.Arrays;
import n9.h0;

/* loaded from: classes3.dex */
public final class f implements x {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f27969b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f27970c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f27971d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f27972e;

    /* renamed from: f, reason: collision with root package name */
    public final long f27973f;

    public f(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f27969b = iArr;
        this.f27970c = jArr;
        this.f27971d = jArr2;
        this.f27972e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.f27973f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f27973f = 0L;
        }
    }

    @Override // y7.x
    public final long getDurationUs() {
        return this.f27973f;
    }

    @Override // y7.x
    public final w getSeekPoints(long j3) {
        long[] jArr = this.f27972e;
        int f10 = h0.f(jArr, j3, true);
        long j10 = jArr[f10];
        long[] jArr2 = this.f27970c;
        y yVar = new y(j10, jArr2[f10]);
        if (j10 < j3 && f10 != this.a - 1) {
            int i10 = f10 + 1;
            return new w(yVar, new y(jArr[i10], jArr2[i10]));
        }
        return new w(yVar, yVar);
    }

    @Override // y7.x
    public final boolean isSeekable() {
        return true;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.f27969b) + ", offsets=" + Arrays.toString(this.f27970c) + ", timeUs=" + Arrays.toString(this.f27972e) + ", durationsUs=" + Arrays.toString(this.f27971d) + ")";
    }
}
