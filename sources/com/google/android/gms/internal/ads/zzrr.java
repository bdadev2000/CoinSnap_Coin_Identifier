package com.google.android.gms.internal.ads;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(24)
/* loaded from: classes2.dex */
public final class zzrr {
    private final AudioTrack zza;
    private final zzpw zzb;

    @Nullable
    private AudioRouting.OnRoutingChangedListener zzc = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.zzrq
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            zzrr.this.zzc(audioRouting);
        }
    };

    public zzrr(AudioTrack audioTrack, zzpw zzpwVar) {
        this.zza = audioTrack;
        this.zzb = zzpwVar;
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
