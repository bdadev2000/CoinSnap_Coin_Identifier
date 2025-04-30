package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcjj;
import com.google.android.gms.internal.ads.zzdvh;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;

/* loaded from: classes2.dex */
public final class zzh implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzh(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzcjj) this.zza).zza();
        zzdvh zzdvhVar = (zzdvh) this.zzb.zzb();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        return new zze(zza, zzdvhVar, zzggeVar);
    }
}
