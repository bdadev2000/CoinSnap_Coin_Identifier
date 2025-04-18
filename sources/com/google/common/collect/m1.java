package com.google.common.collect;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class m1 implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public static final m1 f12003b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ m1[] f12004c;

    static {
        m1 m1Var = new m1();
        f12003b = m1Var;
        f12004c = new m1[]{m1Var};
    }

    public static m1 valueOf(String str) {
        return (m1) Enum.valueOf(m1.class, str);
    }

    public static m1[] values() {
        return (m1[]) f12004c.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        v8.u0.n("no calls to next() since the last call to remove()", false);
    }
}
