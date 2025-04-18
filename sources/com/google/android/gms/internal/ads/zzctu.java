package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzctu {
    private final zzfgt zza;
    private final zzfgh zzb;
    private final String zzc;

    public zzctu(zzfgt zzfgtVar, zzfgh zzfghVar, @Nullable String str) {
        this.zza = zzfgtVar;
        this.zzb = zzfghVar;
        this.zzc = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public final zzfgh zza() {
        return this.zzb;
    }

    public final zzfgk zzb() {
        return this.zza.zzb.zzb;
    }

    public final zzfgt zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzc;
    }
}
