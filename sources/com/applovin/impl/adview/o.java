package com.applovin.impl.adview;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f6722c;

    public /* synthetic */ o(a aVar, int i9) {
        this.b = i9;
        this.f6722c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.f6722c.t();
                return;
            case 1:
                this.f6722c.q();
                return;
            case 2:
                this.f6722c.s();
                return;
            case 3:
                this.f6722c.r();
                return;
            case 4:
                this.f6722c.u();
                return;
            default:
                this.f6722c.p();
                return;
        }
    }
}
