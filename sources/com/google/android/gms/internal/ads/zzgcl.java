package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
final class zzgcl extends zzgbc {
    private final transient zzgba zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzgcl(zzgba zzgbaVar, Object[] objArr, int i2, int i3) {
        this.zza = zzgbaVar;
        this.zzb = objArr;
        this.zzc = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzgas, java.util.AbstractCollection, java.util.Collection
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

    @Override // com.google.android.gms.internal.ads.zzgbc, com.google.android.gms.internal.ads.zzgas, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final int zza(Object[] objArr, int i2) {
        return zzd().zza(objArr, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgbc, com.google.android.gms.internal.ads.zzgas
    /* renamed from: zze */
    public final zzgdd iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgbc
    public final zzgax zzi() {
        return new zzgck(this);
    }
}
