package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: Add missing generic type declarations: [E] */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0092\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\u000e\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlin/collections/AbstractList$IteratorImpl;", "", "(Lkotlin/collections/AbstractList;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.Gx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1190Gx<E> implements Iterator<E> {
    public static byte[] A02;
    public int A00;
    public final /* synthetic */ AbstractC09546u<E> A01;

    static {
        A03();
    }

    public static String A02(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 117);
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

    public C1190Gx(AbstractC09546u abstractC09546u) {
        this.A01 = abstractC09546u;
    }

    /* renamed from: A04, reason: from getter */
    public final int getA00() {
        return this.A00;
    }

    public final void A05(int i9) {
        this.A00 = i9;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00 < this.A01.size();
    }

    @Override // java.util.Iterator
    public final E next() {
        if (hasNext()) {
            AbstractC09546u<E> abstractC09546u = this.A01;
            int i9 = this.A00;
            this.A00 = i9 + 1;
            return abstractC09546u.get(i9);
        }
        throw new NoSuchElementException();
    }
}
