package com.applovin.impl;

import com.applovin.impl.cc;
import com.applovin.impl.f4;
import com.applovin.impl.nh;
import com.applovin.impl.qb;
import com.applovin.impl.s0;
import com.applovin.impl.zb;

/* loaded from: classes.dex */
public final /* synthetic */ class os implements cc.a, f4.c, qb.b, cc.b, zb.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6876b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6877c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6878d;

    public /* synthetic */ os(int i10, Object obj, Object obj2) {
        this.f6876b = i10;
        this.f6877c = obj;
        this.f6878d = obj2;
    }

    @Override // com.applovin.impl.f4.c
    public final void a(f4.b bVar) {
        ((f4) this.f6877c).a((f4.c) this.f6878d, bVar);
    }

    @Override // com.applovin.impl.zb.a
    public final void a(hb hbVar, yb ybVar) {
        ((vn) this.f6877c).a((com.applovin.impl.sdk.k) this.f6878d, hbVar, ybVar);
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        int i10 = this.f6876b;
        Object obj2 = this.f6878d;
        Object obj3 = this.f6877c;
        switch (i10) {
            case 0:
                a8.a((lh) obj3, (uo) obj2, (nh.c) obj);
                return;
            case 1:
            case 5:
            default:
                ((s0) obj).a((s0.a) obj3, (nh.b) obj2);
                return;
            case 2:
                ((qb.b) obj3).a(obj2);
                return;
            case 3:
                ((s0) obj).a((s0.a) obj3, (we) obj2);
                return;
            case 4:
                ((s0) obj).a((s0.a) obj3, (kh) obj2);
                return;
            case 6:
                ((s0) obj).a((s0.a) obj3, (mh) obj2);
                return;
            case 7:
                ((s0) obj).a((s0.a) obj3, (pd) obj2);
                return;
            case 8:
                ((s0) obj).a((s0.a) obj3, (qd) obj2);
                return;
            case 9:
                r0.a((s0.a) obj3, (yq) obj2, (s0) obj);
                return;
        }
    }

    @Override // com.applovin.impl.cc.b
    public final void a(Object obj, z8 z8Var) {
        ((r0) this.f6877c).a((nh) this.f6878d, (s0) obj, z8Var);
    }
}
