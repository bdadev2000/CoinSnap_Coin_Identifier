package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzss {
    private static Boolean zza;

    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        if (zzen.zza >= 29) {
            Boolean bool = zza;
            if (bool == null || !bool.booleanValue()) {
                return zzsr.zza(videoCapabilities, i10, i11, d10);
            }
            return 0;
        }
        return 0;
    }
}
