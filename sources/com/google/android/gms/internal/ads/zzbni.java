package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbni implements Runnable {
    final /* synthetic */ zzbnt zza;
    final /* synthetic */ zzbmp zzb;
    final /* synthetic */ ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzbnu zze;

    public zzbni(zzbnu zzbnuVar, zzbnt zzbntVar, zzbmp zzbmpVar, ArrayList arrayList, long j3) {
        this.zza = zzbntVar;
        this.zzb = zzbmpVar;
        this.zzc = arrayList;
        this.zzd = j3;
        this.zze = zzbnuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i10;
        String concat;
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        obj = this.zze.zza;
        synchronized (obj) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
            if (this.zza.zze() != -1 && this.zza.zze() != 1) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhq)).booleanValue()) {
                    this.zza.zzh(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                } else {
                    this.zza.zzg();
                }
                zzges zzgesVar = zzcaj.zze;
                final zzbmp zzbmpVar = this.zzb;
                Objects.requireNonNull(zzbmpVar);
                zzgesVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnh
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbmp.this.zzc();
                    }
                });
                String valueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzc));
                int zze = this.zza.zze();
                i10 = this.zze.zzi;
                if (this.zzc.isEmpty()) {
                    concat = ". Still waiting for the engine to be loaded";
                } else {
                    concat = ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ".concat(String.valueOf(this.zzc.get(0)));
                }
                com.google.android.gms.ads.internal.util.zze.zza("Could not finish the full JS engine loading in " + valueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + zze + ". Update status(fullLoadTimeout) is " + i10 + concat + " ms. Total latency(fullLoadTimeout) is " + (com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - this.zzd) + " ms at timeout. Rejecting.");
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
        }
    }
}
