package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes12.dex */
final class zziu implements Runnable {
    private final /* synthetic */ zzbf zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ zzic zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziu(zzic zzicVar, zzbf zzbfVar, zzo zzoVar) {
        this.zza = zzbfVar;
        this.zzb = zzoVar;
        this.zzc = zzicVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzc(this.zzc.zzb(this.zza, this.zzb), this.zzb);
    }
}
