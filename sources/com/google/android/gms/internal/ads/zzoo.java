package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi
/* loaded from: classes3.dex */
public final class zzoo {
    @DoNotInline
    public static int zza(int i2, int i3, zzh zzhVar) {
        boolean isDirectPlaybackSupported;
        for (int i4 = 10; i4 > 0; i4--) {
            int zzh = zzeu.zzh(i4);
            if (zzh != 0) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i2).setSampleRate(i3).setChannelMask(zzh).build(), zzhVar.zza().zza);
                if (isDirectPlaybackSupported) {
                    return i4;
                }
            }
        }
        return 0;
    }

    @DoNotInline
    public static zzgax<Integer> zzb(zzh zzhVar) {
        boolean isDirectPlaybackSupported;
        zzgau zzgauVar = new zzgau();
        zzgdd it = zzos.zzb.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (zzeu.zza >= zzeu.zzg(intValue)) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), zzhVar.zza().zza);
                if (isDirectPlaybackSupported) {
                    zzgauVar.zzf(Integer.valueOf(intValue));
                }
            }
        }
        zzgauVar.zzf((Object) 2);
        return zzgauVar.zzi();
    }
}
