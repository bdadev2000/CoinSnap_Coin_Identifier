package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.ads.e;
import eb.j;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgkg extends zzggs {
    private final zzgkm zza;
    private final zzgwv zzb;
    private final zzgwu zzc;
    private final Integer zzd;

    private zzgkg(zzgkm zzgkmVar, zzgwv zzgwvVar, zzgwu zzgwuVar, Integer num) {
        this.zza = zzgkmVar;
        this.zzb = zzgwvVar;
        this.zzc = zzgwuVar;
        this.zzd = num;
    }

    public static zzgkg zza(zzgkl zzgklVar, zzgwv zzgwvVar, Integer num) throws GeneralSecurityException {
        zzgwu zzb;
        zzgkl zzgklVar2 = zzgkl.zzc;
        if (zzgklVar != zzgklVar2 && num == null) {
            throw new GeneralSecurityException(e.f("For given Variant ", zzgklVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzgklVar == zzgklVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgwvVar.zza() == 32) {
            zzgkm zzc = zzgkm.zzc(zzgklVar);
            if (zzc.zzb() == zzgklVar2) {
                zzb = zzgoa.zza;
            } else if (zzc.zzb() == zzgkl.zzb) {
                zzb = zzgoa.zza(num.intValue());
            } else if (zzc.zzb() == zzgkl.zza) {
                zzb = zzgoa.zzb(num.intValue());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(zzc.zzb().toString()));
            }
            return new zzgkg(zzc, zzgwvVar, zzb, num);
        }
        throw new GeneralSecurityException(j.i("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", zzgwvVar.zza()));
    }

    public final zzgkm zzb() {
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
