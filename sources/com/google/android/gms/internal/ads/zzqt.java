package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzqt extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzqu zza;

    public zzqt(zzqu zzquVar) {
        this.zza = zzquVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        AudioTrack audioTrack2;
        audioTrack2 = this.zza.zza.zzs;
        audioTrack.equals(audioTrack2);
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        audioTrack2 = this.zza.zza.zzs;
        if (!audioTrack.equals(audioTrack2)) {
            return;
        }
        this.zza.zza.zzP = true;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        audioTrack2 = this.zza.zza.zzs;
        audioTrack.equals(audioTrack2);
    }
}
