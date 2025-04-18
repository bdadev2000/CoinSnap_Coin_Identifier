package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzfey {

    @Nullable
    public final String zza;

    @Nullable
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    public zzfey(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject zzi = com.google.android.gms.ads.internal.util.zzbr.zzi(jsonReader);
        this.zzd = zzi;
        this.zza = zzi.optString(CampaignEx.JSON_KEY_AD_HTML, null);
        this.zzb = zzi.optString("ad_base_url", null);
        this.zzc = zzi.optJSONObject("ad_json");
    }
}
