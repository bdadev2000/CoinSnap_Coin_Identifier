package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import androidx.annotation.RequiresApi;

@RequiresApi(31)
/* loaded from: classes2.dex */
final class zzrj {
    public static void zza(AudioTrack audioTrack, zzpj zzpjVar) {
        LogSessionId logSessionId;
        boolean equals;
        LogSessionId zza = zzpjVar.zza();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = zza.equals(logSessionId);
        if (!equals) {
            audioTrack.setLogSessionId(zza);
        }
    }
}
