package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class zzgpy {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgpy(Class cls, Class cls2, zzgpx zzgpxVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgpy zzb(zzgpw zzgpwVar, Class cls, Class cls2) {
        return new zzgpv(cls, cls2, zzgpwVar);
    }

    public abstract Object zza(zzghi zzghiVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
