package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(23)
/* loaded from: classes2.dex */
public final class zzps extends AudioDeviceCallback {
    final /* synthetic */ zzpw zza;

    public /* synthetic */ zzps(zzpw zzpwVar, zzpr zzprVar) {
        this.zza = zzpwVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        Context context;
        zzk zzkVar;
        zzpx zzpxVar;
        zzpw zzpwVar = this.zza;
        context = zzpwVar.zza;
        zzkVar = zzpwVar.zzh;
        zzpxVar = zzpwVar.zzg;
        this.zza.zzj(zzpp.zzc(context, zzkVar, zzpxVar));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzpx zzpxVar;
        Context context;
        zzk zzkVar;
        zzpx zzpxVar2;
        zzpxVar = this.zza.zzg;
        int i9 = zzgd.zza;
        int length = audioDeviceInfoArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (zzgd.zzG(audioDeviceInfoArr[i10], zzpxVar)) {
                this.zza.zzg = null;
                break;
            }
            i10++;
        }
        zzpw zzpwVar = this.zza;
        context = zzpwVar.zza;
        zzkVar = zzpwVar.zzh;
        zzpxVar2 = zzpwVar.zzg;
        zzpwVar.zzj(zzpp.zzc(context, zzkVar, zzpxVar2));
    }
}
