package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbpj implements zzccp {
    final /* synthetic */ zzbps zza;
    final /* synthetic */ zzfmc zzb;
    final /* synthetic */ zzbpt zzc;

    public zzbpj(zzbpt zzbptVar, zzbps zzbpsVar, zzfmc zzfmcVar) {
        this.zza = zzbpsVar;
        this.zzb = zzfmcVar;
        this.zzc = zzbptVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zza() {
        Object obj;
        zzfmq zzfmqVar;
        zzfmq zzfmqVar2;
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        obj = this.zzc.zza;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
                this.zzc.zzi = 1;
                com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
                this.zza.zzb();
                if (((Boolean) zzbgd.zzd.zze()).booleanValue()) {
                    zzbpt zzbptVar = this.zzc;
                    zzfmqVar = zzbptVar.zze;
                    if (zzfmqVar != null) {
                        zzfmqVar2 = zzbptVar.zze;
                        zzfmc zzfmcVar = this.zzb;
                        zzfmcVar.zzc("Failed loading new engine");
                        zzfmcVar.zzh(false);
                        zzfmqVar2.zzb(zzfmcVar.zzn());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }
}
