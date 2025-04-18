package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import e0.q;

@StabilityInferred
/* loaded from: classes2.dex */
public final class SnapshotDoubleIndexHeap {

    /* renamed from: a, reason: collision with root package name */
    public int f14558a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f14559b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f14560c;
    public int[] d;
    public int e;

    public final int a(int i2) {
        int i3 = this.f14558a + 1;
        int[] iArr = this.f14559b;
        int length = iArr.length;
        if (i3 > length) {
            int i4 = length * 2;
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            q.S(iArr, iArr2, 0, 0, 14);
            q.S(this.f14560c, iArr3, 0, 0, 14);
            this.f14559b = iArr2;
            this.f14560c = iArr3;
        }
        int i5 = this.f14558a;
        this.f14558a = i5 + 1;
        int length2 = this.d.length;
        if (this.e >= length2) {
            int i6 = length2 * 2;
            int[] iArr4 = new int[i6];
            int i7 = 0;
            while (i7 < i6) {
                int i8 = i7 + 1;
                iArr4[i7] = i8;
                i7 = i8;
            }
            q.S(this.d, iArr4, 0, 0, 14);
            this.d = iArr4;
        }
        int i9 = this.e;
        int[] iArr5 = this.d;
        this.e = iArr5[i9];
        int[] iArr6 = this.f14559b;
        iArr6[i5] = i2;
        this.f14560c[i5] = i9;
        iArr5[i9] = i5;
        int i10 = iArr6[i5];
        while (i5 > 0) {
            int i11 = ((i5 + 1) >> 1) - 1;
            if (iArr6[i11] <= i10) {
                break;
            }
            b(i11, i5);
            i5 = i11;
        }
        return i9;
    }

    public final void b(int i2, int i3) {
        int[] iArr = this.f14559b;
        int[] iArr2 = this.f14560c;
        int[] iArr3 = this.d;
        int i4 = iArr[i2];
        iArr[i2] = iArr[i3];
        iArr[i3] = i4;
        int i5 = iArr2[i2];
        iArr2[i2] = iArr2[i3];
        iArr2[i3] = i5;
        iArr3[iArr2[i2]] = i2;
        iArr3[iArr2[i3]] = i3;
    }
}
