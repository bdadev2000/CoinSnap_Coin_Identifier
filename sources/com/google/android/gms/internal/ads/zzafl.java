package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class zzafl {
    protected final zzaeh zza;

    public zzafl(zzaeh zzaehVar) {
        this.zza = zzaehVar;
    }

    public abstract boolean zza(zzek zzekVar) throws zzbo;

    public abstract boolean zzb(zzek zzekVar, long j2) throws zzbo;

    public final boolean zzf(zzek zzekVar, long j2) throws zzbo {
        return zza(zzekVar) && zzb(zzekVar, j2);
    }
}
