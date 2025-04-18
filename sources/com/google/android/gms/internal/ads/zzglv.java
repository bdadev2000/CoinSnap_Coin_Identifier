package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzglv extends zzgib {
    private final zzgmb zza;
    private final zzgyy zzb;
    private final zzgyx zzc;
    private final Integer zzd;

    private zzglv(zzgmb zzgmbVar, zzgyy zzgyyVar, zzgyx zzgyxVar, Integer num) {
        this.zza = zzgmbVar;
        this.zzb = zzgyyVar;
        this.zzc = zzgyxVar;
        this.zzd = num;
    }

    public static zzglv zza(zzgma zzgmaVar, zzgyy zzgyyVar, Integer num) throws GeneralSecurityException {
        zzgyx zzb;
        zzgma zzgmaVar2 = zzgma.zzc;
        if (zzgmaVar != zzgmaVar2 && num == null) {
            throw new GeneralSecurityException(androidx.compose.foundation.text.input.a.A("For given Variant ", zzgmaVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzgmaVar == zzgmaVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgyyVar.zza() != 32) {
            throw new GeneralSecurityException(d.i("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", zzgyyVar.zza()));
        }
        zzgmb zzc = zzgmb.zzc(zzgmaVar);
        if (zzc.zzb() == zzgmaVar2) {
            zzb = zzgpr.zza;
        } else if (zzc.zzb() == zzgma.zzb) {
            zzb = zzgpr.zza(num.intValue());
        } else {
            if (zzc.zzb() != zzgma.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzc.zzb().toString()));
            }
            zzb = zzgpr.zzb(num.intValue());
        }
        return new zzglv(zzc, zzgyyVar, zzb, num);
    }

    public final zzgmb zzb() {
        return this.zza;
    }

    public final zzgyx zzc() {
        return this.zzc;
    }

    public final zzgyy zzd() {
        return this.zzb;
    }

    public final Integer zze() {
        return this.zzd;
    }
}
