package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes3.dex */
final class zzsz {
    @DoNotInline
    public static void zza(zzsq zzsqVar, zzom zzomVar) {
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        LogSessionId zza = zzomVar.zza();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = zza.equals(logSessionId);
        if (equals) {
            return;
        }
        MediaFormat mediaFormat = zzsqVar.zzb;
        stringId = zza.getStringId();
        mediaFormat.setString("log-session-id", stringId);
    }
}
