package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final class zzfis implements zzhfx {
    private final zzhgp zza;

    public zzfis(zzhgp zzhgpVar) {
        this.zza = zzhgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        ThreadFactory threadFactory = (ThreadFactory) this.zza.zzb();
        zzftc.zza();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
        zzhgf.zzb(unconfigurableScheduledExecutorService);
        return unconfigurableScheduledExecutorService;
    }
}
