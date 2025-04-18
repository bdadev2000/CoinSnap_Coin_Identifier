package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.RequiresApi;

@RequiresApi(30)
/* loaded from: classes3.dex */
final class zzaaq {
    public static void zza(Surface surface, float f10) {
        int i10;
        if (f10 == 0.0f) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        try {
            surface.setFrameRate(f10, i10);
        } catch (IllegalStateException e2) {
            zzdt.zzd("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e2);
        }
    }
}
