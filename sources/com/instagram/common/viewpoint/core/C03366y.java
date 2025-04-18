package com.instagram.common.viewpoint.core;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: Add missing generic type declarations: [E] */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\r\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"Lkotlin/collections/AbstractList$ListIteratorImpl;", "Lkotlin/collections/AbstractList$IteratorImpl;", "Lkotlin/collections/AbstractList;", "", FirebaseAnalytics.Param.INDEX, "", "(Lkotlin/collections/AbstractList;I)V", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C03366y<E> extends AbstractC03356x<E>.IteratorImpl implements ListIterator<E> {
    public static byte[] A01;
    public final /* synthetic */ AbstractC03356x<E> A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{18, 45, 56, 47, 60, 41, 52, 50, 51, 125, 52, 46, 125, 51, 50, 41, 125, 46, 40, 45, 45, 50, 47, 41, 56, 57, 125, 59, 50, 47, 125, 47, 56, 60, 57, 112, 50, 51, 49, 36, 125, 62, 50, 49, 49, 56, 62, 41, 52, 50, 51};
    }

    @Override // java.util.ListIterator
    public final void add(E e) {
        throw new UnsupportedOperationException(A00(0, 51, 5));
    }

    @Override // java.util.ListIterator
    public final void set(E e) {
        throw new UnsupportedOperationException(A00(0, 51, 5));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03366y(AbstractC03356x abstractC03356x, int i2) {
        super(abstractC03356x);
        this.A00 = abstractC03356x;
        AbstractC03356x.A02.A04(i2, this.A00.size());
        A05(i2);
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
            AbstractC03356x<E> abstractC03356x = this.A00;
            A05(getA00() - 1);
            return abstractC03356x.get(getA00());
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return getA00() - 1;
    }
}
