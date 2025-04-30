package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class zzgaw {
    public static int zze(int i9, int i10) {
        int i11 = i9 + (i9 >> 1) + 1;
        if (i11 < i10) {
            int highestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = highestOneBit + highestOneBit;
        }
        if (i11 < 0) {
            return Integer.MAX_VALUE;
        }
        return i11;
    }

    public abstract zzgaw zzb(Object obj);
}
