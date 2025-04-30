package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzeyt implements zzexv {

    @Nullable
    private final AdvertisingIdClient.Info zza;

    @Nullable
    private final String zzb;
    private final zzfvd zzc;

    public zzeyt(@Nullable AdvertisingIdClient.Info info, @Nullable String str, zzfvd zzfvdVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzfvdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            JSONObject zzg = com.google.android.gms.ads.internal.util.zzbw.zzg((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info != null && !TextUtils.isEmpty(info.getId())) {
                zzg.put("rdid", this.zza.getId());
                zzg.put("is_lat", this.zza.isLimitAdTrackingEnabled());
                zzg.put("idtype", "adid");
                zzfvd zzfvdVar = this.zzc;
                if (zzfvdVar.zzc()) {
                    zzg.put("paidv1_id_android_3p", zzfvdVar.zzb());
                    zzg.put("paidv1_creation_time_android_3p", this.zzc.zza());
                    return;
                }
                return;
            }
            String str = this.zzb;
            if (str != null) {
                zzg.put("pdid", str);
                zzg.put("pdidtype", "ssaid");
            }
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e4);
        }
    }
}
