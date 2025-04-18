package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.2w, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02932w<K, V> implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
    public static byte[] A04;
    public static String[] A05 = {"XqZAhum", "ZDgQMvtBgNrA71zPtdKPERKXDyY", "", "fQnh1QnAdjSL19mcL6hVXdKAmOMxUcoe", "Jl6IPYfhih6t3CzPawLUV", "5ptyQxfboOWL43Tud8kOlHSoYTCJZrHB", "GBGqVCnWWQQidVcjkSktabcuIfs5iNWm", "2xozQVjtj3EM4viJRxfTyERGPuYGzhPM"};
    public int A00;
    public final /* synthetic */ AbstractC02952y A03;
    public boolean A02 = false;
    public int A01 = -1;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 108);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{Ascii.FS, -40, -20, -19, -9, -92, -25, -13, -14, -8, -27, -19, -14, -23, -10, -92, -24, -13, -23, -9, -92, -14, -13, -8, -92, -9, -7, -12, -12, -13, -10, -8, -92, -10, -23, -8, -27, -19, -14, -19, -14, -21, -92, -47, -27, -12, -78, -55, -14, -8, -10, -3, -92, -13, -26, -18, -23, -25, -8, -9};
    }

    static {
        A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    public C02932w(AbstractC02952y abstractC02952y) {
        this.A03 = abstractC02952y;
        this.A00 = abstractC02952y.A04() - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Iterator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Map.Entry<K, V> next() {
        if (hasNext()) {
            this.A01++;
            this.A02 = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.A02) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return AbstractC02882r.A04(entry.getKey(), this.A03.A0B(this.A01, 0)) && AbstractC02882r.A04(entry.getValue(), this.A03.A0B(this.A01, 1));
        }
        throw new IllegalStateException(A01(1, 59, 24));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public final K getKey() {
        if (this.A02) {
            return (K) this.A03.A0B(this.A01, 0);
        }
        throw new IllegalStateException(A01(1, 59, 24));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public final V getValue() {
        if (this.A02) {
            return (V) this.A03.A0B(this.A01, 1);
        }
        throw new IllegalStateException(A01(1, 59, 24));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01 < this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (this.A02) {
            Object A0B = this.A03.A0B(this.A01, 0);
            Object value = this.A03.A0B(this.A01, 1);
            int hashCode = (value != null ? value.hashCode() : 0) ^ (A0B == null ? 0 : A0B.hashCode());
            if (A05[4].length() != 21) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[3] = "cWQoJWn94PUAudj4depS9TLvBWA1Kd9i";
            strArr[6] = "6piqOMntm5J7SpM7GaPxMNyHyjGIVV8O";
            return hashCode;
        }
        throw new IllegalStateException(A01(1, 59, 24));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Iterator
    public final void remove() {
        if (this.A02) {
            this.A03.A0E(this.A01);
            this.A01--;
            this.A00--;
            this.A02 = false;
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        if (this.A02) {
            return (V) this.A03.A0C(this.A01, v10);
        }
        throw new IllegalStateException(A01(1, 59, 24));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2w != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$MapIterator */
    public final String toString() {
        return getKey() + A01(0, 1, 115) + getValue();
    }
}
