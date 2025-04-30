package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzzn {
    public final int zza;
    public final zzmq[] zzb;
    public final zzzg[] zzc;
    public final zzdp zzd;

    @Nullable
    public final Object zze;

    public zzzn(zzmq[] zzmqVarArr, zzzg[] zzzgVarArr, zzdp zzdpVar, @Nullable Object obj) {
        this.zzb = zzmqVarArr;
        this.zzc = (zzzg[]) zzzgVarArr.clone();
        this.zzd = zzdpVar;
        this.zze = obj;
        this.zza = zzmqVarArr.length;
    }

    public final boolean zza(@Nullable zzzn zzznVar, int i9) {
        if (zzznVar == null || !zzgd.zzG(this.zzb[i9], zzznVar.zzb[i9]) || !zzgd.zzG(this.zzc[i9], zzznVar.zzc[i9])) {
            return false;
        }
        return true;
    }

    public final boolean zzb(int i9) {
        if (this.zzb[i9] != null) {
            return true;
        }
        return false;
    }
}
