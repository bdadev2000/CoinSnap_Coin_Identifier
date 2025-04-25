package com.google.android.gms.internal.maps;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
final class zzbr extends zzbm {
    private final transient zzbl zza;
    private final transient zzbi zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbr(zzbl zzblVar, zzbi zzbiVar) {
        this.zza = zzblVar;
        this.zzb = zzbiVar;
    }

    @Override // com.google.android.gms.internal.maps.zzbf, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.maps.zzbm, com.google.android.gms.internal.maps.zzbf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.maps.zzbf
    public final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.maps.zzbm, com.google.android.gms.internal.maps.zzbf
    /* renamed from: zzd */
    public final zzbx iterator() {
        return this.zzb.listIterator(0);
    }
}
