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

/* loaded from: classes2.dex */
public final class zzdya implements zzdzb, zzdxl {
    private final zzdyl zza;
    private final zzdzc zzb;
    private final zzdxm zzc;
    private final zzdxv zzd;
    private final zzdxk zze;
    private final zzdyx zzf;
    private final zzdyh zzg;
    private final zzdyh zzh;
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
    private zzdxw zzr = zzdxw.NONE;
    private zzdxz zzv = zzdxz.UNKNOWN;
    private long zzw = 0;
    private String zzx = "";

    public zzdya(zzdyl zzdylVar, zzdzc zzdzcVar, zzdxm zzdxmVar, Context context, VersionInfoParcel versionInfoParcel, zzdxv zzdxvVar, zzdyx zzdyxVar, zzdyh zzdyhVar, zzdyh zzdyhVar2, String str) {
        this.zza = zzdylVar;
        this.zzb = zzdzcVar;
        this.zzc = zzdxmVar;
        this.zze = new zzdxk(context);
        this.zzi = versionInfoParcel.afmaVersion;
        this.zzk = str;
        this.zzd = zzdxvVar;
        this.zzf = zzdyxVar;
        this.zzg = zzdyhVar;
        this.zzh = zzdyhVar2;
        this.zzj = context;
        com.google.android.gms.ads.internal.zzu.zzs().zzg(this);
    }

