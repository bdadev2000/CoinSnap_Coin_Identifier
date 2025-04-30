package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzfzg extends zzgbv {
    final /* synthetic */ zzfzi zza;

    public zzfzg(zzfzi zzfziVar) {
        this.zza = zzfziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgbv, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return zzgab.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfzh(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgbv, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        zzfzi zzfziVar = this.zza;
        zzfzv.zzo(zzfziVar.zzb, entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgbv
    public final Map zza() {
        return this.zza;
    }
}
