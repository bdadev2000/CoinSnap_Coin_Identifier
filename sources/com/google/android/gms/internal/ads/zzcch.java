package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcch implements Runnable {
    private final zzcbt zza;
    private boolean zzb = false;

    public zzcch(zzcbt zzcbtVar) {
        this.zza = zzcbtVar;
    }

    private final void zzc() {
        zzftd zzftdVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzftdVar.removeCallbacks(this);
        zzftdVar.postDelayed(this, 250L);
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
