package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgqk {
    private final Map zza;
    private final List zzb;
    private final zzgqi zzc;
    private final Class zzd;
    private final zzgtk zze;

    public /* synthetic */ zzgqk(Map map, List list, zzgqi zzgqiVar, zzgtk zzgtkVar, Class cls, zzgqj zzgqjVar) {
        this.zza = map;
        this.zzb = list;
        this.zzc = zzgqiVar;
        this.zzd = cls;
        this.zze = zzgtkVar;
    }

    public static zzgqg zza(Class cls) {
        return new zzgqg(cls, null);
    }

    public final zzgqi zzb() {
        return this.zzc;
    }

    public final zzgtk zzc() {
        return this.zze;
    }

    public final Class zzd() {
        return this.zzd;
    }

    public final Collection zze() {
        return this.zza.values();
    }

    public final List zzf(byte[] bArr) {
        List list = (List) this.zza.get(zzgze.zzb(bArr));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    public final boolean zzg() {
        if (!this.zze.zza().isEmpty()) {
            return true;
        }
        return false;
    }
}
