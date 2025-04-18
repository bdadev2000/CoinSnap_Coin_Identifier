package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbno implements zzcaw {
    final /* synthetic */ zzbny zza;
    final /* synthetic */ zzflp zzb;
    final /* synthetic */ zzbnz zzc;

    public zzbno(zzbnz zzbnzVar, zzbny zzbnyVar, zzflp zzflpVar) {
        this.zza = zzbnyVar;
        this.zzb = zzflpVar;
        this.zzc = zzbnzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Object obj2;
        zzbny zzbnyVar;
        zzfmd zzfmdVar;
        zzfmd zzfmdVar2;
        zzbny zzbnyVar2;
        zzbny zzbnyVar3;
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock acquired");
                this.zzc.zzi = 0;
                zzbnz zzbnzVar = this.zzc;
                zzbnyVar = zzbnzVar.zzh;
                if (zzbnyVar != null) {
                    zzbny zzbnyVar4 = this.zza;
                    zzbnyVar2 = zzbnzVar.zzh;
                    if (zzbnyVar4 != zzbnyVar2) {
                        com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                        zzbnyVar3 = this.zzc.zzh;
                        zzbnyVar3.zzb();
                    }
                }
                this.zzc.zzh = this.zza;
                if (((Boolean) zzbek.zzd.zze()).booleanValue()) {
                    zzbnz zzbnzVar2 = this.zzc;
                    zzfmdVar = zzbnzVar2.zze;
                    if (zzfmdVar != null) {
                        zzfmdVar2 = zzbnzVar2.zze;
                        zzflp zzflpVar = this.zzb;
                        zzflpVar.zzg(true);
                        zzfmdVar2.zzb(zzflpVar.zzm());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}
