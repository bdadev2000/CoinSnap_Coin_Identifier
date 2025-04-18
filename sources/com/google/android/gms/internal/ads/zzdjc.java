package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdjc extends zzdjd {
    private final JSONObject zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;
    private final String zzg;

    @Nullable
    private final JSONObject zzh;

    public zzdjc(zzfet zzfetVar, JSONObject jSONObject) {
        super(zzfetVar);
        JSONObject jSONObject2;
        this.zzb = com.google.android.gms.ads.internal.util.zzbr.zzh(jSONObject, "tracking_urls_and_actions", "active_view");
        this.zzc = com.google.android.gms.ads.internal.util.zzbr.zzl(false, jSONObject, "allow_pub_owned_ad_view");
        this.zzd = com.google.android.gms.ads.internal.util.zzbr.zzl(false, jSONObject, "attribution", "allow_pub_rendering");
        this.zze = com.google.android.gms.ads.internal.util.zzbr.zzl(false, jSONObject, "enable_omid");
        this.zzg = com.google.android.gms.ads.internal.util.zzbr.zzb("", jSONObject, "watermark_overlay_png_base64");
        this.zzf = jSONObject.optJSONObject("overlay") != null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfi)).booleanValue()) {
            jSONObject2 = jSONObject.optJSONObject("omid_settings");
        } else {
            jSONObject2 = null;
        }
        this.zzh = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.zzdjd
    public final zzffr zza() {
        JSONObject jSONObject = this.zzh;
        return jSONObject != null ? new zzffr(jSONObject) : this.zza.zzV;
    }

    @Override // com.google.android.gms.internal.ads.zzdjd
    public final String zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzdjd
    @Nullable
    public final JSONObject zzc() {
        JSONObject jSONObject = this.zzb;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.zza.zzz);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjd
    public final boolean zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdjd
    public final boolean zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdjd
    public final boolean zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdjd
    public final boolean zzg() {
        return this.zzf;
    }
}
