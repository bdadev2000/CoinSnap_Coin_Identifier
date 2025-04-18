package androidx.compose.ui.node;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class IntStack {

    /* renamed from: a, reason: collision with root package name */
    public int[] f15926a;

    /* renamed from: b, reason: collision with root package name */
    public int f15927b;

    public IntStack(int i2) {
        this.f15926a = new int[i2];
    }

    public final void a(int i2, int i3, int i4) {
        int i5 = this.f15927b;
        int i6 = i5 + 3;
        int[] iArr = this.f15926a;
        if (i6 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            p0.a.r(copyOf, "copyOf(this, newSize)");
            this.f15926a = copyOf;
        }
        int[] iArr2 = this.f15926a;
        iArr2[i5] = i2 + i4;
        iArr2[i5 + 1] = i3 + i4;
        iArr2[i5 + 2] = i4;
        this.f15927b = i6;
    }

    public final void b(int i2, int i3, int i4, int i5) {
        int i6 = this.f15927b;
        int i7 = i6 + 4;
        int[] iArr = this.f15926a;
        if (i7 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            p0.a.r(copyOf, "copyOf(this, newSize)");
            this.f15926a = copyOf;
        }
        int[] iArr2 = this.f15926a;
        iArr2[i6] = i2;
        iArr2[i6 + 1] = i3;
        iArr2[i6 + 2] = i4;
        iArr2[i6 + 3] = i5;
        this.f15927b = i7;
    }

    public final void c(int i2, int i3) {
        if (i2 < i3) {
            int i4 = i2 - 3;
            for (int i5 = i2; i5 < i3; i5 += 3) {
                int[] iArr = this.f15926a;
                int i6 = iArr[i5];
                int i7 = iArr[i3];
                if (i6 < i7 || (i6 == i7 && iArr[i5 + 1] <= iArr[i3 + 1])) {
                    i4 += 3;
                    d(i4, i5);
                }
            }
            d(i4 + 3, i3);
            c(i2, i4);
            c(i4 + 6, i3);
        }
    }

    public final void d(int i2, int i3) {
        int[] iArr = this.f15926a;
        int i4 = iArr[i2];
        iArr[i2] = iArr[i3];
        iArr[i3] = i4;
        int i5 = i2 + 1;
        int i6 = i3 + 1;
        int i7 = iArr[i5];
        iArr[i5] = iArr[i6];
        iArr[i6] = i7;
        int i8 = i2 + 2;
        int i9 = i3 + 2;
        int i10 = iArr[i8];
        iArr[i8] = iArr[i9];
        iArr[i9] = i10;
    }
}
