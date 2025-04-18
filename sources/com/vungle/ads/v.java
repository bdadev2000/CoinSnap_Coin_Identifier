package com.vungle.ads;

/* loaded from: classes4.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16775b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f16776c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n3 f16777d;

    public /* synthetic */ v(y yVar, n3 n3Var, int i10) {
        this.f16775b = i10;
        this.f16776c = yVar;
        this.f16777d = n3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f16775b;
        n3 n3Var = this.f16777d;
        y yVar = this.f16776c;
        switch (i10) {
            case 0:
                y.c(yVar, n3Var);
                return;
            default:
                x.b(yVar, n3Var);
                return;
        }
    }
}
