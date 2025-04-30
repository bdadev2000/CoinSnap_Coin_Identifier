package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import java.security.GeneralSecurityException;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzgkn extends zzgih {
    private final zzgks zza;
    private final zzgzf zzb;
    private final zzgze zzc;
    private final Integer zzd;

    private zzgkn(zzgks zzgksVar, zzgzf zzgzfVar, zzgze zzgzeVar, Integer num) {
        this.zza = zzgksVar;
        this.zzb = zzgzfVar;
        this.zzc = zzgzeVar;
        this.zzd = num;
    }

    public static zzgkn zza(zzgkr zzgkrVar, zzgzf zzgzfVar, Integer num) throws GeneralSecurityException {
        zzgze zzb;
        zzgkr zzgkrVar2 = zzgkr.zzc;
        if (zzgkrVar != zzgkrVar2 && num == null) {
            throw new GeneralSecurityException(AbstractC2914a.e("For given Variant ", zzgkrVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzgkrVar == zzgkrVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgzfVar.zza() == 32) {
            zzgks zzc = zzgks.zzc(zzgkrVar);
            if (zzc.zzb() == zzgkrVar2) {
                zzb = zzgpm.zza;
            } else if (zzc.zzb() == zzgkr.zzb) {
                zzb = zzgpm.zza(num.intValue());
            } else if (zzc.zzb() == zzgkr.zza) {
                zzb = zzgpm.zzb(num.intValue());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(zzc.zzb().toString()));
            }
            return new zzgkn(zzc, zzgzfVar, zzb, num);
        }
        throw new GeneralSecurityException(o.h(zzgzfVar.zza(), "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
    }

    public final zzgks zzb() {
        return this.zza;
    }

    public final zzgze zzc() {
        return this.zzc;
    }

    public final zzgzf zzd() {
        return this.zzb;
    }

    public final Integer zze() {
        return this.zzd;
    }
}
