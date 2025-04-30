package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class zzig implements Callable<List<zznq>> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzhn zzb;

    public zzig(zzhn zzhnVar, String str) {
        this.zza = str;
        this.zzb = zzhnVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zznq> call() throws Exception {
        zznc zzncVar;
        zznc zzncVar2;
        zzncVar = this.zzb.zza;
        zzncVar.zzr();
        zzncVar2 = this.zzb.zza;
        return zzncVar2.zzf().zzk(this.zza);
    }
}
