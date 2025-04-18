package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzqg {

    @Nullable
    private final Context zza;
    private Boolean zzb;

    public zzqg() {
        this.zza = null;
    }

    public final zzpd zza(zzaf zzafVar, zzh zzhVar) {
        boolean booleanValue;
        zzafVar.getClass();
        zzhVar.getClass();
        int i2 = zzeu.zza;
        if (i2 < 29 || zzafVar.zzC == -1) {
            return zzpd.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                if (audioManager != null) {
                    String parameters = audioManager.getParameters("offloadVariableRateSupported");
                    boolean z2 = false;
                    if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                        z2 = true;
                    }
                    this.zzb = Boolean.valueOf(z2);
                } else {
                    this.zzb = Boolean.FALSE;
                }
            } else {
                this.zzb = Boolean.FALSE;
            }
            booleanValue = this.zzb.booleanValue();
        }
        String str = zzafVar.zzn;
        str.getClass();
        int zza = zzbn.zza(str, zzafVar.zzj);
        if (zza == 0 || i2 < zzeu.zzg(zza)) {
            return zzpd.zza;
        }
        int zzh = zzeu.zzh(zzafVar.zzB);
        if (zzh == 0) {
            return zzpd.zza;
        }
        try {
            AudioFormat zzw = zzeu.zzw(zzafVar.zzC, zzh, zza);
            return i2 >= 31 ? zzqf.zza(zzw, zzhVar.zza().zza, booleanValue) : zzqe.zza(zzw, zzhVar.zza().zza, booleanValue);
        } catch (IllegalArgumentException unused) {
            return zzpd.zza;
        }
    }

    public zzqg(@Nullable Context context) {
        this.zza = context;
    }
}
