package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkh implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ Object zzc;
    private final /* synthetic */ long zzd;
    private final /* synthetic */ zzjq zze;

    public zzkh(zzjq zzjqVar, String str, String str2, Object obj, long j3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = j3;
        this.zze = zzjqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zza(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
