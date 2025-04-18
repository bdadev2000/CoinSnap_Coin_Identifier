package androidx.compose.foundation.lazy.staggeredgrid;

/* loaded from: classes3.dex */
public final class LazyStaggeredGridCellsKt {
    public static final int[] a(int i2, int i3, int i4) {
        int i5;
        int i6 = i2 - ((i3 - 1) * i4);
        int i7 = i6 / i3;
        int i8 = i6 % i3;
        int[] iArr = new int[i3];
        int i9 = 0;
        while (i9 < i3) {
            if (i7 < 0) {
                i5 = 0;
            } else {
                i5 = (i9 < i8 ? 1 : 0) + i7;
            }
            iArr[i9] = i5;
            i9++;
        }
        return iArr;
    }
}
