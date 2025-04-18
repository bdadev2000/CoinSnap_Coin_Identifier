package com.applovin.impl.sdk.ad;

import com.applovin.impl.ql;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements m0.a {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7615b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.f7615b = obj;
    }

    @Override // m0.a
    public final void accept(Object obj) {
        int i10 = this.a;
        Object obj2 = this.f7615b;
        switch (i10) {
            case 0:
                a.d1((a) obj2, (ql) obj);
                return;
            default:
                b.M((String) obj2, (ql) obj);
                return;
        }
    }
}
