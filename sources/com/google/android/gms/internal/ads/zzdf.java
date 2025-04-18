package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdf {
    private boolean zza;

    public zzdf() {
        throw null;
    }

    public zzdf(zzdc zzdcVar) {
    }

    public final synchronized void zza() throws InterruptedException {
        while (!this.zza) {
            wait();
        }
    }

    public final synchronized void zzb() {
        boolean z10 = false;
        while (!this.zza) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean zzc() {
        boolean z10;
        z10 = this.zza;
        this.zza = false;
        return z10;
    }

    public final synchronized boolean zzd() {
        return this.zza;
    }

    public final synchronized boolean zze() {
        if (this.zza) {
            return false;
        }
        this.zza = true;
        notifyAll();
        return true;
    }
}
