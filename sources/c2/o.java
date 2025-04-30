package c2;

import b1.C0552e;

/* loaded from: classes.dex */
public final class o implements Runnable {
    public final /* synthetic */ boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0552e f5400c;

    public o(C0552e c0552e, boolean z8) {
        this.f5400c = c0552e;
        this.b = z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0552e c0552e = this.f5400c;
        c0552e.getClass();
        j2.n.a();
        H0.b bVar = (H0.b) c0552e.b;
        boolean z8 = bVar.b;
        boolean z9 = this.b;
        bVar.b = z9;
        if (z8 != z9) {
            ((InterfaceC0590a) bVar.f1345c).a(z9);
        }
    }
}
