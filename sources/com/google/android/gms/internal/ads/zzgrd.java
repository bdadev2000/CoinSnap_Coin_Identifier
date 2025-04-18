package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgrd {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzgrd(zzgqx zzgqxVar, zzgrc zzgrcVar) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        map = zzgqxVar.zza;
        this.zza = new HashMap(map);
        map2 = zzgqxVar.zzb;
        this.zzb = new HashMap(map2);
        map3 = zzgqxVar.zzc;
        this.zzc = new HashMap(map3);
        map4 = zzgqxVar.zzd;
        this.zzd = new HashMap(map4);
    }

    public final zzghd zza(zzgqw zzgqwVar, zzghw zzghwVar) throws GeneralSecurityException {
        zzgqz zzgqzVar = new zzgqz(zzgqwVar.getClass(), zzgqwVar.zzd(), null);
        if (this.zzb.containsKey(zzgqzVar)) {
            return ((zzgoi) this.zzb.get(zzgqzVar)).zza(zzgqwVar, zzghwVar);
        }
        throw new GeneralSecurityException(androidx.compose.foundation.text.input.a.A("No Key Parser for requested key type ", zzgqzVar.toString(), " available"));
    }

    public final zzghs zzb(zzgqw zzgqwVar) throws GeneralSecurityException {
        zzgqz zzgqzVar = new zzgqz(zzgqwVar.getClass(), zzgqwVar.zzd(), null);
        if (this.zzd.containsKey(zzgqzVar)) {
            return ((zzgpv) this.zzd.get(zzgqzVar)).zza(zzgqwVar);
        }
        throw new GeneralSecurityException(androidx.compose.foundation.text.input.a.A("No Parameters Parser for requested key type ", zzgqzVar.toString(), " available"));
    }

    public final zzgqw zzc(zzghd zzghdVar, Class cls, zzghw zzghwVar) throws GeneralSecurityException {
        zzgrb zzgrbVar = new zzgrb(zzghdVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgrbVar)) {
            return ((zzgom) this.zza.get(zzgrbVar)).zza(zzghdVar, zzghwVar);
        }
        throw new GeneralSecurityException(androidx.compose.foundation.text.input.a.A("No Key serializer for ", zzgrbVar.toString(), " available"));
    }

    public final zzgqw zzd(zzghs zzghsVar, Class cls) throws GeneralSecurityException {
        zzgrb zzgrbVar = new zzgrb(zzghsVar.getClass(), cls, null);
        if (this.zzc.containsKey(zzgrbVar)) {
            return ((zzgpz) this.zzc.get(zzgrbVar)).zza(zzghsVar);
        }
        throw new GeneralSecurityException(androidx.compose.foundation.text.input.a.A("No Key Format serializer for ", zzgrbVar.toString(), " available"));
    }

    public final boolean zzi(zzgqw zzgqwVar) {
        return this.zzb.containsKey(new zzgqz(zzgqwVar.getClass(), zzgqwVar.zzd(), null));
    }

    public final boolean zzj(zzgqw zzgqwVar) {
        return this.zzd.containsKey(new zzgqz(zzgqwVar.getClass(), zzgqwVar.zzd(), null));
    }
}
