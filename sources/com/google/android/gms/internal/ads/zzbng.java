package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbng implements zzbjr {
    final /* synthetic */ zzbmp zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzbx zzb;
    final /* synthetic */ zzbnu zzc;

    public zzbng(zzbnu zzbnuVar, zzavc zzavcVar, zzbmp zzbmpVar, com.google.android.gms.ads.internal.util.zzbx zzbxVar) {
        this.zza = zzbmpVar;
        this.zzb = zzbxVar;
        this.zzc = zzbnuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Object obj2;
        int i10;
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock acquired");
            com.google.android.gms.ads.internal.util.client.zzm.zzi("JS Engine is requesting an update");
            i10 = this.zzc.zzi;
            if (i10 == 0) {
                com.google.android.gms.ads.internal.util.client.zzm.zzi("Starting reload.");
                this.zzc.zzi = 2;
                this.zzc.zzd(null);
            }
            this.zza.zzr("/requestReload", (zzbjr) this.zzb.zza());
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
