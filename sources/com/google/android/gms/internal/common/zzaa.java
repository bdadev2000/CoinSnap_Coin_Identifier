package com.google.android.gms.internal.common;

import java.util.Arrays;

/* loaded from: classes2.dex */
class zzaa extends zzab {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzaa(int i9) {
    }

    public final zzaa zza(Object obj) {
        obj.getClass();
        int i9 = this.zzb;
        int i10 = i9 + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i10) {
            int i11 = length + (length >> 1) + 1;
            if (i11 < i10) {
                int highestOneBit = Integer.highestOneBit(i9);
                i11 = highestOneBit + highestOneBit;
            }
            if (i11 < 0) {
                i11 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(objArr, i11);
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i12 = this.zzb;
        this.zzb = i12 + 1;
        objArr2[i12] = obj;
        return this;
    }
}
