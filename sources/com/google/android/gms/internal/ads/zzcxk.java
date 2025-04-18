package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzcxk {
    private final Context zza;
    private final zzfhc zzb;
    private final Bundle zzc;

    @Nullable
    private final zzfgu zzd;

    @Nullable
    private final zzcxc zze;

    @Nullable
    private final zzegp zzf;

    public /* synthetic */ zzcxk(zzcxi zzcxiVar, zzcxj zzcxjVar) {
        this.zza = zzcxi.zza(zzcxiVar);
        this.zzb = zzcxi.zzm(zzcxiVar);
        this.zzc = zzcxi.zzb(zzcxiVar);
        this.zzd = zzcxi.zzl(zzcxiVar);
        this.zze = zzcxi.zzc(zzcxiVar);
        this.zzf = zzcxi.zzk(zzcxiVar);
    }

    public final Context zza(Context context) {
        return this.zza;
    }

    @Nullable
    public final Bundle zzb() {
        return this.zzc;
    }

    @Nullable
    public final zzcxc zzc() {
        return this.zze;
    }

    public final zzcxi zzd() {
        zzcxi zzcxiVar = new zzcxi();
        zzcxiVar.zze(this.zza);
        zzcxiVar.zzi(this.zzb);
        zzcxiVar.zzf(this.zzc);
        zzcxiVar.zzg(this.zze);
        zzcxiVar.zzd(this.zzf);
        return zzcxiVar;
    }

    public final zzegp zze(String str) {
        zzegp zzegpVar = this.zzf;
        return zzegpVar != null ? zzegpVar : new zzegp(str);
    }

    @Nullable
    public final zzfgu zzf() {
        return this.zzd;
    }

    public final zzfhc zzg() {
        return this.zzb;
    }
}
