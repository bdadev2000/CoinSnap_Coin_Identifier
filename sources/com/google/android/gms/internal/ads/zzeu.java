package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzeu {
    private final zzer zza;
    private boolean zzb;

    public zzeu() {
        throw null;
    }

    public final synchronized void zza() throws InterruptedException {
        while (!this.zzb) {
            wait();
        }
    }

    public final synchronized void zzb() {
        boolean z8 = false;
        while (!this.zzb) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z8 = true;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean zzc() {
        boolean z8;
        z8 = this.zzb;
        this.zzb = false;
        return z8;
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized boolean zze() {
        if (this.zzb) {
            return false;
        }
        this.zzb = true;
        notifyAll();
        return true;
    }

    public zzeu(zzer zzerVar) {
        this.zza = zzerVar;
    }
}
