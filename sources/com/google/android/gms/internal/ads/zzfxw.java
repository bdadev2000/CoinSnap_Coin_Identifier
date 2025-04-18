package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfxw implements Iterator {
    Map.Entry zza;
    final /* synthetic */ Iterator zzb;
    final /* synthetic */ zzfxx zzc;

    public zzfxw(zzfxx zzfxxVar, Iterator it) {
        this.zzb = it;
        this.zzc = zzfxxVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.zzb.next();
        this.zza = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z10;
        int i10;
        if (this.zza != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfwq.zzl(z10, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.zza.getValue();
        this.zzb.remove();
        zzfyh zzfyhVar = this.zzc.zza;
        i10 = zzfyhVar.zzb;
        zzfyhVar.zzb = i10 - collection.size();
        collection.clear();
        this.zza = null;
    }
}
