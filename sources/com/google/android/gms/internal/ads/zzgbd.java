package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzgbd extends zzfzt {
    private final transient zzfzr zza;
    private final transient zzfzo zzb;

    public zzgbd(zzfzr zzfzrVar, zzfzo zzfzoVar) {
        this.zza = zzfzrVar;
        this.zzb = zzfzoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzj, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfzt, com.google.android.gms.internal.ads.zzfzj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    public final int zza(Object[] objArr, int i10) {
        return this.zzb.zza(objArr, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzfzt, com.google.android.gms.internal.ads.zzfzj
    public final zzfzo zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfzt, com.google.android.gms.internal.ads.zzfzj
    /* renamed from: zze */
    public final zzgbu iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    public final boolean zzf() {
        return true;
    }
}
