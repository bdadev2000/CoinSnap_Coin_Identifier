package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class zzgpv {
    private final zzgyx zza;
    private final Class zzb;

    public /* synthetic */ zzgpv(zzgyx zzgyxVar, Class cls, zzgpu zzgpuVar) {
        this.zza = zzgyxVar;
        this.zzb = cls;
    }

    public static zzgpv zzb(zzgpt zzgptVar, zzgyx zzgyxVar, Class cls) {
        return new zzgps(zzgyxVar, cls, zzgptVar);
    }

    public abstract zzghs zza(zzgqw zzgqwVar) throws GeneralSecurityException;

    public final zzgyx zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
