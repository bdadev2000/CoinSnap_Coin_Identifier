package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: Add missing generic type declarations: [E] */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\r\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"Lkotlin/collections/AbstractList$ListIteratorImpl;", "Lkotlin/collections/AbstractList$IteratorImpl;", "Lkotlin/collections/AbstractList;", "", "index", "", "(Lkotlin/collections/AbstractList;I)V", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.6v, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C09556v<E> extends AbstractC09546u<E>.IteratorImpl implements ListIterator<E> {
    public static byte[] A01;
    public final /* synthetic */ AbstractC09546u<E> A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 84);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{6, 39, Ascii.FS, 41, Ascii.CAN, 43, 32, 38, 37, -41, 32, 42, -41, 37, 38, 43, -41, 42, 44, 39, 39, 38, 41, 43, Ascii.FS, Ascii.ESC, -41, Ascii.GS, 38, 41, -41, 41, Ascii.FS, Ascii.CAN, Ascii.ESC, -28, 38, 37, 35, 48, -41, Ascii.SUB, 38, 35, 35, Ascii.FS, Ascii.SUB, 43, 32, 38, 37};
    }

    @Override // java.util.ListIterator
    public final void add(E e4) {
        throw new UnsupportedOperationException(A00(0, 51, 99));
    }

    @Override // java.util.ListIterator
    public final void set(E e4) {
        throw new UnsupportedOperationException(A00(0, 51, 99));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09556v(AbstractC09546u abstractC09546u, int i9) {
        super(abstractC09546u);
        this.A00 = abstractC09546u;
        AbstractC09546u.A02.A04(i9, abstractC09546u.size());
        A05(i9);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return getA00() > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return getA00();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            AbstractC09546u<E> abstractC09546u = this.A00;
            A05(getA00() - 1);
            return abstractC09546u.get(getA00());
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return getA00() - 1;
    }
}
