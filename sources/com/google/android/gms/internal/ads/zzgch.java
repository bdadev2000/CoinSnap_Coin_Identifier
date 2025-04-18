package com.google.android.gms.internal.ads;

import android.support.v4.media.d;

/* loaded from: classes4.dex */
public final class zzgch {
    public static Object zza(Object obj, int i2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(d.i("at index ", i2));
    }

    public static Object[] zzb(Object[] objArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            zza(objArr[i3], i3);
        }
        return objArr;
    }
}
