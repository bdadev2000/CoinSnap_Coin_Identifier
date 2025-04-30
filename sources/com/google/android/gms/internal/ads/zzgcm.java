package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes2.dex */
public final class zzgcm {
    public static Object zza(Object obj, int i9) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(o.h(i9, "at index "));
    }

    public static Object[] zzb(Object[] objArr, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            zza(objArr[i10], i10);
        }
        return objArr;
    }
}
