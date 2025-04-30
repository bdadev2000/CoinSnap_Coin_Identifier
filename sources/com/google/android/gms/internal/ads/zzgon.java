package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class zzgon {
    private final zzgze zza;
    private final Class zzb;

    public /* synthetic */ zzgon(zzgze zzgzeVar, Class cls, zzgom zzgomVar) {
        this.zza = zzgzeVar;
        this.zzb = cls;
    }

    public static zzgon zzb(zzgol zzgolVar, zzgze zzgzeVar, Class cls) {
        return new zzgok(zzgzeVar, cls, zzgolVar);
    }

    public abstract zzghi zza(zzgqq zzgqqVar, zzgic zzgicVar) throws GeneralSecurityException;

    public final zzgze zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
