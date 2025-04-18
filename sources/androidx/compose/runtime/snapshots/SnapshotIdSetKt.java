package androidx.compose.runtime.snapshots;

/* loaded from: classes.dex */
public final class SnapshotIdSetKt {
    public static final int a(int i2, int[] iArr) {
        int length = iArr.length - 1;
        int i3 = 0;
        while (i3 <= length) {
            int i4 = (i3 + length) >>> 1;
            int i5 = iArr[i4];
            if (i2 > i5) {
                i3 = i4 + 1;
            } else {
                if (i2 >= i5) {
                    return i4;
                }
                length = i4 - 1;
            }
        }
        return -(i3 + 1);
    }
}
