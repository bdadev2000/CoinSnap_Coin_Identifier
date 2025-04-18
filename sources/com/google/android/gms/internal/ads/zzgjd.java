package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgjd extends zzggs {
    private final zzgjf zza;
    private final zzgwu zzb;
    private final Integer zzc;

    private zzgjd(zzgjf zzgjfVar, zzgwu zzgwuVar, Integer num) {
        this.zza = zzgjfVar;
        this.zzb = zzgwuVar;
        this.zzc = num;
    }

    public static zzgjd zza(zzgjf zzgjfVar, Integer num) throws GeneralSecurityException {
        zzgwu zzb;
        if (zzgjfVar.zzb() == zzgje.zza) {
            if (num != null) {
                zzb = zzgwu.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else if (zzgjfVar.zzb() == zzgje.zzb) {
            if (num == null) {
                zzb = zzgwu.zzb(new byte[0]);
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else {
            throw new GeneralSecurityException("Unknown Variant: ".concat(zzgjfVar.zzb().toString()));
        }
        return new zzgjd(zzgjfVar, zzb, num);
    }

    public final zzgjf zzb() {
        return this.zza;
    }

    public final zzgwu zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}
