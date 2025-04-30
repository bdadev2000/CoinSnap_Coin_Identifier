package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzceg implements Runnable {
    private final zzcds zza;
    private boolean zzb = false;

    public zzceg(zzcds zzcdsVar) {
        this.zza = zzcdsVar;
    }

    private final void zzc() {
        zzfuv zzfuvVar = com.google.android.gms.ads.internal.util.zzt.zza;
        zzfuvVar.removeCallbacks(this);
        zzfuvVar.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.zzb) {
            this.zza.zzt();
            zzc();
        }
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzt();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
