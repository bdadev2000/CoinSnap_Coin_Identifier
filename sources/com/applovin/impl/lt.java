package com.applovin.impl;

import com.applovin.impl.fi;

/* loaded from: classes.dex */
public final /* synthetic */ class lt implements fi.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25152b;

    public /* synthetic */ lt(Object obj, int i2) {
        this.f25151a = i2;
        this.f25152b = obj;
    }

    @Override // com.applovin.impl.fi.b
    public final void a(boolean z2, Object obj, Object obj2) {
        int i2 = this.f25151a;
        Object obj3 = this.f25152b;
        switch (i2) {
            case 0:
                fi.b((fi.a) obj3, z2, obj, obj2);
                return;
            default:
                fi.c((Runnable) obj3, z2, obj, obj2);
                return;
        }
    }
}
