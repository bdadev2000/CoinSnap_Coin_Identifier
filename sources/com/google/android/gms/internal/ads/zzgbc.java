package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzgbc extends zzfzt {
    private final transient zzfzr zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzgbc(zzfzr zzfzrVar, Object[] objArr, int i10, int i11) {
        this.zza = zzfzrVar;
        this.zzb = objArr;
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzfzj, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfzt, com.google.android.gms.internal.ads.zzfzj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    public final int zza(Object[] objArr, int i10) {
        return zzd().zza(objArr, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzfzt, com.google.android.gms.internal.ads.zzfzj
    /* renamed from: zze */
    public final zzgbu iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfzt
    public final zzfzo zzi() {
        return new zzgbb(this);
    }
}
