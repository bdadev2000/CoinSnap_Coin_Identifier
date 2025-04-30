package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes2.dex */
public final class zzmz {
    private final zzah zza;
    private final SparseArray zzb;

    public zzmz(zzah zzahVar, SparseArray sparseArray) {
        this.zza = zzahVar;
        SparseArray sparseArray2 = new SparseArray(zzahVar.zzb());
        for (int i9 = 0; i9 < zzahVar.zzb(); i9++) {
            int zza = zzahVar.zza(i9);
            zzmy zzmyVar = (zzmy) sparseArray.get(zza);
            zzmyVar.getClass();
            sparseArray2.append(zza, zzmyVar);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i9) {
        return this.zza.zza(i9);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzmy zzc(int i9) {
        zzmy zzmyVar = (zzmy) this.zzb.get(i9);
        zzmyVar.getClass();
        return zzmyVar;
    }

    public final boolean zzd(int i9) {
        return this.zza.zzc(i9);
    }
}
