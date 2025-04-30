package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(29)
/* loaded from: classes2.dex */
public final class zzf {
    public static void zza(AudioAttributes.Builder builder, int i9) {
        builder.setAllowedCapturePolicy(i9);
    }
}
