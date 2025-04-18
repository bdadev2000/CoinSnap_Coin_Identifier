package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* loaded from: classes3.dex */
final class zzqz extends AudioTrack$StreamEventCallback {
    final /* synthetic */ zzra zza;

    public zzqz(zzra zzraVar) {
        this.zza = zzraVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i2) {
        audioTrack.equals(zzrc.zzE(this.zza.zza));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(zzrc.zzE(this.zza.zza))) {
            zzrc.zzH(this.zza.zza, true);
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        audioTrack.equals(zzrc.zzE(this.zza.zza));
    }
}
