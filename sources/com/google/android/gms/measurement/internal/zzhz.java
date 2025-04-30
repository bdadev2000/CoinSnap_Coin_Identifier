package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class zzhz implements Callable<List<zzae>> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzhn zzd;

    public zzhz(zzhn zzhnVar, String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzhnVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzae> call() throws Exception {
        zznc zzncVar;
        zznc zzncVar2;
        zzncVar = this.zzd.zza;
        zzncVar.zzr();
        zzncVar2 = this.zzd.zza;
        return zzncVar2.zzf().zza(this.zza, this.zzb, this.zzc);
    }
}
