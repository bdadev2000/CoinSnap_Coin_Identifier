package com.google.android.gms.internal.consent_sdk;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
abstract class zzcy extends zzdk {
    private final int zza;
    private int zzb;

    public zzcy(int i10, int i11) {
        zzcw.zzb(i11, i10, "index");
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.zzb < this.zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.zzb;
            this.zzb = i10 + 1;
            return zza(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzb;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.zzb - 1;
            this.zzb = i10;
            return zza(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzb - 1;
    }

    public abstract Object zza(int i10);
}
