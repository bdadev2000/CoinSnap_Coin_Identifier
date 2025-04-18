package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
final class zzfzo extends zzfzm implements ListIterator {
    final /* synthetic */ zzfzp zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzo(zzfzp zzfzpVar) {
        super(zzfzpVar);
        this.zzd = zzfzpVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i2;
        boolean isEmpty = this.zzd.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzfzq zzfzqVar = this.zzd.zzf;
        i2 = zzfzqVar.zzb;
        zzfzqVar.zzb = i2 + 1;
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
    public zzfzo(zzfzp zzfzpVar, int i2) {
        super(zzfzpVar, ((List) zzfzpVar.zzb).listIterator(i2));
        this.zzd = zzfzpVar;
    }
}
