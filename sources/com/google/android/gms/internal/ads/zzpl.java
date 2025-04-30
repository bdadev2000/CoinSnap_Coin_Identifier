package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(29)
/* loaded from: classes2.dex */
public final class zzpl {
    public static int zza(int i9, int i10, zzk zzkVar) {
        boolean isDirectPlaybackSupported;
        for (int i11 = 10; i11 > 0; i11--) {
            int zzh = zzgd.zzh(i11);
            if (zzh != 0) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i9).setSampleRate(i10).setChannelMask(zzh).build(), zzkVar.zza().zza);
                if (isDirectPlaybackSupported) {
                    return i11;
                }
            }
        }
        return 0;
    }

    public static zzgbc<Integer> zzb(zzk zzkVar) {
        boolean isDirectPlaybackSupported;
        zzgaz zzgazVar = new zzgaz();
        zzgdi it = zzpp.zzb.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            if (zzgd.zza >= zzgd.zzg(intValue)) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), zzkVar.zza().zza);
                if (isDirectPlaybackSupported) {
                    zzgazVar.zzf(num);
                }
            }
        }
        zzgazVar.zzf((Object) 2);
        return zzgazVar.zzi();
    }
}
