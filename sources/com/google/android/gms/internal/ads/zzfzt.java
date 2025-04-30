package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
final class zzfzt extends zzfzr implements ListIterator {
    final /* synthetic */ zzfzu zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzt(zzfzu zzfzuVar) {
        super(zzfzuVar);
        this.zzd = zzfzuVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i9;
        boolean isEmpty = this.zzd.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzfzv zzfzvVar = this.zzd.zzf;
        i9 = zzfzvVar.zzb;
        zzfzvVar.zzb = i9 + 1;
        if (isEmpty) {
            this.zzd.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzt(zzfzu zzfzuVar, int i9) {
        super(zzfzuVar, ((List) zzfzuVar.zzb).listIterator(i9));
        this.zzd = zzfzuVar;
    }
}
