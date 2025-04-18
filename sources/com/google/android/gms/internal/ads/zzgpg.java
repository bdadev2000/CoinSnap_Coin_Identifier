package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.ads.e;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgpg {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzgpg(zzgpc zzgpcVar, zzgpf zzgpfVar) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        map = zzgpcVar.zza;
        this.zza = new HashMap(map);
        map2 = zzgpcVar.zzb;
        this.zzb = new HashMap(map2);
        map3 = zzgpcVar.zzc;
        this.zzc = new HashMap(map3);
        map4 = zzgpcVar.zzd;
        this.zzd = new HashMap(map4);
    }

    public final zzgfw zza(zzgpb zzgpbVar, zzggn zzggnVar) throws GeneralSecurityException {
        zzgpd zzgpdVar = new zzgpd(zzgpbVar.getClass(), zzgpbVar.zzd(), null);
        if (this.zzb.containsKey(zzgpdVar)) {
            return ((zzgms) this.zzb.get(zzgpdVar)).zza(zzgpbVar, zzggnVar);
        }
        throw new GeneralSecurityException(e.f("No Key Parser for requested key type ", zzgpdVar.toString(), " available"));
    }

    public final zzggj zzb(zzgpb zzgpbVar) throws GeneralSecurityException {
        zzgpd zzgpdVar = new zzgpd(zzgpbVar.getClass(), zzgpbVar.zzd(), null);
        if (this.zzd.containsKey(zzgpdVar)) {
            return ((zzgoe) this.zzd.get(zzgpdVar)).zza(zzgpbVar);
        }
        throw new GeneralSecurityException(e.f("No Parameters Parser for requested key type ", zzgpdVar.toString(), " available"));
    }

    public final zzgpb zzc(zzgfw zzgfwVar, Class cls, zzggn zzggnVar) throws GeneralSecurityException {
        zzgpe zzgpeVar = new zzgpe(zzgfwVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgpeVar)) {
            return ((zzgmw) this.zza.get(zzgpeVar)).zza(zzgfwVar, zzggnVar);
        }
        throw new GeneralSecurityException(e.f("No Key serializer for ", zzgpeVar.toString(), " available"));
    }

    public final zzgpb zzd(zzggj zzggjVar, Class cls) throws GeneralSecurityException {
        zzgpe zzgpeVar = new zzgpe(zzggjVar.getClass(), cls, null);
        if (this.zzc.containsKey(zzgpeVar)) {
            return ((zzgoi) this.zzc.get(zzgpeVar)).zza(zzggjVar);
        }
        throw new GeneralSecurityException(e.f("No Key Format serializer for ", zzgpeVar.toString(), " available"));
    }

    public final boolean zzi(zzgpb zzgpbVar) {
        return this.zzb.containsKey(new zzgpd(zzgpbVar.getClass(), zzgpbVar.zzd(), null));
    }

    public final boolean zzj(zzgpb zzgpbVar) {
        return this.zzd.containsKey(new zzgpd(zzgpbVar.getClass(), zzgpbVar.zzd(), null));
    }
}
