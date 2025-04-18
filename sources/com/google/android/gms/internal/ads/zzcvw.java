package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzcvw {
    private final Context zza;
    private final zzffo zzb;
    private final Bundle zzc;

    @Nullable
    private final zzffg zzd;

    @Nullable
    private final zzcvo zze;

    @Nullable
    private final zzefg zzf;

    public /* synthetic */ zzcvw(zzcvu zzcvuVar, zzcvv zzcvvVar) {
        this.zza = zzcvu.zza(zzcvuVar);
        this.zzb = zzcvu.zzm(zzcvuVar);
        this.zzc = zzcvu.zzb(zzcvuVar);
        this.zzd = zzcvu.zzl(zzcvuVar);
        this.zze = zzcvu.zzc(zzcvuVar);
        this.zzf = zzcvu.zzk(zzcvuVar);
    }

    public final Context zza(Context context) {
        return this.zza;
    }

    @Nullable
    public final Bundle zzb() {
        return this.zzc;
    }

    @Nullable
    public final zzcvo zzc() {
        return this.zze;
    }

    public final zzcvu zzd() {
        zzcvu zzcvuVar = new zzcvu();
        zzcvuVar.zze(this.zza);
        zzcvuVar.zzi(this.zzb);
        zzcvuVar.zzf(this.zzc);
        zzcvuVar.zzg(this.zze);
        zzcvuVar.zzd(this.zzf);
        return zzcvuVar;
    }

    public final zzefg zze(String str) {
        zzefg zzefgVar = this.zzf;
        return zzefgVar != null ? zzefgVar : new zzefg(str);
    }

    @Nullable
    public final zzffg zzf() {
        return this.zzd;
    }

    public final zzffo zzg() {
        return this.zzb;
    }
}
