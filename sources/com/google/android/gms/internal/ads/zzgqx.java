package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgqx {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzgqx() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzgqx zza(zzgoi zzgoiVar) throws GeneralSecurityException {
        zzgqz zzgqzVar = new zzgqz(zzgoiVar.zzd(), zzgoiVar.zzc(), null);
        if (this.zzb.containsKey(zzgqzVar)) {
            zzgoi zzgoiVar2 = (zzgoi) this.zzb.get(zzgqzVar);
            if (!zzgoiVar2.equals(zzgoiVar) || !zzgoiVar.equals(zzgoiVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgqzVar.toString()));
            }
        } else {
            this.zzb.put(zzgqzVar, zzgoiVar);
        }
        return this;
    }

    public final zzgqx zzb(zzgom zzgomVar) throws GeneralSecurityException {
        zzgrb zzgrbVar = new zzgrb(zzgomVar.zzc(), zzgomVar.zzd(), null);
        if (this.zza.containsKey(zzgrbVar)) {
            zzgom zzgomVar2 = (zzgom) this.zza.get(zzgrbVar);
            if (!zzgomVar2.equals(zzgomVar) || !zzgomVar.equals(zzgomVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgrbVar.toString()));
            }
        } else {
            this.zza.put(zzgrbVar, zzgomVar);
        }
        return this;
    }

    public final zzgqx zzc(zzgpv zzgpvVar) throws GeneralSecurityException {
        zzgqz zzgqzVar = new zzgqz(zzgpvVar.zzd(), zzgpvVar.zzc(), null);
        if (this.zzd.containsKey(zzgqzVar)) {
            zzgpv zzgpvVar2 = (zzgpv) this.zzd.get(zzgqzVar);
            if (!zzgpvVar2.equals(zzgpvVar) || !zzgpvVar.equals(zzgpvVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgqzVar.toString()));
            }
        } else {
            this.zzd.put(zzgqzVar, zzgpvVar);
        }
        return this;
    }

    public final zzgqx zzd(zzgpz zzgpzVar) throws GeneralSecurityException {
        zzgrb zzgrbVar = new zzgrb(zzgpzVar.zzc(), zzgpzVar.zzd(), null);
        if (this.zzc.containsKey(zzgrbVar)) {
            zzgpz zzgpzVar2 = (zzgpz) this.zzc.get(zzgrbVar);
            if (!zzgpzVar2.equals(zzgpzVar) || !zzgpzVar.equals(zzgpzVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgrbVar.toString()));
            }
        } else {
            this.zzc.put(zzgrbVar, zzgpzVar);
        }
        return this;
    }

    public zzgqx(zzgrd zzgrdVar) {
        this.zza = new HashMap(zzgrd.zzf(zzgrdVar));
        this.zzb = new HashMap(zzgrd.zze(zzgrdVar));
        this.zzc = new HashMap(zzgrd.zzh(zzgrdVar));
        this.zzd = new HashMap(zzgrd.zzg(zzgrdVar));
    }
}
