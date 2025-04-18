package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public abstract class zzfzo<E> extends zzfzj<E> implements List<E>, RandomAccess {
    private static final zzgbv zza = new zzfzm(zzgba.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zzfzl zzi(int i10) {
        zzfyl.zza(i10, "expectedSize");
        return new zzfzl(i10);
    }

    public static zzfzo zzj(Object[] objArr, int i10) {
        if (i10 == 0) {
            return zzgba.zza;
        }
        return new zzgba(objArr, i10);
    }

    public static zzfzo zzk(Iterable iterable) {
        iterable.getClass();
        return zzl((Collection) iterable);
    }

    public static zzfzo zzl(Collection collection) {
        if (collection instanceof zzfzj) {
            zzfzo zzd2 = ((zzfzj) collection).zzd();
            if (zzd2.zzf()) {
                Object[] array = zzd2.toArray();
                return zzj(array, array.length);
            }
            return zzd2;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzgay.zzb(array2, length);
        return zzj(array2, length);
    }

    public static zzfzo zzm(Object[] objArr) {
        if (objArr.length == 0) {
            return zzgba.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzgay.zzb(objArr2, length);
        return zzj(objArr2, length);
    }

    public static zzfzo zzn() {
        return zzgba.zza;
    }

    public static zzfzo zzo(Object obj) {
        Object[] objArr = {obj};
        zzgay.zzb(objArr, 1);
        return zzj(objArr, 1);
    }

    public static zzfzo zzp(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzgay.zzb(objArr, 2);
        return zzj(objArr, 2);
    }

    public static zzfzo zzq(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzgay.zzb(objArr, 3);
        return zzj(objArr, 3);
    }

    public static zzfzo zzr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzgay.zzb(objArr, 5);
        return zzj(objArr, 5);
    }

    public static zzfzo zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzgay.zzb(objArr, 6);
        return zzj(objArr, 6);
    }

    @SafeVarargs
    public static zzfzo zzt(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i10 = length + 12;
        Object[] objArr2 = new Object[i10];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        zzgay.zzb(objArr2, i10);
        return zzj(objArr2, i10);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfzj, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
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
                    for (int i10 = 0; i10 < size; i10++) {
                        if (zzfwn.zza(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !zzfwn.zza(it.next(), it2.next())) {
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
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfzj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    public int zza(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    @Deprecated
    public final zzfzo zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    /* renamed from: zze */
    public final zzgbu iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzfzo subList(int i10, int i11) {
        zzfwq.zzj(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return zzgba.zza;
        }
        return new zzfzn(this, i10, i12);
    }

    @Override // java.util.List
    /* renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final zzgbv listIterator(int i10) {
        zzfwq.zzb(i10, size(), "index");
        if (isEmpty()) {
            return zza;
        }
        return new zzfzm(this, i10);
    }
}
