package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzdja implements zzhkp {
    private final zzdik zza;
    private final zzhlg zzb;

    public zzdja(zzdik zzdikVar, zzhlg zzhlgVar) {
        this.zza = zzdikVar;
        this.zzb = zzhlgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzd((Executor) this.zzb.zzb());
    }
}