    private final synchronized void zzA(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzx(jSONObject.optBoolean("isTestMode", false), false);
            zzw((zzdxw) Enum.valueOf(zzdxw.class, jSONObject.optString("gesture", "NONE")), false);
            this.zzo = jSONObject.optString("networkExtras", JsonUtils.EMPTY_JSON);
            this.zzq = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    private final synchronized JSONObject zzt() throws JSONException {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.zzl.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (zzdxo zzdxoVar : (List) entry.getValue()) {
                    if (zzdxoVar.zzg()) {
                        jSONArray.put(zzdxoVar.zzd());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
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
        zzbeg zzbegVar = zzbep.zzjx;
        if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar))) {
            this.zzg.zzb(PreferenceManager.getDefaultSharedPreferences(this.zzj), Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar)).split(",")));
        }
        zzbeg zzbegVar2 = zzbep.zzjy;
        if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar2))) {
            this.zzh.zzb(this.zzj.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0), Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar2)).split(",")));
        }
        zzA(com.google.android.gms.ads.internal.zzu.zzo().zzi().zzn());
        this.zzx = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzo();
    }

    private final void zzv() {
        com.google.android.gms.ads.internal.zzu.zzo().zzi().zzG(zzd());
    }

    private final synchronized void zzw(zzdxw zzdxwVar, boolean z8) {
        try {
            if (this.zzr != zzdxwVar) {
                if (zzq()) {
                    zzy();
                }
                this.zzr = zzdxwVar;
                if (zzq()) {
                    zzz();
                }
                if (z8) {
                    zzv();
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:9:0x0006, B:11:0x000a, B:13:0x001c, B:16:0x0029, B:18:0x0038, B:22:0x002d, B:24:0x0033), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void zzx(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzs     // Catch: java.lang.Throwable -> L27
            if (r0 != r2) goto L6
            goto L3d
        L6:
            r1.zzs = r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.zzbeg r2 = com.google.android.gms.internal.ads.zzbep.zzjj     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.ads.zzben r0 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r0.zza(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            com.google.android.gms.ads.internal.util.zzay r2 = com.google.android.gms.ads.internal.zzu.zzs()     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.zzl()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L2d
            goto L29
        L27:
            r2 = move-exception
            goto L3f
        L29:
            r1.zzz()     // Catch: java.lang.Throwable -> L27
            goto L36
        L2d:
            boolean r2 = r1.zzq()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L36
            r1.zzy()     // Catch: java.lang.Throwable -> L27
        L36:
            if (r3 == 0) goto L3d
            r1.zzv()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r1)
            return
        L3d:
            monitor-exit(r1)
            return
        L3f:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdya.zzx(boolean, boolean):void");
    }

    private final synchronized void zzy() {
        zzdxw zzdxwVar = zzdxw.NONE;
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
        zzdxw zzdxwVar = zzdxw.NONE;
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

    public final zzdxw zza() {
        return this.zzr;
    }

    public final synchronized f4.c zzb(String str) {
        zzccn zzccnVar;
        try {
            zzccnVar = new zzccn();
            if (this.zzm.containsKey(str)) {
                zzccnVar.zzc((zzdxo) this.zzm.get(str));
            } else {
                if (!this.zzn.containsKey(str)) {
                    this.zzn.put(str, new ArrayList());
                }
                ((List) this.zzn.get(str)).add(zzccnVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzccnVar;
    }

    public final synchronized String zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziU)).booleanValue() && zzq()) {
            if (this.zzq < com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() / 1000) {
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
            if (this.zzq > com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() / 1000) {
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
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("platform", "ANDROID");
                if (!TextUtils.isEmpty(this.zzk)) {
                    jSONObject.put("sdkVersion", "afma-sdk-a-v" + this.zzk);
                }
                jSONObject.put("internalSdkVersion", this.zzi);
                jSONObject.put("osVersion", Build.VERSION.RELEASE);
                jSONObject.put("adapters", this.zzd.zza());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzju)).booleanValue()) {
                    String zzn = com.google.android.gms.ads.internal.zzu.zzo().zzn();
                    if (!TextUtils.isEmpty(zzn)) {
                        jSONObject.put("plugin", zzn);
                    }
                }
                if (this.zzq < com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() / 1000) {
                    this.zzo = JsonUtils.EMPTY_JSON;
                }
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("adSlots", zzt());
                jSONObject.put("appInfo", this.zze.zza());
                String zzc = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzc();
                if (!TextUtils.isEmpty(zzc)) {
                    jSONObject.put("cld", new JSONObject(zzc));
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjk)).booleanValue() && (jSONObject2 = this.zzp) != null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zze("Server data: " + jSONObject2.toString());
                    jSONObject.put("serverData", this.zzp);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjj)).booleanValue()) {
                    jSONObject.put("openAction", this.zzv);
                    jSONObject.put("gesture", this.zzr);
                }
                jSONObject.put("isGamRegisteredTestDevice", com.google.android.gms.ads.internal.zzu.zzs().zzl());
                com.google.android.gms.ads.internal.zzu.zzp();
                com.google.android.gms.ads.internal.client.zzay.zzb();
                jSONObject.put("isSimulator", com.google.android.gms.ads.internal.util.client.zzf.zzs());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjw)).booleanValue()) {
                    jSONObject.put("uiStorage", new JSONObject(this.zzx));
                }
                if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjy))) {
                    jSONObject.put("gmaDisk", this.zzh.zza());
                }
                if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjx))) {
                    jSONObject.put("userDisk", this.zzg.zza());
                }
            } catch (JSONException e4) {
                com.google.android.gms.ads.internal.zzu.zzo().zzv(e4, "Inspector.toJson");
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Ad inspector encountered an error", e4);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final synchronized void zzf(String str, zzdxo zzdxoVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziU)).booleanValue() && zzq()) {
            if (this.zzt >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziW)).intValue()) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.zzl.containsKey(str)) {
                this.zzl.put(str, new ArrayList());
            }
            this.zzt++;
            ((List) this.zzl.get(str)).add(zzdxoVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjs)).booleanValue()) {
                String zzc = zzdxoVar.zzc();
                this.zzm.put(zzc, zzdxoVar);
                if (this.zzn.containsKey(zzc)) {
                    List list = (List) this.zzn.get(zzc);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((zzccn) it.next()).zzc(zzdxoVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziU)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjj)).booleanValue() && com.google.android.gms.ads.internal.zzu.zzo().zzi().zzR()) {
                zzu();
                return;
            }
            String zzn = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzn();
            if (!TextUtils.isEmpty(zzn)) {
                try {
                    if (new JSONObject(zzn).optBoolean("isTestMode", false)) {
                        zzu();
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzda zzdaVar, zzdxz zzdxzVar) {
        if (!zzq()) {
            try {
                zzdaVar.zze(zzfiq.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziU)).booleanValue()) {
            try {
                zzdaVar.zze(zzfiq.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Ad inspector had an internal error.");
                return;
            }
        } else {
            this.zzv = zzdxzVar;
            this.zza.zzj(zzdaVar, new zzbmj(this), new zzbmc(this.zzf), new zzblq(this));
            return;
        }
    }

    public final synchronized void zzi(String str, long j7) {
        this.zzo = str;
        this.zzq = j7;
        zzv();
    }

    public final synchronized void zzj(String str) {
        this.zzx = str;
        com.google.android.gms.ads.internal.zzu.zzo().zzi().zzH(this.zzx);
    }

    public final synchronized void zzk(long j7) {
        this.zzw += j7;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdya.zzl(boolean):void");
    }

    public final void zzm(zzdxw zzdxwVar) {
        zzw(zzdxwVar, true);
    }

    public final synchronized void zzn(JSONObject jSONObject) {
        this.zzp = jSONObject;
    }

    public final void zzo(boolean z8) {
        if (!this.zzu && z8) {
            zzu();
        }
        zzx(z8, true);
    }

    public final boolean zzp() {
        return this.zzp != null;
    }

    public final synchronized boolean zzq() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjj)).booleanValue()) {
            if (!this.zzs && !com.google.android.gms.ads.internal.zzu.zzs().zzl()) {
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
        if (this.zzw < ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjp)).longValue()) {
            return true;
        }
        return false;
    }
}
