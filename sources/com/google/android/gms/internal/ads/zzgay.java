package com.google.android.gms.internal.ads;

import eb.j;

/* loaded from: classes3.dex */
public final class zzgay {
    public static Object zza(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(j.i("at index ", i10));
    }

    public static Object[] zzb(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            zza(objArr[i11], i11);
        }
        return objArr;
    }
}
