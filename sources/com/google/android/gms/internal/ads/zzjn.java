package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import androidx.annotation.RequiresApi;
import com.vungle.ads.internal.protos.n;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(n.TEMPLATE_HTML_SIZE_VALUE)
/* loaded from: classes3.dex */
public final class zzjn {
    public static zzoj zza(Context context, zzjv zzjvVar, boolean z10, String str) {
        LogSessionId logSessionId;
        zzof zzb = zzof.zzb(context);
        if (zzb == null) {
            zzdt.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new zzoj(logSessionId, str);
        }
        if (z10) {
            zzjvVar.zzy(zzb);
        }
        return new zzoj(zzb.zza(), str);
    }
}
