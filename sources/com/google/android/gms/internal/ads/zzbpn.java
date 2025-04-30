package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbpn extends zzccu {
    private final Object zza = new Object();
    private final zzbps zzb;
    private boolean zzc;

    public zzbpn(zzbps zzbpsVar) {
        this.zzb = zzbpsVar;
    }

    public final void zzb() {
        com.google.android.gms.ads.internal.util.zze.zza("release: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock acquired");
                if (this.zzc) {
                    com.google.android.gms.ads.internal.util.zze.zza("release: Lock already released");
                    return;
                }
                this.zzc = true;
                zzj(new zzbpk(this), new zzccq());
                zzj(new zzbpl(this), new zzbpm(this));
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
