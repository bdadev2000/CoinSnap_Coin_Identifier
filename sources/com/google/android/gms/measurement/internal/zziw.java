package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class zziw implements Callable<byte[]> {
    private final /* synthetic */ zzbf zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzic zzc;

    public zziw(zzic zzicVar, zzbf zzbfVar, String str) {
        this.zza = zzbfVar;
        this.zzb = str;
        this.zzc = zzicVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() throws Exception {
        zznv zznvVar;
        zznv zznvVar2;
        zznvVar = this.zzc.zza;
        zznvVar.zzr();
        zznvVar2 = this.zzc.zza;
        return zznvVar2.zzm().zza(this.zza, this.zzb);
    }
}
