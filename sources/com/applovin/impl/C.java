package com.applovin.impl;

import android.view.Display;
import android.view.View;
import com.applovin.impl.AbstractC0705h2;
import com.applovin.impl.cc;
import com.applovin.impl.f4;
import com.applovin.impl.id;
import com.applovin.impl.nh;
import com.applovin.impl.qb;
import com.applovin.impl.re;
import com.applovin.impl.sdk.C0755g;
import com.applovin.impl.wg;
import com.applovin.impl.wh;
import com.applovin.impl.wq;
import com.applovin.impl.y6;
import com.applovin.impl.yh;
import java.lang.ref.WeakReference;
import t.InterfaceC2702a;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements cc.a, cc.b, id.g, p4, wg.a, InterfaceC2702a, f4.c, C0755g.c, qb.a, AbstractC0705h2.d, re.a, wq.b.a, wh.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6372c;

    public /* synthetic */ C(Object obj, int i9) {
        this.b = i9;
        this.f6372c = obj;
    }

    @Override // com.applovin.impl.cc.a
    public int a(Object obj) {
        return id.e((d9) this.f6372c, (fd) obj);
    }

    @Override // com.applovin.impl.p4
    public void accept(Object obj) {
        v5.d((Exception) this.f6372c, (y6.a) obj);
    }

    @Override // t.InterfaceC2702a
    public Object apply(Object obj) {
        switch (this.b) {
            case 5:
                return be.y((be) this.f6372c, (ql) obj);
            default:
                return bq.d1((bq) this.f6372c, (ql) obj);
        }
    }

    @Override // com.applovin.impl.AbstractC0705h2.d
    public long a(long j7) {
        return ((y8) this.f6372c).a(j7);
    }

    @Override // com.applovin.impl.qb.a, com.applovin.impl.wh.a
    public wh a() {
        return yh.b.b((m8) this.f6372c);
    }

    @Override // com.applovin.impl.qb.a, com.applovin.impl.wh.a
    public Object a() {
        WeakReference b;
        b = qb.d.b((qb.a) this.f6372c);
        return b;
    }

    @Override // com.applovin.impl.re.a
    /* renamed from: a, reason: collision with other method in class */
    public Object mo0a(Object obj) {
        return te.b((Long) this.f6372c, (Long) obj);
    }

    @Override // com.applovin.impl.wq.b.a
    public void a(Display display) {
        wq.a((wq) this.f6372c, display);
    }

    @Override // com.applovin.impl.sdk.C0755g.c
    public void a(View view) {
        ((n9) this.f6372c).a(view);
    }

    @Override // com.applovin.impl.f4.c
    public void a(f4.b bVar) {
        ((f4) this.f6372c).a(bVar);
    }

    @Override // com.applovin.impl.wg.a
    public void a(wg wgVar) {
        switch (this.b) {
            case 4:
                ((AbstractC0780y2) this.f6372c).a((pl) wgVar);
                return;
            case 5:
            default:
                g8.a((g8) this.f6372c, (pl) wgVar);
                return;
            case 6:
                bk.n((bk) this.f6372c, (pl) wgVar);
                return;
        }
    }

    @Override // com.applovin.impl.cc.a
    public void a(Object obj) {
        a8.z((qd) this.f6372c, (nh.c) obj);
    }

    @Override // com.applovin.impl.cc.b
    public void a(Object obj, z8 z8Var) {
        a8.k((nh) this.f6372c, (nh.c) obj, z8Var);
    }
}
