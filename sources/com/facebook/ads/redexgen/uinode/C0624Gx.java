package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: Add missing generic type declarations: [E] */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0092\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\u000e\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlin/collections/AbstractList$IteratorImpl;", "", "(Lkotlin/collections/AbstractList;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.Gx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0624Gx<E> implements Iterator<E> {
    public static byte[] A02;
    public int A00;
    public final /* synthetic */ AbstractC03886u<E> A01;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 117);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{48, Ascii.SI, Ascii.SUB, Ascii.CR, Ascii.RS, Ascii.VT, Ascii.SYN, Ascii.DLE, 17, 95, Ascii.SYN, Ascii.FF, 95, 17, Ascii.DLE, Ascii.VT, 95, Ascii.FF, 10, Ascii.SI, Ascii.SI, Ascii.DLE, Ascii.CR, Ascii.VT, Ascii.SUB, Ascii.ESC, 95, Ascii.EM, Ascii.DLE, Ascii.CR, 95, Ascii.CR, Ascii.SUB, Ascii.RS, Ascii.ESC, 82, Ascii.DLE, 17, 19, 6, 95, Ascii.FS, Ascii.DLE, 19, 19, Ascii.SUB, Ascii.FS, Ascii.VT, Ascii.SYN, Ascii.DLE, 17};
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException(A02(0, 51, 10));
    }

    public C0624Gx(AbstractC03886u abstractC03886u) {
        this.A01 = abstractC03886u;
    }

    /* renamed from: A04, reason: from getter */
    public final int getA00() {
        return this.A00;
    }

    public final void A05(int i10) {
        this.A00 = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00 < this.A01.size();
    }

    @Override // java.util.Iterator
    public final E next() {
        if (hasNext()) {
            AbstractC03886u<E> abstractC03886u = this.A01;
            int i10 = this.A00;
            this.A00 = i10 + 1;
            return abstractC03886u.get(i10);
        }
        throw new NoSuchElementException();
    }
}
