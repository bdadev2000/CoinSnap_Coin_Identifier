package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes3.dex */
final class zzqm {
    @DoNotInline
    public static void zza(AudioTrack audioTrack, zzom zzomVar) {
        LogSessionId logSessionId;
        boolean equals;
        LogSessionId zza = zzomVar.zza();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = zza.equals(logSessionId);
        if (equals) {
            return;
        }
        audioTrack.setLogSessionId(zza);
    }
}
