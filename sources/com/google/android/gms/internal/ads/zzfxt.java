package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzfxt implements Iterator {
    final Iterator zza;
    Collection zzb;
    final /* synthetic */ zzfxu zzc;

    public zzfxt(zzfxu zzfxuVar) {
        this.zzc = zzfxuVar;
        this.zza = zzfxuVar.zza.entrySet().iterator();
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
        boolean z10;
        int i10;
        if (this.zzb != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfwq.zzl(z10, "no calls to next() since the last call to remove()");
        this.zza.remove();
        zzfyh zzfyhVar = this.zzc.zzb;
        i10 = zzfyhVar.zzb;
        zzfyhVar.zzb = i10 - this.zzb.size();
        this.zzb.clear();
        this.zzb = null;
    }
}
