package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgmm {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzgmm(Map map, Map map2, zzgml zzgmlVar) {
        this.zza = map;
        this.zzb = map2;
    }

    public static zzgmk zza() {
        return new zzgmk(null);
    }

    public final Enum zzb(Object obj) throws GeneralSecurityException {
        Enum r02 = (Enum) this.zzb.get(obj);
        if (r02 != null) {
            return r02;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object zzc(Enum r32) throws GeneralSecurityException {
        Object obj = this.zza.get(r32);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r32)));
    }
}
