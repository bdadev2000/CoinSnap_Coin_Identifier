package com.applovin.impl;

import com.applovin.impl.cc;
import com.applovin.impl.s0;

/* loaded from: classes.dex */
public final /* synthetic */ class jv implements cc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5546b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.a f5547c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5548d;

    public /* synthetic */ jv(s0.a aVar, String str, int i10) {
        this.f5546b = i10;
        this.f5547c = aVar;
        this.f5548d = str;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        int i10 = this.f5546b;
        s0.a aVar = this.f5547c;
        String str = this.f5548d;
        switch (i10) {
            case 0:
                ((s0) obj).a(aVar, str);
                return;
            default:
                ((s0) obj).b(aVar, str);
                return;
        }
    }
}
