package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
/* loaded from: classes3.dex */
final class zzok {
    public static boolean zza(AudioManager audioManager, @Nullable zzow zzowVar) {
        AudioDeviceInfo[] audioDeviceInfoArr;
        if (zzowVar == null) {
            audioManager.getClass();
            audioDeviceInfoArr = audioManager.getDevices(2);
        } else {
            audioDeviceInfoArr = new AudioDeviceInfo[]{zzowVar.zza};
        }
        zzfzt<Integer> zzb = zzb();
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (zzb.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }

    private static zzfzt<Integer> zzb() {
        zzfzs zzfzsVar = new zzfzs();
        zzfzsVar.zzg(8, 7);
        int i10 = zzen.zza;
        if (i10 >= 31) {
            zzfzsVar.zzg(26, 27);
        }
        if (i10 >= 33) {
            zzfzsVar.zzf((Object) 30);
        }
        return zzfzsVar.zzi();
    }
}
