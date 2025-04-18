package com.google.android.gms.internal.ads;

import android.content.Context;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzdzl {
    private final zzcho zza;
    private final Context zzb;
    private final VersionInfoParcel zzc;
    private final zzfhc zzd;
    private final Executor zze;
    private final String zzf;
    private final zzfma zzg;
    private final zzdty zzh;
    private final Object zzi = new Object();

    public zzdzl(zzcho zzchoVar, Context context, VersionInfoParcel versionInfoParcel, zzfhc zzfhcVar, Executor executor, String str, zzfma zzfmaVar, zzdty zzdtyVar) {
        this.zza = zzchoVar;
        this.zzb = context;
        this.zzc = versionInfoParcel;
        this.zzd = zzfhcVar;
        this.zze = executor;
        this.zzf = str;
        this.zzg = zzfmaVar;
        zzchoVar.zzx();
        this.zzh = zzdtyVar;
    }

    private final ListenableFuture zzc(final String str, final String str2) {
        zzflp zza = zzflo.zza(this.zzb, 11);
        zza.zzi();
        zzbon zza2 = com.google.android.gms.ads.internal.zzu.zzf().zza(this.zzb, this.zzc, this.zza.zzz());
        zzboh zzbohVar = zzbok.zza;
        final zzbod zza3 = zza2.zza("google.afma.response.normalize", zzbohVar, zzbohVar);
        ListenableFuture zzn = zzgfo.zzn(zzgfo.zzn(zzgfo.zzn(zzgfo.zzh(""), new zzgev(this) { // from class: com.google.android.gms.internal.ads.zzdzi
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str3 = str;
                String str4 = str2;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zzgfo.zzh(jSONObject);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e.getCause())));
                }
            }
        }, this.zze), new zzgev() { // from class: com.google.android.gms.internal.ads.zzdzj
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzbod.this.zzb((JSONObject) obj);
            }
        }, this.zze), new zzgev() { // from class: com.google.android.gms.internal.ads.zzdzk
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzdzl.this.zzb((JSONObject) obj);
            }
        }, this.zze);
        zzflz.zza(zzn, this.zzg, zza);
        return zzn;
    }

    private final String zzd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzf));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    private static final String zze(String str) {
        try {
            return new JSONObject(str).optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.String zzf(java.lang.String r4, java.lang.String r5, java.lang.String r6, com.google.android.gms.internal.ads.zzdty r7) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L88
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1c
            r0.<init>(r6)     // Catch: org.json.JSONException -> L1c
            java.lang.String r1 = "is_gbid"
            java.lang.String r0 = r0.optString(r1)     // Catch: org.json.JSONException -> L1c
            java.lang.String r1 = "true"
            boolean r0 = r0.equals(r1)     // Catch: org.json.JSONException -> L1c
            if (r0 == 0) goto L1c
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: org.json.JSONException -> L1c
            goto L1e
        L1c:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L1e:
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L25
            goto L88
        L25:
            java.lang.String r0 = "&"
            int r0 = r4.lastIndexOf(r0)
            r1 = -1
            r2 = 0
            if (r0 == r1) goto L35
            r1 = 0
            java.lang.String r0 = r4.substring(r1, r0)
            goto L36
        L35:
            r0 = r2
        L36:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L88
            r1 = 11
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> L54
            java.lang.String r1 = "UTF-8"
            byte[] r5 = r5.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> L54
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.io.UnsupportedEncodingException -> L54 org.json.JSONException -> L56
            r1.<init>(r6)     // Catch: java.io.UnsupportedEncodingException -> L54 org.json.JSONException -> L56
            java.lang.String r6 = "arek"
            java.lang.String r2 = r1.getString(r6)     // Catch: java.io.UnsupportedEncodingException -> L54 org.json.JSONException -> L56
            goto L6d
        L54:
            r5 = move-exception
            goto L72
        L56:
            r6 = move-exception
            java.lang.String r1 = r6.toString()     // Catch: java.io.UnsupportedEncodingException -> L54
            java.lang.String r3 = "Failed to get key from QueryJSONMap"
            java.lang.String r1 = r3.concat(r1)     // Catch: java.io.UnsupportedEncodingException -> L54
            com.google.android.gms.ads.internal.util.zze.zza(r1)     // Catch: java.io.UnsupportedEncodingException -> L54
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.io.UnsupportedEncodingException -> L54
            java.lang.String r3 = "CryptoUtils.getKeyFromQueryJsonMap"
            r1.zzw(r6, r3)     // Catch: java.io.UnsupportedEncodingException -> L54
        L6d:
            java.lang.String r4 = com.google.android.gms.internal.ads.zzfhr.zzb(r0, r5, r2, r7)     // Catch: java.io.UnsupportedEncodingException -> L54
            return r4
        L72:
            java.lang.String r6 = "Failed to decode the adResponse. "
            java.lang.String r7 = r5.toString()
            java.lang.String r6 = r6.concat(r7)
            com.google.android.gms.ads.internal.util.zze.zza(r6)
            java.lang.String r6 = "PreloadedLoader.decryptAdResponseIfNecessary"
            com.google.android.gms.internal.ads.zzcad r7 = com.google.android.gms.ads.internal.zzu.zzo()
            r7.zzw(r5, r6)
        L88:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdzl.zzf(java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.zzdty):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0132, code lost:
    
        if (r4.zzg(r1, r6, r2) == false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdzl.zza():com.google.common.util.concurrent.ListenableFuture");
    }

    public final /* synthetic */ ListenableFuture zzb(JSONObject jSONObject) throws Exception {
        return zzgfo.zzh(new zzfgt(new zzfgq(this.zzd), zzfgs.zza(new StringReader(jSONObject.toString()), null)));
    }
}
