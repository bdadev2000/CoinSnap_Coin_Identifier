package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* loaded from: classes2.dex */
final class zzrw extends AudioTrack$StreamEventCallback {
    final /* synthetic */ zzrz zza;
    final /* synthetic */ zzrx zzb;

    public zzrw(zzrx zzrxVar, zzrz zzrzVar) {
        this.zza = zzrzVar;
        this.zzb = zzrxVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i9) {
        AudioTrack audioTrack2;
        zzqs zzqsVar;
        boolean z8;
        zzqs zzqsVar2;
        audioTrack2 = this.zzb.zza.zzu;
        if (audioTrack.equals(audioTrack2)) {
            zzrz zzrzVar = this.zzb.zza;
            zzqsVar = zzrzVar.zzq;
            if (zzqsVar != null) {
                z8 = zzrzVar.zzS;
                if (z8) {
                    zzqsVar2 = zzrzVar.zzq;
                    zzqsVar2.zzb();
                }
            }
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        audioTrack2 = this.zzb.zza.zzu;
        if (!audioTrack.equals(audioTrack2)) {
            return;
        }
        this.zzb.zza.zzR = true;
    }

    public final void onTearDown(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        zzqs zzqsVar;
        boolean z8;
        zzqs zzqsVar2;
        audioTrack2 = this.zzb.zza.zzu;
        if (audioTrack.equals(audioTrack2)) {
            zzrz zzrzVar = this.zzb.zza;
            zzqsVar = zzrzVar.zzq;
            if (zzqsVar != null) {
                z8 = zzrzVar.zzS;
                if (z8) {
                    zzqsVar2 = zzrzVar.zzq;
                    zzqsVar2.zzb();
                }
            }
        }
    }
}
