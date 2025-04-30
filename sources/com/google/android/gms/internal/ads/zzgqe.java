package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzgqe {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzgqe(zzgqa zzgqaVar, zzgqd zzgqdVar) {
        Map map;
        Map map2;
        map = zzgqaVar.zza;
        this.zza = new HashMap(map);
        map2 = zzgqaVar.zzb;
        this.zzb = new HashMap(map2);
    }

    public final Class zza(Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            return ((zzghy) this.zzb.get(cls)).zza();
        }
        throw new GeneralSecurityException(AbstractC2914a.e("No input primitive class for ", cls.toString(), " available"));
    }

    public final Object zzb(zzghi zzghiVar, Class cls) throws GeneralSecurityException {
        zzgqc zzgqcVar = new zzgqc(zzghiVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgqcVar)) {
            return ((zzgpy) this.zza.get(zzgqcVar)).zza(zzghiVar);
        }
        throw new GeneralSecurityException(AbstractC2914a.e("No PrimitiveConstructor for ", zzgqcVar.toString(), " available"));
    }

    public final Object zzc(zzgqk zzgqkVar, Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            zzghy zzghyVar = (zzghy) this.zzb.get(cls);
            if (zzgqkVar.zzd().equals(zzghyVar.zza()) && zzghyVar.zza().equals(zzgqkVar.zzd())) {
                return zzghyVar.zzc(zzgqkVar);
            }
            throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
    }
}
