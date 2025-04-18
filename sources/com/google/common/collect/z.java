package com.google.common.collect;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class z implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public int f12058b;

    /* renamed from: c, reason: collision with root package name */
    public int f12059c;

    /* renamed from: d, reason: collision with root package name */
    public int f12060d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0 f12061f;

    public z(c0 c0Var) {
        int i10;
        this.f12061f = c0Var;
        this.f12058b = c0Var.f11918g;
        if (c0Var.isEmpty()) {
            i10 = -1;
        } else {
            i10 = 0;
        }
        this.f12059c = i10;
        this.f12060d = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12059c >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object l10;
        c0 c0Var = this.f12061f;
        if (c0Var.f11918g == this.f12058b) {
            if (hasNext()) {
                int i10 = this.f12059c;
                this.f12060d = i10;
                x xVar = (x) this;
                int i11 = xVar.f12050g;
                c0 c0Var2 = xVar.f12051h;
                switch (i11) {
                    case 0:
                        l10 = c0Var2.d(i10);
                        break;
                    case 1:
                        l10 = new a0(c0Var2, i10);
                        break;
                    default:
                        l10 = c0Var2.l(i10);
                        break;
                }
                int i12 = this.f12059c + 1;
                if (i12 >= c0Var.f11919h) {
                    i12 = -1;
                }
                this.f12059c = i12;
                return l10;
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z10;
        c0 c0Var = this.f12061f;
        if (c0Var.f11918g == this.f12058b) {
            if (this.f12060d >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            v8.u0.n("no calls to next() since the last call to remove()", z10);
            this.f12058b += 32;
            c0Var.remove(c0Var.d(this.f12060d));
            this.f12059c--;
            this.f12060d = -1;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
