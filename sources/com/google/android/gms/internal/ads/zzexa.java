package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzexa implements zzevy {

    @Nullable
    private final AdvertisingIdClient.Info zza;

    @Nullable
    private final String zzb;
    private final zzfth zzc;

    public zzexa(@Nullable AdvertisingIdClient.Info info, @Nullable String str, zzfth zzfthVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzfthVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        long epochMilli;
        try {
            JSONObject zzg = com.google.android.gms.ads.internal.util.zzbr.zzg((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info != null && !TextUtils.isEmpty(info.getId())) {
                zzg.put("rdid", this.zza.getId());
                zzg.put("is_lat", this.zza.isLimitAdTrackingEnabled());
                zzg.put("idtype", "adid");
                if (this.zzc.zzc()) {
                    zzg.put("paidv1_id_android_3p", this.zzc.zza());
                    epochMilli = this.zzc.zzb().toEpochMilli();
                    zzg.put("paidv1_creation_time_android_3p", epochMilli);
                    return;
                }
                return;
            }
            String str = this.zzb;
            if (str != null) {
                zzg.put("pdid", str);
                zzg.put("pdidtype", "ssaid");
            }
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e2);
        }
    }
}
