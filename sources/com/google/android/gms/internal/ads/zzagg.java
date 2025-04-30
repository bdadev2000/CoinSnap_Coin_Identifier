package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
abstract class zzagg {
    protected final zzafa zza;

    public zzagg(zzafa zzafaVar) {
        this.zza = zzafaVar;
    }

    public abstract boolean zza(zzfu zzfuVar) throws zzch;

    public abstract boolean zzb(zzfu zzfuVar, long j7) throws zzch;

    public final boolean zzf(zzfu zzfuVar, long j7) throws zzch {
        if (zza(zzfuVar) && zzb(zzfuVar, j7)) {
            return true;
        }
        return false;
    }
}
