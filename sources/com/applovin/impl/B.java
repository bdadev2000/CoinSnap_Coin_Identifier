package com.applovin.impl;

import com.applovin.impl.InterfaceC0746s0;
import com.applovin.impl.cc;
import com.applovin.impl.f4;
import com.applovin.impl.nh;
import com.applovin.impl.qb;
import com.applovin.impl.zb;

/* loaded from: classes.dex */
public final /* synthetic */ class B implements cc.a, f4.c, qb.b, cc.b, zb.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6366c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6367d;

    public /* synthetic */ B(int i9, Object obj, Object obj2) {
        this.b = i9;
        this.f6366c = obj;
        this.f6367d = obj2;
    }

    @Override // com.applovin.impl.f4.c
    public void a(f4.b bVar) {
        ((f4) this.f6366c).a((f4.c) this.f6367d, bVar);
    }

    @Override // com.applovin.impl.zb.a
    public void a(hb hbVar, yb ybVar) {
        vn.a((vn) this.f6366c, (com.applovin.impl.sdk.k) this.f6367d, hbVar, ybVar);
    }

    @Override // com.applovin.impl.cc.a
    public void a(Object obj) {
        switch (this.b) {
            case 0:
                a8.A((lh) this.f6366c, (uo) this.f6367d, (nh.c) obj);
                return;
            case 1:
            case 4:
            default:
                C0742r0.c0((InterfaceC0746s0.a) this.f6366c, (yq) this.f6367d, (InterfaceC0746s0) obj);
                return;
            case 2:
                ((qb.b) this.f6366c).a(this.f6367d);
                return;
            case 3:
                C0742r0.q((InterfaceC0746s0.a) this.f6366c, (nh.b) this.f6367d, (InterfaceC0746s0) obj);
                return;
            case 5:
                C0742r0.w((InterfaceC0746s0.a) this.f6366c, (pd) this.f6367d, (InterfaceC0746s0) obj);
                return;
            case 6:
                C0742r0.L((InterfaceC0746s0.a) this.f6366c, (mh) this.f6367d, (InterfaceC0746s0) obj);
                return;
            case 7:
                C0742r0.R((InterfaceC0746s0.a) this.f6366c, (we) this.f6367d, (InterfaceC0746s0) obj);
                return;
            case 8:
                C0742r0.X((InterfaceC0746s0.a) this.f6366c, (qd) this.f6367d, (InterfaceC0746s0) obj);
                return;
            case 9:
                C0742r0.h0((InterfaceC0746s0.a) this.f6366c, (kh) this.f6367d, (InterfaceC0746s0) obj);
                return;
        }
    }

    @Override // com.applovin.impl.cc.b
    public void a(Object obj, z8 z8Var) {
        C0742r0.x((C0742r0) this.f6366c, (nh) this.f6367d, (InterfaceC0746s0) obj, z8Var);
    }
}
