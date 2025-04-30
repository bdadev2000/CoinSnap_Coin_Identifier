package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes2.dex */
abstract class zzgby extends AbstractMap {
    private transient Set zza;
    private transient Set zzb;
    private transient Collection zzc;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zza;
        if (set == null) {
            Set zzb = zzb();
            this.zza = zzb;
            return zzb;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.zzb;
        if (set == null) {
            Set zze = zze();
            this.zzb = zze;
            return zze;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzc;
        if (collection == null) {
            zzgbx zzgbxVar = new zzgbx(this);
            this.zzc = zzgbxVar;
            return zzgbxVar;
        }
        return collection;
    }

    public abstract Set zzb();

    public Set zze() {
        return new zzgbw(this);
    }
}
