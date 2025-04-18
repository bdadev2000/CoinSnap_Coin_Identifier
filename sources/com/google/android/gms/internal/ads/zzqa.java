package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.annotation.RequiresApi;
import com.vungle.ads.internal.protos.n;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(n.NOTIFICATION_REDIRECT_VALUE)
/* loaded from: classes3.dex */
public final class zzqa {
    public static zzoz zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
        boolean isOffloadedPlaybackSupported;
        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
        if (!isOffloadedPlaybackSupported) {
            return zzoz.zza;
        }
        zzox zzoxVar = new zzox();
        zzoxVar.zza(true);
        zzoxVar.zzc(z10);
        return zzoxVar.zzd();
    }
}
