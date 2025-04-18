package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;

/* loaded from: classes3.dex */
public final class IntervalListKt {
    public static final int a(int i2, MutableVector mutableVector) {
        int i3 = mutableVector.f14144c - 1;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = ((i3 - i4) / 2) + i4;
            Object[] objArr = mutableVector.f14142a;
            int i6 = ((IntervalList.Interval) objArr[i5]).f4657a;
            if (i6 != i2) {
                if (i6 < i2) {
                    i4 = i5 + 1;
                    if (i2 < ((IntervalList.Interval) objArr[i4]).f4657a) {
                    }
                } else {
                    i3 = i5 - 1;
                }
            }
            return i5;
        }
        return i4;
    }
}
