package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class zzif implements Callable<byte[]> {
    private final /* synthetic */ zzbd zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzhn zzc;

    public zzif(zzhn zzhnVar, zzbd zzbdVar, String str) {
        this.zza = zzbdVar;
        this.zzb = str;
        this.zzc = zzhnVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() throws Exception {
        zznc zzncVar;
        zznc zzncVar2;
        zzncVar = this.zzc.zza;
        zzncVar.zzr();
        zzncVar2 = this.zzc.zza;
        return zzncVar2.zzm().zza(this.zza, this.zzb);
    }
}
