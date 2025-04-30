package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzbld implements zzgfp {
    final /* synthetic */ zzchd zza;

    public zzbld(zzchd zzchdVar) {
        this.zza = zzchdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzchd zzchdVar = this.zza;
        new com.google.android.gms.ads.internal.util.zzca(zzchdVar.getContext(), zzchdVar.zzn().afmaVersion, (String) obj).zzb();
    }
}
