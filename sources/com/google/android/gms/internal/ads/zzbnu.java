package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class zzbnu {
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;

    @Nullable
    private final zzfko zze;
    private final com.google.android.gms.ads.internal.util.zzbc zzf;
    private final com.google.android.gms.ads.internal.util.zzbc zzg;

    @Nullable
    private zzbnt zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbnu(Context context, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.util.zzbc zzbcVar, com.google.android.gms.ads.internal.util.zzbc zzbcVar2, @Nullable zzfko zzfkoVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = versionInfoParcel;
        this.zze = zzfkoVar;
        this.zzf = zzbcVar;
        this.zzg = zzbcVar2;
    }

    public final zzbno zzb(@Nullable zzavc zzavcVar) {
        com.google.android.gms.ads.internal.util.zze.zza("getEngine: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("getEngine: Lock acquired");
            com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Trying to acquire lock");
            synchronized (this.zza) {
                com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock acquired");
                zzbnt zzbntVar = this.zzh;
                if (zzbntVar != null && this.zzi == 0) {
                    zzbntVar.zzj(new zzcas() { // from class: com.google.android.gms.internal.ads.zzbna
                        @Override // com.google.android.gms.internal.ads.zzcas
                        public final void zza(Object obj) {
                            zzbnu.this.zzk((zzbmp) obj);
                        }
                    }, new zzcaq() { // from class: com.google.android.gms.internal.ads.zzbnb
                        @Override // com.google.android.gms.internal.ads.zzcaq
                        public final void zza() {
                        }
                    });
                }
            }
            com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock released");
            zzbnt zzbntVar2 = this.zzh;
            if (zzbntVar2 != null && zzbntVar2.zze() != -1) {
                int i10 = this.zzi;
                if (i10 == 0) {
                    com.google.android.gms.ads.internal.util.zze.zza("getEngine (NO_UPDATE): Lock released");
                    return this.zzh.zza();
                }
                if (i10 == 1) {
                    this.zzi = 2;
                    zzd(null);
                    com.google.android.gms.ads.internal.util.zze.zza("getEngine (PENDING_UPDATE): Lock released");
                    return this.zzh.zza();
                }
                com.google.android.gms.ads.internal.util.zze.zza("getEngine (UPDATING): Lock released");
                return this.zzh.zza();
            }
            this.zzi = 2;
            this.zzh = zzd(null);
            com.google.android.gms.ads.internal.util.zze.zza("getEngine (NULL or REJECTED): Lock released");
            return this.zzh.zza();
        }
    }

    public final zzbnt zzd(@Nullable zzavc zzavcVar) {
        zzfka zza = zzfjz.zza(this.zzb, 6);
        zza.zzi();
        final zzbnt zzbntVar = new zzbnt(this.zzg);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final zzavc zzavcVar2 = null;
        zzcaj.zze.execute(new Runnable(zzavcVar2, zzbntVar) { // from class: com.google.android.gms.internal.ads.zzbne
            public final /* synthetic */ zzbnt zzb;

            {
                this.zzb = zzbntVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbnu.this.zzj(null, this.zzb);
            }
        });
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine: Promise created");
        zzbntVar.zzj(new zzbnj(this, zzbntVar, zza), new zzbnk(this, zzbntVar, zza));
        return zzbntVar;
    }

    public final /* synthetic */ void zzi(zzbnt zzbntVar, final zzbmp zzbmpVar, ArrayList arrayList, long j3) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
            if (zzbntVar.zze() != -1 && zzbntVar.zze() != 1) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhq)).booleanValue()) {
                    zzbntVar.zzh(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                } else {
                    zzbntVar.zzg();
                }
                zzges zzgesVar = zzcaj.zze;
                Objects.requireNonNull(zzbmpVar);
                zzgesVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnc
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbmp.this.zzc();
                    }
                });
                com.google.android.gms.ads.internal.util.zze.zza("Could not receive /jsLoaded in " + String.valueOf(com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzb)) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + zzbntVar.zze() + ". Update status(onEngLoadedTimeout) is " + this.zzi + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + String.valueOf(arrayList.get(0)) + " ms. Total latency(onEngLoadedTimeout) is " + (com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - j3) + " ms. Rejecting.");
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
        }
    }

    public final /* synthetic */ void zzj(zzavc zzavcVar, zzbnt zzbntVar) {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
            zzbmx zzbmxVar = new zzbmx(this.zzb, this.zzd, null, null);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After createJavascriptEngine");
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbmxVar.zzk(new zzbnd(this, arrayList, currentTimeMillis, zzbntVar, zzbmxVar));
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbmxVar.zzq("/jsLoaded", new zzbnf(this, currentTimeMillis, zzbntVar, zzbmxVar));
            com.google.android.gms.ads.internal.util.zzbx zzbxVar = new com.google.android.gms.ads.internal.util.zzbx();
            zzbng zzbngVar = new zzbng(this, null, zzbmxVar, zzbxVar);
            zzbxVar.zzb(zzbngVar);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            zzbmxVar.zzq("/requestReload", zzbngVar);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(this.zzc)));
            if (this.zzc.endsWith(".js")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbmxVar.zzh(this.zzc);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (this.zzc.startsWith("<html>")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbmxVar.zzf(this.zzc);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbmxVar.zzg(this.zzc);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new zzbni(this, zzbntVar, zzbmxVar, arrayList, currentTimeMillis), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzc)).intValue());
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error creating webview.", th2);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhq)).booleanValue()) {
                zzbntVar.zzh(th2, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhs)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzv(th2, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbntVar.zzg();
            } else {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(th2, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbntVar.zzg();
            }
        }
    }

    public final /* synthetic */ void zzk(zzbmp zzbmpVar) {
        if (zzbmpVar.zzi()) {
            this.zzi = 1;
        }
    }
}
