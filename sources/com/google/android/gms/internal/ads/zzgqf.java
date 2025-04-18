package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgqf {
    private final Map zza;
    private final Map zzb;

    private zzgqf() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzgqf zza(zzgqd zzgqdVar) throws GeneralSecurityException {
        if (zzgqdVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzgqh zzgqhVar = new zzgqh(zzgqdVar.zzc(), zzgqdVar.zzd(), null);
        if (this.zza.containsKey(zzgqhVar)) {
            zzgqd zzgqdVar2 = (zzgqd) this.zza.get(zzgqhVar);
            if (!zzgqdVar2.equals(zzgqdVar) || !zzgqdVar.equals(zzgqdVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzgqhVar.toString()));
            }
        } else {
            this.zza.put(zzgqhVar, zzgqdVar);
        }
        return this;
    }

    public final zzgqf zzb(zzgqq zzgqqVar) throws GeneralSecurityException {
        Map map = this.zzb;
        Class zzb = zzgqqVar.zzb();
        if (map.containsKey(zzb)) {
            zzgqq zzgqqVar2 = (zzgqq) this.zzb.get(zzb);
            if (!zzgqqVar2.equals(zzgqqVar) || !zzgqqVar.equals(zzgqqVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zzb.toString()));
            }
        } else {
            this.zzb.put(zzb, zzgqqVar);
        }
        return this;
    }

    public /* synthetic */ zzgqf(zzgqe zzgqeVar) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public /* synthetic */ zzgqf(zzgqj zzgqjVar, zzgqe zzgqeVar) {
        this.zza = new HashMap(zzgqj.zzd(zzgqjVar));
        this.zzb = new HashMap(zzgqj.zze(zzgqjVar));
    }
}
