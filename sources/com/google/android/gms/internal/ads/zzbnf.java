package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbnf implements zzbjr {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbnt zzb;
    final /* synthetic */ zzbmp zzc;
    final /* synthetic */ zzbnu zzd;

    public zzbnf(zzbnu zzbnuVar, long j3, zzbnt zzbntVar, zzbmp zzbmpVar) {
        this.zza = j3;
        this.zzb = zzbntVar;
        this.zzc = zzbmpVar;
        this.zzd = zzbnuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Object obj2;
        com.google.android.gms.ads.internal.util.zze.zza("onGmsg /jsLoaded. JsLoaded latency is " + (com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - this.zza) + " ms.");
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        obj2 = this.zzd.zza;
        synchronized (obj2) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            if (this.zzb.zze() != -1 && this.zzb.zze() != 1) {
                this.zzd.zzi = 0;
                zzbmp zzbmpVar = this.zzc;
                zzbmpVar.zzq("/log", zzbjq.zzg);
                zzbmpVar.zzq("/result", zzbjq.zzo);
                this.zzb.zzi(this.zzc);
                this.zzd.zzh = this.zzb;
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
