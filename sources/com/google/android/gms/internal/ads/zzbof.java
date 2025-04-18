package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbof {
    private static final Charset zzc = Charset.forName("UTF-8");
    public static final zzboc zza = new zzboe();
    public static final zzboa zzb = new zzboa() { // from class: com.google.android.gms.internal.ads.zzbod
        @Override // com.google.android.gms.internal.ads.zzboa
        public final Object zza(JSONObject jSONObject) {
            return zzbof.zza(jSONObject);
        }
    };

    public static /* synthetic */ InputStream zza(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(zzc));
    }
}
