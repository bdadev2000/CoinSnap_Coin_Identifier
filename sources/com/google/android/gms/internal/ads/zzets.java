package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzets implements zzevz {
    private final zzges zza;

    public zzets(zzges zzgesVar) {
        this.zza = zzgesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bundle bundle = new Bundle();
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free", runtime.freeMemory());
                bundle.putLong("runtime_max", runtime.maxMemory());
                bundle.putLong("runtime_total", runtime.totalMemory());
                bundle.putInt("web_view_count", com.google.android.gms.ads.internal.zzv.zzp().zzb());
                return new zzett(bundle);
            }
        });
    }
}
