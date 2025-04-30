package com.meta.analytics.dsp.uinode;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.facebook.ads.redexgen.X.2t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C08562t<T> implements Iterator<T> {
    public int A00;
    public int A01;
    public boolean A02 = false;
    public final int A03;
    public final /* synthetic */ AbstractC08612y A04;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2t != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
    public C08562t(AbstractC08612y abstractC08612y, int i9) {
        this.A04 = abstractC08612y;
        this.A03 = i9;
        this.A01 = abstractC08612y.A04();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2t != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00 < this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2t != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            T t9 = (T) this.A04.A0B(this.A00, this.A03);
            this.A00++;
            this.A02 = true;
            return t9;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2t != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
    @Override // java.util.Iterator
    public final void remove() {
        if (this.A02) {
            int i9 = this.A00 - 1;
            this.A00 = i9;
            this.A01--;
            this.A02 = false;
            this.A04.A0E(i9);
            return;
        }
        throw new IllegalStateException();
    }
}
