package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdm {
    private boolean zza;

    public zzdm() {
        throw null;
    }

    public zzdm(zzdj zzdjVar) {
    }

    public final synchronized void zza() throws InterruptedException {
        while (!this.zza) {
            wait();
        }
    }

    public final synchronized void zzb() {
        boolean z2 = false;
        while (!this.zza) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z2 = true;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean zzc() {
        boolean z2;
        z2 = this.zza;
        this.zza = false;
        return z2;
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
