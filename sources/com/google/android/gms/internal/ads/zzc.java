package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import androidx.annotation.RequiresApi;
import com.vungle.ads.internal.protos.n;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(n.NOTIFICATION_REDIRECT_VALUE)
/* loaded from: classes3.dex */
public final class zzc {
    public static void zza(AudioAttributes.Builder builder, int i10) {
        builder.setAllowedCapturePolicy(i10);
    }
}
