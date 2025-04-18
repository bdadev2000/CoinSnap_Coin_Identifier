package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import androidx.annotation.RequiresApi;
import com.vungle.ads.internal.protos.n;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(n.NOTIFICATION_REDIRECT_VALUE)
/* loaded from: classes3.dex */
public final class zzol {
    public static int zza(int i10, int i11, zzg zzgVar) {
        boolean isDirectPlaybackSupported;
        for (int i12 = 10; i12 > 0; i12--) {
            int zzi = zzen.zzi(i12);
            if (zzi != 0) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(zzi).build(), zzgVar.zza().zza);
                if (isDirectPlaybackSupported) {
                    return i12;
                }
            }
        }
        return 0;
    }

    public static zzfzo<Integer> zzb(zzg zzgVar) {
        boolean isDirectPlaybackSupported;
        zzfzl zzfzlVar = new zzfzl();
        zzgbu it = zzop.zzb.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (zzen.zza >= zzen.zzh(intValue)) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), zzgVar.zza().zza);
                if (isDirectPlaybackSupported) {
                    zzfzlVar.zzf(Integer.valueOf(intValue));
                }
            }
        }
        zzfzlVar.zzf((Object) 2);
        return zzfzlVar.zzi();
    }
}
