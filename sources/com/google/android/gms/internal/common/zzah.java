package com.google.android.gms.internal.common;

import com.mbridge.msdk.foundation.entity.o;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes2.dex */
public final class zzah {
    public static Object[] zza(Object[] objArr, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(o.h(i10, "at index "));
            }
        }
        return objArr;
    }
}
