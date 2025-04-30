package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzcyv {
    private final Context zza;
    private final zzfho zzb;
    private final Bundle zzc;

    @Nullable
    private final zzfhg zzd;

    @Nullable
    private final zzcyn zze;

    @Nullable
    private final zzehq zzf;

    public /* synthetic */ zzcyv(zzcyt zzcytVar, zzcyu zzcyuVar) {
        this.zza = zzcyt.zza(zzcytVar);
        this.zzb = zzcyt.zzm(zzcytVar);
        this.zzc = zzcyt.zzb(zzcytVar);
        this.zzd = zzcyt.zzl(zzcytVar);
        this.zze = zzcyt.zzc(zzcytVar);
        this.zzf = zzcyt.zzk(zzcytVar);
    }

    public final Context zza(Context context) {
        return this.zza;
    }

    @Nullable
    public final Bundle zzb() {
        return this.zzc;
    }

    @Nullable
    public final zzcyn zzc() {
        return this.zze;
    }

    public final zzcyt zzd() {
        zzcyt zzcytVar = new zzcyt();
        zzcytVar.zze(this.zza);
        zzcytVar.zzi(this.zzb);
        zzcytVar.zzf(this.zzc);
        zzcytVar.zzg(this.zze);
        zzcytVar.zzd(this.zzf);
        return zzcytVar;
    }

    public final zzehq zze(String str) {
        zzehq zzehqVar = this.zzf;
        if (zzehqVar != null) {
            return zzehqVar;
        }
        return new zzehq(str);
    }

    @Nullable
    public final zzfhg zzf() {
        return this.zzd;
    }

    public final zzfho zzg() {
        return this.zzb;
    }
}
