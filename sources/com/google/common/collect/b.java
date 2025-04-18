package com.google.common.collect;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class b extends q2 {

    /* renamed from: b, reason: collision with root package name */
    public int f11903b = 2;

    /* renamed from: c, reason: collision with root package name */
    public Object f11904c;

    public abstract Object a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z10;
        if (this.f11903b != 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        v8.u0.o(z10);
        int b3 = t.h.b(this.f11903b);
        if (b3 == 0) {
            return true;
        }
        if (b3 == 2) {
            return false;
        }
        this.f11903b = 4;
        this.f11904c = a();
        if (this.f11903b == 3) {
            return false;
        }
        this.f11903b = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f11903b = 2;
            Object obj = this.f11904c;
            this.f11904c = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
