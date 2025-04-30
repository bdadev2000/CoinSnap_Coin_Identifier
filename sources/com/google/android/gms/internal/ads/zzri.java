package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
/* loaded from: classes2.dex */
final class zzri {
    public static void zza(AudioTrack audioTrack, @Nullable zzpx zzpxVar) {
        AudioDeviceInfo audioDeviceInfo;
        if (zzpxVar == null) {
            audioDeviceInfo = null;
        } else {
            audioDeviceInfo = zzpxVar.zza;
        }
        audioTrack.setPreferredDevice(audioDeviceInfo);
    }
}
