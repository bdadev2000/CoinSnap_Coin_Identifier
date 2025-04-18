package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi
/* loaded from: classes3.dex */
public final class zzjq {
    @DoNotInline
    public static zzom zza(Context context, zzjz zzjzVar, boolean z2, String str) {
        LogSessionId logSessionId;
        zzoi zzb = zzoi.zzb(context);
        if (zzb == null) {
            zzea.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new zzom(logSessionId, str);
        }
        if (z2) {
            zzjzVar.zzy(zzb);
        }
        return new zzom(zzb.zza(), str);
    }
}
