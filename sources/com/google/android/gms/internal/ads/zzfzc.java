package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzfzc implements Iterator {
    final Iterator zza;
    Collection zzb;
    final /* synthetic */ zzfzd zzc;

    public zzfzc(zzfzd zzfzdVar) {
        this.zzc = zzfzdVar;
        this.zza = zzfzdVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        return this.zzc.zza(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i2;
        zzfxz.zzk(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        zzfzq zzfzqVar = this.zzc.zzb;
        i2 = zzfzqVar.zzb;
        zzfzqVar.zzb = i2 - this.zzb.size();
        this.zzb.clear();
        this.zzb = null;
    }
}
