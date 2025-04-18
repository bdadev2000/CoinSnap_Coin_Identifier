package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzfzp extends zzfzn implements List {
    final /* synthetic */ zzfzq zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzp(zzfzq zzfzqVar, Object obj, List list, zzfzn zzfznVar) {
        super(zzfzqVar, obj, list, zzfznVar);
        this.zzf = zzfzqVar;
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i2, obj);
        zzfzq zzfzqVar = this.zzf;
        i3 = zzfzqVar.zzb;
        zzfzqVar.zzb = i3 + 1;
        if (isEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        int i3;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i2, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.zzb.size();
        zzfzq zzfzqVar = this.zzf;
        i3 = zzfzqVar.zzb;
        zzfzqVar.zzb = i3 + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        zza();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzb();
        return ((List) this.zzb).get(i2);
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
        return new zzfzo(this);
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        int i3;
        zzb();
        Object remove = ((List) this.zzb).remove(i2);
        zzfzq zzfzqVar = this.zzf;
        i3 = zzfzqVar.zzb;
        zzfzqVar.zzb = i3 - 1;
        zzc();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        zzb();
        return ((List) this.zzb).set(i2, obj);
    }

    @Override // java.util.List
    public final List subList(int i2, int i3) {
        zzb();
        List subList = ((List) this.zzb).subList(i2, i3);
        zzfzn zzfznVar = this.zzc;
        if (zzfznVar == null) {
            zzfznVar = this;
        }
        return this.zzf.zzh(this.zza, subList, zzfznVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        zzb();
        return new zzfzo(this, i2);
    }
}
