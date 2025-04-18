package com.google.android.gms.internal.ads;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi
/* loaded from: classes3.dex */
public final class zzqu {
    private final AudioTrack zza;
    private final zzoz zzb;

    @Nullable
    private AudioRouting.OnRoutingChangedListener zzc = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.zzqt
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            zzqu.this.zzc(audioRouting);
        }
    };

    public zzqu(AudioTrack audioTrack, zzoz zzozVar) {
        this.zza = audioTrack;
        this.zzb = zzozVar;
        audioTrack.addOnRoutingChangedListener(this.zzc, new Handler(Looper.myLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @DoNotInline
    public void zzc(AudioRouting audioRouting) {
        if (this.zzc == null || audioRouting.getRoutedDevice() == null) {
            return;
        }
        this.zzb.zzh(audioRouting.getRoutedDevice());
    }

    @DoNotInline
    public void zzb() {
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.zzc;
        onRoutingChangedListener.getClass();
        this.zza.removeOnRoutingChangedListener(onRoutingChangedListener);
        this.zzc = null;
    }
}
