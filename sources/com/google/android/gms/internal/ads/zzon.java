package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi
/* loaded from: classes3.dex */
public final class zzon {
    @DoNotInline
    public static boolean zza(AudioManager audioManager, @Nullable zzpa zzpaVar) {
        AudioDeviceInfo[] audioDeviceInfoArr;
        if (zzpaVar == null) {
            audioManager.getClass();
            audioDeviceInfoArr = audioManager.getDevices(2);
        } else {
            audioDeviceInfoArr = new AudioDeviceInfo[]{zzpaVar.zza};
        }
        zzgbc<Integer> zzb = zzb();
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (zzb.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }

    @DoNotInline
    private static zzgbc<Integer> zzb() {
        zzgbb zzgbbVar = new zzgbb();
        zzgbbVar.zzg(8, 7);
        int i2 = zzeu.zza;
        if (i2 >= 31) {
            zzgbbVar.zzg(26, 27);
        }
        if (i2 >= 33) {
            zzgbbVar.zzf((Object) 30);
        }
        return zzgbbVar.zzi();
    }
}
