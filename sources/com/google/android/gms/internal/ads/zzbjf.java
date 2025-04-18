package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzbjf implements zzgee {
    final /* synthetic */ zzcfk zza;

    public zzbjf(zzcfk zzcfkVar) {
        this.zza = zzcfkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.zzv.zzp().zzw(th2, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcfk zzcfkVar = this.zza;
        new com.google.android.gms.ads.internal.util.zzbv(zzcfkVar.getContext(), zzcfkVar.zzn().afmaVersion, (String) obj).zzb();
    }
}
