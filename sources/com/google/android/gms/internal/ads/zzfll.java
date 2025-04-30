package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public abstract class zzfll {
    private static final f4.c zza = zzgft.zzh(null);
    private final zzgge zzb;
    private final ScheduledExecutorService zzc;
    private final zzflm zzd;

    public zzfll(zzgge zzggeVar, ScheduledExecutorService scheduledExecutorService, zzflm zzflmVar) {
        this.zzb = zzggeVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzflmVar;
    }

    public final zzflb zza(Object obj, f4.c... cVarArr) {
        return new zzflb(this, obj, Arrays.asList(cVarArr), null);
    }

    public final zzflk zzb(Object obj, f4.c cVar) {
        return new zzflk(this, obj, cVar, Collections.singletonList(cVar), cVar);
    }

    public abstract String zzf(Object obj);
}
