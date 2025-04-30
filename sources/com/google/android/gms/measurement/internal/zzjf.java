package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjf implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ zziv zzb;

    public zzjf(zziv zzivVar, AtomicReference atomicReference) {
        this.zza = atomicReference;
        this.zzb = zzivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza) {
            try {
                try {
                    this.zza.set(Boolean.valueOf(this.zzb.zze().zzi(this.zzb.zzg().zzad())));
                } finally {
                    this.zza.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
