package com.facebook.ads.redexgen.uinode;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.facebook.ads.redexgen.X.2t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02902t<T> implements Iterator<T> {
    public int A00;
    public int A01;
    public boolean A02 = false;
    public final int A03;
    public final /* synthetic */ AbstractC02952y A04;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2t != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
    public C02902t(AbstractC02952y abstractC02952y, int i10) {
        this.A04 = abstractC02952y;
        this.A03 = i10;
        this.A01 = abstractC02952y.A04();
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
            T t5 = (T) this.A04.A0B(this.A00, this.A03);
            this.A00++;
            this.A02 = true;
            return t5;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2t != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
    @Override // java.util.Iterator
    public final void remove() {
        if (this.A02) {
            int i10 = this.A00 - 1;
            this.A00 = i10;
            this.A01--;
            this.A02 = false;
            this.A04.A0E(i10);
            return;
        }
        throw new IllegalStateException();
    }
}
