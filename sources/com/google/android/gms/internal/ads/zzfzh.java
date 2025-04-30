package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzfzh implements Iterator {
    final Iterator zza;
    Collection zzb;
    final /* synthetic */ zzfzi zzc;

    public zzfzh(zzfzi zzfziVar) {
        this.zzc = zzfziVar;
        this.zza = zzfziVar.zza.entrySet().iterator();
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
        boolean z8;
        int i9;
        if (this.zzb != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzfyg.zzk(z8, "no calls to next() since the last call to remove()");
        this.zza.remove();
        zzfzv zzfzvVar = this.zzc.zzb;
        i9 = zzfzvVar.zzb;
        zzfzvVar.zzb = i9 - this.zzb.size();
        this.zzb.clear();
        this.zzb = null;
    }
}
