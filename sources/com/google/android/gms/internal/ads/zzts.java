package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import androidx.annotation.RequiresApi;

@RequiresApi(31)
/* loaded from: classes2.dex */
final class zzts {
    public static void zza(zztk zztkVar, zzpj zzpjVar) {
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        LogSessionId zza = zzpjVar.zza();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = zza.equals(logSessionId);
        if (!equals) {
            MediaFormat mediaFormat = zztkVar.zzb;
            stringId = zza.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }
}
