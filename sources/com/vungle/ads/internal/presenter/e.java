package com.vungle.ads.internal.presenter;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16752b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f16753c;

    public /* synthetic */ e(q qVar, int i10) {
        this.f16752b = i10;
        this.f16753c = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f16752b;
        q qVar = this.f16753c;
        switch (i10) {
            case 0:
                q.e(qVar);
                return;
            case 1:
                q.b(qVar);
                return;
            case 2:
                q.a(qVar);
                return;
            case 3:
                q.g(qVar);
                return;
            default:
                q.f(qVar);
                return;
        }
    }
}
