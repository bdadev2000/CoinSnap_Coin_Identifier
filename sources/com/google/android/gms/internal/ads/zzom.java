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
/* loaded from: classes3.dex */
public final class zzom {
    public static zzop zza(AudioManager audioManager, zzg zzgVar) {
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(zzgVar.zza().zza);
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(zzgcr.zzg(12)));
        for (int i10 = 0; i10 < directProfilesForAttributes.size(); i10++) {
            AudioProfile h10 = b.h(directProfilesForAttributes.get(i10));
            encapsulationType = h10.getEncapsulationType();
            if (encapsulationType != 1) {
                format = h10.getFormat();
                if (zzen.zzJ(format) || zzop.zzb.containsKey(Integer.valueOf(format))) {
                    Integer valueOf = Integer.valueOf(format);
                    if (hashMap.containsKey(valueOf)) {
                        Set set = (Set) hashMap.get(valueOf);
                        set.getClass();
                        channelMasks2 = h10.getChannelMasks();
                        set.addAll(zzgcr.zzg(channelMasks2));
                    } else {
                        channelMasks = h10.getChannelMasks();
                        hashMap.put(valueOf, new HashSet(zzgcr.zzg(channelMasks)));
                    }
                }
            }
        }
        zzfzl zzfzlVar = new zzfzl();
        for (Map.Entry entry : hashMap.entrySet()) {
            zzfzlVar.zzf(new zzon(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new zzop(zzfzlVar.zzi());
    }

    @Nullable
    public static zzow zzb(AudioManager audioManager, zzg zzgVar) {
        List audioDevicesForAttributes;
        audioManager.getClass();
        try {
            audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(zzgVar.zza().zza);
            if (!audioDevicesForAttributes.isEmpty()) {
                return new zzow((AudioDeviceInfo) audioDevicesForAttributes.get(0));
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
