package com.google.android.gms.common;

import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzd {
    public static int zza(int i10) {
        int[] iArr = {1, 2, 3};
        for (int i11 = 0; i11 < 3; i11++) {
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
