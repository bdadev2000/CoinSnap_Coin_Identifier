package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import com.applovin.impl.wd;
import com.applovin.impl.xd;
import com.applovin.impl.y6;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.applovin.impl.b2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0675b2 implements wd {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f6798a = new ArrayList(1);
    private final HashSet b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    private final xd.a f6799c = new xd.a();

    /* renamed from: d, reason: collision with root package name */
    private final y6.a f6800d = new y6.a();

    /* renamed from: e, reason: collision with root package name */
    private Looper f6801e;

    /* renamed from: f, reason: collision with root package name */
    private go f6802f;

    @Override // com.applovin.impl.wd
    public final void a(Handler handler, y6 y6Var) {
        AbstractC0669a1.a(handler);
        AbstractC0669a1.a(y6Var);
        this.f6800d.a(handler, y6Var);
    }

    public abstract void a(yo yoVar);

    public final xd.a b(wd.a aVar) {
        return this.f6799c.a(0, aVar, 0L);
    }

    @Override // com.applovin.impl.wd
    public final void c(wd.b bVar) {
        this.f6798a.remove(bVar);
        if (this.f6798a.isEmpty()) {
            this.f6801e = null;
            this.f6802f = null;
            this.b.clear();
            h();
            return;
        }
        a(bVar);
    }

    public void e() {
    }

    public void f() {
    }

    public final boolean g() {
        return !this.b.isEmpty();
    }

    public abstract void h();

    @Override // com.applovin.impl.wd
    public final void b(wd.b bVar) {
        AbstractC0669a1.a(this.f6801e);
        boolean isEmpty = this.b.isEmpty();
        this.b.add(bVar);
        if (isEmpty) {
            f();
        }
    }

    @Override // com.applovin.impl.wd
    public final void a(Handler handler, xd xdVar) {
        AbstractC0669a1.a(handler);
        AbstractC0669a1.a(xdVar);
        this.f6799c.a(handler, xdVar);
    }

    public final y6.a a(int i9, wd.a aVar) {
        return this.f6800d.a(i9, aVar);
    }

    public final y6.a a(wd.a aVar) {
        return this.f6800d.a(0, aVar);
    }

    public final xd.a a(int i9, wd.a aVar, long j7) {
        return this.f6799c.a(i9, aVar, j7);
    }

    @Override // com.applovin.impl.wd
    public final void a(wd.b bVar) {
        boolean z8 = !this.b.isEmpty();
        this.b.remove(bVar);
        if (z8 && this.b.isEmpty()) {
            e();
        }
    }

    @Override // com.applovin.impl.wd
    public final void a(wd.b bVar, yo yoVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f6801e;
        AbstractC0669a1.a(looper == null || looper == myLooper);
        go goVar = this.f6802f;
        this.f6798a.add(bVar);
        if (this.f6801e == null) {
            this.f6801e = myLooper;
            this.b.add(bVar);
            a(yoVar);
        } else if (goVar != null) {
            b(bVar);
            bVar.a(this, goVar);
        }
    }

    public final void a(go goVar) {
        this.f6802f = goVar;
        Iterator it = this.f6798a.iterator();
        while (it.hasNext()) {
            ((wd.b) it.next()).a(this, goVar);
        }
    }

    @Override // com.applovin.impl.wd
    public final void a(y6 y6Var) {
        this.f6800d.e(y6Var);
    }

    @Override // com.applovin.impl.wd
    public final void a(xd xdVar) {
        this.f6799c.a(xdVar);
    }
}
