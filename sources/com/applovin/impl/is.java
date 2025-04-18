package com.applovin.impl;

import android.view.Display;
import android.view.View;
import androidx.arch.core.util.Function;
import com.applovin.impl.a7;
import com.applovin.impl.bi;
import com.applovin.impl.h4;
import com.applovin.impl.hc;
import com.applovin.impl.i2;
import com.applovin.impl.j2;
import com.applovin.impl.nd;
import com.applovin.impl.qh;
import com.applovin.impl.vb;
import com.applovin.impl.vq;
import com.applovin.impl.we;
import com.applovin.impl.zg;
import com.applovin.impl.zh;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final /* synthetic */ class is implements zg.a, hc.b, hc.a, nd.g, r4, Function, zh.a, h4.c, j2.c, i2.d, vb.a, vq.b.a, we.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24535b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24536c;

    public /* synthetic */ is(Object obj, int i2) {
        this.f24535b = i2;
        this.f24536c = obj;
    }

    @Override // com.applovin.impl.hc.a
    public final int a(Object obj) {
        return nd.b((f9) this.f24536c, (kd) obj);
    }

    @Override // com.applovin.impl.r4
    public final void accept(Object obj) {
        x5.c((Exception) this.f24536c, (a7.a) obj);
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        int i2 = this.f24535b;
        Object obj2 = this.f24536c;
        switch (i2) {
            case 5:
                return aq.i1((aq) obj2, (tl) obj);
            default:
                return ge.z((ge) obj2, (tl) obj);
        }
    }

    @Override // com.applovin.impl.i2.d
    public final long a(long j2) {
        return ((a9) this.f24536c).a(j2);
    }

    @Override // com.applovin.impl.zh.a, com.applovin.impl.vb.a
    public final zh a() {
        return bi.b.b((o8) this.f24536c);
    }

    @Override // com.applovin.impl.vb.a
    public final Object a() {
        WeakReference b2;
        b2 = vb.d.b((vb.a) this.f24536c);
        return b2;
    }

    @Override // com.applovin.impl.we.a
    /* renamed from: a, reason: collision with other method in class */
    public final Object mo8a(Object obj) {
        return ye.b((Long) this.f24536c, (Long) obj);
    }

    @Override // com.applovin.impl.vq.b.a
    public final void a(Display display) {
        vq.a((vq) this.f24536c, display);
    }

    @Override // com.applovin.impl.j2.c
    public final void a(View view) {
        ((p9) this.f24536c).a(view);
    }

    @Override // com.applovin.impl.h4.c
    public final void a(h4.b bVar) {
        ((h4) this.f24536c).a(bVar);
    }

    @Override // com.applovin.impl.zg.a
    public final void a(zg zgVar) {
        int i2 = this.f24535b;
        Object obj = this.f24536c;
        switch (i2) {
            case 0:
                ((a3) obj).a((sl) zgVar);
                return;
            case 7:
                ek.n((ek) obj, (sl) zgVar);
                return;
            default:
                i8.a((i8) obj, (sl) zgVar);
                return;
        }
    }

    @Override // com.applovin.impl.hc.a
    public final void a(Object obj) {
        c8.f((vd) this.f24536c, (qh.c) obj);
    }

    @Override // com.applovin.impl.hc.b
    public final void a(Object obj, b9 b9Var) {
        c8.g((qh) this.f24536c, (qh.c) obj, b9Var);
    }
}
