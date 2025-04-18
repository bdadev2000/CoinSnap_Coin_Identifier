package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
final class zzfzb extends zzgbq {
    final /* synthetic */ zzfzd zza;

    public zzfzb(zzfzd zzfzdVar) {
        this.zza = zzfzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgbq, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return zzfzw.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfzc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgbq, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        zzfzd zzfzdVar = this.zza;
        zzfzq.zzo(zzfzdVar.zzb, entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgbq
    public final Map zza() {
        return this.zza;
    }
}
