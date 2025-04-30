package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzcvf {
    private final zzfhf zza;
    private final zzfgt zzb;
    private final String zzc;

    public zzcvf(zzfhf zzfhfVar, zzfgt zzfgtVar, @Nullable String str) {
        this.zza = zzfhfVar;
        this.zzb = zzfgtVar;
        this.zzc = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public final zzfgt zza() {
        return this.zzb;
    }

    public final zzfgw zzb() {
        return this.zza.zzb.zzb;
    }

    public final zzfhf zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzc;
    }
}
