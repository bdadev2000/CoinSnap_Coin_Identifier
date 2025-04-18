package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(32)
/* loaded from: classes3.dex */
public final class zzxt {
    private final Spatializer zza;
    private final boolean zzb;

    @Nullable
    private Handler zzc;

    @Nullable
    private Spatializer.OnSpatializerStateChangedListener zzd;

    private zzxt(Spatializer spatializer) {
        int immersiveAudioLevel;
        this.zza = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.zzb = immersiveAudioLevel != 0;
    }

    @Nullable
    public static zzxt zza(Context context) {
        Spatializer spatializer;
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return null;
        }
        spatializer = audioManager.getSpatializer();
        return new zzxt(spatializer);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzxr] */
    public final void zzb(zzyb zzybVar, Looper looper) {
        if (this.zzd == null && this.zzc == null) {
            this.zzd = new zzxs(this, zzybVar);
            final Handler handler = new Handler(looper);
            this.zzc = handler;
            this.zza.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzxr
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.zzd);
        }
    }

    public final void zzc() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.zzd;
        if (onSpatializerStateChangedListener != null && this.zzc != null) {
            this.zza.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            Handler handler = this.zzc;
            int i10 = zzen.zza;
            handler.removeCallbacksAndMessages(null);
            this.zzc = null;
            this.zzd = null;
        }
    }

    public final boolean zzd(zzg zzgVar, zzad zzadVar) {
        int i10;
        boolean canBeSpatialized;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(zzadVar.zzo) && zzadVar.zzC == 16) {
            i10 = 12;
        } else {
            i10 = zzadVar.zzC;
        }
        int zzi = zzen.zzi(i10);
        if (zzi == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(zzi);
        int i11 = zzadVar.zzD;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        canBeSpatialized = this.zza.canBeSpatialized(zzgVar.zza().zza, channelMask.build());
        return canBeSpatialized;
    }

    public final boolean zze() {
        boolean isAvailable;
        isAvailable = this.zza.isAvailable();
        return isAvailable;
    }

    public final boolean zzf() {
        boolean isEnabled;
        isEnabled = this.zza.isEnabled();
        return isEnabled;
    }

    public final boolean zzg() {
        return this.zzb;
    }
}
