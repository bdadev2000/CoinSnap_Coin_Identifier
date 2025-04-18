package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public abstract class zzfjj {
    private static final ua.b zza = zzgei.zzh(null);
    private final zzges zzb;
    private final ScheduledExecutorService zzc;
    private final zzfjk zzd;

    public zzfjj(zzges zzgesVar, ScheduledExecutorService scheduledExecutorService, zzfjk zzfjkVar) {
        this.zzb = zzgesVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfjkVar;
    }

    public final zzfiz zza(Object obj, ua.b... bVarArr) {
        return new zzfiz(this, obj, Arrays.asList(bVarArr), null);
    }

    public final zzfjh zzb(Object obj, ua.b bVar) {
        return new zzfjh(this, obj, bVar, Collections.singletonList(bVar), bVar);
    }

    public abstract String zzf(Object obj);
}
