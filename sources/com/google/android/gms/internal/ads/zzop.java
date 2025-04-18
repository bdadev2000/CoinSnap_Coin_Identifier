package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi
/* loaded from: classes3.dex */
public final class zzop {
    @DoNotInline
    public static zzos zza(AudioManager audioManager, zzh zzhVar) {
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(zzhVar.zza().zza);
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(zzgdu.zzg(12)));
        for (int i2 = 0; i2 < directProfilesForAttributes.size(); i2++) {
            AudioProfile c2 = c.c(directProfilesForAttributes.get(i2));
            encapsulationType = c2.getEncapsulationType();
            if (encapsulationType != 1) {
                format = c2.getFormat();
                if (zzeu.zzI(format) || zzos.zzb.containsKey(Integer.valueOf(format))) {
                    Integer valueOf = Integer.valueOf(format);
                    if (hashMap.containsKey(valueOf)) {
                        Set set = (Set) hashMap.get(valueOf);
                        set.getClass();
                        channelMasks2 = c2.getChannelMasks();
                        set.addAll(zzgdu.zzg(channelMasks2));
                    } else {
                        channelMasks = c2.getChannelMasks();
                        hashMap.put(valueOf, new HashSet(zzgdu.zzg(channelMasks)));
                    }
                }
            }
        }
        zzgau zzgauVar = new zzgau();
        for (Map.Entry entry : hashMap.entrySet()) {
            zzgauVar.zzf(new zzoq(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new zzos(zzgauVar.zzi());
    }

    @Nullable
    @DoNotInline
    public static zzpa zzb(AudioManager audioManager, zzh zzhVar) {
        List audioDevicesForAttributes;
        audioManager.getClass();
        try {
            audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(zzhVar.zza().zza);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new zzpa((AudioDeviceInfo) audioDevicesForAttributes.get(0));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
