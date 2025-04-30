package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzdha;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;

/* loaded from: classes2.dex */
public final class zzas implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzas(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzl zzlVar = (zzl) this.zza.zzb();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        return new zzdha(zzlVar, zzggeVar);
    }
}
