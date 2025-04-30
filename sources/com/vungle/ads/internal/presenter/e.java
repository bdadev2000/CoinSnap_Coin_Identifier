package com.vungle.ads.internal.presenter;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f19760c;

    public /* synthetic */ e(q qVar, int i9) {
        this.b = i9;
        this.f19760c = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                q.g(this.f19760c);
                return;
            case 1:
                q.e(this.f19760c);
                return;
            case 2:
                q.c(this.f19760c);
                return;
            case 3:
                q.f(this.f19760c);
                return;
            default:
                q.a(this.f19760c);
                return;
        }
    }
}
