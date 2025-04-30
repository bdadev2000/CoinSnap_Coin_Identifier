package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzheu implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzhev zzb;

    public zzheu(zzhev zzhevVar) {
        zzhcm zzhcmVar;
        this.zzb = zzhevVar;
        zzhcmVar = zzhevVar.zza;
        this.zza = zzhcmVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
