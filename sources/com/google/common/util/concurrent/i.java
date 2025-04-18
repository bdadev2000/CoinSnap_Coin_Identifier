package com.google.common.util.concurrent;

import com.google.common.base.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28814a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28815b;

    public /* synthetic */ i(int i2, int i3) {
        this.f28814a = i3;
        this.f28815b = i2;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        int i2 = this.f28814a;
        int i3 = this.f28815b;
        switch (i2) {
            case 0:
                return Striped.c(i3);
            default:
                return Striped.a(i3);
        }
    }
}
