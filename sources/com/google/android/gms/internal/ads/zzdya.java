package com.google.android.gms.internal.ads;

import android.content.Context;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.internal.ui.i;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdya {
    private final zzchk zza;
    private final Context zzb;
    private final VersionInfoParcel zzc;
    private final zzffo zzd;
    private final Executor zze;
    private final String zzf;
    private final zzfkl zzg;
    private final zzdsh zzh;
    private final Object zzi = new Object();

    public zzdya(zzchk zzchkVar, Context context, VersionInfoParcel versionInfoParcel, zzffo zzffoVar, Executor executor, String str, zzfkl zzfklVar, zzdsh zzdshVar) {
        this.zza = zzchkVar;
        this.zzb = context;
        this.zzc = versionInfoParcel;
        this.zzd = zzffoVar;
        this.zze = executor;
        this.zzf = str;
        this.zzg = zzfklVar;
        zzchkVar.zzx();
        this.zzh = zzdshVar;
    }

    private final ua.b zzc(final String str, final String str2) {
        zzfka zza = zzfjz.zza(this.zzb, 11);
        zza.zzi();
        zzboi zza2 = com.google.android.gms.ads.internal.zzv.zzg().zza(this.zzb, this.zzc, this.zza.zzz());
        zzboc zzbocVar = zzbof.zza;
        final zzbny zza3 = zza2.zza("google.afma.response.normalize", zzbocVar, zzbocVar);
        ua.b zzn = zzgei.zzn(zzgei.zzn(zzgei.zzn(zzgei.zzh(""), new zzgdp(this) { // from class: com.google.android.gms.internal.ads.zzdxx
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str3 = str;
                String str4 = str2;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put(TtmlNode.TAG_BODY, str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put(i.REQUEST_KEY_EXTRA, jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zzgei.zzh(jSONObject);
                } catch (JSONException e2) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e2.getCause())));
                }
            }
        }, this.zze), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdxy
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzbny.this.zzb((JSONObject) obj);
            }
        }, this.zze), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdxz
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzdya.this.zzb((JSONObject) obj);
            }
        }, this.zze);
        zzfkk.zza(zzn, this.zzg, zza);
        return zzn;
    }

    private final String zzd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && AppLovinMediationProvider.UNKNOWN.equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzf));
            }
            return jSONObject.toString();
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to update the ad types for rendering. ".concat(e2.toString()));
            return str;
        }
    }

    private static final String zze(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.String zzf(java.lang.String r4, java.lang.String r5, java.lang.String r6, com.google.android.gms.internal.ads.zzdsh r7) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L87
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
            goto L87
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
            if (r1 != 0) goto L87
            r1 = 11
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.String r1 = "UTF-8"
            byte[] r5 = r5.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> L70
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L54 java.io.UnsupportedEncodingException -> L70
            r1.<init>(r6)     // Catch: org.json.JSONException -> L54 java.io.UnsupportedEncodingException -> L70
            java.lang.String r6 = "arek"
            java.lang.String r2 = r1.getString(r6)     // Catch: org.json.JSONException -> L54 java.io.UnsupportedEncodingException -> L70
            goto L6b
        L54:
            r6 = move-exception
            java.lang.String r1 = r6.toString()     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.String r3 = "Failed to get key from QueryJSONMap"
            java.lang.String r1 = r3.concat(r1)     // Catch: java.io.UnsupportedEncodingException -> L70
            com.google.android.gms.ads.internal.util.zze.zza(r1)     // Catch: java.io.UnsupportedEncodingException -> L70
            com.google.android.gms.internal.ads.zzbzz r1 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.String r3 = "CryptoUtils.getKeyFromQueryJsonMap"
            r1.zzw(r6, r3)     // Catch: java.io.UnsupportedEncodingException -> L70
        L6b:
            java.lang.String r4 = com.google.android.gms.internal.ads.zzfgd.zzb(r0, r5, r2, r7)     // Catch: java.io.UnsupportedEncodingException -> L70
            return r4
        L70:
            r5 = move-exception
            java.lang.String r6 = "Failed to decode the adResponse. "
            java.lang.String r7 = r5.toString()
            java.lang.String r6 = r6.concat(r7)
            com.google.android.gms.ads.internal.util.zze.zza(r6)
            java.lang.String r6 = "PreloadedLoader.decryptAdResponseIfNecessary"
            com.google.android.gms.internal.ads.zzbzz r7 = com.google.android.gms.ads.internal.zzv.zzp()
            r7.zzw(r5, r6)
        L87:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdya.zzf(java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.zzdsh):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x012e, code lost:
    
        if (r4.zzg(r1, r6, r2) == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ua.b zza() {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdya.zza():ua.b");
    }

    public final /* synthetic */ ua.b zzb(JSONObject jSONObject) throws Exception {
        return zzgei.zzh(new zzfff(new zzffc(this.zzd), zzffe.zza(new StringReader(jSONObject.toString()), null)));
    }
}
