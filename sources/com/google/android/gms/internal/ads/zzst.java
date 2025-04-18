package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import androidx.annotation.RequiresApi;
import com.vungle.ads.internal.protos.n;

@RequiresApi(n.TEMPLATE_HTML_SIZE_VALUE)
/* loaded from: classes3.dex */
final class zzst {
    public static void zza(zzsk zzskVar, zzoj zzojVar) {
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        LogSessionId zza = zzojVar.zza();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = zza.equals(logSessionId);
        if (!equals) {
            MediaFormat mediaFormat = zzskVar.zzb;
            stringId = zza.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }
}
