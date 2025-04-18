package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbok implements zzcaq {
    final /* synthetic */ zzcao zza;
    final /* synthetic */ zzbno zzb;

    public zzbok(zzbom zzbomVar, zzcao zzcaoVar, zzbno zzbnoVar) {
        this.zza = zzcaoVar;
        this.zzb = zzbnoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise rejected");
        this.zza.zzd(new zzbnx("Unable to obtain a JavascriptEngine."));
        this.zzb.zzb();
    }
}
