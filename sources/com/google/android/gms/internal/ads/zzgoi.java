package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class zzgoi {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgoi(Class cls, Class cls2, zzgoh zzgohVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgoi zzb(zzgog zzgogVar, Class cls, Class cls2) {
        return new zzgof(cls, cls2, zzgogVar);
    }

    public abstract zzgpb zza(zzggj zzggjVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
