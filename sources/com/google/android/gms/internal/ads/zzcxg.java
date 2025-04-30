package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcxg implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzcxg(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdha((zzdds) this.zza.zzb(), (Executor) this.zzb.zzb());
    }
}
