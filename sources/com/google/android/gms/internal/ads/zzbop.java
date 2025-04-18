package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzbop implements zzcau {
    final /* synthetic */ zzcas zza;
    final /* synthetic */ zzbnt zzb;

    public zzbop(zzbor zzborVar, zzcas zzcasVar, zzbnt zzbntVar) {
        this.zza = zzcasVar;
        this.zzb = zzbntVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise rejected");
        this.zza.zzd(new zzboc("Unable to obtain a JavascriptEngine."));
        this.zzb.zzb();
    }
}
