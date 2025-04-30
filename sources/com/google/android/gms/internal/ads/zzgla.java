package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgla extends zzgih {
    private final zzglc zza;
    private final zzgze zzb;
    private final Integer zzc;

    private zzgla(zzglc zzglcVar, zzgze zzgzeVar, Integer num) {
        this.zza = zzglcVar;
        this.zzb = zzgzeVar;
        this.zzc = num;
    }

    public static zzgla zza(zzglc zzglcVar, Integer num) throws GeneralSecurityException {
        zzgze zzb;
        if (zzglcVar.zzb() == zzglb.zza) {
            if (num != null) {
                zzb = zzgze.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else if (zzglcVar.zzb() == zzglb.zzb) {
            if (num == null) {
                zzb = zzgze.zzb(new byte[0]);
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else {
            throw new GeneralSecurityException("Unknown Variant: ".concat(zzglcVar.zzb().toString()));
        }
        return new zzgla(zzglcVar, zzb, num);
    }

    public final zzglc zzb() {
        return this.zza;
    }

    public final zzgze zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}
