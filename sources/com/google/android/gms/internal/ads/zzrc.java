package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(31)
/* loaded from: classes2.dex */
public final class zzrc {
    public static zzqa zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z8) {
        int playbackOffloadSupport;
        playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return zzqa.zza;
        }
        zzpy zzpyVar = new zzpy();
        boolean z9 = false;
        if (zzgd.zza > 32 && playbackOffloadSupport == 2) {
            z9 = true;
        }
        zzpyVar.zza(true);
        zzpyVar.zzb(z9);
        zzpyVar.zzc(z8);
        return zzpyVar.zzd();
    }
}
