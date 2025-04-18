package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import com.applovin.impl.wd;
import com.applovin.impl.xd;
import com.applovin.impl.y6;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class b2 implements wd {
    private final ArrayList a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    private final HashSet f3814b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    private final xd.a f3815c = new xd.a();

    /* renamed from: d, reason: collision with root package name */
    private final y6.a f3816d = new y6.a();

    /* renamed from: e, reason: collision with root package name */
    private Looper f3817e;

    /* renamed from: f, reason: collision with root package name */
    private go f3818f;

    @Override // com.applovin.impl.wd
    public final void a(Handler handler, y6 y6Var) {
        a1.a(handler);
        a1.a(y6Var);
        this.f3816d.a(handler, y6Var);
    }

    public abstract void a(yo yoVar);

    public final xd.a b(wd.a aVar) {
        return this.f3815c.a(0, aVar, 0L);
    }

    @Override // com.applovin.impl.wd
    public final void c(wd.b bVar) {
        this.a.remove(bVar);
        if (this.a.isEmpty()) {
            this.f3817e = null;
            this.f3818f = null;
            this.f3814b.clear();
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
        return !this.f3814b.isEmpty();
    }

    public abstract void h();

    @Override // com.applovin.impl.wd
    public final void b(wd.b bVar) {
        a1.a(this.f3817e);
        boolean isEmpty = this.f3814b.isEmpty();
        this.f3814b.add(bVar);
        if (isEmpty) {
            f();
        }
    }

    @Override // com.applovin.impl.wd
    public final void a(Handler handler, xd xdVar) {
        a1.a(handler);
        a1.a(xdVar);
        this.f3815c.a(handler, xdVar);
    }

    public final y6.a a(int i10, wd.a aVar) {
        return this.f3816d.a(i10, aVar);
    }

    public final y6.a a(wd.a aVar) {
        return this.f3816d.a(0, aVar);
    }

    public final xd.a a(int i10, wd.a aVar, long j3) {
        return this.f3815c.a(i10, aVar, j3);
    }

    @Override // com.applovin.impl.wd
    public final void a(wd.b bVar) {
        boolean z10 = !this.f3814b.isEmpty();
        this.f3814b.remove(bVar);
        if (z10 && this.f3814b.isEmpty()) {
            e();
        }
    }

    @Override // com.applovin.impl.wd
    public final void a(wd.b bVar, yo yoVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f3817e;
        a1.a(looper == null || looper == myLooper);
        go goVar = this.f3818f;
        this.a.add(bVar);
        if (this.f3817e == null) {
            this.f3817e = myLooper;
            this.f3814b.add(bVar);
            a(yoVar);
        } else if (goVar != null) {
            b(bVar);
            bVar.a(this, goVar);
        }
    }

    public final void a(go goVar) {
        this.f3818f = goVar;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((wd.b) it.next()).a(this, goVar);
        }
    }

    @Override // com.applovin.impl.wd
    public final void a(y6 y6Var) {
        this.f3816d.e(y6Var);
    }

    @Override // com.applovin.impl.wd
    public final void a(xd xdVar) {
        this.f3815c.a(xdVar);
    }
}
