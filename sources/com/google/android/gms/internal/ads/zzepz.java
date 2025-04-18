package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzepz implements zzevz {
    private final zzges zza;
    private final Context zzb;

    public zzepz(zzges zzgesVar, Context context) {
        this.zza = zzgesVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepz.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeqa zzc() throws Exception {
        int i10;
        int i11;
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkF)).booleanValue()) {
            i10 = com.google.android.gms.ads.internal.zzv.zzr().zzj(audioManager);
            i11 = audioManager.getStreamMaxVolume(3);
        } else {
            i10 = -1;
            i11 = -1;
        }
        return new zzeqa(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i10, i11, audioManager.getRingerMode(), audioManager.getStreamVolume(2), com.google.android.gms.ads.internal.zzv.zzs().zza(), com.google.android.gms.ads.internal.zzv.zzs().zze());
    }
}
