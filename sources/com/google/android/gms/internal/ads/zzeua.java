package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzeua implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzeua(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzewe(((zzexj) this.zza).zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzmc)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
