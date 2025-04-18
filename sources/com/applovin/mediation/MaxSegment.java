package com.applovin.mediation;

import com.applovin.impl.sdk.n;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class MaxSegment {

    /* renamed from: a, reason: collision with root package name */
    private final int f28402a;

    /* renamed from: b, reason: collision with root package name */
    private final List f28403b;

    public MaxSegment(int i2, List<Integer> list) {
        this.f28402a = i2;
        this.f28403b = list;
        a(i2);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            a(it.next().intValue());
        }
    }

    private void a(int i2) {
        if (i2 >= 0) {
            return;
        }
        n.h("MaxSegment", "Please ensure that the segment value entered is a non-negative number in the range of [0, 2147483647]: " + i2);
    }

    public int getKey() {
        return this.f28402a;
    }

    public List<Integer> getValues() {
        return this.f28403b;
    }

    public String toString() {
        return "MaxSegment{key=" + this.f28402a + ", values=" + this.f28403b + '}';
    }
}
