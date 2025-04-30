package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(31)
/* loaded from: classes2.dex */
public final class zzkn {
    public static zzpj zza(Context context, zzkw zzkwVar, boolean z8, String str) {
        LogSessionId logSessionId;
        zzpf zzb = zzpf.zzb(context);
        if (zzb == null) {
            zzfk.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new zzpj(logSessionId, str);
        }
        if (z8) {
            zzkwVar.zzz(zzb);
        }
        return new zzpj(zzb.zza(), str);
    }
}
