package com.google.protobuf;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.v4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2017v4 implements Iterator {
    private final ArrayDeque<C2031x4> breadCrumbs;
    private D next;

    public /* synthetic */ C2017v4(H h6, C2003t4 c2003t4) {
        this(h6);
    }

    private D getLeafByLeft(H h6) {
        while (h6 instanceof C2031x4) {
            C2031x4 c2031x4 = (C2031x4) h6;
            this.breadCrumbs.push(c2031x4);
            h6 = c2031x4.left;
        }
        return (D) h6;
    }

    private D getNextNonEmptyLeaf() {
        H h6;
        D leafByLeft;
        do {
            ArrayDeque<C2031x4> arrayDeque = this.breadCrumbs;
            if (arrayDeque != null && !arrayDeque.isEmpty()) {
                h6 = this.breadCrumbs.pop().right;
                leafByLeft = getLeafByLeft(h6);
            } else {
                return null;
            }
        } while (leafByLeft.isEmpty());
        return leafByLeft;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.next != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    private C2017v4(H h6) {
        H h9;
        if (h6 instanceof C2031x4) {
            C2031x4 c2031x4 = (C2031x4) h6;
            ArrayDeque<C2031x4> arrayDeque = new ArrayDeque<>(c2031x4.getTreeDepth());
            this.breadCrumbs = arrayDeque;
            arrayDeque.push(c2031x4);
            h9 = c2031x4.left;
            this.next = getLeafByLeft(h9);
            return;
        }
        this.breadCrumbs = null;
        this.next = (D) h6;
    }

    @Override // java.util.Iterator
    public D next() {
        D d2 = this.next;
        if (d2 != null) {
            this.next = getNextNonEmptyLeaf();
            return d2;
        }
        throw new NoSuchElementException();
    }
}
