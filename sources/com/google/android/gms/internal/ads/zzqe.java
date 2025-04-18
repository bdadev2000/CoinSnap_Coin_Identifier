package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi
/* loaded from: classes3.dex */
public final class zzqe {
    @DoNotInline
    public static zzpd zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z2) {
        boolean isOffloadedPlaybackSupported;
        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
        if (!isOffloadedPlaybackSupported) {
            return zzpd.zza;
        }
        zzpb zzpbVar = new zzpb();
        zzpbVar.zza(true);
        zzpbVar.zzc(z2);
        return zzpbVar.zzd();
    }
}
