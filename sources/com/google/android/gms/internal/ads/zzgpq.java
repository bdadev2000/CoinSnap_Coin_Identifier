package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class zzgpq {
    private final zzgze zza;
    private final Class zzb;

    public /* synthetic */ zzgpq(zzgze zzgzeVar, Class cls, zzgpp zzgppVar) {
        this.zza = zzgzeVar;
        this.zzb = cls;
    }

    public static zzgpq zzb(zzgpo zzgpoVar, zzgze zzgzeVar, Class cls) {
        return new zzgpn(zzgzeVar, cls, zzgpoVar);
    }

    public abstract zzghx zza(zzgqq zzgqqVar) throws GeneralSecurityException;

    public final zzgze zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
