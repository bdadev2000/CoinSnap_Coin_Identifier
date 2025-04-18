package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdvk implements zzdwl, zzduv {
    private final zzdvv zza;
    private final zzdwm zzb;
    private final zzduw zzc;
    private final zzdvf zzd;
    private final zzduu zze;
    private final zzdwh zzf;
    private final zzdvr zzg;
    private final zzdvr zzh;
    private final String zzi;
    private final Context zzj;
    private final String zzk;
    private JSONObject zzp;
    private boolean zzs;
    private int zzt;
    private boolean zzu;
    private final Map zzl = new HashMap();
    private final Map zzm = new HashMap();
    private final Map zzn = new HashMap();
    private String zzo = JsonUtils.EMPTY_JSON;
    private long zzq = Long.MAX_VALUE;
    private zzdvg zzr = zzdvg.NONE;
    private zzdvj zzv = zzdvj.UNKNOWN;
    private long zzw = 0;
    private String zzx = "";

    public zzdvk(zzdvv zzdvvVar, zzdwm zzdwmVar, zzduw zzduwVar, Context context, VersionInfoParcel versionInfoParcel, zzdvf zzdvfVar, zzdwh zzdwhVar, zzdvr zzdvrVar, zzdvr zzdvrVar2, String str) {
        this.zza = zzdvvVar;
        this.zzb = zzdwmVar;
        this.zzc = zzduwVar;
        this.zze = new zzduu(context);
        this.zzi = versionInfoParcel.afmaVersion;
        this.zzk = str;
        this.zzd = zzdvfVar;
        this.zzf = zzdwhVar;
        this.zzg = zzdvrVar;
        this.zzh = zzdvrVar2;
        this.zzj = context;
        com.google.android.gms.ads.internal.zzv.zzt().zzg(this);
    }

    private final synchronized void zzA(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzx(jSONObject.optBoolean("isTestMode", false), false);
            zzw((zzdvg) Enum.valueOf(zzdvg.class, jSONObject.optString("gesture", "NONE")), false);
            this.zzo = jSONObject.optString("networkExtras", JsonUtils.EMPTY_JSON);
            this.zzq = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    private final synchronized JSONObject zzt() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.zzl.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (zzduy zzduyVar : (List) entry.getValue()) {
                if (zzduyVar.zzg()) {
                    jSONArray.put(zzduyVar.zzd());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    private final void zzu() {
        this.zzu = true;
        this.zzd.zzc();
        this.zza.zzh(this);
        this.zzb.zzd(this);
        this.zzc.zzd(this);
        this.zzf.zzf(this);
        zzbce zzbceVar = zzbcn.zzjc;
        if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar))) {
            this.zzg.zzb(PreferenceManager.getDefaultSharedPreferences(this.zzj), Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).split(",")));
        }
        zzbce zzbceVar2 = zzbcn.zzjd;
        if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar2))) {
            this.zzh.zzb(this.zzj.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0), Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar2)).split(",")));
        }
        zzA(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzk());
        this.zzx = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzl();
    }

    private final void zzv() {
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzB(zzd());
    }

    private final synchronized void zzw(zzdvg zzdvgVar, boolean z10) {
        if (this.zzr != zzdvgVar) {
            if (zzq()) {
                zzy();
            }
            this.zzr = zzdvgVar;
            if (zzq()) {
                zzz();
            }
            if (z10) {
                zzv();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0006, B:11:0x000a, B:13:0x001c, B:15:0x0026, B:17:0x0035, B:21:0x002a, B:23:0x0030), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void zzx(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzs     // Catch: java.lang.Throwable -> L3c
            if (r0 != r2) goto L6
            goto L3a
        L6:
            r1.zzs = r2     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L2a
            com.google.android.gms.internal.ads.zzbce r2 = com.google.android.gms.internal.ads.zzbcn.zziO     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzbcl r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r0.zza(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L3c
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L26
            com.google.android.gms.ads.internal.util.zzax r2 = com.google.android.gms.ads.internal.zzv.zzt()     // Catch: java.lang.Throwable -> L3c
            boolean r2 = r2.zzl()     // Catch: java.lang.Throwable -> L3c
            if (r2 != 0) goto L2a
        L26:
            r1.zzz()     // Catch: java.lang.Throwable -> L3c
            goto L33
        L2a:
            boolean r2 = r1.zzq()     // Catch: java.lang.Throwable -> L3c
            if (r2 != 0) goto L33
            r1.zzy()     // Catch: java.lang.Throwable -> L3c
        L33:
            if (r3 == 0) goto L3a
            r1.zzv()     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r1)
            return
        L3a:
            monitor-exit(r1)
            return
        L3c:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdvk.zzx(boolean, boolean):void");
    }

    private final synchronized void zzy() {
        int ordinal = this.zzr.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            this.zzc.zzb();
            return;
        }
        this.zzb.zzb();
    }

    private final synchronized void zzz() {
        int ordinal = this.zzr.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            this.zzc.zzc();
            return;
        }
        this.zzb.zzc();
    }

    public final zzdvg zza() {
        return this.zzr;
    }

    public final synchronized ua.b zzb(String str) {
        zzcao zzcaoVar;
        zzcaoVar = new zzcao();
        if (this.zzm.containsKey(str)) {
            zzcaoVar.zzc((zzduy) this.zzm.get(str));
        } else {
            if (!this.zzn.containsKey(str)) {
                this.zzn.put(str, new ArrayList());
            }
            ((List) this.zzn.get(str)).add(zzcaoVar);
        }
        return zzcaoVar;
    }

    public final synchronized String zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziz)).booleanValue() && zzq()) {
            if (this.zzq < com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() / 1000) {
                this.zzo = JsonUtils.EMPTY_JSON;
                this.zzq = Long.MAX_VALUE;
                return "";
            }
            if (!this.zzo.equals(JsonUtils.EMPTY_JSON)) {
                return this.zzo;
            }
        }
        return "";
    }

    public final synchronized String zzd() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzs);
            jSONObject.put("gesture", this.zzr);
            if (this.zzq > com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("networkExtrasExpirationSecs", this.zzq);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject zze() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            if (!TextUtils.isEmpty(this.zzk)) {
                jSONObject.put("sdkVersion", "afma-sdk-a-v" + this.zzk);
            }
            jSONObject.put("internalSdkVersion", this.zzi);
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("adapters", this.zzd.zza());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziZ)).booleanValue()) {
                String zzn = com.google.android.gms.ads.internal.zzv.zzp().zzn();
                if (!TextUtils.isEmpty(zzn)) {
                    jSONObject.put("plugin", zzn);
                }
            }
            if (this.zzq < com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() / 1000) {
                this.zzo = JsonUtils.EMPTY_JSON;
            }
            jSONObject.put("networkExtras", this.zzo);
            jSONObject.put("adSlots", zzt());
            jSONObject.put("appInfo", this.zze.zza());
            String zzc = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc();
            if (!TextUtils.isEmpty(zzc)) {
                jSONObject.put("cld", new JSONObject(zzc));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziP)).booleanValue() && (jSONObject2 = this.zzp) != null) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Server data: " + jSONObject2.toString());
                jSONObject.put("serverData", this.zzp);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziO)).booleanValue()) {
                jSONObject.put("openAction", this.zzv);
                jSONObject.put("gesture", this.zzr);
            }
            jSONObject.put("isGamRegisteredTestDevice", com.google.android.gms.ads.internal.zzv.zzt().zzl());
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            jSONObject.put("isSimulator", com.google.android.gms.ads.internal.util.client.zzf.zzs());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjb)).booleanValue()) {
                jSONObject.put("uiStorage", new JSONObject(this.zzx));
            }
            if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjd))) {
                jSONObject.put("gmaDisk", this.zzh.zza());
            }
            if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjc))) {
                jSONObject.put("userDisk", this.zzg.zza());
            }
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(e2, "Inspector.toJson");
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Ad inspector encountered an error", e2);
        }
        return jSONObject;
    }

    public final synchronized void zzf(String str, zzduy zzduyVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziz)).booleanValue() && zzq()) {
            if (this.zzt >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziB)).intValue()) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.zzl.containsKey(str)) {
                this.zzl.put(str, new ArrayList());
            }
            this.zzt++;
            ((List) this.zzl.get(str)).add(zzduyVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziX)).booleanValue()) {
                String zzc = zzduyVar.zzc();
                this.zzm.put(zzc, zzduyVar);
                if (this.zzn.containsKey(zzc)) {
                    List list = (List) this.zzn.get(zzc);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((zzcao) it.next()).zzc(zzduyVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziz)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziO)).booleanValue() && com.google.android.gms.ads.internal.zzv.zzp().zzi().zzM()) {
                zzu();
                return;
            }
            String zzk = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzk();
            if (!TextUtils.isEmpty(zzk)) {
                try {
                    if (new JSONObject(zzk).optBoolean("isTestMode", false)) {
                        zzu();
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzdl zzdlVar, zzdvj zzdvjVar) {
        if (!zzq()) {
            try {
                zzdlVar.zze(zzfgq.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziz)).booleanValue()) {
            try {
                zzdlVar.zze(zzfgq.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Ad inspector had an internal error.");
                return;
            }
        } else {
            this.zzv = zzdvjVar;
            this.zza.zzj(zzdlVar, new zzbkl(this), new zzbke(this.zzf), new zzbjs(this));
            return;
        }
    }

    public final synchronized void zzi(String str, long j3) {
        this.zzo = str;
        this.zzq = j3;
        zzv();
    }

    public final synchronized void zzj(String str) {
        this.zzx = str;
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzC(this.zzx);
    }

    public final synchronized void zzk(long j3) {
        this.zzw += j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x000a, code lost:
    
        if (r2 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzl(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.zzu
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.zzu()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.zzs
            if (r2 == 0) goto L11
            goto L15
        L11:
            r1.zzz()
            return
        L15:
            boolean r2 = r1.zzq()
            if (r2 != 0) goto L1e
            r1.zzy()
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdvk.zzl(boolean):void");
    }

    public final void zzm(zzdvg zzdvgVar) {
        zzw(zzdvgVar, true);
    }

    public final synchronized void zzn(JSONObject jSONObject) {
        this.zzp = jSONObject;
    }

    public final void zzo(boolean z10) {
        if (!this.zzu && z10) {
            zzu();
        }
        zzx(z10, true);
    }

    public final boolean zzp() {
        return this.zzp != null;
    }

    public final synchronized boolean zzq() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziO)).booleanValue()) {
            if (!this.zzs && !com.google.android.gms.ads.internal.zzv.zzt().zzl()) {
                return false;
            }
            return true;
        }
        return this.zzs;
    }

    public final synchronized boolean zzr() {
        return this.zzs;
    }

    public final boolean zzs() {
        if (this.zzw < ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziU)).longValue()) {
            return true;
        }
        return false;
    }
}
