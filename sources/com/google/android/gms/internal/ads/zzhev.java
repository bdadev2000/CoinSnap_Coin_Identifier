package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* loaded from: classes2.dex */
public final class zzhev extends AbstractList implements RandomAccess, zzhcm {
    private final zzhcm zza;

    public zzhev(zzhcm zzhcmVar) {
        this.zza = zzhcmVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i9) {
        return ((zzhcl) this.zza).get(i9);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzheu(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i9) {
        return new zzhet(this, i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final zzhcm zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final Object zze(int i9) {
        return this.zza.zze(i9);
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final List zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final void zzi(zzhac zzhacVar) {
        throw new UnsupportedOperationException();
    }
}
