package com.google.protobuf;

import java.util.Comparator;

/* renamed from: com.google.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2019w implements Comparator {
    @Override // java.util.Comparator
    public int compare(H h6, H h9) {
        int i9;
        int i10;
        B it = h6.iterator();
        B it2 = h9.iterator();
        while (it.hasNext() && it2.hasNext()) {
            i9 = H.toInt(it.nextByte());
            Integer valueOf = Integer.valueOf(i9);
            i10 = H.toInt(it2.nextByte());
            int compareTo = valueOf.compareTo(Integer.valueOf(i10));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(h6.size()).compareTo(Integer.valueOf(h9.size()));
    }
}
