package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdve {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private final int zzf;
    private final boolean zzg;

    public zzdve(String str, String str2, String str3, int i10, String str4, int i11, boolean z10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = i10;
        this.zze = str4;
        this.zzf = i11;
        this.zzg = z10;
    }

    public final JSONObject zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.zza);
        jSONObject.put("version", this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziV)).booleanValue()) {
            jSONObject.put("sdkVersion", this.zzb);
        }
        jSONObject.put(NotificationCompat.CATEGORY_STATUS, this.zzd);
        jSONObject.put("description", this.zze);
        jSONObject.put("initializationLatencyMillis", this.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziW)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.zzg);
        }
        return jSONObject;
    }
}
