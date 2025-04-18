package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.safedk.android.analytics.events.MaxEvent;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdvh {

    @Nullable
    private Long zza;
    private final String zzb;

    @Nullable
    private String zzc;

    @Nullable
    private Integer zzd;

    @Nullable
    private String zze;

    @Nullable
    private Integer zzf;

    public /* synthetic */ zzdvh(String str, zzdvg zzdvgVar) {
        this.zzb = str;
    }

    public static /* bridge */ /* synthetic */ String zza(zzdvh zzdvhVar) {
        String str = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjD);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdvhVar.zza);
            jSONObject.put("eventCategory", zzdvhVar.zzb);
            jSONObject.putOpt(MaxEvent.f29810a, zzdvhVar.zzc);
            jSONObject.putOpt("errorCode", zzdvhVar.zzd);
            jSONObject.putOpt("rewardType", zzdvhVar.zze);
            jSONObject.putOpt("rewardAmount", zzdvhVar.zzf);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }
}
