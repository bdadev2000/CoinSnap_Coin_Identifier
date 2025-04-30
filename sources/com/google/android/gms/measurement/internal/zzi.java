package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzi implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdg zza;
    private final /* synthetic */ AppMeasurementDynamiteService zzb;

    public zzi(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzdg zzdgVar) {
        this.zza = zzdgVar;
        this.zzb = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzr().zza(this.zza);
    }
}
