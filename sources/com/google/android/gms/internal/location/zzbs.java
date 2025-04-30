package com.google.android.gms.internal.location;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes2.dex */
public abstract class zzbs<E> extends zzbp<E> implements List<E>, RandomAccess {
    private static final zzbv<Object> zza = new zzbq(zzbt.zza, 0);

    public static <E> zzbs<E> zzi() {
        return (zzbs<E>) zzbt.zza;
    }

    public static <E> zzbs<E> zzj(Collection<? extends E> collection) {
        if (collection instanceof zzbp) {
            zzbs<E> zze = ((zzbp) collection).zze();
            if (zze.zzf()) {
                Object[] array = zze.toArray();
                return zzk(array, array.length);
            }
            return zze;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (array2[i9] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i9);
                throw new NullPointerException(sb.toString());
            }
        }
        return zzk(array2, length);
    }

    public static <E> zzbs<E> zzk(Object[] objArr, int i9) {
        if (i9 == 0) {
            return (zzbs<E>) zzbt.zza;
        }
        return new zzbt(objArr, i9);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i9, E e4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i9, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@NullableDecl Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i9 = 0; i9 < size; i9++) {
                        if (zzbl.zza(get(i9), list.get(i9))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !zzbl.zza(it.next(), it2.next())) {
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
    public final int indexOf(@NullableDecl Object obj) {
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

    @Override // com.google.android.gms.internal.location.zzbp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@NullableDecl Object obj) {
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
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i9) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i9, E e4) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.location.zzbp
    /* renamed from: zza */
    public final zzbu<E> iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final zzbs<E> zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public int zzg(Object[] objArr, int i9) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = get(i10);
        }
        return size;
    }

    @Override // java.util.List
    /* renamed from: zzh */
    public zzbs<E> subList(int i9, int i10) {
        zzbm.zzc(i9, i10, size());
        int i11 = i10 - i9;
        if (i11 == size()) {
            return this;
        }
        if (i11 == 0) {
            return (zzbs<E>) zzbt.zza;
        }
        return new zzbr(this, i9, i11);
    }

    @Override // java.util.List
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final zzbv<E> listIterator(int i9) {
        zzbm.zzb(i9, size(), "index");
        if (isEmpty()) {
            return (zzbv<E>) zza;
        }
        return new zzbq(this, i9);
    }
}
