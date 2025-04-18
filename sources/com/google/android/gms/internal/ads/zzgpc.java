package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgpc {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzgpc() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzgpc zza(zzgms zzgmsVar) throws GeneralSecurityException {
        zzgpd zzgpdVar = new zzgpd(zzgmsVar.zzd(), zzgmsVar.zzc(), null);
        if (this.zzb.containsKey(zzgpdVar)) {
            zzgms zzgmsVar2 = (zzgms) this.zzb.get(zzgpdVar);
            if (!zzgmsVar2.equals(zzgmsVar) || !zzgmsVar.equals(zzgmsVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgpdVar.toString()));
            }
        } else {
            this.zzb.put(zzgpdVar, zzgmsVar);
        }
        return this;
    }

    public final zzgpc zzb(zzgmw zzgmwVar) throws GeneralSecurityException {
        zzgpe zzgpeVar = new zzgpe(zzgmwVar.zzc(), zzgmwVar.zzd(), null);
        if (this.zza.containsKey(zzgpeVar)) {
            zzgmw zzgmwVar2 = (zzgmw) this.zza.get(zzgpeVar);
            if (!zzgmwVar2.equals(zzgmwVar) || !zzgmwVar.equals(zzgmwVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgpeVar.toString()));
            }
        } else {
            this.zza.put(zzgpeVar, zzgmwVar);
        }
        return this;
    }

    public final zzgpc zzc(zzgoe zzgoeVar) throws GeneralSecurityException {
        zzgpd zzgpdVar = new zzgpd(zzgoeVar.zzd(), zzgoeVar.zzc(), null);
        if (this.zzd.containsKey(zzgpdVar)) {
            zzgoe zzgoeVar2 = (zzgoe) this.zzd.get(zzgpdVar);
            if (!zzgoeVar2.equals(zzgoeVar) || !zzgoeVar.equals(zzgoeVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgpdVar.toString()));
            }
        } else {
            this.zzd.put(zzgpdVar, zzgoeVar);
        }
        return this;
    }

    public final zzgpc zzd(zzgoi zzgoiVar) throws GeneralSecurityException {
        zzgpe zzgpeVar = new zzgpe(zzgoiVar.zzc(), zzgoiVar.zzd(), null);
        if (this.zzc.containsKey(zzgpeVar)) {
            zzgoi zzgoiVar2 = (zzgoi) this.zzc.get(zzgpeVar);
            if (!zzgoiVar2.equals(zzgoiVar) || !zzgoiVar.equals(zzgoiVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgpeVar.toString()));
            }
        } else {
            this.zzc.put(zzgpeVar, zzgoiVar);
        }
        return this;
    }

    public zzgpc(zzgpg zzgpgVar) {
        this.zza = new HashMap(zzgpg.zzf(zzgpgVar));
        this.zzb = new HashMap(zzgpg.zze(zzgpgVar));
        this.zzc = new HashMap(zzgpg.zzh(zzgpgVar));
        this.zzd = new HashMap(zzgpg.zzg(zzgpgVar));
    }
}
