package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgon {
    private final Map zza;
    private final Map zzb;

    private zzgon() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzgon zza(zzgom zzgomVar) throws GeneralSecurityException {
        if (zzgomVar != null) {
            zzgoo zzgooVar = new zzgoo(zzgomVar.zzc(), zzgomVar.zzd(), null);
            if (this.zza.containsKey(zzgooVar)) {
                zzgom zzgomVar2 = (zzgom) this.zza.get(zzgooVar);
                if (!zzgomVar2.equals(zzgomVar) || !zzgomVar.equals(zzgomVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzgooVar.toString()));
                }
            } else {
                this.zza.put(zzgooVar, zzgomVar);
            }
            return this;
        }
        throw new NullPointerException("primitive constructor must be non-null");
    }

    public final zzgon zzb(zzgov zzgovVar) throws GeneralSecurityException {
        Map map = this.zzb;
        Class zzb = zzgovVar.zzb();
        if (map.containsKey(zzb)) {
            zzgov zzgovVar2 = (zzgov) this.zzb.get(zzb);
            if (!zzgovVar2.equals(zzgovVar) || !zzgovVar.equals(zzgovVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zzb.toString()));
            }
        } else {
            this.zzb.put(zzb, zzgovVar);
        }
        return this;
    }

    public /* synthetic */ zzgon(zzgop zzgopVar) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public /* synthetic */ zzgon(zzgoq zzgoqVar, zzgop zzgopVar) {
        this.zza = new HashMap(zzgoq.zzd(zzgoqVar));
        this.zzb = new HashMap(zzgoq.zze(zzgoqVar));
    }
}
