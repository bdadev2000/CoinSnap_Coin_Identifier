package com.applovin.impl;

import com.applovin.impl.ec;
import com.applovin.impl.hc;
import com.applovin.impl.s0;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class os implements ec.a, hc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25938b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25939c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ os(c0 c0Var, List list, com.applovin.impl.sdk.j jVar) {
        this.f25938b = 1;
        this.d = c0Var;
        this.e = list;
        this.f25939c = jVar;
    }

    @Override // com.applovin.impl.ec.a
    public final void a(lb lbVar, dc dcVar) {
        int i2 = this.f25938b;
        Object obj = this.f25939c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i2) {
            case 0:
                ((b0) obj3).a((com.applovin.impl.sdk.j) obj, (z) obj2, lbVar, dcVar);
                return;
            default:
                ((c0) obj3).a((List) obj2, (com.applovin.impl.sdk.j) obj, lbVar, dcVar);
                return;
        }
    }

    public /* synthetic */ os(Object obj, int i2, Object obj2, Object obj3) {
        this.f25938b = i2;
        this.d = obj;
        this.f25939c = obj2;
        this.e = obj3;
    }

    @Override // com.applovin.impl.hc.a
    public final void a(Object obj) {
        ((s0) obj).a((s0.a) this.d, (po) this.f25939c, (to) this.e);
    }
}
