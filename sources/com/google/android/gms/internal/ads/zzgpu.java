package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class zzgpu {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgpu(Class cls, Class cls2, zzgpt zzgptVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgpu zzb(zzgps zzgpsVar, Class cls, Class cls2) {
        return new zzgpr(cls, cls2, zzgpsVar);
    }

    public abstract zzgqq zza(zzghx zzghxVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
