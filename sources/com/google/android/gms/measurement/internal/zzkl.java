package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkl implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzjq zzb;

    public zzkl(zzjq zzjqVar, long j3) {
        this.zza = j3;
        this.zzb = zzjqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
        this.zzb.zzo().zza(new AtomicReference<>());
    }
}
