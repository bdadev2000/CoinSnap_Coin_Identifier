package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzm implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdg zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ AppMeasurementDynamiteService zzd;

    public zzm(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzdg zzdgVar, String str, String str2) {
        this.zza = zzdgVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zza.zzr().zza(this.zza, this.zzb, this.zzc);
    }
}
