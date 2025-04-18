package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class zzgoe {
    private final zzgwu zza;
    private final Class zzb;

    public /* synthetic */ zzgoe(zzgwu zzgwuVar, Class cls, zzgod zzgodVar) {
        this.zza = zzgwuVar;
        this.zzb = cls;
    }

    public static zzgoe zzb(zzgoc zzgocVar, zzgwu zzgwuVar, Class cls) {
        return new zzgob(zzgwuVar, cls, zzgocVar);
    }

    public abstract zzggj zza(zzgpb zzgpbVar) throws GeneralSecurityException;

    public final zzgwu zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
