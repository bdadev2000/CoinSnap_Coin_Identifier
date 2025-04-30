package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzelp implements zzhkp {
    private final zzelo zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;

    public zzelp(zzelo zzeloVar, zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4) {
        this.zza = zzeloVar;
        this.zzb = zzhlgVar;
        this.zzc = zzhlgVar2;
        this.zzd = zzhlgVar3;
        this.zze = zzhlgVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* synthetic */ Object zzb() {
        return this.zza.zza((Clock) this.zzb.zzb(), ((zzeli) this.zzc).zzb(), (zzehq) this.zzd.zzb(), (zzfoe) this.zze.zzb());
    }
}
