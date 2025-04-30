package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zztr {
    private static Boolean zza;

    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i9, int i10, double d2) {
        if (zzgd.zza >= 29) {
            Boolean bool = zza;
            if (bool == null || !bool.booleanValue()) {
                return zztq.zza(videoCapabilities, i9, i10, d2);
            }
            return 0;
        }
        return 0;
    }
}
