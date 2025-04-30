package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzdmy implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzdmy(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdmx(((zzdkx) this.zza).zza(), (Clock) this.zzb.zzb());
    }
}
