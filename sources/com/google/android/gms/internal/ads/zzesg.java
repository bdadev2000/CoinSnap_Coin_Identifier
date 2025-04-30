package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzesg implements zzexw {
    private final zzgge zza;
    private final Context zzb;

    public zzesg(zzgge zzggeVar, Context context) {
        this.zza = zzggeVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesg.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzesh zzc() throws Exception {
        int i9;
        int i10;
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkV)).booleanValue()) {
            i9 = com.google.android.gms.ads.internal.zzu.zzq().zzj(audioManager);
            i10 = audioManager.getStreamMaxVolume(3);
        } else {
            i9 = -1;
            i10 = -1;
        }
        return new zzesh(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i9, i10, audioManager.getRingerMode(), audioManager.getStreamVolume(2), com.google.android.gms.ads.internal.zzu.zzr().zza(), com.google.android.gms.ads.internal.zzu.zzr().zze());
    }
}
