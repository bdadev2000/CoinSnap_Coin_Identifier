package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbnr implements zzcaw {
    final /* synthetic */ zzbnt zza;

    public zzbnr(zzbnt zzbntVar) {
        this.zza = zzbntVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbny zzbnyVar;
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        zzbnyVar = this.zza.zzb;
        zzbnyVar.zzd();
    }
}
