package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbpl implements zzccr {
    final /* synthetic */ zzbpn zza;

    public zzbpl(zzbpn zzbpnVar) {
        this.zza = zzbpnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccr
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbps zzbpsVar;
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        zzbpsVar = this.zza.zzb;
        zzbpsVar.zzd();
    }
}
