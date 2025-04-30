package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzcal implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzcal(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcak zzb() {
        return new zzcak((Clock) this.zza.zzb(), (zzcai) this.zzb.zzb());
    }
}
