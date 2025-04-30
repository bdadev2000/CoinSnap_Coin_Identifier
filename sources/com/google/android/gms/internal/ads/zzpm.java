package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(33)
/* loaded from: classes2.dex */
public final class zzpm {
    public static zzpp zza(AudioManager audioManager, zzk zzkVar) {
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(zzkVar.zza().zza);
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(zzgea.zzf(12)));
        for (int i9 = 0; i9 < directProfilesForAttributes.size(); i9++) {
            AudioProfile b = c.b(directProfilesForAttributes.get(i9));
            encapsulationType = b.getEncapsulationType();
            if (encapsulationType != 1) {
                format = b.getFormat();
                if (zzgd.zzK(format) || zzpp.zzb.containsKey(Integer.valueOf(format))) {
                    Integer valueOf = Integer.valueOf(format);
                    if (!hashMap.containsKey(valueOf)) {
                        channelMasks = b.getChannelMasks();
                        hashMap.put(valueOf, new HashSet(zzgea.zzf(channelMasks)));
                    } else {
                        Set set = (Set) hashMap.get(valueOf);
                        set.getClass();
                        channelMasks2 = b.getChannelMasks();
                        set.addAll(zzgea.zzf(channelMasks2));
                    }
                }
            }
        }
        zzgaz zzgazVar = new zzgaz();
        for (Map.Entry entry : hashMap.entrySet()) {
            zzgazVar.zzf(new zzpn(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new zzpp(zzgazVar.zzi());
    }

    @Nullable
    public static zzpx zzb(AudioManager audioManager, zzk zzkVar) {
        List audioDevicesForAttributes;
        audioManager.getClass();
        try {
            audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(zzkVar.zza().zza);
            if (!audioDevicesForAttributes.isEmpty()) {
                return new zzpx((AudioDeviceInfo) audioDevicesForAttributes.get(0));
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
