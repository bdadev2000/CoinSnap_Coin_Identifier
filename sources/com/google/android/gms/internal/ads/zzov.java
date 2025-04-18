package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi
/* loaded from: classes3.dex */
public final class zzov extends AudioDeviceCallback {
    final /* synthetic */ zzoz zza;

    public /* synthetic */ zzov(zzoz zzozVar, zzou zzouVar) {
        this.zza = zzozVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        Context context;
        zzh zzhVar;
        zzpa zzpaVar;
        zzoz zzozVar = this.zza;
        context = zzozVar.zza;
        zzhVar = zzozVar.zzh;
        zzpaVar = zzozVar.zzg;
        this.zza.zzj(zzos.zzc(context, zzhVar, zzpaVar));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzpa zzpaVar;
        Context context;
        zzh zzhVar;
        zzpa zzpaVar2;
        zzpaVar = this.zza.zzg;
        int i2 = zzeu.zza;
        int length = audioDeviceInfoArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i3], zzpaVar)) {
                this.zza.zzg = null;
                break;
            }
            i3++;
        }
        zzoz zzozVar = this.zza;
        context = zzozVar.zza;
        zzhVar = zzozVar.zzh;
        zzpaVar2 = zzozVar.zzg;
        zzozVar.zzj(zzos.zzc(context, zzhVar, zzpaVar2));
    }
}
