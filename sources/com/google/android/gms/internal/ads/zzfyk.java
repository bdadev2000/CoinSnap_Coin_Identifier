package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
abstract class zzfyk implements zzgam {
    private transient Set zza;
    private transient Collection zzb;
    private transient Map zzc;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgam)) {
            return false;
        }
        return zzs().equals(((zzgam) obj).zzs());
    }

    public final int hashCode() {
        return zzs().hashCode();
    }

    public final String toString() {
        return zzs().toString();
    }

    public abstract Collection zzf();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Iterator zzg() {
        throw null;
    }

    public abstract Map zzj();

    public abstract Set zzl();

    @Override // com.google.android.gms.internal.ads.zzgam
    public boolean zzq(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgam
    public final Collection zzr() {
        Collection collection = this.zzb;
        if (collection != null) {
            return collection;
        }
        Collection zzf = zzf();
        this.zzb = zzf;
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgam
    public final Map zzs() {
        Map map = this.zzc;
        if (map != null) {
            return map;
        }
        Map zzj = zzj();
        this.zzc = zzj;
        return zzj;
    }

    public final Set zzt() {
        Set set = this.zza;
        if (set != null) {
            return set;
        }
        Set zzl = zzl();
        this.zza = zzl;
        return zzl;
    }
}
