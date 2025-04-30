package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import java.security.GeneralSecurityException;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzgmb extends zzgih {
    private final zzgmh zza;
    private final zzgzf zzb;
    private final zzgze zzc;
    private final Integer zzd;

    private zzgmb(zzgmh zzgmhVar, zzgzf zzgzfVar, zzgze zzgzeVar, Integer num) {
        this.zza = zzgmhVar;
        this.zzb = zzgzfVar;
        this.zzc = zzgzeVar;
        this.zzd = num;
    }

    public static zzgmb zza(zzgmg zzgmgVar, zzgzf zzgzfVar, Integer num) throws GeneralSecurityException {
        zzgze zzb;
        zzgmg zzgmgVar2 = zzgmg.zzc;
        if (zzgmgVar != zzgmgVar2 && num == null) {
            throw new GeneralSecurityException(AbstractC2914a.e("For given Variant ", zzgmgVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzgmgVar == zzgmgVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgzfVar.zza() == 32) {
            zzgmh zzc = zzgmh.zzc(zzgmgVar);
            if (zzc.zzb() == zzgmgVar2) {
                zzb = zzgpm.zza;
            } else if (zzc.zzb() == zzgmg.zzb) {
                zzb = zzgpm.zza(num.intValue());
            } else if (zzc.zzb() == zzgmg.zza) {
                zzb = zzgpm.zzb(num.intValue());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(zzc.zzb().toString()));
            }
            return new zzgmb(zzc, zzgzfVar, zzb, num);
        }
        throw new GeneralSecurityException(o.h(zzgzfVar.zza(), "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
    }

    public final zzgmh zzb() {
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
