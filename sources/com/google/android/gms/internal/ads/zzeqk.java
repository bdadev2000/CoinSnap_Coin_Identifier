package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzeqk implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzeqk(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeqi((Clock) this.zza.zzb(), ((zzczc) this.zzb).zza());
    }
}
