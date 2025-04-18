package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbzx {
    private final Object zza = new Object();
    private volatile int zzc = 1;
    private volatile long zzb = 0;

    private zzbzx() {
    }

    public final void zza() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        synchronized (this.zza) {
            if (this.zzc == 3) {
                if (this.zzb + ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfQ)).longValue() <= currentTimeMillis) {
                    this.zzc = 1;
                }
            }
        }
        long currentTimeMillis2 = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        synchronized (this.zza) {
            if (this.zzc != 2) {
                return;
            }
            this.zzc = 3;
            if (this.zzc == 3) {
                this.zzb = currentTimeMillis2;
            }
        }
    }

    public /* synthetic */ zzbzx(zzbzy zzbzyVar) {
    }
}
