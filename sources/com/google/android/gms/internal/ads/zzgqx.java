package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzgqx {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzgqx(zzgqr zzgqrVar, zzgqw zzgqwVar) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        map = zzgqrVar.zza;
        this.zza = new HashMap(map);
        map2 = zzgqrVar.zzb;
        this.zzb = new HashMap(map2);
        map3 = zzgqrVar.zzc;
        this.zzc = new HashMap(map3);
        map4 = zzgqrVar.zzd;
        this.zzd = new HashMap(map4);
    }

    public final zzghi zza(zzgqq zzgqqVar, zzgic zzgicVar) throws GeneralSecurityException {
        zzgqt zzgqtVar = new zzgqt(zzgqqVar.getClass(), zzgqqVar.zzd(), null);
        if (this.zzb.containsKey(zzgqtVar)) {
            return ((zzgon) this.zzb.get(zzgqtVar)).zza(zzgqqVar, zzgicVar);
        }
        throw new GeneralSecurityException(AbstractC2914a.e("No Key Parser for requested key type ", zzgqtVar.toString(), " available"));
    }

    public final zzghx zzb(zzgqq zzgqqVar) throws GeneralSecurityException {
        zzgqt zzgqtVar = new zzgqt(zzgqqVar.getClass(), zzgqqVar.zzd(), null);
        if (this.zzd.containsKey(zzgqtVar)) {
            return ((zzgpq) this.zzd.get(zzgqtVar)).zza(zzgqqVar);
        }
        throw new GeneralSecurityException(AbstractC2914a.e("No Parameters Parser for requested key type ", zzgqtVar.toString(), " available"));
    }

    public final zzgqq zzc(zzghi zzghiVar, Class cls, zzgic zzgicVar) throws GeneralSecurityException {
        zzgqv zzgqvVar = new zzgqv(zzghiVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgqvVar)) {
            return ((zzgor) this.zza.get(zzgqvVar)).zza(zzghiVar, zzgicVar);
        }
        throw new GeneralSecurityException(AbstractC2914a.e("No Key serializer for ", zzgqvVar.toString(), " available"));
    }

    public final zzgqq zzd(zzghx zzghxVar, Class cls) throws GeneralSecurityException {
        zzgqv zzgqvVar = new zzgqv(zzghxVar.getClass(), cls, null);
        if (this.zzc.containsKey(zzgqvVar)) {
            return ((zzgpu) this.zzc.get(zzgqvVar)).zza(zzghxVar);
        }
        throw new GeneralSecurityException(AbstractC2914a.e("No Key Format serializer for ", zzgqvVar.toString(), " available"));
    }

    public final boolean zzi(zzgqq zzgqqVar) {
        return this.zzb.containsKey(new zzgqt(zzgqqVar.getClass(), zzgqqVar.zzd(), null));
    }

    public final boolean zzj(zzgqq zzgqqVar) {
        return this.zzd.containsKey(new zzgqt(zzgqqVar.getClass(), zzgqqVar.zzd(), null));
    }
}
