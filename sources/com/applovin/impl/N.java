package com.applovin.impl;

import com.applovin.impl.InterfaceC0746s0;
import com.applovin.impl.cc;
import com.applovin.impl.zb;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class N implements zb.a, cc.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6438c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6439d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6440f;

    public /* synthetic */ N(AbstractActivityC0678c0 abstractActivityC0678c0, List list, com.applovin.impl.sdk.k kVar) {
        this.b = 1;
        this.f6439d = abstractActivityC0678c0;
        this.f6440f = list;
        this.f6438c = kVar;
    }

    @Override // com.applovin.impl.zb.a
    public void a(hb hbVar, yb ybVar) {
        switch (this.b) {
            case 0:
                ((AbstractActivityC0673b0) this.f6439d).a((com.applovin.impl.sdk.k) this.f6438c, (C0781z) this.f6440f, hbVar, ybVar);
                return;
            default:
                ((AbstractActivityC0678c0) this.f6439d).a((List) this.f6440f, (com.applovin.impl.sdk.k) this.f6438c, hbVar, ybVar);
                return;
        }
    }

    public /* synthetic */ N(Object obj, Object obj2, Object obj3, int i9) {
        this.b = i9;
        this.f6439d = obj;
        this.f6438c = obj2;
        this.f6440f = obj3;
    }

    @Override // com.applovin.impl.cc.a
    public void a(Object obj) {
        C0742r0.i0((InterfaceC0746s0.a) this.f6439d, (qo) this.f6438c, (uo) this.f6440f, (InterfaceC0746s0) obj);
    }
}
