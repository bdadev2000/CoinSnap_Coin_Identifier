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

/* loaded from: classes2.dex */
public final class zzdxf {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdst zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdvm zzl;
    private final VersionInfoParcel zzm;
    private final zzdgh zzo;
    private final zzfmq zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzccn zze = new zzccn();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();

    public zzdxf(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdst zzdstVar, ScheduledExecutorService scheduledExecutorService, zzdvm zzdvmVar, VersionInfoParcel versionInfoParcel, zzdgh zzdghVar, zzfmq zzfmqVar) {
        this.zzh = zzdstVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdvmVar;
        this.zzm = versionInfoParcel;
        this.zzo = zzdghVar;
        this.zzp = zzfmqVar;
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public static /* bridge */ /* synthetic */ void zzj(final zzdxf zzdxfVar, String str) {
        final zzfmc zza = zzfmb.zza(zzdxfVar.zzf, zzfmu.CUI_NAME_SDKINIT_ADAPTERINIT);
        zza.zzj();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final zzfmc zza2 = zzfmb.zza(zzdxfVar.zzf, zzfmu.CUI_NAME_SDKINIT_ADAPTERINIT);
                zza2.zzj();
                zza2.zze(next);
                final Object obj = new Object();
                final zzccn zzccnVar = new zzccn();
                f4.c zzo = zzgft.zzo(zzccnVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbP)).longValue(), TimeUnit.SECONDS, zzdxfVar.zzk);
                zzdxfVar.zzl.zzc(next);
                zzdxfVar.zzo.zzc(next);
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
                Iterator<String> it = keys;
                zzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdww
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdxf.this.zzq(obj, zzccnVar, next, elapsedRealtime, zza2);
                    }
                }, zzdxfVar.zzi);
                arrayList.add(zzo);
                final zzdxe zzdxeVar = new zzdxe(zzdxfVar, obj, next, elapsedRealtime, zza2, zzccnVar);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                        int i9 = 0;
                        while (i9 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
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
                            arrayList2.add(new zzbnx(optString, bundle));
                            i9++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdxfVar.zzv(next, false, "", 0);
                try {
                    try {
                        final zzfim zzc = zzdxfVar.zzh.zzc(next, new JSONObject());
                        zzdxfVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxa
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdxf.this.zzn(next, zzdxeVar, zzc, arrayList2);
                            }
                        });
                    } catch (zzfhv unused2) {
                        zzdxeVar.zze("Failed to create Adapter.");
                    }
                } catch (RemoteException e4) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
                }
                keys = it;
            }
            zzgft.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwx
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzdxf.this.zzf(zza);
                    return null;
                }
            }, zzdxfVar.zzi);
        } catch (JSONException e9) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e9);
            zzdxfVar.zzo.zza("MalformedJson");
            zzdxfVar.zzl.zza("MalformedJson");
            zzdxfVar.zze.zzd(e9);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e9, "AdapterInitializer.updateAdapterStatus");
            zzfmq zzfmqVar = zzdxfVar.zzp;
            zza.zzi(e9);
            zza.zzh(false);
            zzfmqVar.zzb(zza.zzn());
        }
    }

    private final synchronized f4.c zzu() {
        String zzc = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzc();
        if (!TextUtils.isEmpty(zzc)) {
            return zzgft.zzh(zzc);
        }
        final zzccn zzccnVar = new zzccn();
        com.google.android.gms.ads.internal.zzu.zzo().zzi().zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwy
            @Override // java.lang.Runnable
            public final void run() {
                zzdxf.this.zzo(zzccnVar);
            }
        });
        return zzccnVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str, boolean z8, String str2, int i9) {
        this.zzn.put(str, new zzbnn(str, z8, i9, str2));
    }

    public final /* synthetic */ Object zzf(zzfmc zzfmcVar) throws Exception {
        this.zze.zzc(Boolean.TRUE);
        zzfmcVar.zzh(true);
        this.zzp.zzb(zzfmcVar.zzn());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzbnn zzbnnVar = (zzbnn) this.zzn.get(str);
            arrayList.add(new zzbnn(str, zzbnnVar.zzb, zzbnnVar.zzc, zzbnnVar.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    public final /* synthetic */ void zzm() {
        synchronized (this) {
            try {
                if (this.zzc) {
                    return;
                }
                zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzd));
                this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                this.zze.zzd(new Exception());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzn(String str, zzbnr zzbnrVar, zzfim zzfimVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzbnrVar.zzf();
                    return;
                }
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfimVar.zzi(context, zzbnrVar, list);
            } catch (RemoteException e4) {
                throw new zzfzb(e4);
            } catch (zzfhv unused) {
                zzbnrVar.zze("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
            }
        } catch (RemoteException e9) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e9);
        }
    }

    public final /* synthetic */ void zzo(final zzccn zzccnVar) {
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwv
            @Override // java.lang.Runnable
            public final void run() {
                String zzc = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzc();
                boolean isEmpty = TextUtils.isEmpty(zzc);
                zzccn zzccnVar2 = zzccnVar;
                if (!isEmpty) {
                    zzccnVar2.zzc(zzc);
                } else {
                    zzccnVar2.zzd(new Exception());
                }
            }
        });
    }

    public final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    public final /* synthetic */ void zzq(Object obj, zzccn zzccnVar, String str, long j7, zzfmc zzfmcVar) {
        synchronized (obj) {
            try {
                if (!zzccnVar.isDone()) {
                    zzv(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - j7));
                    this.zzl.zzb(str, "timeout");
                    this.zzo.zzb(str, "timeout");
                    zzfmq zzfmqVar = this.zzp;
                    zzfmcVar.zzc("Timeout");
                    zzfmcVar.zzh(false);
                    zzfmqVar.zzb(zzfmcVar.zzn());
                    zzccnVar.zzc(Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzbgq.zza.zze()).booleanValue()) {
            if (this.zzm.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbO)).intValue() && this.zzq) {
                if (!this.zza) {
                    synchronized (this) {
                        try {
                            if (this.zza) {
                                return;
                            }
                            this.zzl.zzf();
                            this.zzo.zzf();
                            this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxb
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzdxf.this.zzp();
                                }
                            }, this.zzi);
                            this.zza = true;
                            f4.c zzu = zzu();
                            this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwu
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzdxf.this.zzm();
                                }
                            }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbQ)).longValue(), TimeUnit.SECONDS);
                            zzgft.zzr(zzu, new zzdxd(this), this.zzi);
                            return;
                        } catch (Throwable th) {
                            throw th;
                        }
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

    public final void zzs(final zzbnu zzbnuVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwz
            @Override // java.lang.Runnable
            public final void run() {
                zzdxf zzdxfVar = zzdxf.this;
                try {
                    zzbnuVar.zzb(zzdxfVar.zzg());
                } catch (RemoteException e4) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
                }
            }
        }, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
