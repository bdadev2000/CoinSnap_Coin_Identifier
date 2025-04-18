package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzbdw {
    private final ScheduledExecutorService zza;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzj zzb;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zza zzc;
    private final zzdui zzd;
    private Runnable zze;
    private zzbdt zzf;
    private CustomTabsSession zzg;
    private String zzh;
    private long zzi = 0;
    private long zzj;
    private JSONArray zzk;
    private Context zzl;

    @VisibleForTesting
    public zzbdw(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.ads.nonagon.signalgeneration.zzj zzjVar, com.google.android.gms.ads.nonagon.signalgeneration.zza zzaVar, zzdui zzduiVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzjVar;
        this.zzc = zzaVar;
        this.zzd = zzduiVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0049, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcv.zzjt)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzbdt r0 = r5.zzf
            if (r0 != 0) goto La
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r0)
            return
        La:
            java.lang.Boolean r0 = r0.zza()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L15
            return
        L15:
            java.lang.String r0 = r5.zzh
            if (r0 == 0) goto L83
            androidx.browser.customtabs.CustomTabsSession r0 = r5.zzg
            if (r0 == 0) goto L83
            java.util.concurrent.ScheduledExecutorService r0 = r5.zza
            if (r0 == 0) goto L83
            long r0 = r5.zzi
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            goto L39
        L2a:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r0.elapsedRealtime()
            long r2 = r5.zzi
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L39
            goto L4b
        L39:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjt
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L83
        L4b:
            androidx.browser.customtabs.CustomTabsSession r0 = r5.zzg
            java.lang.String r1 = r5.zzh
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.getClass()
            android.app.PendingIntent r2 = r0.e     // Catch: android.os.RemoteException -> L69
            a.c r3 = r0.f1360c
            a.f r4 = r0.f1359b
            if (r2 == 0) goto L66
            android.os.Bundle r0 = r0.a()     // Catch: android.os.RemoteException -> L69
            r4.q(r3, r1, r0)     // Catch: android.os.RemoteException -> L69
            goto L69
        L66:
            r4.d(r3, r1)     // Catch: android.os.RemoteException -> L69
        L69:
            java.util.concurrent.ScheduledExecutorService r0 = r5.zza
            java.lang.Runnable r1 = r5.zze
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzju
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L83:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdw.zzj():void");
    }

    private final void zzk(JSONObject jSONObject) {
        try {
            if (this.zzk == null) {
                this.zzk = new JSONArray((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjw));
            }
            jSONObject.put("eids", this.zzk);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error fetching the PACT active eids JSON: ", e);
        }
    }

    public final CustomTabsSession zzb() {
        return this.zzg;
    }

    @VisibleForTesting
    public final JSONObject zzc(String str, String str2) throws JSONException {
        long j2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        if (((Boolean) zzbew.zzb.zze()).booleanValue()) {
            j2 = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjx)).longValue();
        } else {
            j2 = 0;
        }
        jSONObject.put("sdk_ttl_ms", j2);
        zzk(jSONObject);
        if (((Boolean) zzbew.zza.zze()).booleanValue()) {
            jSONObject.put("appLevelSignals", this.zzc.zza());
        }
        return jSONObject;
    }

    @VisibleForTesting
    public final JSONObject zzd(String str, String str2) throws JSONException {
        long j2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        if (((Boolean) zzbew.zzb.zze()).booleanValue()) {
            j2 = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjx)).longValue();
        } else {
            j2 = 0;
        }
        jSONObject.put("sdk_ttl_ms", j2);
        zzk(jSONObject);
        if (((Boolean) zzbew.zza.zze()).booleanValue()) {
            jSONObject.put("appLevelSignals", this.zzc.zza());
        }
        return jSONObject;
    }

    public final void zzf() {
        this.zzi = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() + ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjs)).intValue();
        if (this.zze == null) {
            this.zze = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdu
                @Override // java.lang.Runnable
                public final void run() {
                    zzbdw.this.zzj();
                }
            };
        }
        zzj();
    }

    public final void zzg(Context context, CustomTabsClient customTabsClient, String str, CustomTabsCallback customTabsCallback) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (customTabsClient == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.zzl = context;
        this.zzh = str;
        zzbdt zzbdtVar = new zzbdt(this, customTabsCallback, this.zzd);
        this.zzf = zzbdtVar;
        CustomTabsSession d = customTabsClient.d(zzbdtVar);
        this.zzg = d;
        if (d == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("CustomTabsClient failed to create new session.");
        }
        com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(this.zzd, null, "pact_action", new Pair("pe", "pact_init"));
    }

    public final void zzh(String str) {
        try {
            CustomTabsSession customTabsSession = this.zzg;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.zzj).toString());
            zzk(jSONObject);
            if (((Boolean) zzbew.zza.zze()).booleanValue()) {
                jSONObject.put("appLevelSignals", this.zzc.zza());
            }
            customTabsSession.b(jSONObject.toString());
            zzbdv zzbdvVar = new zzbdv(this, str);
            if (((Boolean) zzbew.zzb.zze()).booleanValue()) {
                this.zzb.zzg(this.zzg, zzbdvVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            QueryInfo.generate(this.zzl, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbdvVar);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error creating JSON: ", e);
        }
    }

    public final void zzi(long j2) {
        this.zzj = j2;
    }
}
