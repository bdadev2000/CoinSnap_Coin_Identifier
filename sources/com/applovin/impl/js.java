package com.applovin.impl;

import com.applovin.impl.a7;

/* loaded from: classes.dex */
public final /* synthetic */ class js implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a7.a f24745b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a7 f24746c;

    public /* synthetic */ js(a7.a aVar, a7 a7Var, int i2) {
        this.f24744a = i2;
        this.f24745b = aVar;
        this.f24746c = a7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f24744a;
        a7 a7Var = this.f24746c;
        a7.a aVar = this.f24745b;
        switch (i2) {
            case 0:
                a7.a.a(aVar, a7Var);
                return;
            case 1:
                a7.a.d(aVar, a7Var);
                return;
            case 2:
                a7.a.f(aVar, a7Var);
                return;
            default:
                a7.a.c(aVar, a7Var);
                return;
        }
    }
}
