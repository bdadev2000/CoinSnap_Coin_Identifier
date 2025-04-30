package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import org.json.JSONException;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdwg {

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

    public /* synthetic */ zzdwg(String str, zzdwf zzdwfVar) {
        this.zzb = str;
    }

    public static /* bridge */ /* synthetic */ String zza(zzdwg zzdwgVar) {
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjX);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdwgVar.zza);
            jSONObject.put("eventCategory", zzdwgVar.zzb);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, zzdwgVar.zzc);
            jSONObject.putOpt("errorCode", zzdwgVar.zzd);
            jSONObject.putOpt("rewardType", zzdwgVar.zze);
            jSONObject.putOpt("rewardAmount", zzdwgVar.zzf);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not convert parameters to JSON.");
        }
        return AbstractC2914a.f(str, "(\"h5adsEvent\",", jSONObject.toString(), ");");
    }
}
