package com.applovin.impl;

import com.applovin.impl.InterfaceC0736p1;
import com.applovin.impl.InterfaceC0775x1;

/* loaded from: classes.dex */
public final /* synthetic */ class U2 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6496c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f6497d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f6498f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6499g;

    public /* synthetic */ U2(Object obj, int i9, long j7, long j9, int i10) {
        this.b = i10;
        this.f6499g = obj;
        this.f6496c = i9;
        this.f6497d = j7;
        this.f6498f = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                InterfaceC0775x1.a.C0042a.b((InterfaceC0775x1.a.C0042a.C0043a) this.f6499g, this.f6496c, this.f6497d, this.f6498f);
                return;
            default:
                ((InterfaceC0736p1.a) this.f6499g).a(this.f6496c, this.f6497d, this.f6498f);
                return;
        }
    }
}
