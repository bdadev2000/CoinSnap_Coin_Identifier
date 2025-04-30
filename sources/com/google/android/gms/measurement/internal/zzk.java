package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzk implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdg zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ boolean zzd;
    private final /* synthetic */ AppMeasurementDynamiteService zze;

    public zzk(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzdg zzdgVar, String str, String str2, boolean z8) {
        this.zza = zzdgVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = z8;
        this.zze = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zza.zzr().zza(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
