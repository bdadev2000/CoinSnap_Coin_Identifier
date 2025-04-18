package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi
/* loaded from: classes3.dex */
public final class zzqf {
    @DoNotInline
    public static zzpd zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z2) {
        int playbackOffloadSupport;
        playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return zzpd.zza;
        }
        zzpb zzpbVar = new zzpb();
        boolean z3 = false;
        if (zzeu.zza > 32 && playbackOffloadSupport == 2) {
            z3 = true;
        }
        zzpbVar.zza(true);
        zzpbVar.zzb(z3);
        zzpbVar.zzc(z2);
        return zzpbVar.zzd();
    }
}
