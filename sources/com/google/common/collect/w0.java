package com.google.common.collect;

/* loaded from: classes3.dex */
public final class w0 extends q2 {

    /* renamed from: b, reason: collision with root package name */
    public final q2 f12048b;

    /* renamed from: c, reason: collision with root package name */
    public q2 f12049c = l1.f11996g;

    public w0(y0 y0Var) {
        this.f12048b = ((r0) y0Var.f12056f.values()).listIterator(0);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12049c.hasNext() || this.f12048b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f12049c.hasNext()) {
            this.f12049c = ((k0) this.f12048b.next()).iterator();
        }
        return this.f12049c.next();
    }
}
