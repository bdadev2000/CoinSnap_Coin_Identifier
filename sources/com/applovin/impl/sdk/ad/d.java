package com.applovin.impl.sdk.ad;

import com.applovin.impl.ql;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements S.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10766a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i9) {
        this.f10766a = i9;
        this.b = obj;
    }

    @Override // S.a
    public final void accept(Object obj) {
        switch (this.f10766a) {
            case 0:
                a.d1((a) this.b, (ql) obj);
                return;
            default:
                b.d((String) this.b, (ql) obj);
                return;
        }
    }
}
