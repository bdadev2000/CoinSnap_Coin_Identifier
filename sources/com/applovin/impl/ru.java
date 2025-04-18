package com.applovin.impl;

import com.applovin.impl.p1;

/* loaded from: classes.dex */
public final /* synthetic */ class ru implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7406b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1.a f7407c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l5 f7408d;

    public /* synthetic */ ru(p1.a aVar, l5 l5Var, int i10) {
        this.f7406b = i10;
        this.f7407c = aVar;
        this.f7408d = l5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7406b;
        l5 l5Var = this.f7408d;
        p1.a aVar = this.f7407c;
        switch (i10) {
            case 0:
                aVar.d(l5Var);
                return;
            default:
                aVar.c(l5Var);
                return;
        }
    }
}
