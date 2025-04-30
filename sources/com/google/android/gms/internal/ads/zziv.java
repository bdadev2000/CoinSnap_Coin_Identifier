package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.applovin.impl.L;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zziv {
    private final AudioManager zza;
    private final zzit zzb;

    @Nullable
    private zziu zzc;
    private int zzd;
    private float zze = 1.0f;

    public zziv(Context context, Handler handler, zziu zziuVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        audioManager.getClass();
        this.zza = audioManager;
        this.zzc = zziuVar;
        this.zzb = new zzit(this, handler);
        this.zzd = 0;
    }

    public static /* bridge */ /* synthetic */ void zzc(zziv zzivVar, int i9) {
        if (i9 != -3 && i9 != -2) {
            if (i9 != -1) {
                if (i9 != 1) {
                    L.z(i9, "Unknown focus change type: ", "AudioFocusManager");
                    return;
                } else {
                    zzivVar.zzg(1);
                    zzivVar.zzf(1);
                    return;
                }
            }
            zzivVar.zzf(-1);
            zzivVar.zze();
            return;
        }
        if (i9 != -2) {
            zzivVar.zzg(3);
        } else {
            zzivVar.zzf(0);
            zzivVar.zzg(2);
        }
    }

    private final void zze() {
        if (this.zzd == 0) {
            return;
        }
        if (zzgd.zza < 26) {
            this.zza.abandonAudioFocus(this.zzb);
        }
        zzg(0);
    }

    private final void zzf(int i9) {
        int zzX;
        zziu zziuVar = this.zzc;
        if (zziuVar != null) {
            zzks zzksVar = (zzks) zziuVar;
            boolean zzv = zzksVar.zza.zzv();
            zzX = zzkw.zzX(zzv, i9);
            zzksVar.zza.zzak(zzv, i9, zzX);
        }
    }

    private final void zzg(int i9) {
        float f9;
        if (this.zzd != i9) {
            this.zzd = i9;
            if (i9 == 3) {
                f9 = 0.2f;
            } else {
                f9 = 1.0f;
            }
            if (this.zze != f9) {
                this.zze = f9;
                zziu zziuVar = this.zzc;
                if (zziuVar != null) {
                    ((zzks) zziuVar).zza.zzah();
                }
            }
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z8, int i9) {
        zze();
        if (z8) {
            return 1;
        }
        return -1;
    }

    public final void zzd() {
        this.zzc = null;
        zze();
    }
}
