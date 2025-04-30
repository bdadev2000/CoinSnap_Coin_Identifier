package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class zzbpt {
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;

    @Nullable
    private final zzfmq zze;
    private final com.google.android.gms.ads.internal.util.zzbd zzf;
    private final com.google.android.gms.ads.internal.util.zzbd zzg;

    @Nullable
    private zzbps zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbpt(Context context, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.util.zzbd zzbdVar, com.google.android.gms.ads.internal.util.zzbd zzbdVar2, @Nullable zzfmq zzfmqVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = versionInfoParcel;
        this.zze = zzfmqVar;
        this.zzf = zzbdVar;
        this.zzg = zzbdVar2;
    }

    public final zzbpn zzb(@Nullable zzaxd zzaxdVar) {
        com.google.android.gms.ads.internal.util.zze.zza("getEngine: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine: Lock acquired");
                com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Trying to acquire lock");
                synchronized (this.zza) {
                    try {
                        com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock acquired");
                        zzbps zzbpsVar = this.zzh;
                        if (zzbpsVar != null && this.zzi == 0) {
                            zzbpsVar.zzj(new zzccr() { // from class: com.google.android.gms.internal.ads.zzboz
                                @Override // com.google.android.gms.internal.ads.zzccr
                                public final void zza(Object obj) {
                                    zzbpt.this.zzk((zzboo) obj);
                                }
                            }, new zzccp() { // from class: com.google.android.gms.internal.ads.zzbpa
                                @Override // com.google.android.gms.internal.ads.zzccp
                                public final void zza() {
                                }
                            });
                        }
                    } finally {
                    }
                }
                com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock released");
                zzbps zzbpsVar2 = this.zzh;
                if (zzbpsVar2 != null && zzbpsVar2.zze() != -1) {
                    int i9 = this.zzi;
                    if (i9 == 0) {
                        com.google.android.gms.ads.internal.util.zze.zza("getEngine (NO_UPDATE): Lock released");
                        return this.zzh.zza();
                    }
                    if (i9 == 1) {
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
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzbps zzd(@Nullable zzaxd zzaxdVar) {
        zzfmc zza = zzfmb.zza(this.zzb, zzfmu.CUI_NAME_SDKINIT_SDKCORE);
        zza.zzj();
        final zzbps zzbpsVar = new zzbps(this.zzg);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final zzaxd zzaxdVar2 = null;
        zzcci.zze.execute(new Runnable(zzaxdVar2, zzbpsVar) { // from class: com.google.android.gms.internal.ads.zzbpd
            public final /* synthetic */ zzbps zzb;

            {
                this.zzb = zzbpsVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbpt.this.zzj(null, this.zzb);
            }
        });
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine: Promise created");
        zzbpsVar.zzj(new zzbpi(this, zzbpsVar, zza), new zzbpj(this, zzbpsVar, zza));
        return zzbpsVar;
    }

    public final /* synthetic */ void zzi(zzbps zzbpsVar, final zzboo zzbooVar, ArrayList arrayList, long j7) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                if (zzbpsVar.zze() != -1 && zzbpsVar.zze() != 1) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhO)).booleanValue()) {
                        zzbpsVar.zzh(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                    } else {
                        zzbpsVar.zzg();
                    }
                    zzgge zzggeVar = zzcci.zze;
                    Objects.requireNonNull(zzbooVar);
                    zzggeVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbpb
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzboo.this.zzc();
                        }
                    });
                    com.google.android.gms.ads.internal.util.zze.zza("Could not receive /jsLoaded in " + String.valueOf(com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzc)) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + zzbpsVar.zze() + ". Update status(onEngLoadedTimeout) is " + this.zzi + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + String.valueOf(arrayList.get(0)) + " ms. Total latency(onEngLoadedTimeout) is " + (com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - j7) + " ms. Rejecting.");
                    com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                    return;
                }
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzj(zzaxd zzaxdVar, zzbps zzbpsVar) {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
            zzbow zzbowVar = new zzbow(this.zzb, this.zzd, null, null);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After createJavascriptEngine");
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbowVar.zzk(new zzbpc(this, arrayList, currentTimeMillis, zzbpsVar, zzbowVar));
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbowVar.zzq("/jsLoaded", new zzbpe(this, currentTimeMillis, zzbpsVar, zzbowVar));
            com.google.android.gms.ads.internal.util.zzcc zzccVar = new com.google.android.gms.ads.internal.util.zzcc();
            zzbpf zzbpfVar = new zzbpf(this, null, zzbowVar, zzccVar);
            zzccVar.zzb(zzbpfVar);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            zzbowVar.zzq("/requestReload", zzbpfVar);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(this.zzc)));
            if (this.zzc.endsWith(".js")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbowVar.zzh(this.zzc);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (this.zzc.startsWith("<html>")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbowVar.zzf(this.zzc);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbowVar.zzg(this.zzc);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new zzbph(this, zzbpsVar, zzbowVar, arrayList, currentTimeMillis), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzd)).intValue());
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error creating webview.", th);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhO)).booleanValue()) {
                zzbpsVar.zzh(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
            } else {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbpsVar.zzg();
            }
        }
    }

    public final /* synthetic */ void zzk(zzboo zzbooVar) {
        if (zzbooVar.zzi()) {
            this.zzi = 1;
        }
    }
}
