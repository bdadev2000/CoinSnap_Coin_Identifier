package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import androidx.annotation.RequiresApi;
import com.vungle.ads.internal.protos.n;

@RequiresApi(n.TEMPLATE_HTML_SIZE_VALUE)
/* loaded from: classes3.dex */
final class zzqi {
    public static void zza(AudioTrack audioTrack, zzoj zzojVar) {
        LogSessionId logSessionId;
        boolean equals;
        LogSessionId zza = zzojVar.zza();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = zza.equals(logSessionId);
        if (!equals) {
            audioTrack.setLogSessionId(zza);
        }
    }
}
