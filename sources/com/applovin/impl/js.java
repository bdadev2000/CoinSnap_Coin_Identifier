package com.applovin.impl;

import android.os.Bundle;
import android.view.Display;
import android.view.View;
import com.applovin.impl.cc;
import com.applovin.impl.f4;
import com.applovin.impl.h2;
import com.applovin.impl.id;
import com.applovin.impl.nh;
import com.applovin.impl.qb;
import com.applovin.impl.re;
import com.applovin.impl.sdk.g;
import com.applovin.impl.wg;
import com.applovin.impl.wh;
import com.applovin.impl.wq;
import com.applovin.impl.y6;
import com.applovin.impl.yh;

/* loaded from: classes.dex */
public final /* synthetic */ class js implements cc.b, cc.a, id.g, p4, wg.a, n.a, f4.c, g.c, qb.a, h2.d, re.a, wq.b.a, wh.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5541b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5542c;

    public /* synthetic */ js(Object obj, int i10) {
        this.f5541b = i10;
        this.f5542c = obj;
    }

    @Override // com.applovin.impl.cc.a
    public final int a(Object obj) {
        return id.b((d9) this.f5542c, (fd) obj);
    }

    @Override // com.applovin.impl.p4
    public final void accept(Object obj) {
        v5.c((Exception) this.f5542c, (y6.a) obj);
    }

    @Override // n.a, o7.h
    public final Object apply(Object obj) {
        Bundle c10;
        int i10 = this.f5541b;
        Object obj2 = this.f5542c;
        switch (i10) {
            case 5:
                c10 = ((be) obj2).c((ql) obj);
                return c10;
            default:
                return bq.d1((bq) obj2, (ql) obj);
        }
    }

    @Override // com.applovin.impl.h2.d
    public final long a(long j3) {
        return ((y8) this.f5542c).a(j3);
    }

    @Override // com.applovin.impl.qb.a
    public final wh a() {
        return yh.b.b((m8) this.f5542c);
    }

    @Override // com.applovin.impl.qb.a
    public final Object a() {
        return qb.d.c((qb.a) this.f5542c);
    }

    @Override // com.applovin.impl.re.a
    /* renamed from: a, reason: collision with other method in class */
    public final Object mo2a(Object obj) {
        return te.b((Long) this.f5542c, (Long) obj);
    }

    @Override // com.applovin.impl.wq.b.a
    public final void a(Display display) {
        wq.a((wq) this.f5542c, display);
    }

    @Override // com.applovin.impl.sdk.g.c
    public final void a(View view) {
        n9.b((n9) this.f5542c, view);
    }

    @Override // com.applovin.impl.f4.c
    public final void a(f4.b bVar) {
        ((f4) this.f5542c).a(bVar);
    }

    @Override // com.applovin.impl.wg.a
    public final void a(wg wgVar) {
        int i10 = this.f5541b;
        Object obj = this.f5542c;
        switch (i10) {
            case 4:
                ((y2) obj).a((pl) wgVar);
                return;
            case 5:
            default:
                ((g8) obj).a((pl) wgVar);
                return;
            case 6:
                bk.n((bk) obj, (pl) wgVar);
                return;
        }
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        a8.E((qd) this.f5542c, (nh.c) obj);
    }

    @Override // com.applovin.impl.cc.b
    public final void a(Object obj, z8 z8Var) {
        a8.v((nh) this.f5542c, (nh.c) obj, z8Var);
    }
}
