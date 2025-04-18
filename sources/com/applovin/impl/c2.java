package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import com.applovin.impl.a7;
import com.applovin.impl.be;
import com.applovin.impl.ce;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class c2 implements be {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f23198a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    private final HashSet f23199b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    private final ce.a f23200c = new ce.a();
    private final a7.a d = new a7.a();
    private Looper e;

    /* renamed from: f, reason: collision with root package name */
    private fo f23201f;

    @Override // com.applovin.impl.be
    public final void a(Handler handler, a7 a7Var) {
        b1.a(handler);
        b1.a(a7Var);
        this.d.a(handler, a7Var);
    }

    public abstract void a(xo xoVar);

    public final ce.a b(be.a aVar) {
        return this.f23200c.a(0, aVar, 0L);
    }

    @Override // com.applovin.impl.be
    public final void c(be.b bVar) {
        this.f23198a.remove(bVar);
        if (!this.f23198a.isEmpty()) {
            a(bVar);
            return;
        }
        this.e = null;
        this.f23201f = null;
        this.f23199b.clear();
        h();
    }

    public void e() {
    }

    public void f() {
    }

    public final boolean g() {
        return !this.f23199b.isEmpty();
    }

    public abstract void h();

    @Override // com.applovin.impl.be
    public final void b(be.b bVar) {
        b1.a(this.e);
        boolean isEmpty = this.f23199b.isEmpty();
        this.f23199b.add(bVar);
        if (isEmpty) {
            f();
        }
    }

    @Override // com.applovin.impl.be
    public final void a(Handler handler, ce ceVar) {
        b1.a(handler);
        b1.a(ceVar);
        this.f23200c.a(handler, ceVar);
    }

    public final a7.a a(int i2, be.a aVar) {
        return this.d.a(i2, aVar);
    }

    public final a7.a a(be.a aVar) {
        return this.d.a(0, aVar);
    }

    public final ce.a a(int i2, be.a aVar, long j2) {
        return this.f23200c.a(i2, aVar, j2);
    }

    @Override // com.applovin.impl.be
    public final void a(be.b bVar) {
        boolean z2 = !this.f23199b.isEmpty();
        this.f23199b.remove(bVar);
        if (z2 && this.f23199b.isEmpty()) {
            e();
        }
    }

    @Override // com.applovin.impl.be
    public final void a(be.b bVar, xo xoVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        b1.a(looper == null || looper == myLooper);
        fo foVar = this.f23201f;
        this.f23198a.add(bVar);
        if (this.e == null) {
            this.e = myLooper;
            this.f23199b.add(bVar);
            a(xoVar);
        } else if (foVar != null) {
            b(bVar);
            bVar.a(this, foVar);
        }
    }

    public final void a(fo foVar) {
        this.f23201f = foVar;
        Iterator it = this.f23198a.iterator();
        while (it.hasNext()) {
            ((be.b) it.next()).a(this, foVar);
        }
    }

    @Override // com.applovin.impl.be
    public final void a(a7 a7Var) {
        this.d.e(a7Var);
    }

    @Override // com.applovin.impl.be
    public final void a(ce ceVar) {
        this.f23200c.a(ceVar);
    }
}
