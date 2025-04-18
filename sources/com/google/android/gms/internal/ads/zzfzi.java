package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public abstract class zzfzi {
    public static int zze(int i10, int i11) {
        if (i11 >= 0) {
            if (i11 <= i10) {
                return i10;
            }
            int i12 = i10 + (i10 >> 1) + 1;
            if (i12 < i11) {
                int highestOneBit = Integer.highestOneBit(i11 - 1);
                i12 = highestOneBit + highestOneBit;
            }
            if (i12 < 0) {
                return Integer.MAX_VALUE;
            }
            return i12;
        }
        throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
    }

    public abstract zzfzi zzb(Object obj);
}
