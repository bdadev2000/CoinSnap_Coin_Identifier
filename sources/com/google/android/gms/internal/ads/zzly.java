package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes3.dex */
public final class zzly {
    private final zzz zza;
    private final SparseArray zzb;

    public zzly(zzz zzzVar, SparseArray sparseArray) {
        this.zza = zzzVar;
        SparseArray sparseArray2 = new SparseArray(zzzVar.zzb());
        for (int i10 = 0; i10 < zzzVar.zzb(); i10++) {
            int zza = zzzVar.zza(i10);
            zzlx zzlxVar = (zzlx) sparseArray.get(zza);
            zzlxVar.getClass();
            sparseArray2.append(zza, zzlxVar);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i10) {
        return this.zza.zza(i10);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzlx zzc(int i10) {
        zzlx zzlxVar = (zzlx) this.zzb.get(i10);
        zzlxVar.getClass();
        return zzlxVar;
    }

    public final boolean zzd(int i10) {
        return this.zza.zzc(i10);
    }
}
