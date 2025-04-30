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

/* loaded from: classes2.dex */
public final class zzeam {
    private final zzcjd zza;
    private final Context zzb;
    private final VersionInfoParcel zzc;
    private final zzfho zzd;
    private final Executor zze;
    private final String zzf;
    private final zzfmn zzg;
    private final zzfid zzh;
    private final zzdux zzi;

    public zzeam(zzcjd zzcjdVar, Context context, VersionInfoParcel versionInfoParcel, zzfho zzfhoVar, Executor executor, String str, zzfmn zzfmnVar, zzdux zzduxVar) {
        this.zza = zzcjdVar;
        this.zzb = context;
        this.zzc = versionInfoParcel;
        this.zzd = zzfhoVar;
        this.zze = executor;
        this.zzf = str;
        this.zzg = zzfmnVar;
        this.zzh = zzcjdVar.zzx();
        this.zzi = zzduxVar;
    }

    private final f4.c zzc(final String str, final String str2) {
        zzfmc zza = zzfmb.zza(this.zzb, zzfmu.CUI_NAME_ADREQUEST_PARSERESPONSE);
        zza.zzj();
        zzbqh zza2 = com.google.android.gms.ads.internal.zzu.zzf().zza(this.zzb, this.zzc, this.zza.zzz());
        zzbqb zzbqbVar = zzbqe.zza;
        final zzbpx zza3 = zza2.zza("google.afma.response.normalize", zzbqbVar, zzbqbVar);
        f4.c zzn = zzgft.zzn(zzgft.zzn(zzgft.zzn(zzgft.zzh(""), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeaj
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
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
                    return zzgft.zzh(jSONObject);
                } catch (JSONException e4) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e4.getCause())));
                }
            }
        }, this.zze), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeak
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzbpx.this.zzb((JSONObject) obj);
            }
        }, this.zze), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeal
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzeam.this.zzb((JSONObject) obj);
            }
        }, this.zze);
        zzfmm.zzb(zzn, this.zzg, zza);
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
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to update the ad types for rendering. ".concat(e4.toString()));
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

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final f4.c zza() {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeam.zza():f4.c");
    }

    public final /* synthetic */ f4.c zzb(JSONObject jSONObject) throws Exception {
        return zzgft.zzh(new zzfhf(new zzfhc(this.zzd), zzfhe.zza(new StringReader(jSONObject.toString()), null)));
    }
}
