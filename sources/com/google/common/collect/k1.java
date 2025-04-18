package com.google.common.collect;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class k1 extends q2 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f11989b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11990c;

    public k1(Object obj) {
        this.f11990c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f11989b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f11989b) {
            this.f11989b = true;
            return this.f11990c;
        }
        throw new NoSuchElementException();
    }
}
