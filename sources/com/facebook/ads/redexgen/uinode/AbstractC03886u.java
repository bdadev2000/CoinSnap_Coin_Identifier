package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\b\b'\u0018\u0000 \u001c*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0004\u001c\u001d\u001e\u001fB\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\u0016\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006H¦\u0002¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0096\u0002J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0016R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006 "}, d2 = {"Lkotlin/collections/AbstractList;", "E", "Lkotlin/collections/AbstractCollection;", "", "()V", "size", "", "getSize", "()I", "equals", "", "other", "", "get", "index", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "element", "(Ljava/lang/Object;)I", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "Companion", "IteratorImpl", "ListIteratorImpl", "SubList", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.6u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC03886u<E> extends H0<E> implements List<E> {
    public static byte[] A00;
    public static String[] A01 = {"8MJW7qL63X9", "G9aG2oIn1Y4", "HqPOsgzYagb9l4J9VzVkZ8o4DQz4V9lO", "xJmplYEd", "tRQ4jDSCys0NBNjWiBDDhKLDNc3mQFOg", "4p2K0RIvYgiFEE4cJyGXuzJhjREv5DiA", "7kO1qpo2YPdStit", "T7n9PzVqaAEs33V"};
    public static final C1230c1 A02;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[4].charAt(17) != 'B') {
                throw new RuntimeException();
            }
            A01[5] = "g090LmixS2shdtXN00k1fUpYmTec5Rl3";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 118);
            i13++;
        }
    }

    public static void A07() {
        byte[] bArr = {-21, Ascii.FF, 1, Ascii.SO, -3, Ascii.DLE, 5, Ascii.VT, 10, -68, 5, Ascii.SI, -68, 10, Ascii.VT, Ascii.DLE, -68, Ascii.SI, 17, Ascii.FF, Ascii.FF, Ascii.VT, Ascii.SO, Ascii.DLE, 1, 0, -68, 2, Ascii.VT, Ascii.SO, -68, Ascii.SO, 1, -3, 0, -55, Ascii.VT, 10, 8, Ascii.NAK, -68, -1, Ascii.VT, 8, 8, 1, -1, Ascii.DLE, 5, Ascii.VT, 10};
        if (A01[3].length() == 24) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[0] = "JUfY89Gw2s4";
        strArr[1] = "2A8vB3DQCih";
        A00 = bArr;
    }

    @Override // java.util.List
    public final void add(int i10, E e2) {
        throw new UnsupportedOperationException(A06(0, 51, 38));
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException(A06(0, 51, 38));
    }

    public abstract E get(int index);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public int indexOf(E element) {
        int i10 = 0;
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (C1224bu.A0A(it.next(), element)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public int lastIndexOf(E element) {
        AbstractC03886u<E> abstractC03886u = this;
        ListIterator<E> listIterator = abstractC03886u.listIterator(abstractC03886u.size());
        while (listIterator.hasPrevious()) {
            if (C1224bu.A0A(listIterator.previous(), element)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final E remove(int i10) {
        throw new UnsupportedOperationException(A06(0, 51, 38));
    }

    @Override // java.util.List
    public final E set(int i10, E e2) {
        throw new UnsupportedOperationException(A06(0, 51, 38));
    }

    static {
        A07();
        A02 = new C1230c1(null);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof List) {
            return A02.A06(this, (Collection) other);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return A02.A02(this);
    }

    @Override // com.facebook.ads.redexgen.uinode.H0, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new C0624Gx(this);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new C03896v(this, 0);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int index) {
        return new C03896v(this, index);
    }

    @Override // java.util.List
    public final List<E> subList(int fromIndex, int toIndex) {
        return new C3N(this, fromIndex, toIndex);
    }
}
