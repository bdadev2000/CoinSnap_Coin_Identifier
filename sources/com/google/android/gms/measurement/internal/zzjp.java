package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjp implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ boolean zzb;
    private final /* synthetic */ zziv zzc;

    public zzjp(zziv zzivVar, AtomicReference atomicReference, boolean z8) {
        this.zza = atomicReference;
        this.zzb = z8;
        this.zzc = zzivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzo().zza(this.zza, this.zzb);
    }
}
