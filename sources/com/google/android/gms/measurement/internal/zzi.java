package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzi implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdo zza;
    private final /* synthetic */ AppMeasurementDynamiteService zzb;

    public zzi(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzdo zzdoVar) {
        this.zza = zzdoVar;
        this.zzb = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzr().zza(this.zza);
    }
}
