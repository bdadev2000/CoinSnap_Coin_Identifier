package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
abstract class zzafb {
    protected final zzadx zza;

    public zzafb(zzadx zzadxVar) {
        this.zza = zzadxVar;
    }

    public abstract boolean zza(zzed zzedVar) throws zzbh;

    public abstract boolean zzb(zzed zzedVar, long j3) throws zzbh;

    public final boolean zzf(zzed zzedVar, long j3) throws zzbh {
        return zza(zzedVar) && zzb(zzedVar, j3);
    }
}
