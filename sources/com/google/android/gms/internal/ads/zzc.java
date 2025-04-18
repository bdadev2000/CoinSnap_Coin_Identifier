package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi
/* loaded from: classes4.dex */
public final class zzc {
    @DoNotInline
    public static void zza(AudioAttributes.Builder builder, int i2) {
        builder.setAllowedCapturePolicy(i2);
    }
}
