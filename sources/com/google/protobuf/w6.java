package com.google.protobuf;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class w6 implements Iterator {
    private final ArrayDeque<y6> breadCrumbs;
    private d0 next;

    public /* synthetic */ w6(h0 h0Var, u6 u6Var) {
        this(h0Var);
    }

    private d0 getLeafByLeft(h0 h0Var) {
        while (h0Var instanceof y6) {
            y6 y6Var = (y6) h0Var;
            this.breadCrumbs.push(y6Var);
            h0Var = y6Var.left;
        }
        return (d0) h0Var;
    }

    private d0 getNextNonEmptyLeaf() {
        h0 h0Var;
        d0 leafByLeft;
        do {
            ArrayDeque<y6> arrayDeque = this.breadCrumbs;
            if (arrayDeque != null && !arrayDeque.isEmpty()) {
                h0Var = this.breadCrumbs.pop().right;
                leafByLeft = getLeafByLeft(h0Var);
            } else {
                return null;
            }
        } while (leafByLeft.isEmpty());
        return leafByLeft;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.next != null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    private w6(h0 h0Var) {
        h0 h0Var2;
        if (h0Var instanceof y6) {
            y6 y6Var = (y6) h0Var;
            ArrayDeque<y6> arrayDeque = new ArrayDeque<>(y6Var.getTreeDepth());
            this.breadCrumbs = arrayDeque;
            arrayDeque.push(y6Var);
            h0Var2 = y6Var.left;
            this.next = getLeafByLeft(h0Var2);
            return;
        }
        this.breadCrumbs = null;
        this.next = (d0) h0Var;
    }

    @Override // java.util.Iterator
    public d0 next() {
        d0 d0Var = this.next;
        if (d0Var != null) {
            this.next = getNextNonEmptyLeaf();
            return d0Var;
        }
        throw new NoSuchElementException();
    }
}
