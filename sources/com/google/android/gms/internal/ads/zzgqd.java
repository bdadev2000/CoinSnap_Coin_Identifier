package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class zzgqd {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgqd(Class cls, Class cls2, zzgqc zzgqcVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgqd zzb(zzgqb zzgqbVar, Class cls, Class cls2) {
        return new zzgqa(cls, cls2, zzgqbVar);
    }

    public abstract Object zza(zzghd zzghdVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
