package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.ads.e;
import eb.j;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgiq extends zzggs {
    private final zzgiv zza;
    private final zzgwv zzb;
    private final zzgwu zzc;
    private final Integer zzd;

    private zzgiq(zzgiv zzgivVar, zzgwv zzgwvVar, zzgwu zzgwuVar, Integer num) {
        this.zza = zzgivVar;
        this.zzb = zzgwvVar;
        this.zzc = zzgwuVar;
        this.zzd = num;
    }

    public static zzgiq zza(zzgiu zzgiuVar, zzgwv zzgwvVar, Integer num) throws GeneralSecurityException {
        zzgwu zzb;
        zzgiu zzgiuVar2 = zzgiu.zzc;
        if (zzgiuVar != zzgiuVar2 && num == null) {
            throw new GeneralSecurityException(e.f("For given Variant ", zzgiuVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzgiuVar == zzgiuVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgwvVar.zza() == 32) {
            zzgiv zzc = zzgiv.zzc(zzgiuVar);
            if (zzc.zzb() == zzgiuVar2) {
                zzb = zzgoa.zza;
            } else if (zzc.zzb() == zzgiu.zzb) {
                zzb = zzgoa.zza(num.intValue());
            } else if (zzc.zzb() == zzgiu.zza) {
                zzb = zzgoa.zzb(num.intValue());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(zzc.zzb().toString()));
            }
            return new zzgiq(zzc, zzgwvVar, zzb, num);
        }
        throw new GeneralSecurityException(j.i("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", zzgwvVar.zza()));
    }

    public final zzgiv zzb() {
        return this.zza;
    }

    public final zzgwu zzc() {
        return this.zzc;
    }

    public final zzgwv zzd() {
        return this.zzb;
    }

    public final Integer zze() {
        return this.zzd;
    }
}
