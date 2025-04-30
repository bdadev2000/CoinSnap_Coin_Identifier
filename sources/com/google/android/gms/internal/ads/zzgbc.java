package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class zzgbc<E> extends zzgax<E> implements List<E>, RandomAccess {
    private static final zzgdj zza = new zzgba(zzgco.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zzgaz zzi(int i9) {
        return new zzgaz(i9);
    }

    public static zzgbc zzj(Object[] objArr, int i9) {
        if (i9 == 0) {
            return zzgco.zza;
        }
        return new zzgco(objArr, i9);
    }

    public static zzgbc zzk(Collection collection) {
        if (collection instanceof zzgax) {
            zzgbc zzd2 = ((zzgax) collection).zzd();
            if (zzd2.zzf()) {
                Object[] array = zzd2.toArray();
                return zzj(array, array.length);
            }
            return zzd2;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzgcm.zzb(array2, length);
        return zzj(array2, length);
    }

    public static zzgbc zzl(Object[] objArr) {
        if (objArr.length == 0) {
            return zzgco.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzgcm.zzb(objArr2, length);
        return zzj(objArr2, length);
    }

    public static zzgbc zzm() {
        return zzgco.zza;
    }

    public static zzgbc zzn(Object obj) {
        Object[] objArr = {obj};
        zzgcm.zzb(objArr, 1);
        return zzj(objArr, 1);
    }

    public static zzgbc zzo(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzgcm.zzb(objArr, 2);
        return zzj(objArr, 2);
    }

    public static zzgbc zzp(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzgcm.zzb(objArr, 3);
        return zzj(objArr, 3);
    }

    public static zzgbc zzq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzgcm.zzb(objArr, 5);
        return zzj(objArr, 5);
    }

    public static zzgbc zzr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzgcm.zzb(objArr, 6);
        return zzj(objArr, 6);
    }

    public static zzgbc zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9};
        zzgcm.zzb(objArr, 9);
        return zzj(objArr, 9);
    }

    public static zzgbc zzt(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10};
        zzgcm.zzb(objArr, 10);
        return zzj(objArr, 10);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i9, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i9, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgax, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i9 = 0; i9 < size; i9++) {
                        if (zzfya.zza(get(i9), list.get(i9))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !zzfya.zza(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i9 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i9 = (i9 * 31) + get(i10).hashCode();
        }
        return i9;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (obj.equals(get(i9))) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgax, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i9) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i9, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public int zza(Object[] objArr, int i9) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i9 + i10] = get(i10);
        }
        return i9 + size;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    @Deprecated
    public final zzgbc zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    /* renamed from: zze */
    public final zzgdi iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzgbc subList(int i9, int i10) {
        zzfyg.zzi(i9, i10, size());
        int i11 = i10 - i9;
        if (i11 == size()) {
            return this;
        }
        if (i11 == 0) {
            return zzgco.zza;
        }
        return new zzgbb(this, i9, i11);
    }

    @Override // java.util.List
    /* renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final zzgdj listIterator(int i9) {
        zzfyg.zzb(i9, size(), "index");
        if (isEmpty()) {
            return zza;
        }
        return new zzgba(this, i9);
    }
}
