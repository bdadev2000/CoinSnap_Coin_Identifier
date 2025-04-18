package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class zzij implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ zzic zzb;

    public zzij(zzic zzicVar, zzo zzoVar) {
        this.zza = zzoVar;
        this.zzb = zzicVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznv zznvVar;
        zznv zznvVar2;
        zznvVar = this.zzb.zza;
        zznvVar.zzr();
        zznvVar2 = this.zzb.zza;
        zzo zzoVar = this.zza;
        zznvVar2.zzl().zzt();
        zznvVar2.zzs();
        Preconditions.checkNotEmpty(zzoVar.zza);
        zznvVar2.zza(zzoVar);
    }
}
