package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@22.1.2 */
/* loaded from: classes12.dex */
final class zzi implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdo zza;
    private final /* synthetic */ AppMeasurementDynamiteService zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzi(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzdo zzdoVar) {
        this.zza = zzdoVar;
        this.zzb = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzr().zza(this.zza);
    }
}
