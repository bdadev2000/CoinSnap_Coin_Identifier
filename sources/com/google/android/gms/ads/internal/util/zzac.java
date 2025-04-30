package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes2.dex */
public final class zzac {
    private boolean zza = false;
    private float zzb = 1.0f;

    public static float zzb(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager != null) {
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            if (streamMaxVolume != 0) {
                return streamVolume / streamMaxVolume;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    private final synchronized boolean zzf() {
        return this.zzb >= 0.0f;
    }

    public final synchronized float zza() {
        if (!zzf()) {
            return 1.0f;
        }
        return this.zzb;
    }

    public final synchronized void zzc(boolean z8) {
        this.zza = z8;
    }

    public final synchronized void zzd(float f9) {
        this.zzb = f9;
    }

    public final synchronized boolean zze() {
        return this.zza;
    }
}
