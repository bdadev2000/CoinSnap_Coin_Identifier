package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes3.dex */
public final class zzmc {
    private final zzab zza;
    private final SparseArray zzb;

    public zzmc(zzab zzabVar, SparseArray sparseArray) {
        this.zza = zzabVar;
        SparseArray sparseArray2 = new SparseArray(zzabVar.zzb());
        for (int i2 = 0; i2 < zzabVar.zzb(); i2++) {
            int zza = zzabVar.zza(i2);
            zzmb zzmbVar = (zzmb) sparseArray.get(zza);
            zzmbVar.getClass();
            sparseArray2.append(zza, zzmbVar);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i2) {
        return this.zza.zza(i2);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzmb zzc(int i2) {
        zzmb zzmbVar = (zzmb) this.zzb.get(i2);
        zzmbVar.getClass();
        return zzmbVar;
    }

    public final boolean zzd(int i2) {
        return this.zza.zzc(i2);
    }
}
