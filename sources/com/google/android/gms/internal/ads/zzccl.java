package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzccl implements Runnable {
    private final zzcbx zza;
    private boolean zzb = false;

    public zzccl(zzcbx zzcbxVar) {
        this.zza = zzcbxVar;
    }

    private final void zzc() {
        zzfun zzfunVar = com.google.android.gms.ads.internal.util.zzt.zza;
        zzfunVar.removeCallbacks(this);
        zzfunVar.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzt();
        zzc();
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
