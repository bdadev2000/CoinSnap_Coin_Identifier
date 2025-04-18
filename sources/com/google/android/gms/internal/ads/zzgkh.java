package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgkh extends zzgib {
    private final zzgkm zza;
    private final zzgyy zzb;
    private final zzgyx zzc;
    private final Integer zzd;

    private zzgkh(zzgkm zzgkmVar, zzgyy zzgyyVar, zzgyx zzgyxVar, Integer num) {
        this.zza = zzgkmVar;
        this.zzb = zzgyyVar;
        this.zzc = zzgyxVar;
        this.zzd = num;
    }

    public static zzgkh zza(zzgkl zzgklVar, zzgyy zzgyyVar, Integer num) throws GeneralSecurityException {
        zzgyx zzb;
        zzgkl zzgklVar2 = zzgkl.zzc;
        if (zzgklVar != zzgklVar2 && num == null) {
            throw new GeneralSecurityException(androidx.compose.foundation.text.input.a.A("For given Variant ", zzgklVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzgklVar == zzgklVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgyyVar.zza() != 32) {
            throw new GeneralSecurityException(d.i("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", zzgyyVar.zza()));
        }
        zzgkm zzc = zzgkm.zzc(zzgklVar);
        if (zzc.zzb() == zzgklVar2) {
            zzb = zzgpr.zza;
        } else if (zzc.zzb() == zzgkl.zzb) {
            zzb = zzgpr.zza(num.intValue());
        } else {
            if (zzc.zzb() != zzgkl.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzc.zzb().toString()));
            }
            zzb = zzgpr.zzb(num.intValue());
        }
        return new zzgkh(zzc, zzgyyVar, zzb, num);
    }

    public final zzgkm zzb() {
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
