package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class zzgoi {
    private final zzgyx zza;
    private final Class zzb;

    public /* synthetic */ zzgoi(zzgyx zzgyxVar, Class cls, zzgoh zzgohVar) {
        this.zza = zzgyxVar;
        this.zzb = cls;
    }

    public static zzgoi zzb(zzgog zzgogVar, zzgyx zzgyxVar, Class cls) {
        return new zzgof(zzgyxVar, cls, zzgogVar);
    }

    public abstract zzghd zza(zzgqw zzgqwVar, zzghw zzghwVar) throws GeneralSecurityException;

    public final zzgyx zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
