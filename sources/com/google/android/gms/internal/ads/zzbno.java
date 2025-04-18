package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzbno extends zzcav {
    private final Object zza = new Object();
    private final zzbnt zzb;
    private boolean zzc;

    public zzbno(zzbnt zzbntVar) {
        this.zzb = zzbntVar;
    }

    public final void zzb() {
        com.google.android.gms.ads.internal.util.zze.zza("release: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("release: Lock acquired");
            if (this.zzc) {
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock already released");
                return;
            }
            this.zzc = true;
            zzj(new zzbnl(this), new zzcar());
            zzj(new zzbnm(this), new zzbnn(this));
            com.google.android.gms.ads.internal.util.zze.zza("release: Lock released");
        }
    }
}
