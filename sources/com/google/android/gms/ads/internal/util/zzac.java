package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;

/* loaded from: classes2.dex */
public final class zzac {
    private boolean zza = false;
    private float zzb = 1.0f;

    public static float zzb(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume != 0) {
            return streamVolume / streamMaxVolume;
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

    public final synchronized void zzc(boolean z2) {
        this.zza = z2;
    }

    public final synchronized void zzd(float f2) {
        this.zzb = f2;
    }

    public final synchronized boolean zze() {
        return this.zza;
    }
}
