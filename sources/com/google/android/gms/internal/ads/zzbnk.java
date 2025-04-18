package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbnk implements zzcaq {
    final /* synthetic */ zzbnt zza;
    final /* synthetic */ zzfka zzb;
    final /* synthetic */ zzbnu zzc;

    public zzbnk(zzbnu zzbnuVar, zzbnt zzbntVar, zzfka zzfkaVar) {
        this.zza = zzbntVar;
        this.zzb = zzfkaVar;
        this.zzc = zzbnuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zza() {
        Object obj;
        zzfko zzfkoVar;
        zzfko zzfkoVar2;
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        obj = this.zzc.zza;
        synchronized (obj) {
            com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
            this.zzc.zzi = 1;
            com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if (((Boolean) zzbeg.zzd.zze()).booleanValue()) {
                zzbnu zzbnuVar = this.zzc;
                zzfkoVar = zzbnuVar.zze;
                if (zzfkoVar != null) {
                    zzfkoVar2 = zzbnuVar.zze;
                    zzfka zzfkaVar = this.zzb;
                    zzfkaVar.zzc("Failed loading new engine");
                    zzfkaVar.zzg(false);
                    zzfkoVar2.zzb(zzfkaVar.zzm());
                }
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }
}
