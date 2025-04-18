package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzfyg extends zzfye implements List {
    final /* synthetic */ zzfyh zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfyg(zzfyh zzfyhVar, Object obj, List list, zzfye zzfyeVar) {
        super(zzfyhVar, obj, list, zzfyeVar);
        this.zzf = zzfyhVar;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i10, obj);
        zzfyh zzfyhVar = this.zzf;
        i11 = zzfyhVar.zzb;
        zzfyhVar.zzb = i11 + 1;
        if (isEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        int i11;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i10, collection);
        if (addAll) {
            int size2 = this.zzb.size();
            zzfyh zzfyhVar = this.zzf;
            i11 = zzfyhVar.zzb;
            zzfyhVar.zzb = i11 + (size2 - size);
            if (size == 0) {
                zza();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzb();
        return ((List) this.zzb).get(i10);
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
        return new zzfyf(this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        int i11;
        zzb();
        Object remove = ((List) this.zzb).remove(i10);
        zzfyh zzfyhVar = this.zzf;
        i11 = zzfyhVar.zzb;
        zzfyhVar.zzb = i11 - 1;
        zzc();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        zzb();
        return ((List) this.zzb).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        zzb();
        List subList = ((List) this.zzb).subList(i10, i11);
        zzfye zzfyeVar = this.zzc;
        if (zzfyeVar == null) {
            zzfyeVar = this;
        }
        return this.zzf.zzh(this.zza, subList, zzfyeVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        zzb();
        return new zzfyf(this, i10);
    }
}
