package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class zzgmw {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgmw(Class cls, Class cls2, zzgmv zzgmvVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgmw zzb(zzgmu zzgmuVar, Class cls, Class cls2) {
        return new zzgmt(cls, cls2, zzgmuVar);
    }

    public abstract zzgpb zza(zzgfw zzgfwVar, zzggn zzggnVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
