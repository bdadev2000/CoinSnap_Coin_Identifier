package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
final class zzfyf extends zzfyd implements ListIterator {
    final /* synthetic */ zzfyg zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfyf(zzfyg zzfygVar) {
        super(zzfygVar);
        this.zzd = zzfygVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i10;
        boolean isEmpty = this.zzd.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzfyh zzfyhVar = this.zzd.zzf;
        i10 = zzfyhVar.zzb;
        zzfyhVar.zzb = i10 + 1;
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
    public zzfyf(zzfyg zzfygVar, int i10) {
        super(zzfygVar, ((List) zzfygVar.zzb).listIterator(i10));
        this.zzd = zzfygVar;
    }
}
