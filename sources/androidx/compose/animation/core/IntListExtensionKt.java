package androidx.compose.animation.core;

import androidx.collection.IntList;

/* loaded from: classes2.dex */
public final class IntListExtensionKt {
    public static int a(IntList intList, int i2) {
        int i3 = intList.f1434b;
        int i4 = 0;
        if (i3 < 0) {
            throw new IllegalArgumentException("fromIndex(0) > toIndex(" + i3 + ')');
        }
        int i5 = i3 - 1;
        while (i4 <= i5) {
            int i6 = (i4 + i5) >>> 1;
            int a2 = intList.a(i6);
            if (a2 < i2) {
                i4 = i6 + 1;
            } else {
                if (a2 <= i2) {
                    return i6;
                }
                i5 = i6 - 1;
            }
        }
        return -(i4 + 1);
    }
}
