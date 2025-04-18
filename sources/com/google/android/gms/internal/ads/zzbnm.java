package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbnm implements zzcas {
    final /* synthetic */ zzbno zza;

    public zzbnm(zzbno zzbnoVar) {
        this.zza = zzbnoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbnt zzbntVar;
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        zzbntVar = this.zza.zzb;
        zzbntVar.zzd();
    }
}
