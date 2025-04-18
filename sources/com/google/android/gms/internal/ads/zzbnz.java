package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class zzbnz {
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;

    @Nullable
    private final zzfmd zze;
    private final com.google.android.gms.ads.internal.util.zzbd zzf;
    private final com.google.android.gms.ads.internal.util.zzbd zzg;

    @Nullable
    private zzbny zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbnz(Context context, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.util.zzbd zzbdVar, com.google.android.gms.ads.internal.util.zzbd zzbdVar2, @Nullable zzfmd zzfmdVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = versionInfoParcel;
        this.zze = zzfmdVar;
        this.zzf = zzbdVar;
        this.zzg = zzbdVar2;
    }

    public final zzbnt zzb(@Nullable zzavn zzavnVar) {
        com.google.android.gms.ads.internal.util.zze.zza("getEngine: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine: Lock acquired");
                com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Trying to acquire lock");
                synchronized (this.zza) {
                    try {
                        com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock acquired");
                        zzbny zzbnyVar = this.zzh;
                        if (zzbnyVar != null && this.zzi == 0) {
                            zzbnyVar.zzj(new zzcaw() { // from class: com.google.android.gms.internal.ads.zzbnf
                                @Override // com.google.android.gms.internal.ads.zzcaw
                                public final void zza(Object obj) {
                                    zzbnz.this.zzk((zzbmu) obj);
                                }
                            }, new zzcau() { // from class: com.google.android.gms.internal.ads.zzbng
                                @Override // com.google.android.gms.internal.ads.zzcau
                                public final void zza() {
                                }
                            });
                        }
                    } finally {
                    }
                }
                com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock released");
                zzbny zzbnyVar2 = this.zzh;
                if (zzbnyVar2 != null && zzbnyVar2.zze() != -1) {
                    int i2 = this.zzi;
                    if (i2 == 0) {
                        com.google.android.gms.ads.internal.util.zze.zza("getEngine (NO_UPDATE): Lock released");
                        return this.zzh.zza();
                    }
                    if (i2 != 1) {
                        com.google.android.gms.ads.internal.util.zze.zza("getEngine (UPDATING): Lock released");
                        return this.zzh.zza();
                    }
                    this.zzi = 2;
                    zzd(null);
                    com.google.android.gms.ads.internal.util.zze.zza("getEngine (PENDING_UPDATE): Lock released");
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

    public final zzbny zzd(@Nullable zzavn zzavnVar) {
        zzflp zza = zzflo.zza(this.zzb, 6);
        zza.zzi();
        final zzbny zzbnyVar = new zzbny(this.zzg);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final zzavn zzavnVar2 = null;
        zzcan.zze.execute(new Runnable(zzavnVar2, zzbnyVar) { // from class: com.google.android.gms.internal.ads.zzbnj
            public final /* synthetic */ zzbny zzb;

            {
                this.zzb = zzbnyVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbnz.this.zzj(null, this.zzb);
            }
        });
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine: Promise created");
        zzbnyVar.zzj(new zzbno(this, zzbnyVar, zza), new zzbnp(this, zzbnyVar, zza));
        return zzbnyVar;
    }

    public final /* synthetic */ void zzi(zzbny zzbnyVar, final zzbmu zzbmuVar, ArrayList arrayList, long j2) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                if (zzbnyVar.zze() != -1 && zzbnyVar.zze() != 1) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzho)).booleanValue()) {
                        zzbnyVar.zzh(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                    } else {
                        zzbnyVar.zzg();
                    }
                    zzgfz zzgfzVar = zzcan.zze;
                    Objects.requireNonNull(zzbmuVar);
                    zzgfzVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnh
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbmu.this.zzc();
                        }
                    });
                    com.google.android.gms.ads.internal.util.zze.zza("Could not receive /jsLoaded in " + String.valueOf(com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzb)) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + zzbnyVar.zze() + ". Update status(onEngLoadedTimeout) is " + this.zzi + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + String.valueOf(arrayList.get(0)) + " ms. Total latency(onEngLoadedTimeout) is " + (com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - j2) + " ms. Rejecting.");
                    com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                    return;
                }
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzj(zzavn zzavnVar, zzbny zzbnyVar) {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
            zzbnc zzbncVar = new zzbnc(this.zzb, this.zzd, null, null);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After createJavascriptEngine");
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbncVar.zzk(new zzbni(this, arrayList, currentTimeMillis, zzbnyVar, zzbncVar));
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbncVar.zzq("/jsLoaded", new zzbnk(this, currentTimeMillis, zzbnyVar, zzbncVar));
            com.google.android.gms.ads.internal.util.zzby zzbyVar = new com.google.android.gms.ads.internal.util.zzby();
            zzbnl zzbnlVar = new zzbnl(this, null, zzbncVar, zzbyVar);
            zzbyVar.zzb(zzbnlVar);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            zzbncVar.zzq("/requestReload", zzbnlVar);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(this.zzc)));
            if (this.zzc.endsWith(".js")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbncVar.zzh(this.zzc);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (this.zzc.startsWith("<html>")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbncVar.zzf(this.zzc);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbncVar.zzg(this.zzc);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new zzbnn(this, zzbnyVar, zzbncVar, arrayList, currentTimeMillis), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzc)).intValue());
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error creating webview.", th);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzho)).booleanValue()) {
                zzbnyVar.zzh(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhq)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.zzo().zzv(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbnyVar.zzg();
            } else {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbnyVar.zzg();
            }
        }
    }

    public final /* synthetic */ void zzk(zzbmu zzbmuVar) {
        if (zzbmuVar.zzi()) {
            this.zzi = 1;
        }
    }
}
