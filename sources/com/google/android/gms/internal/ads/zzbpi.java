package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbpi implements zzccr {
    final /* synthetic */ zzbps zza;
    final /* synthetic */ zzfmc zzb;
    final /* synthetic */ zzbpt zzc;

    public zzbpi(zzbpt zzbptVar, zzbps zzbpsVar, zzfmc zzfmcVar) {
        this.zza = zzbpsVar;
        this.zzb = zzfmcVar;
        this.zzc = zzbptVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccr
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Object obj2;
        zzbps zzbpsVar;
        zzfmq zzfmqVar;
        zzfmq zzfmqVar2;
        zzbps zzbpsVar2;
        zzbps zzbpsVar3;
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock acquired");
                this.zzc.zzi = 0;
                zzbpt zzbptVar = this.zzc;
                zzbpsVar = zzbptVar.zzh;
                if (zzbpsVar != null) {
                    zzbps zzbpsVar4 = this.zza;
                    zzbpsVar2 = zzbptVar.zzh;
                    if (zzbpsVar4 != zzbpsVar2) {
                        com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                        zzbpsVar3 = this.zzc.zzh;
                        zzbpsVar3.zzb();
                    }
                }
                this.zzc.zzh = this.zza;
                if (((Boolean) zzbgd.zzd.zze()).booleanValue()) {
                    zzbpt zzbptVar2 = this.zzc;
                    zzfmqVar = zzbptVar2.zze;
                    if (zzfmqVar != null) {
                        zzfmqVar2 = zzbptVar2.zze;
                        zzfmc zzfmcVar = this.zzb;
                        zzfmcVar.zzh(true);
                        zzfmqVar2.zzb(zzfmcVar.zzn());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}
