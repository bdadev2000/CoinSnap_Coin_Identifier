package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzeyj implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;
    private final zzhja zzc;
    private final zzhja zzd;
    private final zzhja zze;

    public zzeyj(zzhja zzhjaVar, zzhja zzhjaVar2, zzhja zzhjaVar3, zzhja zzhjaVar4, zzhja zzhjaVar5, zzhja zzhjaVar6, zzhja zzhjaVar7) {
        this.zza = zzhjaVar2;
        this.zzb = zzhjaVar3;
        this.zzc = zzhjaVar5;
        this.zzd = zzhjaVar6;
        this.zze = zzhjaVar7;
    }

    public static zzeyh zza(zzbzu zzbzuVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i2, boolean z2, boolean z3) {
        return new zzeyh(zzbzuVar, context, scheduledExecutorService, executor, i2, z2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeyh(zzcmy.zza(), ((zzchu) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb(), zzfkb.zzc(), ((zzfal) this.zzc).zzb().intValue(), ((zzfam) this.zzd).zzb().booleanValue(), ((zzfao) this.zze).zzb().booleanValue());
    }
}
