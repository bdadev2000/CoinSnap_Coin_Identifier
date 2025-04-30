package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbph implements Runnable {
    final /* synthetic */ zzbps zza;
    final /* synthetic */ zzboo zzb;
    final /* synthetic */ ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzbpt zze;

    public zzbph(zzbpt zzbptVar, zzbps zzbpsVar, zzboo zzbooVar, ArrayList arrayList, long j7) {
        this.zza = zzbpsVar;
        this.zzb = zzbooVar;
        this.zzc = arrayList;
        this.zzd = j7;
        this.zze = zzbptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i9;
        String concat;
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        obj = this.zze.zza;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                if (this.zza.zze() != -1 && this.zza.zze() != 1) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhO)).booleanValue()) {
                        this.zza.zzh(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                    } else {
                        this.zza.zzg();
                    }
                    zzgge zzggeVar = zzcci.zze;
                    final zzboo zzbooVar = this.zzb;
                    Objects.requireNonNull(zzbooVar);
                    zzggeVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbpg
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzboo.this.zzc();
                        }
                    });
                    String valueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzd));
                    int zze = this.zza.zze();
                    i9 = this.zze.zzi;
                    if (this.zzc.isEmpty()) {
                        concat = ". Still waiting for the engine to be loaded";
                    } else {
                        concat = ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ".concat(String.valueOf(this.zzc.get(0)));
                    }
                    com.google.android.gms.ads.internal.util.zze.zza("Could not finish the full JS engine loading in " + valueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + zze + ". Update status(fullLoadTimeout) is " + i9 + concat + " ms. Total latency(fullLoadTimeout) is " + (com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - this.zzd) + " ms at timeout. Rejecting.");
                    com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
