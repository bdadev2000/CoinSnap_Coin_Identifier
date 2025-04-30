package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbqe {
    private static final Charset zzc = Charset.forName("UTF-8");
    public static final zzbqb zza = new zzbqd();
    public static final zzbpz zzb = new zzbpz() { // from class: com.google.android.gms.internal.ads.zzbqc
        @Override // com.google.android.gms.internal.ads.zzbpz
        public final Object zza(JSONObject jSONObject) {
            return zzbqe.zza(jSONObject);
        }
    };

    public static /* synthetic */ InputStream zza(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(zzc));
    }
}
