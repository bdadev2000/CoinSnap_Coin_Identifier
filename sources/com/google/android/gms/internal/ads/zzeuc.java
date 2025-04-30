package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzeuc implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzeuc(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzewe(((zzexu) this.zza).zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzma)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
