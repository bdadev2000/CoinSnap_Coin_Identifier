package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzerj implements zzexh {
    private final zzgfz zza;
    private final Context zzb;

    public zzerj(zzgfz zzgfzVar, Context context) {
        this.zza = zzgfzVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeri
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerj.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzerk zzc() throws Exception {
        int i2;
        int i3;
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService("audio");
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkD)).booleanValue()) {
            i2 = com.google.android.gms.ads.internal.zzu.zzq().zzj(audioManager);
            i3 = audioManager.getStreamMaxVolume(3);
        } else {
            i2 = -1;
            i3 = -1;
        }
        return new zzerk(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i2, i3, audioManager.getRingerMode(), audioManager.getStreamVolume(2), com.google.android.gms.ads.internal.zzu.zzr().zza(), com.google.android.gms.ads.internal.zzu.zzr().zze());
    }
}
