package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes3.dex */
public final class zzqc {

    @Nullable
    private final Context zza;
    private Boolean zzb;

    public zzqc() {
        this.zza = null;
    }

    public final zzoz zza(zzad zzadVar, zzg zzgVar) {
        boolean booleanValue;
        zzadVar.getClass();
        zzgVar.getClass();
        int i10 = zzen.zza;
        if (i10 >= 29 && zzadVar.zzD != -1) {
            Context context = this.zza;
            Boolean bool = this.zzb;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                if (context != null) {
                    AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                    if (audioManager != null) {
                        String parameters = audioManager.getParameters("offloadVariableRateSupported");
                        boolean z10 = false;
                        if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                            z10 = true;
                        }
                        this.zzb = Boolean.valueOf(z10);
                    } else {
                        this.zzb = Boolean.FALSE;
                    }
                } else {
                    this.zzb = Boolean.FALSE;
                }
                booleanValue = this.zzb.booleanValue();
            }
            String str = zzadVar.zzo;
            str.getClass();
            int zza = zzbg.zza(str, zzadVar.zzk);
            if (zza != 0 && i10 >= zzen.zzh(zza)) {
                int zzi = zzen.zzi(zzadVar.zzC);
                if (zzi == 0) {
                    return zzoz.zza;
                }
                try {
                    AudioFormat zzx = zzen.zzx(zzadVar.zzD, zzi, zza);
                    if (i10 >= 31) {
                        return zzqb.zza(zzx, zzgVar.zza().zza, booleanValue);
                    }
                    return zzqa.zza(zzx, zzgVar.zza().zza, booleanValue);
                } catch (IllegalArgumentException unused) {
                    return zzoz.zza;
                }
            }
            return zzoz.zza;
        }
        return zzoz.zza;
    }

    public zzqc(@Nullable Context context) {
        this.zza = context;
    }
}
