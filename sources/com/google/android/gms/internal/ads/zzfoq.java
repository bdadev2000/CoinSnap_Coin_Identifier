package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class zzfoq {
    private static int zza = 2;

    public static void zza(@NonNull Context context) {
        context.registerReceiver(new zzfop(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (zzfom.zza() != zzfnc.CTV) {
            return 2;
        }
        return zza;
    }
}
