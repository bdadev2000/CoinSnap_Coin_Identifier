package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgou {
    private final Map zza;
    private final zzgos zzb;
    private final Class zzc;
    private final zzgnd zzd;

    public /* synthetic */ zzgou(Map map, List list, zzgos zzgosVar, zzgnd zzgndVar, Class cls, zzgot zzgotVar) {
        this.zza = map;
        this.zzb = zzgosVar;
        this.zzc = cls;
        this.zzd = zzgndVar;
    }

    public static zzgor zzb(Class cls) {
        return new zzgor(cls, null);
    }

    public final zzgnd zza() {
        return this.zzd;
    }

    public final zzgos zzc() {
        return this.zzb;
    }

    public final Class zzd() {
        return this.zzc;
    }

    public final Collection zze() {
        return this.zza.values();
    }

    public final List zzf(byte[] bArr) {
        List list = (List) this.zza.get(zzgwu.zzb(bArr));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    public final boolean zzg() {
        return !this.zzd.zza().isEmpty();
    }
}
