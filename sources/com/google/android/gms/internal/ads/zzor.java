package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import androidx.annotation.RequiresApi;
import java.util.Objects;

@RequiresApi(23)
/* loaded from: classes3.dex */
final class zzor extends AudioDeviceCallback {
    final /* synthetic */ zzov zza;

    public /* synthetic */ zzor(zzov zzovVar, zzou zzouVar) {
        this.zza = zzovVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzov zzovVar = this.zza;
        zzov.zzf(this.zza, zzop.zzc(zzov.zza(zzovVar), zzov.zzb(zzovVar), zzov.zzd(zzovVar)));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzow zzd = zzov.zzd(this.zza);
        int i10 = zzen.zza;
        int length = audioDeviceInfoArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i11], zzd)) {
                zzov.zze(this.zza, null);
                break;
            }
            i11++;
        }
        zzov zzovVar = this.zza;
        zzov.zzf(zzovVar, zzop.zzc(zzov.zza(zzovVar), zzov.zzb(zzovVar), zzov.zzd(zzovVar)));
    }
}
