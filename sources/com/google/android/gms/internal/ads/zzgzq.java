package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzgzq implements Iterator {
    private final Iterator zza;

    public zzgzq(Iterator it) {
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        if (entry.getValue() instanceof zzgzs) {
            return new zzgzp(entry, null);
        }
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
    }
}
