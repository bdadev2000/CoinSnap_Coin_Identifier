package com.google.android.gms.internal.measurement;

import Q7.n0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlg<E> extends zzhu<E> implements RandomAccess {
    private static final zzlg<Object> zza = new zzlg<>(new Object[0], 0, false);
    private E[] zzb;
    private int zzc;

    public zzlg() {
        this(new Object[10], 0, true);
    }

    private final String zzb(int i9) {
        return n0.e(i9, this.zzc, "Index:", ", Size:");
    }

    private final void zzc(int i9) {
        if (i9 >= 0 && i9 < this.zzc) {
        } else {
            throw new IndexOutOfBoundsException(zzb(i9));
        }
    }

    public static <E> zzlg<E> zzd() {
        return (zzlg<E>) zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.List
    public final void add(int i9, E e4) {
        int i10;
        zza();
        if (i9 >= 0 && i9 <= (i10 = this.zzc)) {
            E[] eArr = this.zzb;
            if (i10 < eArr.length) {
                System.arraycopy(eArr, i9, eArr, i9 + 1, i10 - i9);
            } else {
                E[] eArr2 = (E[]) new Object[n0.v(i10, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i9);
                System.arraycopy(this.zzb, i9, eArr2, i9 + 1, this.zzc - i9);
                this.zzb = eArr2;
            }
            this.zzb[i9] = e4;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzb(i9));
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i9) {
        zzc(i9);
        return this.zzb[i9];
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.List
    public final E remove(int i9) {
        zza();
        zzc(i9);
        E[] eArr = this.zzb;
        E e4 = eArr[i9];
        if (i9 < this.zzc - 1) {
            System.arraycopy(eArr, i9 + 1, eArr, i9, (r2 - i9) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return e4;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.List
    public final E set(int i9, E e4) {
        zza();
        zzc(i9);
        E[] eArr = this.zzb;
        E e9 = eArr[i9];
        eArr[i9] = e4;
        ((AbstractList) this).modCount++;
        return e9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzjt
    public final /* synthetic */ zzjt zza(int i9) {
        if (i9 >= this.zzc) {
            return new zzlg(Arrays.copyOf(this.zzb, i9), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    private zzlg(E[] eArr, int i9, boolean z8) {
        super(z8);
        this.zzb = eArr;
        this.zzc = i9;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e4) {
        zza();
        int i9 = this.zzc;
        E[] eArr = this.zzb;
        if (i9 == eArr.length) {
            this.zzb = (E[]) Arrays.copyOf(eArr, ((i9 * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        eArr2[i10] = e4;
        ((AbstractList) this).modCount++;
        return true;
    }
}
