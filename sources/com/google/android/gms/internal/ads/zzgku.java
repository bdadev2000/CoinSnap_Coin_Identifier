package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgku extends zzgib {
    private final zzgkw zza;
    private final zzgyx zzb;
    private final Integer zzc;

    private zzgku(zzgkw zzgkwVar, zzgyx zzgyxVar, Integer num) {
        this.zza = zzgkwVar;
        this.zzb = zzgyxVar;
        this.zzc = num;
    }

    public static zzgku zza(zzgkw zzgkwVar, Integer num) throws GeneralSecurityException {
        zzgyx zzb;
        if (zzgkwVar.zzb() == zzgkv.zza) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzb = zzgyx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzgkwVar.zzb() != zzgkv.zzb) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(zzgkwVar.zzb().toString()));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzb = zzgyx.zzb(new byte[0]);
        }
        return new zzgku(zzgkwVar, zzb, num);
    }

    public final zzgkw zzb() {
        return this.zza;
    }

    public final zzgyx zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}
