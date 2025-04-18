package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdup {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdqd zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdsw zzl;
    private final VersionInfoParcel zzm;
    private final zzddk zzo;
    private final zzfko zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzcao zze = new zzcao();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();

    public zzdup(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdqd zzdqdVar, ScheduledExecutorService scheduledExecutorService, zzdsw zzdswVar, VersionInfoParcel versionInfoParcel, zzddk zzddkVar, zzfko zzfkoVar) {
        this.zzh = zzdqdVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdswVar;
        this.zzm = versionInfoParcel;
        this.zzo = zzddkVar;
        this.zzp = zzfkoVar;
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public static /* bridge */ /* synthetic */ void zzj(final zzdup zzdupVar, String str) {
        int i10 = 5;
        final zzfka zza = zzfjz.zza(zzdupVar.zzf, 5);
        zza.zzi();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final zzfka zza2 = zzfjz.zza(zzdupVar.zzf, i10);
                zza2.zzi();
                zza2.zzd(next);
                final Object obj = new Object();
                final zzcao zzcaoVar = new zzcao();
                ua.b zzo = zzgei.zzo(zzcaoVar, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbU)).longValue(), TimeUnit.SECONDS, zzdupVar.zzk);
                zzdupVar.zzl.zzc(next);
                zzdupVar.zzo.zzc(next);
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
                zzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdug
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdup.this.zzq(obj, zzcaoVar, next, elapsedRealtime, zza2);
                    }
                }, zzdupVar.zzi);
                arrayList.add(zzo);
                final zzduo zzduoVar = new zzduo(zzdupVar, obj, next, elapsedRealtime, zza2, zzcaoVar);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                        int i11 = 0;
                        while (i11 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzblz(optString, bundle));
                            i11++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdupVar.zzv(next, false, "", 0);
                try {
                    final zzfgm zzc = zzdupVar.zzh.zzc(next, new JSONObject());
                    zzdupVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduk
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdup.this.zzn(next, zzduoVar, zzc, arrayList2);
                        }
                    });
                } catch (zzffv e2) {
                    try {
                        String str2 = "Failed to create Adapter.";
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzmG)).booleanValue()) {
                            str2 = "Failed to create Adapter. " + e2.getMessage();
                        }
                        zzduoVar.zze(str2);
                    } catch (RemoteException e10) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("", e10);
                    }
                }
                i10 = 5;
            }
            zzgei.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzduh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzdup.this.zzf(zza);
                    return null;
                }
            }, zzdupVar.zzi);
        } catch (JSONException e11) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e11);
            zzdupVar.zzo.zza("MalformedJson");
            zzdupVar.zzl.zza("MalformedJson");
            zzdupVar.zze.zzd(e11);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e11, "AdapterInitializer.updateAdapterStatus");
            zzfko zzfkoVar = zzdupVar.zzp;
            zza.zzh(e11);
            zza.zzg(false);
            zzfkoVar.zzb(zza.zzm());
        }
    }

    private final synchronized ua.b zzu() {
        String zzc = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc();
        if (!TextUtils.isEmpty(zzc)) {
            return zzgei.zzh(zzc);
        }
        final zzcao zzcaoVar = new zzcao();
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdui
            @Override // java.lang.Runnable
            public final void run() {
                zzdup.this.zzo(zzcaoVar);
            }
        });
        return zzcaoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str, boolean z10, String str2, int i10) {
        this.zzn.put(str, new zzblp(str, z10, i10, str2));
    }

    public final /* synthetic */ Object zzf(zzfka zzfkaVar) throws Exception {
        this.zze.zzc(Boolean.TRUE);
        zzfkaVar.zzg(true);
        this.zzp.zzb(zzfkaVar.zzm());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzblp zzblpVar = (zzblp) this.zzn.get(str);
            arrayList.add(new zzblp(str, zzblpVar.zzb, zzblpVar.zzc, zzblpVar.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    public final /* synthetic */ void zzm() {
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zzd));
            this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zze.zzd(new Exception());
        }
    }

    public final /* synthetic */ void zzn(String str, zzblt zzbltVar, zzfgm zzfgmVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzbltVar.zzf();
                    return;
                }
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfgmVar.zzi(context, zzbltVar, list);
            } catch (RemoteException e2) {
                throw new zzfxm(e2);
            } catch (zzffv unused) {
                zzbltVar.zze("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e10);
        }
    }

    public final /* synthetic */ void zzo(final zzcao zzcaoVar) {
        this.zzi.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzduf
            @Override // java.lang.Runnable
            public final void run() {
                String zzc = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc();
                boolean isEmpty = TextUtils.isEmpty(zzc);
                zzcao zzcaoVar2 = zzcaoVar;
                if (!isEmpty) {
                    zzcaoVar2.zzc(zzc);
                } else {
                    zzcaoVar2.zzd(new Exception());
                }
            }
        });
    }

    public final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    public final /* synthetic */ void zzq(Object obj, zzcao zzcaoVar, String str, long j3, zzfka zzfkaVar) {
        synchronized (obj) {
            if (!zzcaoVar.isDone()) {
                zzv(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - j3));
                this.zzl.zzb(str, "timeout");
                this.zzo.zzb(str, "timeout");
                zzfko zzfkoVar = this.zzp;
                zzfkaVar.zzc("Timeout");
                zzfkaVar.zzg(false);
                zzfkoVar.zzb(zzfkaVar.zzm());
                zzcaoVar.zzc(Boolean.FALSE);
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzbet.zza.zze()).booleanValue()) {
            if (this.zzm.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbT)).intValue() && this.zzq) {
                if (!this.zza) {
                    synchronized (this) {
                        if (this.zza) {
                            return;
                        }
                        this.zzl.zzf();
                        this.zzo.zzf();
                        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdul
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdup.this.zzp();
                            }
                        }, this.zzi);
                        this.zza = true;
                        ua.b zzu = zzu();
                        this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdue
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdup.this.zzm();
                            }
                        }, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbV)).longValue(), TimeUnit.SECONDS);
                        zzgei.zzr(zzu, new zzdun(this), this.zzi);
                        return;
                    }
                }
                return;
            }
        }
        if (!this.zza) {
            zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
            this.zze.zzc(Boolean.FALSE);
            this.zza = true;
            this.zzb = true;
        }
    }

    public final void zzs(final zzblw zzblwVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduj
            @Override // java.lang.Runnable
            public final void run() {
                zzdup zzdupVar = zzdup.this;
                try {
                    zzblwVar.zzb(zzdupVar.zzg());
                } catch (RemoteException e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
                }
            }
        }, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
