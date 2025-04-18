package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbnp implements zzcau {
    final /* synthetic */ zzbny zza;
    final /* synthetic */ zzflp zzb;
    final /* synthetic */ zzbnz zzc;

    public zzbnp(zzbnz zzbnzVar, zzbny zzbnyVar, zzflp zzflpVar) {
        this.zza = zzbnyVar;
        this.zzb = zzflpVar;
        this.zzc = zzbnzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zza() {
        Object obj;
        zzfmd zzfmdVar;
        zzfmd zzfmdVar2;
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        obj = this.zzc.zza;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
                this.zzc.zzi = 1;
                com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
                this.zza.zzb();
                if (((Boolean) zzbek.zzd.zze()).booleanValue()) {
                    zzbnz zzbnzVar = this.zzc;
                    zzfmdVar = zzbnzVar.zze;
                    if (zzfmdVar != null) {
                        zzfmdVar2 = zzbnzVar.zze;
                        zzflp zzflpVar = this.zzb;
                        zzflpVar.zzc("Failed loading new engine");
                        zzflpVar.zzg(false);
                        zzfmdVar2.zzb(zzflpVar.zzm());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }
}
