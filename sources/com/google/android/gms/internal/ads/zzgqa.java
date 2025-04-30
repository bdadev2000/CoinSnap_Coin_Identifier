package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgqa {
    private final Map zza;
    private final Map zzb;

    private zzgqa() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzgqa zza(zzgpy zzgpyVar) throws GeneralSecurityException {
        if (zzgpyVar != null) {
            zzgqc zzgqcVar = new zzgqc(zzgpyVar.zzc(), zzgpyVar.zzd(), null);
            if (this.zza.containsKey(zzgqcVar)) {
                zzgpy zzgpyVar2 = (zzgpy) this.zza.get(zzgqcVar);
                if (!zzgpyVar2.equals(zzgpyVar) || !zzgpyVar.equals(zzgpyVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzgqcVar.toString()));
                }
            } else {
                this.zza.put(zzgqcVar, zzgpyVar);
            }
            return this;
        }
        throw new NullPointerException("primitive constructor must be non-null");
    }

    public final zzgqa zzb(zzghy zzghyVar) throws GeneralSecurityException {
        Map map = this.zzb;
        Class zzb = zzghyVar.zzb();
        if (map.containsKey(zzb)) {
            zzghy zzghyVar2 = (zzghy) this.zzb.get(zzb);
            if (!zzghyVar2.equals(zzghyVar) || !zzghyVar.equals(zzghyVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zzb.toString()));
            }
        } else {
            this.zzb.put(zzb, zzghyVar);
        }
        return this;
    }

    public /* synthetic */ zzgqa(zzgpz zzgpzVar) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public /* synthetic */ zzgqa(zzgqe zzgqeVar, zzgpz zzgpzVar) {
        this.zza = new HashMap(zzgqe.zzd(zzgqeVar));
        this.zzb = new HashMap(zzgqe.zze(zzgqeVar));
    }
}
