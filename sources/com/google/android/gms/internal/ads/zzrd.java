package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes2.dex */
public final class zzrd {

    @Nullable
    private final Context zza;
    private Boolean zzb;

    public zzrd() {
        this.zza = null;
    }

    public final zzqa zza(zzan zzanVar, zzk zzkVar) {
        boolean booleanValue;
        zzanVar.getClass();
        zzkVar.getClass();
        int i9 = zzgd.zza;
        if (i9 >= 29 && zzanVar.zzB != -1) {
            Context context = this.zza;
            Boolean bool = this.zzb;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                if (context != null) {
                    AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                    if (audioManager != null) {
                        String parameters = audioManager.getParameters("offloadVariableRateSupported");
                        boolean z8 = false;
                        if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                            z8 = true;
                        }
                        this.zzb = Boolean.valueOf(z8);
                    } else {
                        this.zzb = Boolean.FALSE;
                    }
                } else {
                    this.zzb = Boolean.FALSE;
                }
                booleanValue = this.zzb.booleanValue();
            }
            String str = zzanVar.zzn;
            str.getClass();
            int zza = zzcg.zza(str, zzanVar.zzk);
            if (zza != 0 && i9 >= zzgd.zzg(zza)) {
                int zzh = zzgd.zzh(zzanVar.zzA);
                if (zzh == 0) {
                    return zzqa.zza;
                }
                try {
                    AudioFormat zzw = zzgd.zzw(zzanVar.zzB, zzh, zza);
                    if (i9 >= 31) {
                        return zzrc.zza(zzw, zzkVar.zza().zza, booleanValue);
                    }
                    return zzrb.zza(zzw, zzkVar.zza().zza, booleanValue);
                } catch (IllegalArgumentException unused) {
                    return zzqa.zza;
                }
            }
            return zzqa.zza;
        }
        return zzqa.zza;
    }

    public zzrd(@Nullable Context context) {
        this.zza = context;
    }
}
