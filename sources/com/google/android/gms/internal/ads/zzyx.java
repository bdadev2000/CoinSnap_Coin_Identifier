package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(32)
/* loaded from: classes2.dex */
public final class zzyx {
    private final Spatializer zza;
    private final boolean zzb;

    @Nullable
    private Handler zzc;

    @Nullable
    private Spatializer$OnSpatializerStateChangedListener zzd;

    private zzyx(Spatializer spatializer) {
        int immersiveAudioLevel;
        boolean z8;
        this.zza = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        if (immersiveAudioLevel != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.zzb = z8;
    }

    @Nullable
    public static zzyx zza(Context context) {
        Spatializer spatializer;
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager != null) {
            spatializer = audioManager.getSpatializer();
            return new zzyx(spatializer);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzyv] */
    public final void zzb(zzze zzzeVar, Looper looper) {
        if (this.zzd == null && this.zzc == null) {
            this.zzd = new zzyw(this, zzzeVar);
            final Handler handler = new Handler(looper);
            this.zzc = handler;
            this.zza.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzyv
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.zzd);
        }
    }

    public final void zzc() {
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.zzd;
        if (spatializer$OnSpatializerStateChangedListener != null && this.zzc != null) {
            this.zza.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            Handler handler = this.zzc;
            int i9 = zzgd.zza;
            handler.removeCallbacksAndMessages(null);
            this.zzc = null;
            this.zzd = null;
        }
    }

    public final boolean zzd(zzk zzkVar, zzan zzanVar) {
        int i9;
        boolean canBeSpatialized;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(zzanVar.zzn) && zzanVar.zzA == 16) {
            i9 = 12;
        } else {
            i9 = zzanVar.zzA;
        }
        int zzh = zzgd.zzh(i9);
        if (zzh == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(zzh);
        int i10 = zzanVar.zzB;
        if (i10 != -1) {
            channelMask.setSampleRate(i10);
        }
        canBeSpatialized = this.zza.canBeSpatialized(zzkVar.zza().zza, channelMask.build());
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
