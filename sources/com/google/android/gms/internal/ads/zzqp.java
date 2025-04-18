package com.google.android.gms.internal.ads;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(24)
/* loaded from: classes3.dex */
public final class zzqp {
    private final AudioTrack zza;
    private final zzov zzb;

    @Nullable
    private AudioRouting.OnRoutingChangedListener zzc = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.zzqo
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            zzqp.this.zzc(audioRouting);
        }
    };

    public zzqp(AudioTrack audioTrack, zzov zzovVar) {
        this.zza = audioTrack;
        this.zzb = zzovVar;
        audioTrack.addOnRoutingChangedListener(this.zzc, new Handler(Looper.myLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zzc(AudioRouting audioRouting) {
        if (this.zzc != null && audioRouting.getRoutedDevice() != null) {
            this.zzb.zzh(audioRouting.getRoutedDevice());
        }
    }

    public void zzb() {
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.zzc;
        onRoutingChangedListener.getClass();
        this.zza.removeOnRoutingChangedListener(onRoutingChangedListener);
        this.zzc = null;
    }
}
