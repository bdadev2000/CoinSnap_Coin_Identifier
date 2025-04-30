package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class H2 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6406c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f6407d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6408f;

    public /* synthetic */ H2(Object obj, boolean z8, long j7, int i9) {
        this.b = i9;
        this.f6408f = obj;
        this.f6406c = z8;
        this.f6407d = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((s9) this.f6408f).b(this.f6406c, this.f6407d);
                return;
            case 1:
                com.applovin.impl.sdk.w.b((com.applovin.impl.sdk.w) this.f6408f, this.f6406c, this.f6407d);
                return;
            default:
                t9.J((t9) this.f6408f, this.f6406c, this.f6407d);
                return;
        }
    }
}
