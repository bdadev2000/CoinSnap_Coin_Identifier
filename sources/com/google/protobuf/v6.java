package com.google.protobuf;

import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class v6 {
    private final ArrayDeque<h0> prefixesStack;

    private v6() {
        this.prefixesStack = new ArrayDeque<>();
    }

    public static /* synthetic */ h0 access$100(v6 v6Var, h0 h0Var, h0 h0Var2) {
        return v6Var.balance(h0Var, h0Var2);
    }

    public h0 balance(h0 h0Var, h0 h0Var2) {
        doBalance(h0Var);
        doBalance(h0Var2);
        h0 pop = this.prefixesStack.pop();
        while (!this.prefixesStack.isEmpty()) {
            pop = new y6(this.prefixesStack.pop(), pop, null);
        }
        return pop;
    }

    private void doBalance(h0 h0Var) {
        h0 h0Var2;
        h0 h0Var3;
        if (h0Var.isBalanced()) {
            insert(h0Var);
            return;
        }
        if (h0Var instanceof y6) {
            y6 y6Var = (y6) h0Var;
            h0Var2 = y6Var.left;
            doBalance(h0Var2);
            h0Var3 = y6Var.right;
            doBalance(h0Var3);
            return;
        }
        throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + h0Var.getClass());
    }

    private int getDepthBinForLength(int i10) {
        int binarySearch = Arrays.binarySearch(y6.minLengthByDepth, i10);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    private void insert(h0 h0Var) {
        u6 u6Var;
        int depthBinForLength = getDepthBinForLength(h0Var.size());
        int minLength = y6.minLength(depthBinForLength + 1);
        if (!this.prefixesStack.isEmpty() && this.prefixesStack.peek().size() < minLength) {
            int minLength2 = y6.minLength(depthBinForLength);
            h0 pop = this.prefixesStack.pop();
            while (true) {
                u6Var = null;
                if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= minLength2) {
                    break;
                } else {
                    pop = new y6(this.prefixesStack.pop(), pop, u6Var);
                }
            }
            y6 y6Var = new y6(pop, h0Var, u6Var);
            while (!this.prefixesStack.isEmpty()) {
                if (this.prefixesStack.peek().size() >= y6.minLength(getDepthBinForLength(y6Var.size()) + 1)) {
                    break;
                } else {
                    y6Var = new y6(this.prefixesStack.pop(), y6Var, u6Var);
                }
            }
            this.prefixesStack.push(y6Var);
            return;
        }
        this.prefixesStack.push(h0Var);
    }

    public /* synthetic */ v6(u6 u6Var) {
        this();
    }
}
