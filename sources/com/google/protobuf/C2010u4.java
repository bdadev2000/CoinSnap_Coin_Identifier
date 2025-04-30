package com.google.protobuf;

import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: com.google.protobuf.u4 */
/* loaded from: classes3.dex */
public final class C2010u4 {
    private final ArrayDeque<H> prefixesStack;

    private C2010u4() {
        this.prefixesStack = new ArrayDeque<>();
    }

    public static /* synthetic */ H access$100(C2010u4 c2010u4, H h6, H h9) {
        return c2010u4.balance(h6, h9);
    }

    public H balance(H h6, H h9) {
        doBalance(h6);
        doBalance(h9);
        H pop = this.prefixesStack.pop();
        while (!this.prefixesStack.isEmpty()) {
            pop = new C2031x4(this.prefixesStack.pop(), pop, null);
        }
        return pop;
    }

    private void doBalance(H h6) {
        H h9;
        H h10;
        if (h6.isBalanced()) {
            insert(h6);
            return;
        }
        if (h6 instanceof C2031x4) {
            C2031x4 c2031x4 = (C2031x4) h6;
            h9 = c2031x4.left;
            doBalance(h9);
            h10 = c2031x4.right;
            doBalance(h10);
            return;
        }
        throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + h6.getClass());
    }

    private int getDepthBinForLength(int i9) {
        int binarySearch = Arrays.binarySearch(C2031x4.minLengthByDepth, i9);
        if (binarySearch < 0) {
            return (-(binarySearch + 1)) - 1;
        }
        return binarySearch;
    }

    private void insert(H h6) {
        C2003t4 c2003t4;
        int depthBinForLength = getDepthBinForLength(h6.size());
        int minLength = C2031x4.minLength(depthBinForLength + 1);
        if (!this.prefixesStack.isEmpty() && this.prefixesStack.peek().size() < minLength) {
            int minLength2 = C2031x4.minLength(depthBinForLength);
            H pop = this.prefixesStack.pop();
            while (true) {
                c2003t4 = null;
                if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= minLength2) {
                    break;
                } else {
                    pop = new C2031x4(this.prefixesStack.pop(), pop, c2003t4);
                }
            }
            C2031x4 c2031x4 = new C2031x4(pop, h6, c2003t4);
            while (!this.prefixesStack.isEmpty()) {
                if (this.prefixesStack.peek().size() >= C2031x4.minLength(getDepthBinForLength(c2031x4.size()) + 1)) {
                    break;
                } else {
                    c2031x4 = new C2031x4(this.prefixesStack.pop(), c2031x4, c2003t4);
                }
            }
            this.prefixesStack.push(c2031x4);
            return;
        }
        this.prefixesStack.push(h6);
    }

    public /* synthetic */ C2010u4(C2003t4 c2003t4) {
        this();
    }
}
