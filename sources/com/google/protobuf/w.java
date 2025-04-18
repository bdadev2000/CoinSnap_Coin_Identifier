package com.google.protobuf;

import java.util.Comparator;

/* loaded from: classes4.dex */
public final class w implements Comparator {
    @Override // java.util.Comparator
    public int compare(h0 h0Var, h0 h0Var2) {
        int i10;
        int i11;
        b0 it = h0Var.iterator();
        b0 it2 = h0Var2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            i10 = h0.toInt(it.nextByte());
            Integer valueOf = Integer.valueOf(i10);
            i11 = h0.toInt(it2.nextByte());
            int compareTo = valueOf.compareTo(Integer.valueOf(i11));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(h0Var.size()).compareTo(Integer.valueOf(h0Var2.size()));
    }
}
