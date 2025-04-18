package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdtp {

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

    public /* synthetic */ zzdtp(String str, zzdtq zzdtqVar) {
        this.zzb = str;
    }

    public static /* bridge */ /* synthetic */ String zza(zzdtp zzdtpVar) {
        String str = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjF);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdtpVar.zza);
            jSONObject.put("eventCategory", zzdtpVar.zzb);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, zzdtpVar.zzc);
            jSONObject.putOpt("errorCode", zzdtpVar.zzd);
            jSONObject.putOpt("rewardType", zzdtpVar.zze);
            jSONObject.putOpt("rewardAmount", zzdtpVar.zzf);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }

    public static /* bridge */ /* synthetic */ void zzb(zzdtp zzdtpVar, Integer num) {
        zzdtpVar.zzd = num;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzdtp zzdtpVar, String str) {
        zzdtpVar.zzc = str;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzdtp zzdtpVar, Long l10) {
        zzdtpVar.zza = l10;
    }

    public static /* bridge */ /* synthetic */ void zze(zzdtp zzdtpVar, Integer num) {
        zzdtpVar.zzf = num;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzdtp zzdtpVar, String str) {
        zzdtpVar.zze = str;
    }
}
