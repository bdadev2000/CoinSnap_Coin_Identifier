package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbpf implements zzblp {
    final /* synthetic */ zzboo zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzcc zzb;
    final /* synthetic */ zzbpt zzc;

    public zzbpf(zzbpt zzbptVar, zzaxd zzaxdVar, zzboo zzbooVar, com.google.android.gms.ads.internal.util.zzcc zzccVar) {
        this.zza = zzbooVar;
        this.zzb = zzccVar;
        this.zzc = zzbptVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzblp, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Object obj2;
        int i9;
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock acquired");
                com.google.android.gms.ads.internal.util.client.zzm.zzi("JS Engine is requesting an update");
                i9 = this.zzc.zzi;
                if (i9 == 0) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzi("Starting reload.");
                    this.zzc.zzi = 2;
                    this.zzc.zzd(null);
                }
                this.zza.zzr("/requestReload", this.zzb.zza());
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
