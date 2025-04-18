package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.ads.e;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgoq {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzgoq(zzgon zzgonVar, zzgop zzgopVar) {
        this.zza = new HashMap(zzgon.zzc(zzgonVar));
        this.zzb = new HashMap(zzgon.zzd(zzgonVar));
    }

    public final Class zza(Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            return ((zzgov) this.zzb.get(cls)).zza();
        }
        throw new GeneralSecurityException(e.f("No input primitive class for ", cls.toString(), " available"));
    }

    public final Object zzb(zzgfw zzgfwVar, Class cls) throws GeneralSecurityException {
        zzgoo zzgooVar = new zzgoo(zzgfwVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgooVar)) {
            return ((zzgom) this.zza.get(zzgooVar)).zza(zzgfwVar);
        }
        throw new GeneralSecurityException(e.f("No PrimitiveConstructor for ", zzgooVar.toString(), " available"));
    }

    public final Object zzc(zzgou zzgouVar, Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            zzgov zzgovVar = (zzgov) this.zzb.get(cls);
            if (zzgouVar.zzd().equals(zzgovVar.zza()) && zzgovVar.zza().equals(zzgouVar.zzd())) {
                return zzgovVar.zzc(zzgouVar);
            }
            throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
    }
}
