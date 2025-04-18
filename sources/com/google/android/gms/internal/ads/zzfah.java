package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfah implements zzexg {
    private final Bundle zza;

    public zzfah(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.zza != null) {
            try {
                com.google.android.gms.ads.internal.util.zzbs.zzg(com.google.android.gms.ads.internal.util.zzbs.zzg(jSONObject, DeviceRequestsHelper.DEVICE_INFO_DEVICE), "play_store").put("parental_controls", com.google.android.gms.ads.internal.client.zzbc.zzb().zzi(this.zza));
            } catch (JSONException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed putting parental controls bundle.");
            }
        }
    }
}
