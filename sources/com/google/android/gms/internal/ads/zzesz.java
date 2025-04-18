package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzesz implements zzevz {
    private final Context zza;
    private final zzges zzb;

    public zzesz(zzges zzgesVar, Context context) {
        this.zzb = zzgesVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 57;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesz.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeta zzc() throws Exception {
        com.google.android.gms.ads.internal.zzv.zzq();
        return new zzeta(com.google.android.gms.ads.internal.util.zzs.zzs(this.zza));
    }
}
