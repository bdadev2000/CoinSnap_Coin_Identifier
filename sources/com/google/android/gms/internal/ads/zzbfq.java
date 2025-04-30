package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u.AbstractC2736e;
import u.C2732a;
import u.C2744m;

/* loaded from: classes2.dex */
public final class zzbfq {
    private final ScheduledExecutorService zza;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zze zzb;
    private Runnable zzc;
    private zzbfn zzd;
    private C2744m zze;
    private String zzf;
    private long zzg = 0;
    private long zzh;
    private JSONArray zzi;
    private Context zzj;

    public zzbfq(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.ads.nonagon.signalgeneration.zze zzeVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0049, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbep.zzjN)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbfn r0 = r6.zzd
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
            java.lang.String r0 = r6.zzf
            if (r0 == 0) goto La4
            u.m r0 = r6.zze
            if (r0 == 0) goto La4
            java.util.concurrent.ScheduledExecutorService r0 = r6.zza
            if (r0 == 0) goto La4
            long r0 = r6.zzg
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            goto L39
        L2a:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r0.elapsedRealtime()
            long r2 = r6.zzg
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L39
            goto L4b
        L39:
            com.google.android.gms.internal.ads.zzbeg r0 = com.google.android.gms.internal.ads.zzbep.zzjN
            com.google.android.gms.internal.ads.zzben r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La4
        L4b:
            u.m r0 = r6.zze
            java.lang.String r1 = r6.zzf
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.getClass()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            android.os.Bundle r3 = new android.os.Bundle     // Catch: android.os.RemoteException -> L8a
            r3.<init>()     // Catch: android.os.RemoteException -> L8a
            android.app.PendingIntent r4 = r0.f23056e     // Catch: android.os.RemoteException -> L8a
            if (r4 == 0) goto L6b
            if (r4 == 0) goto L6b
            java.lang.String r5 = "android.support.customtabs.extra.SESSION_ID"
            r3.putParcelable(r5, r4)     // Catch: android.os.RemoteException -> L8a
        L6b:
            boolean r4 = r3.isEmpty()     // Catch: android.os.RemoteException -> L8a
            if (r4 == 0) goto L72
            r3 = 0
        L72:
            c.a r4 = r0.f23054c
            c.d r0 = r0.b
            if (r3 == 0) goto L83
            r2.putAll(r3)     // Catch: android.os.RemoteException -> L8a
            c.b r0 = (c.C0578b) r0     // Catch: android.os.RemoteException -> L8a
            u.d r4 = (u.BinderC2735d) r4     // Catch: android.os.RemoteException -> L8a
            r0.g(r4, r1, r2)     // Catch: android.os.RemoteException -> L8a
            goto L8a
        L83:
            c.b r0 = (c.C0578b) r0     // Catch: android.os.RemoteException -> L8a
            u.d r4 = (u.BinderC2735d) r4     // Catch: android.os.RemoteException -> L8a
            r0.f(r4, r1)     // Catch: android.os.RemoteException -> L8a
        L8a:
            java.util.concurrent.ScheduledExecutorService r0 = r6.zza
            java.lang.Runnable r1 = r6.zzc
            com.google.android.gms.internal.ads.zzbeg r2 = com.google.android.gms.internal.ads.zzbep.zzjO
            com.google.android.gms.internal.ads.zzben r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        La4:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbfq.zzj():void");
    }

    private final void zzk(JSONObject jSONObject) {
        try {
            if (this.zzi == null) {
                this.zzi = new JSONArray((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjQ));
            }
            jSONObject.put("eids", this.zzi);
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error fetching the PACT active eids JSON: ", e4);
        }
    }

    public final C2744m zzb() {
        return this.zze;
    }

    public final JSONObject zzc(String str, String str2) throws JSONException {
        long j7;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        if (((Boolean) zzbgp.zza.zze()).booleanValue()) {
            j7 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjR)).longValue();
        } else {
            j7 = 0;
        }
        jSONObject.put("sdk_ttl_ms", j7);
        zzk(jSONObject);
        return jSONObject;
    }

    public final JSONObject zzd(String str, String str2) throws JSONException {
        long j7;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        if (((Boolean) zzbgp.zza.zze()).booleanValue()) {
            j7 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjR)).longValue();
        } else {
            j7 = 0;
        }
        jSONObject.put("sdk_ttl_ms", j7);
        zzk(jSONObject);
        return jSONObject;
    }

    public final void zzf() {
        this.zzg = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjM)).intValue();
        if (this.zzc == null) {
            this.zzc = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbfo
                @Override // java.lang.Runnable
                public final void run() {
                    zzbfq.this.zzj();
                }
            };
        }
        zzj();
    }

    public final void zzg(Context context, AbstractC2736e abstractC2736e, String str, C2732a c2732a) {
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (abstractC2736e != null) {
                    this.zzj = context;
                    this.zzf = str;
                    zzbfn zzbfnVar = new zzbfn(this, c2732a);
                    this.zzd = zzbfnVar;
                    C2744m b = abstractC2736e.b(zzbfnVar);
                    this.zze = b;
                    if (b == null) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzg("CustomTabsClient failed to create new session.");
                        return;
                    }
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
            C2744m c2744m = this.zze;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.zzh).toString());
            zzk(jSONObject);
            c2744m.a(jSONObject.toString());
            zzbfp zzbfpVar = new zzbfp(this, str);
            if (((Boolean) zzbgp.zza.zze()).booleanValue()) {
                this.zzb.zzg(this.zze, zzbfpVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            QueryInfo.generate(this.zzj, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbfpVar);
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error creating JSON: ", e4);
        }
    }

    public final void zzi(long j7) {
        this.zzh = j7;
    }
}
