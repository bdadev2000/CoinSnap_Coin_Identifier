package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbpe implements zzblp {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbps zzb;
    final /* synthetic */ zzboo zzc;
    final /* synthetic */ zzbpt zzd;

    public zzbpe(zzbpt zzbptVar, long j7, zzbps zzbpsVar, zzboo zzbooVar) {
        this.zza = j7;
        this.zzb = zzbpsVar;
        this.zzc = zzbooVar;
        this.zzd = zzbptVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Object obj2;
        com.google.android.gms.ads.internal.util.zze.zza("onGmsg /jsLoaded. JsLoaded latency is " + (com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - this.zza) + " ms.");
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        obj2 = this.zzd.zza;
        synchronized (obj2) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            if (this.zzb.zze() != -1 && this.zzb.zze() != 1) {
                this.zzd.zzi = 0;
                zzboo zzbooVar = this.zzc;
                zzbooVar.zzq("/log", zzblo.zzg);
                zzbooVar.zzq("/result", zzblo.zzo);
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
