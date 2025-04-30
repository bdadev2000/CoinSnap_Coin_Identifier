package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public final class zzedr implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;
    private final zzhlg zzf;
    private final zzhlg zzg;
    private final zzhlg zzh;

    public zzedr(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4, zzhlg zzhlgVar5, zzhlg zzhlgVar6, zzhlg zzhlgVar7, zzhlg zzhlgVar8) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
        this.zzd = zzhlgVar4;
        this.zze = zzhlgVar5;
        this.zzf = zzhlgVar6;
        this.zzg = zzhlgVar7;
        this.zzh = zzhlgVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* synthetic */ Object zzb() {
        Context zza = ((zzcjj) this.zza).zza();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        return new zzedq(zza, zzggeVar, new zzbyd(), ((zzcjs) this.zzd).zzb(), ((zzeej) this.zze).zzb(), (ArrayDeque) this.zzf.zzb(), new zzeef(), (zzfmq) this.zzh.zzb());
    }
}
