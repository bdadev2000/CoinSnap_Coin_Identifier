package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzecy implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzecy(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzecx zzb() {
        return new zzecx(((zzcjj) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
