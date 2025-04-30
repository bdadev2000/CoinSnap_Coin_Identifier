package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class zzia implements Callable<zzaj> {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ zzhn zzb;

    public zzia(zzhn zzhnVar, zzo zzoVar) {
        this.zza = zzoVar;
        this.zzb = zzhnVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ zzaj call() throws Exception {
        zznc zzncVar;
        zznc zzncVar2;
        zzncVar = this.zzb.zza;
        zzncVar.zzr();
        zzncVar2 = this.zzb.zza;
        return new zzaj(zzncVar2.zza(this.zza.zza));
    }
}
