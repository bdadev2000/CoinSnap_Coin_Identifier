package com.google.android.gms.internal.common;

import eb.j;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes3.dex */
public final class zzah {
    public static Object[] zza(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(j.i("at index ", i11));
            }
        }
        return objArr;
    }
}
