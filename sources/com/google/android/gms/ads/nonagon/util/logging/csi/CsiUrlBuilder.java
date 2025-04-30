package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.zzbge;
import java.util.Map;

/* loaded from: classes2.dex */
public class CsiUrlBuilder {
    private final String zza = (String) zzbge.zzb.zze();

    @NonNull
    public String generateUrl(@NonNull Map<String, String> map) {
        Uri.Builder buildUpon = Uri.parse(this.zza).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return buildUpon.build().toString();
    }
}
