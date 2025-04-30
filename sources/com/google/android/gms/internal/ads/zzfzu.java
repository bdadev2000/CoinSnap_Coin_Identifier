package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzfzu extends zzfzs implements List {
    final /* synthetic */ zzfzv zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzu(zzfzv zzfzvVar, Object obj, List list, zzfzs zzfzsVar) {
        super(zzfzvVar, obj, list, zzfzsVar);
        this.zzf = zzfzvVar;
    }

    @Override // java.util.List
    public final void add(int i9, Object obj) {
        int i10;
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i9, obj);
        zzfzv zzfzvVar = this.zzf;
        i10 = zzfzvVar.zzb;
        zzfzvVar.zzb = i10 + 1;
        if (isEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i9, Collection collection) {
        int i10;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i9, collection);
        if (addAll) {
            int size2 = this.zzb.size();
            zzfzv zzfzvVar = this.zzf;
            i10 = zzfzvVar.zzb;
            zzfzvVar.zzb = i10 + (size2 - size);
            if (size == 0) {
                zza();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        zzb();
        return ((List) this.zzb).get(i9);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzfzt(this);
    }

    @Override // java.util.List
    public final Object remove(int i9) {
        int i10;
        zzb();
        Object remove = ((List) this.zzb).remove(i9);
        zzfzv zzfzvVar = this.zzf;
        i10 = zzfzvVar.zzb;
        zzfzvVar.zzb = i10 - 1;
        zzc();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i9, Object obj) {
        zzb();
        return ((List) this.zzb).set(i9, obj);
    }

    @Override // java.util.List
    public final List subList(int i9, int i10) {
        zzb();
        List subList = ((List) this.zzb).subList(i9, i10);
        zzfzs zzfzsVar = this.zzc;
        if (zzfzsVar == null) {
            zzfzsVar = this;
        }
        return this.zzf.zzh(this.zza, subList, zzfzsVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i9) {
        zzb();
        return new zzfzt(this, i9);
    }
}
