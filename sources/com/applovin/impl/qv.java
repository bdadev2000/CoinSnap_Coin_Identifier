package com.applovin.impl;

import com.applovin.impl.hc;
import com.applovin.impl.s0;

/* loaded from: classes2.dex */
public final /* synthetic */ class qv implements hc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26223b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.a f26224c;
    public final /* synthetic */ String d;

    public /* synthetic */ qv(s0.a aVar, String str, int i2) {
        this.f26223b = i2;
        this.f26224c = aVar;
        this.d = str;
    }

    @Override // com.applovin.impl.hc.a
    public final void a(Object obj) {
        int i2 = this.f26223b;
        s0.a aVar = this.f26224c;
        String str = this.d;
        s0 s0Var = (s0) obj;
        switch (i2) {
            case 0:
                s0Var.a(aVar, str);
                return;
            default:
                s0Var.b(aVar, str);
                return;
        }
    }
}
