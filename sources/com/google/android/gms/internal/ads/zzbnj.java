package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbnj implements zzcas {
    final /* synthetic */ zzbnt zza;
    final /* synthetic */ zzfka zzb;
    final /* synthetic */ zzbnu zzc;

    public zzbnj(zzbnu zzbnuVar, zzbnt zzbntVar, zzfka zzfkaVar) {
        this.zza = zzbntVar;
        this.zzb = zzfkaVar;
        this.zzc = zzbnuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Object obj2;
        zzbnt zzbntVar;
        zzfko zzfkoVar;
        zzfko zzfkoVar2;
        zzbnt zzbntVar2;
        zzbnt zzbntVar3;
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock acquired");
            this.zzc.zzi = 0;
            zzbnu zzbnuVar = this.zzc;
            zzbntVar = zzbnuVar.zzh;
            if (zzbntVar != null) {
                zzbnt zzbntVar4 = this.zza;
                zzbntVar2 = zzbnuVar.zzh;
                if (zzbntVar4 != zzbntVar2) {
                    com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    zzbntVar3 = this.zzc.zzh;
                    zzbntVar3.zzb();
                }
            }
            this.zzc.zzh = this.zza;
            if (((Boolean) zzbeg.zzd.zze()).booleanValue()) {
                zzbnu zzbnuVar2 = this.zzc;
                zzfkoVar = zzbnuVar2.zze;
                if (zzfkoVar != null) {
                    zzfkoVar2 = zzbnuVar2.zze;
                    zzfka zzfkaVar = this.zzb;
                    zzfkaVar.zzg(true);
                    zzfkoVar2.zzb(zzfkaVar.zzm());
                }
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}
