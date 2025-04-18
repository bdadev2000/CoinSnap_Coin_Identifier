package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzcsg {
    private final zzfff zza;
    private final zzfet zzb;
    private final String zzc;

    public zzcsg(zzfff zzfffVar, zzfet zzfetVar, @Nullable String str) {
        this.zza = zzfffVar;
        this.zzb = zzfetVar;
        this.zzc = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public final zzfet zza() {
        return this.zzb;
    }

    public final zzfew zzb() {
        return this.zza.zzb.zzb;
    }

    public final zzfff zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzc;
    }
}
