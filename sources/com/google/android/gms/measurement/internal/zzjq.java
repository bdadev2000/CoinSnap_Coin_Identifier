package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjq implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ Object zzc;
    private final /* synthetic */ long zzd;
    private final /* synthetic */ zziv zze;

    public zzjq(zziv zzivVar, String str, String str2, Object obj, long j7) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = j7;
        this.zze = zzivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zza(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
