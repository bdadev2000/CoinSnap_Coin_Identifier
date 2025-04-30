package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzead;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;

/* loaded from: classes2.dex */
public final class zzaw implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzaw(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzav zzb() {
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        return new zzav(zzggeVar, ((zzead) this.zzb).zzb());
    }
}
