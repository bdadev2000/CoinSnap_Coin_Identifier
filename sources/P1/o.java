package P1;

import f2.C2269g;
import f2.InterfaceC2268f;

/* loaded from: classes.dex */
public final class o implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2268f f2364c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f2365d;

    public /* synthetic */ o(r rVar, InterfaceC2268f interfaceC2268f, int i9) {
        this.b = i9;
        this.f2365d = rVar;
        this.f2364c = interfaceC2268f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0230d c0230d;
        switch (this.b) {
            case 0:
                C2269g c2269g = (C2269g) this.f2364c;
                c2269g.b.a();
                synchronized (c2269g.f20299c) {
                    synchronized (this.f2365d) {
                        try {
                            q qVar = this.f2365d.b;
                            InterfaceC2268f interfaceC2268f = this.f2364c;
                            qVar.getClass();
                            if (qVar.b.contains(new p(interfaceC2268f, j2.g.b))) {
                                r rVar = this.f2365d;
                                InterfaceC2268f interfaceC2268f2 = this.f2364c;
                                rVar.getClass();
                                try {
                                    ((C2269g) interfaceC2268f2).e(rVar.f2385v, 5);
                                } finally {
                                }
                            }
                            this.f2365d.d();
                        } finally {
                        }
                    }
                }
                return;
            default:
                C2269g c2269g2 = (C2269g) this.f2364c;
                c2269g2.b.a();
                synchronized (c2269g2.f20299c) {
                    synchronized (this.f2365d) {
                        try {
                            q qVar2 = this.f2365d.b;
                            InterfaceC2268f interfaceC2268f3 = this.f2364c;
                            qVar2.getClass();
                            if (qVar2.b.contains(new p(interfaceC2268f3, j2.g.b))) {
                                this.f2365d.f2387x.b();
                                r rVar2 = this.f2365d;
                                InterfaceC2268f interfaceC2268f4 = this.f2364c;
                                rVar2.getClass();
                                try {
                                    ((C2269g) interfaceC2268f4).j(rVar2.f2387x, rVar2.f2383t, rVar2.f2368A);
                                    this.f2365d.h(this.f2364c);
                                } finally {
                                }
                            }
                            this.f2365d.d();
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
