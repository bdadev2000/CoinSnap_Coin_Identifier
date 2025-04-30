package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
/* loaded from: classes2.dex */
final class zzrb {
    public static zzqa zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z8) {
        boolean isOffloadedPlaybackSupported;
        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
        if (!isOffloadedPlaybackSupported) {
            return zzqa.zza;
        }
        zzpy zzpyVar = new zzpy();
        zzpyVar.zza(true);
        zzpyVar.zzc(z8);
        return zzpyVar.zzd();
    }
}
