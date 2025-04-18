package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import o.h;
import o.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbds {
    private final ScheduledExecutorService zza;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzj zzb;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zza zzc;
    private final zzdsr zzd;
    private Runnable zze;
    private zzbdp zzf;
    private s zzg;
    private String zzh;
    private long zzi = 0;
    private long zzj;
    private JSONArray zzk;
    private Context zzl;

    public zzbds(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.ads.nonagon.signalgeneration.zzj zzjVar, com.google.android.gms.ads.nonagon.signalgeneration.zza zzaVar, zzdsr zzdsrVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzjVar;
        this.zzc = zzaVar;
        this.zzd = zzdsrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0049, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcn.zzjv)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbdp r0 = r6.zzf
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
            java.lang.String r0 = r6.zzh
            if (r0 == 0) goto La0
            o.s r0 = r6.zzg
            if (r0 == 0) goto La0
            java.util.concurrent.ScheduledExecutorService r0 = r6.zza
            if (r0 == 0) goto La0
            long r0 = r6.zzi
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            goto L39
        L2a:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzv.zzC()
            long r0 = r0.elapsedRealtime()
            long r2 = r6.zzi
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L39
            goto L4b
        L39:
            com.google.android.gms.internal.ads.zzbce r0 = com.google.android.gms.internal.ads.zzbcn.zzjv
            com.google.android.gms.internal.ads.zzbcl r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La0
        L4b:
            o.s r0 = r6.zzg
            java.lang.String r1 = r6.zzh
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.getClass()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            android.os.Bundle r3 = new android.os.Bundle     // Catch: android.os.RemoteException -> L86
            r3.<init>()     // Catch: android.os.RemoteException -> L86
            android.app.PendingIntent r4 = r0.f22953e     // Catch: android.os.RemoteException -> L86
            if (r4 == 0) goto L6b
            if (r4 == 0) goto L6b
            java.lang.String r5 = "android.support.customtabs.extra.SESSION_ID"
            r3.putParcelable(r5, r4)     // Catch: android.os.RemoteException -> L86
        L6b:
            boolean r4 = r3.isEmpty()     // Catch: android.os.RemoteException -> L86
            if (r4 == 0) goto L72
            r3 = 0
        L72:
            b.b r4 = r0.f22951c
            b.e r0 = r0.f22950b
            if (r3 == 0) goto L81
            r2.putAll(r3)     // Catch: android.os.RemoteException -> L86
            b.c r0 = (b.c) r0     // Catch: android.os.RemoteException -> L86
            r0.i(r4, r1, r2)     // Catch: android.os.RemoteException -> L86
            goto L86
        L81:
            b.c r0 = (b.c) r0     // Catch: android.os.RemoteException -> L86
            r0.h(r4, r1)     // Catch: android.os.RemoteException -> L86
        L86:
            java.util.concurrent.ScheduledExecutorService r0 = r6.zza
            java.lang.Runnable r1 = r6.zze
            com.google.android.gms.internal.ads.zzbce r2 = com.google.android.gms.internal.ads.zzbcn.zzjw
            com.google.android.gms.internal.ads.zzbcl r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        La0:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbds.zzj():void");
    }

    private final void zzk(JSONObject jSONObject) {
        try {
            if (this.zzk == null) {
                this.zzk = new JSONArray((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjy));
            }
            jSONObject.put("eids", this.zzk);
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error fetching the PACT active eids JSON: ", e2);
        }
    }

    public final s zzb() {
        return this.zzg;
    }

    public final JSONObject zzc(String str, String str2) throws JSONException {
        long j3;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        if (((Boolean) zzbes.zzb.zze()).booleanValue()) {
            j3 = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjz)).longValue();
        } else {
            j3 = 0;
        }
        jSONObject.put("sdk_ttl_ms", j3);
        zzk(jSONObject);
        if (((Boolean) zzbes.zza.zze()).booleanValue()) {
            jSONObject.put("appLevelSignals", this.zzc.zza());
        }
        return jSONObject;
    }

    public final JSONObject zzd(String str, String str2) throws JSONException {
        long j3;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        if (((Boolean) zzbes.zzb.zze()).booleanValue()) {
            j3 = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjz)).longValue();
        } else {
            j3 = 0;
        }
        jSONObject.put("sdk_ttl_ms", j3);
        zzk(jSONObject);
        if (((Boolean) zzbes.zza.zze()).booleanValue()) {
            jSONObject.put("appLevelSignals", this.zzc.zza());
        }
        return jSONObject;
    }

    public final void zzf() {
        this.zzi = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() + ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzju)).intValue();
        if (this.zze == null) {
            this.zze = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdq
                @Override // java.lang.Runnable
                public final void run() {
                    zzbds.this.zzj();
                }
            };
        }
        zzj();
    }

    public final void zzg(Context context, h hVar, String str, o.a aVar) {
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (hVar != null) {
                    this.zzl = context;
                    this.zzh = str;
                    zzbdp zzbdpVar = new zzbdp(this, aVar, this.zzd);
                    this.zzf = zzbdpVar;
                    s c10 = hVar.c(zzbdpVar);
                    this.zzg = c10;
                    if (c10 == null) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzg("CustomTabsClient failed to create new session.");
                    }
                    com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(this.zzd, null, "pact_action", new Pair("pe", "pact_init"));
                    return;
                }
                throw new IllegalArgumentException("CustomTabsClient parameter is null");
            }
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        throw new IllegalArgumentException("App Context parameter is null");
    }

    public final void zzh(String str) {
        try {
            s sVar = this.zzg;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.zzj).toString());
            zzk(jSONObject);
            if (((Boolean) zzbes.zza.zze()).booleanValue()) {
                jSONObject.put("appLevelSignals", this.zzc.zza());
            }
            sVar.b(jSONObject.toString());
            zzbdr zzbdrVar = new zzbdr(this, str);
            if (((Boolean) zzbes.zzb.zze()).booleanValue()) {
                this.zzb.zzg(this.zzg, zzbdrVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            QueryInfo.generate(this.zzl, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbdrVar);
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error creating JSON: ", e2);
        }
    }

    public final void zzi(long j3) {
        this.zzj = j3;
    }
}
