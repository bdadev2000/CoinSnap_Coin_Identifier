package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
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

/* loaded from: classes4.dex */
public final class zzdwg {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdru zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdun zzl;
    private final VersionInfoParcel zzm;
    private final zzdez zzo;
    private final zzfmd zzp;
    private boolean zza = false;
    private boolean zzb = false;

    @GuardedBy
    private boolean zzc = false;
    private final zzcas zze = new zzcas();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();

    public zzdwg(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdru zzdruVar, ScheduledExecutorService scheduledExecutorService, zzdun zzdunVar, VersionInfoParcel versionInfoParcel, zzdez zzdezVar, zzfmd zzfmdVar) {
        this.zzh = zzdruVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdunVar;
        this.zzm = versionInfoParcel;
        this.zzo = zzdezVar;
        this.zzp = zzfmdVar;
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public static /* bridge */ /* synthetic */ void zzj(final zzdwg zzdwgVar, String str) {
        int i2 = 5;
        final zzflp zza = zzflo.zza(zzdwgVar.zzf, 5);
        zza.zzi();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final zzflp zza2 = zzflo.zza(zzdwgVar.zzf, i2);
                zza2.zzi();
                zza2.zzd(next);
                final Object obj = new Object();
                final zzcas zzcasVar = new zzcas();
                ListenableFuture zzo = zzgfo.zzo(zzcasVar, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbR)).longValue(), TimeUnit.SECONDS, zzdwgVar.zzk);
                zzdwgVar.zzl.zzc(next);
                zzdwgVar.zzo.zzc(next);
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
                zzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdwg.this.zzq(obj, zzcasVar, next, elapsedRealtime, zza2);
                    }
                }, zzdwgVar.zzi);
                arrayList.add(zzo);
                final zzdwf zzdwfVar = new zzdwf(zzdwgVar, obj, next, elapsedRealtime, zza2, zzcasVar);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        int i3 = 0;
                        while (i3 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
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
                            arrayList2.add(new zzbme(optString, bundle));
                            i3++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdwgVar.zzv(next, false, "", 0);
                try {
                    try {
                        final zzfia zzc = zzdwgVar.zzh.zzc(next, new JSONObject());
                        zzdwgVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwb
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdwg.this.zzn(next, zzdwfVar, zzc, arrayList2);
                            }
                        });
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
                    }
                } catch (zzfhj unused2) {
                    zzdwfVar.zze("Failed to create Adapter.");
                }
                i2 = 5;
            }
            zzgfo.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdvy
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzdwg.this.zzf(zza);
                    return null;
                }
            }, zzdwgVar.zzi);
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e2);
            zzdwgVar.zzo.zza("MalformedJson");
            zzdwgVar.zzl.zza("MalformedJson");
            zzdwgVar.zze.zzd(e2);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e2, "AdapterInitializer.updateAdapterStatus");
            zzfmd zzfmdVar = zzdwgVar.zzp;
            zza.zzh(e2);
            zza.zzg(false);
            zzfmdVar.zzb(zza.zzm());
        }
    }

    private final synchronized ListenableFuture zzu() {
        String zzc = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzc();
        if (!TextUtils.isEmpty(zzc)) {
            return zzgfo.zzh(zzc);
        }
        final zzcas zzcasVar = new zzcas();
        com.google.android.gms.ads.internal.zzu.zzo().zzi().zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvz
            @Override // java.lang.Runnable
            public final void run() {
                zzdwg.this.zzo(zzcasVar);
            }
        });
        return zzcasVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str, boolean z2, String str2, int i2) {
        this.zzn.put(str, new zzblu(str, z2, i2, str2));
    }

    public final /* synthetic */ Object zzf(zzflp zzflpVar) throws Exception {
        this.zze.zzc(Boolean.TRUE);
        zzflpVar.zzg(true);
        this.zzp.zzb(zzflpVar.zzm());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzblu zzbluVar = (zzblu) this.zzn.get(str);
            arrayList.add(new zzblu(str, zzbluVar.zzb, zzbluVar.zzc, zzbluVar.zzd));
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

    public final /* synthetic */ void zzn(String str, zzbly zzblyVar, zzfia zzfiaVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzblyVar.zzf();
                    return;
                }
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfiaVar.zzi(context, zzblyVar, list);
            } catch (RemoteException e) {
                throw new zzfyv(e);
            } catch (zzfhj unused) {
                zzblyVar.zze("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
        }
    }

    public final /* synthetic */ void zzo(final zzcas zzcasVar) {
        this.zzi.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdvw
            @Override // java.lang.Runnable
            public final void run() {
                String zzc = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzc();
                boolean isEmpty = TextUtils.isEmpty(zzc);
                zzcas zzcasVar2 = zzcasVar;
                if (isEmpty) {
                    zzcasVar2.zzd(new Exception());
                } else {
                    zzcasVar2.zzc(zzc);
                }
            }
        });
    }

    public final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    public final /* synthetic */ void zzq(Object obj, zzcas zzcasVar, String str, long j2, zzflp zzflpVar) {
        synchronized (obj) {
            try {
                if (!zzcasVar.isDone()) {
                    zzv(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - j2));
                    this.zzl.zzb(str, "timeout");
                    this.zzo.zzb(str, "timeout");
                    zzfmd zzfmdVar = this.zzp;
                    zzflpVar.zzc("Timeout");
                    zzflpVar.zzg(false);
                    zzfmdVar.zzb(zzflpVar.zzm());
                    zzcasVar.zzc(Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzbex.zza.zze()).booleanValue()) {
            if (this.zzm.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbQ)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.zza) {
                            return;
                        }
                        this.zzl.zzf();
                        this.zzo.zzf();
                        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwc
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdwg.this.zzp();
                            }
                        }, this.zzi);
                        this.zza = true;
                        ListenableFuture zzu = zzu();
                        this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvv
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdwg.this.zzm();
                            }
                        }, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbS)).longValue(), TimeUnit.SECONDS);
                        zzgfo.zzr(zzu, new zzdwe(this), this.zzi);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzc(Boolean.FALSE);
        this.zza = true;
        this.zzb = true;
    }

    public final void zzs(final zzbmb zzbmbVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwa
            @Override // java.lang.Runnable
            public final void run() {
                zzdwg zzdwgVar = zzdwg.this;
                try {
                    zzbmbVar.zzb(zzdwgVar.zzg());
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
                }
            }
        }, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
