package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzdod implements zzhkp {
    private final zzdnw zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzdod(zzdnw zzdnwVar, zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzdnwVar;
        this.zzb = zzhlgVar;
        this.zzc = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdha(((zzdrd) this.zzb).zzb(), (Executor) this.zzc.zzb());
    }
}
