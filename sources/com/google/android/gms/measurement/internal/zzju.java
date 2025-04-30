package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzju implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zziv zzb;

    public zzju(zziv zzivVar, long j7) {
        this.zza = j7;
        this.zzb = zzivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
        this.zzb.zzo().zza(new AtomicReference<>());
    }
}
