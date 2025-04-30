package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import androidx.annotation.RequiresApi;

@RequiresApi(31)
/* loaded from: classes2.dex */
final class zzpi {
    public static final zzpi zza;
    public final LogSessionId zzb;

    static {
        LogSessionId logSessionId;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        zza = new zzpi(logSessionId);
    }

    public zzpi(LogSessionId logSessionId) {
        this.zzb = logSessionId;
    }
}
