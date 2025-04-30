package com.applovin.impl;

import com.applovin.impl.InterfaceC0736p1;
import com.applovin.impl.xq;

/* loaded from: classes.dex */
public final /* synthetic */ class I1 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6410c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f6411d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f6412f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6413g;

    public /* synthetic */ I1(Object obj, String str, long j7, long j9, int i9) {
        this.b = i9;
        this.f6413g = obj;
        this.f6410c = str;
        this.f6411d = j7;
        this.f6412f = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((InterfaceC0736p1.a) this.f6413g).b(this.f6410c, this.f6411d, this.f6412f);
                return;
            default:
                xq.a.a((xq.a) this.f6413g, this.f6410c, this.f6411d, this.f6412f);
                return;
        }
    }
}
