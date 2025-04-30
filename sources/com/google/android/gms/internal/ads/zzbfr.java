package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzbfr implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzbfr(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbfq zzb() {
        return new zzbfq((ScheduledExecutorService) this.zza.zzb(), (com.google.android.gms.ads.nonagon.signalgeneration.zze) this.zzb.zzb());
    }
}
