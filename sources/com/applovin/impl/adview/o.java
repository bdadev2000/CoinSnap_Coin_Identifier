package com.applovin.impl.adview;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22823a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f22824b;

    public /* synthetic */ o(a aVar, int i2) {
        this.f22823a = i2;
        this.f22824b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f22823a;
        a aVar = this.f22824b;
        switch (i2) {
            case 0:
                aVar.s();
                return;
            case 1:
                aVar.q();
                return;
            case 2:
                aVar.r();
                return;
            case 3:
                aVar.u();
                return;
            case 4:
                aVar.t();
                return;
            default:
                aVar.p();
                return;
        }
    }
}
