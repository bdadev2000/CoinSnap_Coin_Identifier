package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(23)
/* loaded from: classes2.dex */
public final class zzpk {
    public static boolean zza(AudioManager audioManager, @Nullable zzpx zzpxVar) {
        AudioDeviceInfo[] audioDeviceInfoArr;
        if (zzpxVar == null) {
            audioManager.getClass();
            audioDeviceInfoArr = audioManager.getDevices(2);
        } else {
            audioDeviceInfoArr = new AudioDeviceInfo[]{zzpxVar.zza};
        }
        zzgbh<Integer> zzb = zzb();
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (zzb.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }

    private static zzgbh<Integer> zzb() {
        zzgbg zzgbgVar = new zzgbg();
        zzgbgVar.zzg(8, 7);
        int i9 = zzgd.zza;
        if (i9 >= 31) {
            zzgbgVar.zzg(26, 27);
        }
        if (i9 >= 33) {
            zzgbgVar.zzf((Object) 30);
        }
        return zzgbgVar.zzi();
    }
}
