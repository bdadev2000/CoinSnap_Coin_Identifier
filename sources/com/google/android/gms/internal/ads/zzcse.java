package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzcse implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzcse(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdca zzb() {
        return new zzdca((ScheduledExecutorService) this.zza.zzb(), (Clock) this.zzb.zzb());
    }
}
