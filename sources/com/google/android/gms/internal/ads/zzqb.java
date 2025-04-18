package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.annotation.RequiresApi;
import com.vungle.ads.internal.protos.n;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(n.TEMPLATE_HTML_SIZE_VALUE)
/* loaded from: classes3.dex */
public final class zzqb {
    public static zzoz zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
        int playbackOffloadSupport;
        playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return zzoz.zza;
        }
        zzox zzoxVar = new zzox();
        boolean z11 = false;
        if (zzen.zza > 32 && playbackOffloadSupport == 2) {
            z11 = true;
        }
        zzoxVar.zza(true);
        zzoxVar.zzb(z11);
        zzoxVar.zzc(z10);
        return zzoxVar.zzd();
    }
}
