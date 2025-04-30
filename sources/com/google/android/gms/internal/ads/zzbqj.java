package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbqj implements zzccp {
    final /* synthetic */ zzccn zza;
    final /* synthetic */ zzbpn zzb;

    public zzbqj(zzbql zzbqlVar, zzccn zzccnVar, zzbpn zzbpnVar) {
        this.zza = zzccnVar;
        this.zzb = zzbpnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise rejected");
        this.zza.zzd(new zzbpw("Unable to obtain a JavascriptEngine."));
        this.zzb.zzb();
    }
}
