package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzbjk implements zzgfk {
    final /* synthetic */ zzcfo zza;

    public zzbjk(zzcfo zzcfoVar) {
        this.zza = zzcfoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcfo zzcfoVar = this.zza;
        new com.google.android.gms.ads.internal.util.zzbw(zzcfoVar.getContext(), zzcfoVar.zzn().afmaVersion, (String) obj).zzb();
    }
}
