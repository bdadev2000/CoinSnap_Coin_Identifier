package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.vungle.ads.internal.protos.n;

@RequiresApi(n.AD_PLAY_RESET_ON_DEINIT_VALUE)
/* loaded from: classes2.dex */
final class zzabr {
    public static void zza(Surface surface, float f9) {
        int i9;
        if (f9 == 0.0f) {
            i9 = 0;
        } else {
            i9 = 1;
        }
        try {
            surface.setFrameRate(f9, i9);
        } catch (IllegalStateException e4) {
            zzfk.zzd("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e4);
        }
    }
}
