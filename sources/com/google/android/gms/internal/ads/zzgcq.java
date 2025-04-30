package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzgcq extends zzgbh {
    private final transient zzgbf zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzgcq(zzgbf zzgbfVar, Object[] objArr, int i9, int i10) {
        this.zza = zzgbfVar;
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgax, java.util.AbstractCollection, java.util.Collection
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

    @Override // com.google.android.gms.internal.ads.zzgbh, com.google.android.gms.internal.ads.zzgax, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final int zza(Object[] objArr, int i9) {
        return zzd().zza(objArr, i9);
    }

    @Override // com.google.android.gms.internal.ads.zzgbh, com.google.android.gms.internal.ads.zzgax
    /* renamed from: zze */
    public final zzgdi iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    public final zzgbc zzi() {
        return new zzgcp(this);
    }
}
