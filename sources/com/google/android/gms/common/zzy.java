package com.google.android.gms.common;

/* loaded from: classes3.dex */
final class zzy {
    public static int zza(int i10) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i11 = 0; i11 < 6; i11++) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 != 0) {
                if (i13 == i10) {
                    return i12;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }
}
